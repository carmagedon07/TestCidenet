package com.PedroNel.Domain.DTO;

import java.sql.Date;

//DTO de insercion
public class EmpleadoDTO1 {




    private String primerNombre;


    private String segundoNombre;


    private String primerApellido;


    private String segundoApellido;


    private String paisEmpleo;


    private String tipoIdentificacion;


    private int numeroDocumento;




    private String estado;


    private String fechaIngerso;




    private String fechaRegistro;

    private String area;


    public EmpleadoDTO1() {

    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPaisEmpleo() {
        return paisEmpleo;
    }

    public void setPaisEmpleo(String paisEmpleo) {
        this.paisEmpleo = paisEmpleo;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaIngerso() {
        return fechaIngerso;
    }

    public void setFechaIngerso(String fechaIngerso) {
        this.fechaIngerso = fechaIngerso;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}


