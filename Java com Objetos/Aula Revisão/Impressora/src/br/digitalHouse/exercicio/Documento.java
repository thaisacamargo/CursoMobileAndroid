package br.digitalHouse.exercicio;

public class Documento extends Arquivo implements Imprimivel{


    public Documento(String novoNome, String novoTipo) {
        super(novoNome, novoTipo);
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word! Nome: "+ getNome()+ " tipo: "+ getTipo());
    }

}
