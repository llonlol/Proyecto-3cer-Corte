package com.example.Empleado.repositorios;
import org.springframework.stereotype.Repository;
import com.example.Empleado.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {

}
