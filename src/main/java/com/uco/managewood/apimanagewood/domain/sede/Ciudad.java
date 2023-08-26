package com.uco.managewood.apimanagewood.domain.sede;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Ciudad {

    @Id
    private int codigociudad;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "FK_departamento")
    private Departamento codigodepartamento;



}
