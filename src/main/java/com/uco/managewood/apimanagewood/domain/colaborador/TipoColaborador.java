package com.uco.managewood.apimanagewood.domain.colaborador;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tipocolaborador")
public class TipoColaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigotipocolaborador", nullable = false)
    private int codigotipocolaborador;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "salario")
    private int salario;
    @Column(name = "funcion")
    private String funcion;

    public int getCodigotipocolaborador() {
        return codigotipocolaborador;
    }

    public void setCodigotipocolaborador(int codigotipocolaborador) {
        this.codigotipocolaborador = codigotipocolaborador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
}
