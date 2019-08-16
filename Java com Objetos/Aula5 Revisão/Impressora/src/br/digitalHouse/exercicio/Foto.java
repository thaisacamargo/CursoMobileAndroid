package br.digitalHouse.exercicio;

public class Foto extends Arquivo implements Imprimivel{

    public Foto(String novoNome, String novoTipo) {
        super(novoNome, novoTipo);
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie! Nome: "+ getNome()+ " tipo: "+ getTipo());
    }

}
