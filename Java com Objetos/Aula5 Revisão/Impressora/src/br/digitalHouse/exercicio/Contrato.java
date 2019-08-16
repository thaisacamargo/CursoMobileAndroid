package br.digitalHouse.exercicio;

public class Contrato extends Arquivo implements Imprimivel {

    public Contrato(String novoNome, String novoTipo) {
        super(novoNome, novoTipo);
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal! Nome: "+ getNome()+ " tipo: "+ getTipo());
    }

}
