package com.soaint.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ac_clients_private")
@ApiModel("Modelo => Cliente Privado")
public class AcClientsPrivate {

    @Id
    @ApiModelProperty(value = "Campo id autoincrementable")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ApiModelProperty(value = "Campo cedula")
    @Column(name="cedula")
    private String cedula;

    @ApiModelProperty(value = "Campo fecha de nacimiento")
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;

    @ApiModelProperty(value = "Campo numero de dependiente registrado")
    @Column(name="numero_dependiente")
    private String numeroDependiente;

    @ApiModelProperty(value = "Campo grupo sanguineo")
    @Column(name="grupo_sanguineo")
    private String grupoSanguineo;

    @ApiModelProperty(value = "Campo numero de afiliacion")
    @Column(name="numero_afiliacion")
    private String numeroAfiliacion;

    @ApiModelProperty(value = "Campo estado civil")
    @Column(name="estado_civil")
    private String estadoCivil;

    @ApiModelProperty(value = "Campo tiempo de servicio")
    @Column(name="tiempo_servicio")
    private String tiempoServicio;

    @ApiModelProperty(value = "Campo email")
    @Column(name="email")
    private String email;

    @ApiModelProperty(value = "Campo nombre de espos@")
    @Column(name="nombre_parentesco")
    private String nombreParent;

    @ApiModelProperty(value = "Campo de fecha creación")
    @Column(name="created_at")
    private Date created_at;

    @ApiModelProperty(value = "Campo de fecha actualizacion")
    @Column(name="update_at")
    private Date update_at;

    public AcClientsPrivate() {
    }

    public AcClientsPrivate(int id, Date fechaNacimiento, String numeroDependiente, String grupoSanguineo, String numeroAfiliacion, String estadoCivil, String tiempoServicio, String email, String nombreParent, Date created_at, Date update_at) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroDependiente = numeroDependiente;
        this.grupoSanguineo = grupoSanguineo;
        this.numeroAfiliacion = numeroAfiliacion;
        this.estadoCivil = estadoCivil;
        this.tiempoServicio = tiempoServicio;
        this.email = email;
        this.nombreParent = nombreParent;
        this.created_at = created_at;
        this.update_at = update_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroDependiente() {
        return numeroDependiente;
    }

    public void setNumeroDependiente(String numeroDependiente) {
        this.numeroDependiente = numeroDependiente;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getNumeroAfiliacion() {
        return numeroAfiliacion;
    }

    public void setNumeroAfiliacion(String numeroAfiliacion) {
        this.numeroAfiliacion = numeroAfiliacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(String tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreParent() {
        return nombreParent;
    }

    public void setNombreParent(String nombreParent) {
        this.nombreParent = nombreParent;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
}
