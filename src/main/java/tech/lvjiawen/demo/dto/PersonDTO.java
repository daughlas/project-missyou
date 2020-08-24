package tech.lvjiawen.demo.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Getter
@Builder
public class PersonDTO {
    @Length(min=2, max= 10, message = "2 - 10 个字符")
    private String name;
    private Integer age;

    @Valid
    private SchoolDTO schoolDTO;
}
