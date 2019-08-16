package br.digitalHouse.exercicio;

public abstract class Arquivo {
    public String nome;
    public String tipo;

    public Arquivo(String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    //gets e seters

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    @Override
    public String toString() {
        return "nome:'" + nome + '\'' +
                ", tipo:'" + tipo + '\'';
    }
}
