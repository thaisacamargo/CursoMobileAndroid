package br.digitalHouse.exercicios;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer rg;

    Pessoa(String nome, Integer rg){
        this.nome = nome;
        this.rg = rg;
    }


    @Override
    public boolean equals(Object o) {
        return rg.equals(((Pessoa) o).rg);
    }


    public String getNome() {
        return nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
