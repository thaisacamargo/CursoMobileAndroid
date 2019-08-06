package br.digitalHouse.exercicios;

public class Tarefa4 {
    public static void main(String[] args) {
        int contador = 0;
        int numInteiro = 0;

        while (contador < 100){
            if( numInteiro % 2 != 0 ){
                System.out.println((numInteiro));
                contador = contador + 1;
            }
            numInteiro = numInteiro + 1;
        }
    }
}
