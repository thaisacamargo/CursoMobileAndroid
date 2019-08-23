package br.digitalHouse.entregavel1;

import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codA; //código de aluno

    //Construtor da classe
    public Aluno(String nome, String sobrenome, Integer codA) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codA = codA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codA, aluno.codA);
    }


}
