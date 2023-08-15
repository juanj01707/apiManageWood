package com.uco.managewood.apimanagewood.service.sede;


import com.uco.managewood.apimanagewood.domain.sede.Ciudad;
import com.uco.managewood.apimanagewood.domain.sede.Empresa;
import com.uco.managewood.apimanagewood.domain.sede.Sede;
import org.springframework.stereotype.Service;

@Service
public class SedeService{

    public Sede get(Integer codigoSede){
        Sede sede = new Sede();

        Empresa empresa = new Empresa();
        empresa.setCodigo(7887);
        empresa.setNombre("EMPRESA CARPINETECALIDOSA");
        empresa.setNit(7774);

        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Rionegro");
        ciudad.setCodigo(4847);

        sede.setCodigo(122463);
        sede.setNombre("CARPENTERS RIONEGRO INC");
        sede.setEmpresa(empresa);
        sede.setCiudad(ciudad);

        return sede;
    }

    public String create(Sede sede){
        System.out.println(sede.getCodigo());
        System.out.println(sede.getCiudad());
        System.out.println(sede.getNombre());
        System.out.println(sede.getEmpresa());
    return  "Se ha creado una sede correctamente.";
    }

    public String delete(Integer codigoSede){
        System.out.println(codigoSede);
        return "Se ha eliminado una sede correctamente";
    }


}
