package br.digitalHouse.exercicios;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public Prova(int dificuldadeDaProva, int energiaDaProva){
        dificuldade = dificuldadeDaProva;
        energiaNecessaria = energiaDaProva;
    }

    public void podeRealizar (Atleta atletaParticipante){
        if (atletaParticipante.getNivel() >= dificuldade && atletaParticipante.getEnergia() >=energiaNecessaria){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
