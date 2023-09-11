package com.uco.managewood.apimanagewood.validators;

import com.uco.managewood.apimanagewood.domain.inventario.Inventario;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class InventarioValidator implements Validator {

    private Errors errors;

    @Override
    public boolean supports(Class<?> clazz) {
        return Inventario.class.equals(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        this.errors = errors;
        Inventario inventario = (Inventario) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "field.required", "El campo 'nombre' es obligatorio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigosede", "field.required", "El campo 'codigosede' es obligatorio.");
    }

    public boolean hasErrors() {
        return errors != null && errors.hasErrors();
    }
}
