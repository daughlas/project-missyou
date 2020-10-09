package tech.lvjiawen.missyou.dto.validators;

import tech.lvjiawen.missyou.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordEqual , PersonDTO> {
    private int min;
    private int max;

    @Override
    public void initialize(PasswordEqual constrainAnnotation) {
        this.min = constrainAnnotation.min();
        this.max = constrainAnnotation.max();
    }

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        boolean match = password1.equals(password2);
        return match;
    }
}
