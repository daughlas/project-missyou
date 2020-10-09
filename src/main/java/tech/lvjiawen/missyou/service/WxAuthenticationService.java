package tech.lvjiawen.missyou.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dozermapper.core.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tech.lvjiawen.missyou.exception.http.ParameterException;
import tech.lvjiawen.missyou.model.User;
import tech.lvjiawen.missyou.repository.UserRepository;
import tech.lvjiawen.missyou.util.JwtToken;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class WxAuthenticationService {
    @Value("${wx.code2session}")
    private String code2SessionUrl;
    @Value("${wx.appid}")
    private String appid;
    @Value("${wx.appsecret}")
    private String appsecret;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private UserRepository userRepository;

    public String code2Session(String code) {
        // 1. 验证用户身份
        // 2. 身份合法颁布令牌
        String url = MessageFormat.format(this.code2SessionUrl, this.appid, this.appsecret, code);
        RestTemplate rest = new RestTemplate();
        String sessionText = rest.getForObject(url, String.class);
        Map<String, Object> session = new HashMap<>();
        try {
            session = mapper.readValue(sessionText, Map.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this.registerUser(session);
    }

    private String registerUser(Map<String, Object> session)  {
        String openid = (String)session.get("openid");
        if (openid == null) {
            throw new ParameterException(20004);
        }

        // TODO 此处其实不应该写 Optional
        Optional<User> userOptional = this.userRepository.findByOpenid(openid);

        if (userOptional.isPresent()) {
            return JwtToken.makeToken(userOptional.get().getId());
        } else {
            User user = User.builder()
                    .openid(openid)
                    .build();
            userRepository.save(user);
            // TODO:返回 JWT 令牌
            Long uid = user.getId();
            return JwtToken.makeToken(uid);
        }
    }
}
