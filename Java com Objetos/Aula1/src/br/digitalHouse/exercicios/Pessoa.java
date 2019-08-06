package br.digitalHouse.exercicios;

public class Pessoa {

    String nomePessoa;

    public Pessoa(String novoNome){
        nomePessoa = novoNome;
    }

    //Get
    public String getNomePessoa (){
        return nomePessoa;
    }

    //Set
    public void  setNomePessoa(String novoNome){
        nomePessoa = novoNome;
    }
}