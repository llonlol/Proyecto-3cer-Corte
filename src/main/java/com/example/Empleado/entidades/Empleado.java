package com.example.Empleado.entidades;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="tbl_empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEmpleado;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Puesto;
    private int Sueldo;

}
