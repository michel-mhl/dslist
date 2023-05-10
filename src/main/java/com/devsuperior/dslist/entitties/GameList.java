package com.devsuperior.dslist.entitties;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_gameList")
public class GameList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public GameList(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public GameList() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}