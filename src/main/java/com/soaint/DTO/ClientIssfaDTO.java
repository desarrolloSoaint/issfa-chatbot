package com.soaint.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientIssfaDTO {

    private String cedula;
    private String email;
    private String fechaNacimiento;
    private String numeroDependiente;
    private String grupoSanguineo;
    private String numeroAfiliacion;
    private String estadoCivil;
    private String tiempoServicio;
    private String nombreParent;

}
