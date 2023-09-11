package com.uco.managewood.apimanagewood.service.sede;


import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.repository.sede.SedeRepository;
import com.uco.managewood.apimanagewood.validators.SedeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.validation.BeanPropertyBindingResult;

import javax.validation.ValidationException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;


import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

@Service
public class SedeService{


    @Autowired
    private SedeRepository sedeRepository;

    @Autowired
    private SedeValidator sedeValidator;

    public List<Sede> findAll() {
        return sedeRepository.findAll();
    }

    public Optional<Sede> findById(Integer codigo){
        return sedeRepository.findById(codigo);
    }


    public Sede saveSede(Sede sede) {
        BeanPropertyBindingResult bindingResult = new BeanPropertyBindingResult(sede, "sede");
        sedeValidator.validate(sede, bindingResult);

        if (bindingResult.hasErrors()) {
            // Aquí, en lugar de lanzar una excepción, puedes simplemente devolver null o lanzar una excepción personalizada,
            // dependiendo de cómo quieras manejar los errores.
            return null; // O lanzar una excepción personalizada si lo prefieres.
        }

        return sedeRepository.save(sede);
    }

    /*
    public Sede saveSede(Sede sede){
        return sedeRepository.save(sede);
    }
    */









    public void deleteSede(Integer codigo){
        sedeRepository.deleteById(codigo);
    }



    public Sede updateSede(int codigosede, Sede nuevaSede) {
        Optional<Sede> sedeOptional = sedeRepository.findById(codigosede);

        if (sedeOptional.isPresent()) {
            Sede sedeExistente = sedeOptional.get();
            sedeExistente.setNombre(nuevaSede.getNombre());
            sedeExistente.setCodigoempresa(nuevaSede.getCodigoempresa());
            sedeExistente.setCodigociudad(nuevaSede.getCodigociudad());
            return sedeRepository.save(sedeExistente);
        } else {
            throw new RuntimeException("Sede no encontrada con el código: " + codigosede);
        }
    }


    public Sede patchSede(int codigosede, Map<String, Object> fields){

        Optional<Sede> sedeOptional = sedeRepository.findById(codigosede);

        if(sedeOptional.isPresent()) {
            Sede sedeExistente = sedeOptional.get();
            fields.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(Sede.class, key);
                field.setAccessible(true);

                if (field.getType() == String.class && value instanceof String) {
                    ReflectionUtils.setField(field, sedeExistente, value);
                }

            });
            return sedeRepository.save(sedeExistente);
        }
        return null;
    }
}
