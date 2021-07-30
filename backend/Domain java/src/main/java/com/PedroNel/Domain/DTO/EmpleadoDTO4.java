package com.PedroNel.Domain.DTO;

public class EmpleadoDTO4 {


    private String primerNombre;


    private String segundoNombre;


    private String primerApellido;


    private String segundoApellido;


    private String paisEmpleo;


    private String tipoIdentificacion;

    private String area;

    private Integer numeroDocumento;

    private String email;

    private String estado;

    private String fechaIngerso;

    private String fechaEdicion;

    public EmpleadoDTO4() {
    }

    public EmpleadoDTO4( String primerNombre, String segundoNombre, String primerApellido,
                        String segundoApellido, String paisEmpleo, String tipoIdentificacion,
                        String area, Integer numeroDocumento, String email, String estado, String fechaIngerso,
                        String fechaEdicion) {

        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.paisEmpleo = paisEmpleo;
        this.tipoIdentificacion = tipoIdentificacion;
        this.area = area;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.estado = estado;
        this.fechaIngerso = fechaIngerso;
        this.fechaEdicion = fechaEdicion;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }
}
