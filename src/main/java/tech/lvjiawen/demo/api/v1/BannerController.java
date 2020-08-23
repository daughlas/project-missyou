package tech.lvjiawen.demo.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.lvjiawen.demo.exception.http.ForbiddenException;
import tech.lvjiawen.demo.exception.http.NotFoundException;
import tech.lvjiawen.demo.sample.ISkill;
import tech.lvjiawen.demo.sample.database.IConnect;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private ISkill iSkill;

    @GetMapping("/test")
    public String test(HttpServletResponse response) throws Exception {
        iSkill.r();
        if (true) {
            throw new ForbiddenException(10000);
        }

        return "0190 Hello, spring boot. I am 吕嘉文!";
    }
}
