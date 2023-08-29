package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sede")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigosede",nullable = false)
    private int codigosede;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigoempresa")
    private Empresa codigoempresa;

    @ManyToOne
    @JoinColumn(name = "codigociudad")
    private Ciudad codigociudad;


}
