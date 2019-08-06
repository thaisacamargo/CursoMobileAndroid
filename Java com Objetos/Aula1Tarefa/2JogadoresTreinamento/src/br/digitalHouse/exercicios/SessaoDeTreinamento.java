package br.digitalHouse.exercicios;

public class SessaoDeTreinamento {
   // public int experiencia;


    public void treinarA(JogadorDeFutebol jogador){
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        int exp = jogador.getExperiencia();
        jogador.setExperiencia(1);
        System.out.println("Experiência inicial: "+exp + " Experiência final:" + jogador.getExperiencia());
    }
}
