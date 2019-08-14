package br.digitalHouse.exercicios;

import java.util.HashSet;
import java.util.Set;

public class Prova {


    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer somaDeInteiros = 0;
        for (Integer numero:conjuntoDeInteiros){
            somaDeInteiros = somaDeInteiros + numero;
        }
        System.out.println("Soma dos numeros é: "+somaDeInteiros);

    }


}
