package com.repaso.hospital;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")

public class Paciente {

    @Id
    
    private int id;
    private String cedula;
    private String nombre;
    private String direccion;
    private String celular;
    private String diagnostico;


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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Paciente(){

    }
    
    
    @Override
    public String toString() {
        return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion
                + ", celular=" + celular + ", diagnostico=" + diagnostico + "]";
    }
}
