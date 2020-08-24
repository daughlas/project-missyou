package tech.lvjiawen.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class SchoolDTO {
    @Length(min=2, message="school name 最少两个字符")
    private String schoolName;
}
