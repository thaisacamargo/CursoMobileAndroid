package br.digitalHouse.exercicios;

public class CalculoMatematico {

    public int  divisao(int numerador, int denominador) throws ArithmeticException{
        if(denominador == 0){
             throw new ArithmeticException("A operação não pode ser realizada");
        }
        return numerador/denominador;
    }
}
