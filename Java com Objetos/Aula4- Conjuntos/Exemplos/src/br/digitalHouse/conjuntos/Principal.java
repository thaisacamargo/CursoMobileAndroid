package br.digitalHouse.conjuntos;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        //HashSet
        Set<String> conjunto = new HashSet<> ();
        conjunto.add("Erika");
        conjunto.add("Jessica");
        conjunto.add("Camila");
        conjunto.add("Rafa");

        for (String valor : conjunto){
            System.out.println(valor);
        }

        //HashMap
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Thais é numero 1");
        mapa.put(2, "Pessoa2 é numero 2");
        mapa.put(3, "Pessoa3 é numero 3");
        mapa.put(4, "Pessoa4 é numero 4");

        for(Integer chave:mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }

        mapa.remove(3);
        System.out.println("----------------Depois do remove ----------------- \n " + mapa.values());

        List<String> lista = new ArrayList<>();
        lista.add("Thaiziii");
        lista.add("Pessoinha 2");
        lista.add("Pessoinha 3");
        lista.add("Pessoinha 4");
        lista.add("Pessoinha 5");

        String qualquer = lista.get(2);
        System.out.println("valor:" + qualquer);

        for (String valor : lista){
            System.out.println("\n" + valor);
        }



    }
}
