package br.digitalHouse.exercicios;

import java.util.Objects;

public class Aluno {
    private  String nome;
    private Integer numeroDeAluno;

    public Aluno(String nome, Integer numeroDeAluno){
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object o) {
        return numeroDeAluno.equals(((Aluno) o).numeroDeAluno);
    }

}
