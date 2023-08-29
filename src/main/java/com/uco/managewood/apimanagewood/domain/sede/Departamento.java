package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Departamento {

    @Id
    private int codigodepartamento;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigopais")
    private Pais codigopais;

}
