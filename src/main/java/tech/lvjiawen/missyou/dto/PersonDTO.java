package tech.lvjiawen.missyou.dto;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;
import tech.lvjiawen.missyou.validators.PasswordEqual;

@Getter
@Builder
@PasswordEqual(min=1)
public class PersonDTO {
    @Length(min=2, max= 10, message = "2 - 10 个字符")
    private String name;
    private Integer age;

    private String password1;
    private String password2;
}
