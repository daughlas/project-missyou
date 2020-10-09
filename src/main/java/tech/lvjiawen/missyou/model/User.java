package tech.lvjiawen.missyou.model;

import lombok.*;
import org.hibernate.annotations.Where;
import javax.persistence.*;
import java.util.Map;
import static javax.persistence.GenerationType.IDENTITY;

import tech.lvjiawen.missyou.util.MapAndJSON;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Where(clause = "delete_time is null")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String openid;
    private String nickname;
    private String email;
    private String mobile;
    private String password;
    private Integer unifyUid;
//    private String group; // 会员等级之类

    @Convert(converter = MapAndJSON.class)
    private Map<String, Object> wxProfile;
}
