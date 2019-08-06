package br.digitalHouse.exercicios;

public class Atleta {
    private String nome;
    private int nivel;
    private int energia;

    public Atleta(String nomeAtleta, int nivelAtleta, int energiaAtleta){
        nome = nomeAtleta;
        nivel = nivelAtleta;
        energia = energiaAtleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int novaEnergia) {
        energia = energia + novaEnergia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int novoNivel) {
        nivel = novoNivel;
    }
}
