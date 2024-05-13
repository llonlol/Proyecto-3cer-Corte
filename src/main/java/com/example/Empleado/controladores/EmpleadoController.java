package com.example.Empleado.controladores;

import java.util.List;
import java.util.Optional;

import com.example.Empleado.entidades.Empleado;
import com.example.Empleado.servicios.EmpleadoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/Empleado")

public class EmpleadoController {

    @Autowired
    private EmpleadoServicio empleadoServicio;

    @GetMapping
    public List<Empleado> getAll(){
        return empleadoServicio.getEmpleados();
    }
    @PostMapping
    public void Update(@RequestBody Empleado empleado){
        empleadoServicio.SaveorUpdate(empleado);
    }

    @DeleteMapping("/{empleadoId}")
    public void Update(@PathVariable("empleadoId") Long empleadoId){
        empleadoServicio.delete(empleadoId);
    }

    @GetMapping("/{empleadoId}")
    public Optional<Empleado> getById(@PathVariable("empleadoId") Long empleadoId){
        return empleadoServicio.getEmpleado(empleadoId);
    }
 

}
