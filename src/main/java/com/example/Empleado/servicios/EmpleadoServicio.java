package com.example.Empleado.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Empleado.entidades.Empleado;
import com.example.Empleado.repositorios.EmpleadoRepositorio;


@Service
public class EmpleadoServicio {
    @Autowired
    EmpleadoRepositorio empleadoRepositorio;

    public List<Empleado> getEmpleados(){
        return empleadoRepositorio.findAll();
    }

    public Optional<Empleado> getEmpleado(Long id){
        return empleadoRepositorio.findById(id);
    }

    public void SaveorUpdate(Empleado empleado){
        empleadoRepositorio.save(empleado);
    }

    public void delete(Long id){
        empleadoRepositorio.deleteById(id);
    } 

}
