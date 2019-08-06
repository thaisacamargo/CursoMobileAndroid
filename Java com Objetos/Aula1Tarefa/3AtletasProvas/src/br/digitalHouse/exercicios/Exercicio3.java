package br.digitalHouse.exercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Atleta1",3,20);
        Atleta atleta2 = new Atleta("Atleta2",4,25);

        Prova prova1Atleta1 = new Prova(2,19);
        Prova prova2Atleta1 = new Prova(3,20);
        Prova prova3Atleta1 = new Prova(3,22);
        Prova prova1Atleta2 = new Prova(4,26);
        Prova prova2Atleta2 = new Prova(4,22);
        Prova prova3Atleta2 = new Prova(1,19);

        prova1Atleta1.podeRealizar(atleta1);
        prova2Atleta1.podeRealizar(atleta1);
        prova3Atleta1.podeRealizar(atleta1);
        prova1Atleta2.podeRealizar(atleta2);
        prova2Atleta2.podeRealizar(atleta2);
        prova3Atleta2.podeRealizar(atleta2);


    }

}
