package com.uco.managewood.apimanagewood.domain.inventario;

import com.uco.managewood.apimanagewood.domain.sede.Sede;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoinventario;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigosede")
    private Sede codigosede;



}

