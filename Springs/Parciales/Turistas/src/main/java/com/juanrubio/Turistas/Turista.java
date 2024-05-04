package com.juanrubio.Turistas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turistas")
public class Turista {
    @Id

    private int id;
    private String cedula;
    private String nombre;
    private String fechaingreso;
    private String fechasalida;
    private int diashospedaje;
    private int valordia;
    private int valortotal;

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
    public String getFechaingreso() {
        return fechaingreso;
    }
    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    public String getFechasalida() {
        return fechasalida;
    }
    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }
    public int getDiashospedaje() {
        return diashospedaje;
    }
    public void setDiashospedaje(int diashospedaje) {
        this.diashospedaje = diashospedaje;
    }
    public int getValordia() {
        return valordia;
    }
    public void setValordia(int valordia) {
        this.valordia = valordia;
    }
    public int getValortotal() {
        return valortotal;
    }
    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }

    @Override
    public String toString() {
        return "Turista [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", fechaingreso=" + fechaingreso
                + ", fechasalida=" + fechasalida + ", diashospedaje=" + diashospedaje + ", valordia=" + valordia
                + ", valortotal=" + valortotal + "]";
    }
    


}
