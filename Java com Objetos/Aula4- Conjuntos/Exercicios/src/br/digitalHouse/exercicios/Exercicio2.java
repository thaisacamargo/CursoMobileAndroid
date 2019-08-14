package br.digitalHouse.exercicios;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> novaLista = new ArrayList();
        novaLista.add(1);
        novaLista.add(5);
        novaLista.add(5);
        novaLista.add(6);
        novaLista.add(7);
        novaLista.add(8);
        novaLista.add(8);
        novaLista.add(8);

        Set<Integer> novoSet = new HashSet<>();
        novoSet.add(1);
        novoSet.add(5);
        novoSet.add(5);
        novoSet.add(6);
        novoSet.add(7);
        novoSet.add(8);
        novoSet.add(8);
        novoSet.add(8);

        for (Integer elemento : novaLista){
            System.out.println(elemento);
        }
        System.out.println("\n------------------------------\n");

        for (Integer chave: novoSet){
            System.out.println(chave );
        }

    }
}
