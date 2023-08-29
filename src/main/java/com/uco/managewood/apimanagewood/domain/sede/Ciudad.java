package com.uco.managewood.apimanagewood.domain.sede;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigociudad", nullable = false)
    private int codigociudad;


    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigodepartamento")
    private Departamento codigodepartamento;



}
