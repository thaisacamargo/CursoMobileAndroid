package br.digitalHouse.exercicios;

public class Exercicio2 {
    public static void main(String[] args) {

        JogadorDeFutebol jogador1 = new JogadorDeFutebol("Jogador1",30,10,0,5);
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("Jogador2",33,5,0,7);

        SessaoDeTreinamento treinamentoJogador1 = new SessaoDeTreinamento();
        SessaoDeTreinamento treinamentoJogador2 = new SessaoDeTreinamento();

        treinamentoJogador1.treinarA(jogador1);
        treinamentoJogador2.treinarA(jogador2);



    }
}
