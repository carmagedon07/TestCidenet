package com.PedroNel.Domain.DTO;

public class EmpleadoDTO5 {

    private Integer id;

    private String primerNombre;


    private String segundoNombre;


    private String primerApellido;


    private String segundoApellido;


    private String paisEmpleo;


    private String tipoIdentificacion;


    private Integer numeroDocumento;

    private String email;

    private String estado;

    private String fechaIngerso;

    public EmpleadoDTO5() {
    }

    public EmpleadoDTO5(Integer id, String primerNombre, String segundoNombre, String primerApellido,
                        String segundoApellido, String paisEmpleo, String tipoIdentificacion,
                        Integer numeroDocumento, String email, String estado, String fechaIngerso) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.paisEmpleo = paisEmpleo;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.estado = estado;
        this.fechaIngerso = fechaIngerso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
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

    public String getFechaIngerso() {
        return fechaIngerso;
    }

    public void setFechaIngerso(String fechaIngerso) {
        this.fechaIngerso = fechaIngerso;
    }
}
