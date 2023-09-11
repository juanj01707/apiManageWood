package com.uco.managewood.apimanagewood.validators;

import com.uco.managewood.apimanagewood.domain.sede.Sede;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class SedeValidator implements Validator {
    private Errors errors;

    @Override
    public boolean supports(Class<?> clazz) {
        return Sede.class.equals(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        this.errors = errors;
        Sede sede = (Sede) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "field.required", "El campo 'nombre' es obligatorio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigoempresa", "field.required", "El campo 'codigoempresa' es obligatorio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigociudad", "field.required", "El campo 'codigociudad' es obligatorio.");
    }

    public boolean hasErrors() {
        return errors != null && errors.hasErrors();
    }
    
}
