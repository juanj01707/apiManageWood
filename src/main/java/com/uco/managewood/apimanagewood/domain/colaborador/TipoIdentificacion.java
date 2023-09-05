package com.uco.managewood.apimanagewood.domain.colaborador;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tipoidentificacion")
public class TipoIdentificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigotipoidentificacion", nullable = false)
    private int codigotipoidentificacion;

    @Column(name = "nombre")
    private String nombre;

    public int getCodigotipoidentificacion() {
        return codigotipoidentificacion;
    }

    public void setCodigotipoidentificacion(int codigotipoidentificacion) {
        this.codigotipoidentificacion = codigotipoidentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
