package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoempresa",nullable = false)
    private int codigoempresa;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "nit",nullable = false)
    private String nit;

}
