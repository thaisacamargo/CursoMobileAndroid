package br.digitalHouse.inferfaces;

public abstract class Animal implements Brincavel{
    private String raca;
    private int idade;
    private String cor;

    public Animal (String novaRaca){
        raca = novaRaca;
    }

    //gets
    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //sets
    public void setRaca(String novaRaca) {
        raca = novaRaca;
    }

    public int setIdade(int NovaIdade) {
        idade = NovaIdade;
        return NovaIdade;
    }

    public void setCor(String novaCor) {
        cor = novaCor;
    }



}
