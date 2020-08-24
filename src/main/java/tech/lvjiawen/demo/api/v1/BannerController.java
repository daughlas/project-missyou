package tech.lvjiawen.demo.api.v1;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Max;

import tech.lvjiawen.demo.dto.PersonDTO;
import tech.lvjiawen.demo.sample.ISkill;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    @Autowired
    private ISkill iSkill;

    @GetMapping("/test/{id}")
    public PersonDTO test(@PathVariable @Range(min= 1,max = 10, message="需要 1 - 10 之间") Integer id,
                       @RequestParam String name,
                       @RequestBody @Validated PersonDTO person) {
        iSkill.r();
        PersonDTO dto = PersonDTO.builder()
                .name("lvjiawen")
                .age(18)
                .build();
        return dto;
    }

    @GetMapping("/test2/{idFE}")
    public PersonDTO test2(@PathVariable(name="idFE") Integer id) {
        iSkill.r();
        PersonDTO dto = PersonDTO.builder()
                .name("lvjiawen")
                .age(18)
                .build();
        return dto;
    }

    @GetMapping("/test3")
    public String test3(@RequestParam String name) {
        iSkill.r();
        System.out.println("name is " + name);
        return "hello world";
    }


    @PostMapping("/test4")
    public PersonDTO test4(@RequestBody PersonDTO person) {
        PersonDTO dto = PersonDTO.builder()
                .name("lvjiawen")
                .age(18)
                .build();
        return dto;
    }
}
