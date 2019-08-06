package br.digitalHouse.exercicios;

public class Animal {
    private String nomeAnimal;
    private String raca;
    private int idade;
    private String cor;
    private Pessoa donoAnimal;

    //Construtor específico
    public Animal (String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    //Construtor padrão
    public Animal(){
    }

    //Gets
    public String getNomeAnimal(){
        return nomeAnimal;
    }

    public String getRaca(){
        return raca;
    }

    public int getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    public Pessoa getDonoAnimal(){
        return donoAnimal;
    }

    //Set
    public void setNomeAnimal(String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    public void setRaca(String novaRaca){
        raca = novaRaca;
    }

    public void setIdade(int novaIdade){
        idade = novaIdade;
    }

    public void setCor(String novaCor){
        cor = novaCor;
    }

    public void setDonoAnimal(Pessoa novoDono){
        donoAnimal = novoDono;
    }

    public void brincar(){
        System.out.println("O animal está brincando");
    }

}

