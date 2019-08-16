package br.digitalHouse.exercicios;

public class Funcionario {

    private  String nome;
    private Integer numeroDeRegistro;

    public Funcionario(String nome, Integer numeroDeRegistro){
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object o) {
        return numeroDeRegistro.equals(((Funcionario) o).numeroDeRegistro);
    }
}
