package com.uco.managewood.apimanagewood.domain.inventario;

import com.uco.managewood.apimanagewood.domain.sede.Sede;




public class Inventario {

private int codigo;
private String nombre;

private Sede sede;

    public Inventario(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}

