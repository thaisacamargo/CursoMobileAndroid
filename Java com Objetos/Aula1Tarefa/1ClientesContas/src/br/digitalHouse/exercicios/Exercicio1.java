package br.digitalHouse.exercicios;

public class Exercicio1 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Thais","Araujo");
        Cliente cliente2 = new Cliente("Maria","Souza");

        Conta contaDoCliente1 = new Conta(1,2000,cliente1);
        Conta contaDoCliente2 = new Conta(2,950,cliente2);

        contaDoCliente1.saque(1200);
        contaDoCliente1.deposito(22);

        contaDoCliente2.saque(0);
        contaDoCliente2.deposito(0);

    }
}
