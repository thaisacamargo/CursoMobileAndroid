package br.digitalHouse.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    //lista
    private List<Imprimivel> listaArquivos = new ArrayList<>();


    //percorre a lista de imprimivel e faz a impressão
    public void imprimirTudo(){
        for (int i = 0; i<listaArquivos.size(); i++){

            System.out.println("\n O " + (i+1) + "º arquivo da lista é: " +listaArquivos.get(i).toString());
            listaArquivos.get(i).imprimir();
        }
    }


    //Adiciona um imprimivel a lista de impressora
    public void adicionarImprimivel(Imprimivel umImprimivel){
        listaArquivos.add(umImprimivel);
    }
}
