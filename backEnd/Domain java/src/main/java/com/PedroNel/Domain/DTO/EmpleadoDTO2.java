package com.PedroNel.Domain.DTO;

import java.sql.Date;

// DTO Para la Consulta
public class EmpleadoDTO2 {




    private String primerNombre;


    private String segundoNombre;


    private String primerApellido;


    private String segundoApellido;


    private String PaisEmpleo;


    private String tipoIdentificacion;


    private int numeroDocumento;

    private String email;

    private String estado;

    Date fechaIngerso;



    public EmpleadoDTO2() {

    }

    public EmpleadoDTO2(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
                        String paisEmpleo, String tipoIdentificacion, int numeroDocumento, String email, String estado,
                        Date fechaIngerso) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.PaisEmpleo = paisEmpleo;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.estado = estado;
        this.fechaIngerso = fechaIngerso;
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
        return PaisEmpleo;
    }

    public void setPaisEmpleo(String paisEmpleo) {
        PaisEmpleo = paisEmpleo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaIngerso() {
        return fechaIngerso;
    }

    public void setFechaIngerso(Date fechaIngerso) {
        this.fechaIngerso = fechaIngerso;
    }
}


