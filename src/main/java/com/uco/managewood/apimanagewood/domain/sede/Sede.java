package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sede")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigosede;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "FK_empresa")
    private Empresa codigoempresa;

    @ManyToOne
    @JoinColumn(name = "FK_ciudad")
    private Ciudad codigociudad;


}
