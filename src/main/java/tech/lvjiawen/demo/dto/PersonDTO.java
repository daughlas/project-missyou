package tech.lvjiawen.demo.dto;

import lombok.*;

@Getter
@Builder
public class PersonDTO {
    @NonNull
    private String name;
    private Integer age;
}
