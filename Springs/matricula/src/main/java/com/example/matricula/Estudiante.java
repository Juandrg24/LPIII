package com.example.matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // trabajar con base de datos
@Table(name = "estudiantes") // Especificar que es con esa tabla

public class Estudiante {

    @Id // Es para buscar por el Id

    // Trabajar con minusculas
    private int id;
    private String carnet;
    private String nombre;
    private String apellido;
    private String fechamatricula;
    private String carrera;
    private String semestre;

    public Estudiante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechamatricula() {
        return fechamatricula;
    }

    public void setFechamatricula(String fechamatricula) {
        this.fechamatricula = fechamatricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiante [id: " + id + ", carnet: " + carnet + ", nombre: " + nombre + ", apellido: " + apellido
                + ", fechamatricula: " + fechamatricula + ", carrera: " + carrera + ", semestre: " + semestre + "]";
    }

}
