package tech.lvjiawen.missyou.dto;

import lombok.Getter;
import lombok.Setter;
import tech.lvjiawen.missyou.core.enumeration.LoginType;
import tech.lvjiawen.missyou.dto.validators.TokenPassword;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class TokenGetDTO {
    @NotBlank(message = "account")
    private String account;
    @TokenPassword(max=30, message="{token.password}")
    private String password;

    private LoginType type;
}
