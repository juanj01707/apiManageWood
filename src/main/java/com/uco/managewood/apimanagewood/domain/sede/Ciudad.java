package com.uco.managewood.apimanagewood.domain.sede;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ciudad")
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

    public int getCodigociudad() {
        return codigociudad;
    }

    public void setCodigociudad(int codigociudad) {
        this.codigociudad = codigociudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getCodigodepartamento() {
        return codigodepartamento;
    }

    public void setCodigodepartamento(Departamento codigodepartamento) {
        this.codigodepartamento = codigodepartamento;
    }
}
