package com.PedroNel.Domain.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Empleado", schema = "public")
public class Empleado {

    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpleado;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_Nombre")
    private String segundoNombre;



    @Column(name = "primer_Apellido")
    private String primerApellido;

    @Column(name = "segundo_Apellido")
    private String segundoApellido;

    @Column(name = "Pais_Empleo")
    private String paisEmpleo;

    @Column(name = "tipo_Identificacion")
    private String tipoIdentificacion;

    @Column(name = "numberDoc")
    private int numeroDocumento;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;



    @Column(name = "area_departamento")
    private String area;

    @Column(name = "email")
    private String email;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "fecha_Ingerso")
    String fechaIngerso;

    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "CET")
    @Column(name = "fecha_salida")
    String fechaSalida;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "CET")
    @Column(name = "fecha_Registro")
    String fechaRegistro;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "CET")
    @Column(name = "fecha_Edicion")
    String fechaEdicion;

    public Empleado() {

    }

    public Empleado(int idEmpleado, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String paisEmpleo, String tipoIdentificacion, int numeroDocumento, String descripcion, String estado, String area, String email, String fechaIngerso, String fechaSalida, String fechaRegistro, String fechaEdicion) {
        this.idEmpleado = idEmpleado;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.paisEmpleo = paisEmpleo;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
        this.descripcion = descripcion;
        this.estado = estado;
        this.area = area;
        this.email = email;
        this.fechaIngerso = fechaIngerso;
        this.fechaSalida = fechaSalida;
        this.fechaRegistro = fechaRegistro;
        this.fechaEdicion = fechaEdicion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaIngerso() {
        return fechaIngerso;
    }

    public void setFechaIngerso(String fechaIngerso) {
        this.fechaIngerso = fechaIngerso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return idEmpleado == empleado.idEmpleado && email.equals(empleado.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado, email);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", paisEmpleo='" + paisEmpleo + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", numeroDocumento=" + numeroDocumento +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", area='" + area + '\'' +
                ", email='" + email + '\'' +
                ", fechaIngerso=" + fechaIngerso +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", fechaEdicion='" + fechaEdicion + '\'' +
                '}';
    }
}


