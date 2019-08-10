package br.digitalHouse;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    //Construtor
    public Pessoa(String novoNome, Data novoNascimento){
        nome = novoNome;
        nascimento = novoNascimento;
    }

    //Gests
    public String getNome() {
        return nome;
    }
    public Data getNascimento() {
        return nascimento;
    }

    //Sets
    public void setNome(String novoNome) {
        nome = novoNome;
    }
    public void setNascimento(Data novoNascimento) {
        nascimento = novoNascimento;
    }

    //método abstrato
    public abstract void imprimeDados();

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}
