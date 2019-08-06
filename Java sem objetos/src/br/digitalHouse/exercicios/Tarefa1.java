package br.digitalHouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Tarefa1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(2);
        numeros.add(5);

        int maior = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++){
            if (numeros.get(i) > maior){
                maior = numeros.get(i);
            }
        }

        System.out.println("O maior entre os 3 números é: " + maior);

    }
}