package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Pais {

    @Id
    private int codigopais;
    private String nombre;
}
