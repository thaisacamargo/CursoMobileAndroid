package br.digitalHouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("------------------------- Exercicio 1 -------------------------");
        try {
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Cachorro");
        lista.add("Gato");

        System.out.println(lista.get(3));
        }catch (Exception erro){
            System.out.println("Deu ruim "+ erro.getCause()+ erro.getMessage());
            erro.printStackTrace();
        }

        System.out.println("------------------------- Exercicio 2 -------------------------");
        try {
            List<String> lista2 = new ArrayList<>();


            lista2.add("Pato");
            lista2.add("Cachorro");
            lista2.add("Gato");

            System.out.println(lista2.get(2));
        }catch (Exception error){
            System.out.println("Deu ruim 2 "+ error.getCause()+ error.getMessage());
            error.printStackTrace();
        }

        System.out.println("------------------------- Exercicio 3 -------------------------");
    }
}
