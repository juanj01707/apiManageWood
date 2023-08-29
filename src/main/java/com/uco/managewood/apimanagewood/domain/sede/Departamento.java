package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigodepartamento",nullable = false)
    private int codigodepartamento;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigopais")
    private Pais codigopais;

}
