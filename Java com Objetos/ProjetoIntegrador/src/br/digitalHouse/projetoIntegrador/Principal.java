package br.digitalHouse.projetoIntegrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        List<Livro> listaParaCadastrar = new ArrayList<>();
        SistemaLivraria sistema = new SistemaLivraria();


        Scanner qtddCadastro = new Scanner(System.in);


        Scanner codigo = new Scanner(System.in);
        Scanner preco = new Scanner(System.in);
        Scanner titulo = new Scanner(System.in);
        Scanner autor = new Scanner(System.in);
        Scanner anoLancamento = new Scanner(System.in);
        Scanner codigoISBN = new Scanner(System.in);
        Scanner qtddEstoque = new Scanner(System.in);



        //sistema.menu();

        int opcaoMenu = sistema.menu();


        if(opcaoMenu==1 || opcaoMenu==2 || opcaoMenu==3){
            //System.out.println("opcao menu: " +  opcaoMenu);

            //cadastrar livro
            if(opcaoMenu ==1){
                System.out.println("\nQuantos livros deseja cadastrar?");
                int qtddDesejada = qtddCadastro.nextInt();

                for (int i=0; i<qtddDesejada;i++){
                    System.out.println("Forneça as informações do "+(i+1)+"º livro:\n");

                    System.out.println("Digite o código do livro: ");
                    String codigoIn = codigo.next();

                    System.out.println("Digite o preço do livro: ");
                    Double precoIn = preco.nextDouble();

                    System.out.println("Digite o título do livro: ");
                    String tituloIn = titulo.next();

                    System.out.println("Digite o autor do livro: ");
                    String autorIn = autor.next();

                    System.out.println("Digite o ano de lançamento do livro: ");
                    String lancIn = anoLancamento.next();

                    System.out.println("Digite o codigoISBN do livro: ");
                    String codigoISBNIn = codigoISBN.next();
                    
                    System.out.println("Digite a quantidade em estoque para este livro: ");
                    int qntddIn = qtddEstoque.nextInt();

                    Livro novoLivro = new Livro(codigoIn,precoIn,tituloIn,autorIn,lancIn,codigoISBNIn,qntddIn);

                    sistema.cadastrarLivro(novoLivro);

                    sistema.menu();
                }
            }

            if (opcaoMenu ==2){
                System.out.println("Digite o código do produto:");
                String codigoIn = codigo.next();
                sistema.consultaLivro(codigoIn);
                sistema.menu();
            }
            if(opcaoMenu == 3){
                System.out.println("Digite o código do produto vendido:");
                String codigoIn = codigo.next();
                sistema.vender(codigoIn);
                sistema.menu();
            }
        }else{
            System.out.println("A opção escolhida não é válida, tente novamente");

            sistema.menu();
        }









    }





}
