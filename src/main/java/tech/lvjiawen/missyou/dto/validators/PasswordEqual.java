package tech.lvjiawen.missyou.dto.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordEqual {
    int min() default 4;
    int max() default 10;
    String message() default "passwords are not equal";

    Class<?>[] groups() default {}; // 自定义校验注解规范规定的

    Class<? extends Payload>[] payload() default {}; // 自定义校验注解规范规定的

    // 关联类
}
