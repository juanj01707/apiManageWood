package com.uco.managewood.apimanagewood.domain.sede;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigopais",nullable = false)
    private int codigopais;
    @Column(name = "nombre")
    private String nombre;

    public int getCodigopais() {
        return codigopais;
    }

    public void setCodigopais(int codigopais) {
        this.codigopais = codigopais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
