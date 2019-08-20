package br.digitalHouse.exercicios;

public class Teste {
    public static void main(String[] args) {
        CalculoMatematico calculando = new CalculoMatematico();
        System.out.println("----------------------- CALCULO MATEMÁTICO ---------------------------");
        try {
            System.out.println(calculando.divisao(4, 0));
        }catch (ArithmeticException erro){
            System.out.println(erro.getMessage());
        }



    }


}
