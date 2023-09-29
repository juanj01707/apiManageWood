package com.uco.managewood.apimanagewood.domain.inventario;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class InventarioRabbit {


    private int codigoinventario;
    private String nombre;
    private int codigosede;

    public InventarioRabbit(int codigoinventario, String nombre, int codigosede) {
        this.codigoinventario = codigoinventario;
        this.nombre = nombre;
        this.codigosede = codigosede;
    }

    public int getCodigoinventario() {
        return codigoinventario;
    }

    public void setCodigoinventario(int codigoinventario) {
        this.codigoinventario = codigoinventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigosede() {
        return codigosede;
    }

    public void setCodigosede(int codigosede) {
        this.codigosede = codigosede;
    }
}
