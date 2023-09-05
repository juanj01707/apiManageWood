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

    public int getCodigoempresa() {
        return codigoempresa;
    }

    public void setCodigoempresa(int codigoempresa) {
        this.codigoempresa = codigoempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
