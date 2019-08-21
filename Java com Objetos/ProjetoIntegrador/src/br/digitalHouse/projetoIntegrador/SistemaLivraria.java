package br.digitalHouse.projetoIntegrador;

import java.util.*;

public class SistemaLivraria {

    Map<String, Produto> listaLivros = new HashMap<>();
    Scanner pegandoOpc = new Scanner(System.in);

    public SistemaLivraria() {
        Livro livro1 = new Livro("1", 12.0, "Era uma vez...", "Tobias Amaral", "1998", "ABCVF45G", 12);
        Livro livro2 = new Livro("2", 10.22, "Romeu e Julieta", "William", "1789", "ABCVF45G", 7);
        Livro livro3 = new Livro("3", 23.11, "Pai rico pai pobre", "Blabla", "1998", "ABCVF45G", 3);
        Livro livro4 = new Livro("4", 42.00, "Pisando em cacos de vidro", "Ane", "1998", "ABCVF45G", 18);
        listaLivros.put(livro1.getCodigo(),livro1);
        listaLivros.put(livro2.getCodigo(),livro2);
        listaLivros.put(livro3.getCodigo(),livro3);
        listaLivros.put(livro4.getCodigo(),livro4);

    }



    public int menu(){
        System.out.println("***********************************************************");
        System.out.println("***************      SISTEMA LIVRARIA       ***************");
        System.out.println("***************      Escolha uma opção:      **************");
        System.out.println("***************   1- CADASTRAR LIVROS       ***************");
        System.out.println("***************   2- CONSULTAR CÓDIGOS      ***************");
        System.out.println("***************   3- REALIZAR VENDA         ***************");
        System.out.println("***********************************************************");
        int opcaoEscolhida = pegandoOpc.nextInt();

        return opcaoEscolhida;
    }



    public void cadastrarLivro(Produto novoLivro){
        listaLivros.put(novoLivro.getCodigo(),novoLivro);
    }

    public void consultaLivro(String codigo){
        Produto item = listaLivros.get(codigo);


        if(item == null){
            System.out.println("Livro não encontrado");
        }else{
            System.out.println("As informações do produto cadastrado neste código é: \n" + item);
        }

    }


    public void vender(String codigo){
        Produto item = listaLivros.get(codigo);
        Livro livro = (Livro) item;

        if(livro == null){
            System.out.println("Produto não encontrado");
        }else {
            if (livro.getQtddEstoque() == 0) {
                System.out.println("Estoque esgotado! Não é possível realizar a venda.");
            }else{
                livro.setQtddEstoque(livro.getQtddEstoque() - 1);
                System.out.println("Venda realizada com sucesso!");
                System.out.println("A quantidade deste produto no estoque é: " + livro.getQtddEstoque());
            }
        }

    }

    @Override
    public String toString() {
        return "SistemaLivraria{" +
                "listaLivros=" + listaLivros +
                ", pegandoOpc=" + pegandoOpc +
                '}';
    }
}
