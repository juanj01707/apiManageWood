package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Empresa {

    @Id
    private int codigoempresa;
    private String nombre;
    private String nit;

}
