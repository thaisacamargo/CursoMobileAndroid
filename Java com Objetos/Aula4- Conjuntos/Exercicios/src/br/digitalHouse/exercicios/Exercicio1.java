package br.digitalHouse.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<Integer,String> dicionario = new HashMap<>();
        dicionario.put(0,"Ovos");
        dicionario.put(1,"Água");
        dicionario.put(2,"Escopeta");
        dicionario.put(3,"Cavalo");
        dicionario.put(4,"Dentista");
        dicionario.put(5,"Fogo");


        Map<String, List<String>> apelidos = new HashMap<>();
        List<String> listaJuan = new ArrayList<>();
        List<String> listaMiguel = new ArrayList<>();
        List<String> listaMaria = new ArrayList<>();
        List<String> listaLucas = new ArrayList<>();

        listaJuan.add("Juan");
        listaJuan.add("Fissura");
        listaJuan.add("Maromba");

        listaMiguel.add("Night Watch");
        listaMiguel.add("Bruce Wayne");
        listaMiguel.add("Tampinha");

        listaMaria.add("Wonder Woman");
        listaMaria.add("Mary");
        listaMaria.add("Marilene");

        listaLucas.add("Lukinha");
        listaLucas.add("Jorge");
        listaLucas.add("George");


        apelidos.put("Juan",listaJuan);
        apelidos.put("Miguel",listaMiguel);
        apelidos.put("Maria",listaMaria);
        apelidos.put("Lucas",listaLucas);

        for (Integer valor: dicionario.keySet()) {
            String significado = dicionario.get(valor);
            System.out.println( valor + " " + significado);
        }

        for (String pessoa:apelidos.keySet()){
            List apelido = apelidos.get(pessoa);
            System.out.println("\n" + pessoa + " " + apelido);
        }

    }


}
