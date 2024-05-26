package com.musica.musica;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cantantes")
public class Cantante {
    @Id

    private int id;
    private String nombre;
    private String pais;
    private int integrantes;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Generomusical generomusical;

    public Cantante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public Generomusical getGeneromusical() {
        return generomusical;
    }

    public void setGeneromusical(Generomusical generomusical) {
        this.generomusical = generomusical;
    }

}
