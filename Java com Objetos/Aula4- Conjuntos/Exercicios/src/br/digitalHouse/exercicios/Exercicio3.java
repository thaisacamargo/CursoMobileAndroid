package br.digitalHouse.exercicios;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {

        Set<Integer> conjuntoDeInteiros = new HashSet<>();
        conjuntoDeInteiros.add(2);
        conjuntoDeInteiros.add(3);
        conjuntoDeInteiros.add(4);
        conjuntoDeInteiros.add(5);
        conjuntoDeInteiros.add(6);
        conjuntoDeInteiros.add(7);

       Prova novaProva = new Prova();
       novaProva.somaTotal(conjuntoDeInteiros);

    }
}
