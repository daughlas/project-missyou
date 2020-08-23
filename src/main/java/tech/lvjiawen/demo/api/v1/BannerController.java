package tech.lvjiawen.demo.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

import tech.lvjiawen.demo.dto.PersonDTO;
import tech.lvjiawen.demo.exception.http.ForbiddenException;
import tech.lvjiawen.demo.sample.ISkill;

import java.util.Map;

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

    @GetMapping("/test/{idFE}")
    public String test2(@PathVariable(name="idFE") Integer id) {
        iSkill.r();
        System.out.println("id is " + id);
        return "hello world";
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
