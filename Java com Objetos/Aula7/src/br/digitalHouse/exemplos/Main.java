package br.digitalHouse.exemplos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("João");
            lista.add("Jessica");
            lista.add("Tarantino");

            System.out.println(lista.get(3));
        }catch (Exception e){
            System.out.println("Ocorreu um erro: "+ e.getMessage());
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------------------");


        try {
            Pessoa pessoa = new Pessoa();
            System.out.println(pessoa.getRg() + 0000);
        }catch (NullPointerException erro){
            System.out.println("Ocorreu um erro: "+ erro.getMessage());
            erro.printStackTrace();
        }finally {
            System.out.println("Aconteceu o print dentro do código!");
        }
    }
}
