package com.musica.musica;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "generosmusicales")
public class Generomusical {
    @Id

    private int id;
    private String genero;

    @OneToMany(mappedBy = "generomusical", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Cantante> cantantes;

    public Generomusical() {
        cantantes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(List<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

}
