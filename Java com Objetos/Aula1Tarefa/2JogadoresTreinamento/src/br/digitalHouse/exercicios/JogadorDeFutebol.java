package br.digitalHouse.exercicios;

public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadorDeFutebol(String nomeJogador, int energiaJogador, int alegriaJogador, int golsJogador, int experienciaJogador){
        nome = nomeJogador;
        energia = energiaJogador;
        alegria = alegriaJogador;
        gols = golsJogador;
        experiencia = experienciaJogador;
    }

    public void fazerGol(){
        energia = energia-5;
        alegria = alegria+10;
        gols = gols+1;
        System.out.println("GOOOOL");
    }

    public void correr(){
        energia = energia-10;
        System.out.println("Cansei");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int novaEnergia){
        energia = energia + novaEnergia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int novaAlegria){
        alegria = alegria + novaAlegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int maisGols){
        gols = gols + maisGols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int novaExperiencia){
        experiencia = experiencia + novaExperiencia;
    }
}
