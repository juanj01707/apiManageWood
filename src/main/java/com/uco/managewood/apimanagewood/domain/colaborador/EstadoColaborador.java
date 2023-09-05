package com.uco.managewood.apimanagewood.domain.colaborador;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estadocolaborador")
public class EstadoColaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoestadocolaborador", nullable = false)
    private int codigoestadocolaborador;

    @Column(name = "nombre")
    private String nombre;

    public int getCodigoestadocolaborador() {
        return codigoestadocolaborador;
    }

    public void setCodigoestadocolaborador(int codigoestadocolaborador) {
        this.codigoestadocolaborador = codigoestadocolaborador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
