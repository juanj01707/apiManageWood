package com.uco.managewood.apimanagewood.validators;

import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ColaboradorValidator implements Validator {
    private Errors errors;

    @Override
    public boolean supports(Class<?> clazz) {
        return Colaborador.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        this.errors = errors;
        Colaborador colaborador = (Colaborador) target;

        // Ejemplo de validación: el campo "nombre" no debe estar vacío
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "field.required", "El campo 'nombre' es obligatorio.");
    }

    public boolean hasErrors() {
        return errors != null && errors.hasErrors();
    }
}