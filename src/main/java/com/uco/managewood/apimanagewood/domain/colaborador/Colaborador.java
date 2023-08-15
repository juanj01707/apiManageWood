package com.uco.managewood.apimanagewood.domain.colaborador;

import com.uco.managewood.apimanagewood.domain.sede.Sede;

public class Colaborador {
    private int codigo;
    private TipoColaborador tipoColaborador;
    private EstadoColaborador estadoColaborador;
    private int codigoSede;

    public Colaborador(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TipoColaborador getTipoColaborador() {
        return tipoColaborador;
    }

    public void setTipoColaborador(TipoColaborador tipoColaborador) {
        this.tipoColaborador = tipoColaborador;
    }

    public EstadoColaborador getEstadoColaborador() {
        return estadoColaborador;
    }

    public int getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(int codigoSede) {
        this.codigoSede = codigoSede;
    }

    public void setEstadoColaborador(EstadoColaborador estadoColaborador) {
        this.estadoColaborador = estadoColaborador;
    }

    public int getSede() {
        return codigoSede;
    }

    public void setSede(Sede sede) {
        this.codigoSede = sede.getCodigo();
    }
}
