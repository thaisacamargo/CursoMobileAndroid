package br.digitalHouse.exercicios;

public class Conta {
    int numeroDaConta;
    float saldo;
    Cliente titular;

    public Conta(int numeroDaContaCliente,float saldoCliente, Cliente titularCliente){
        numeroDaConta = numeroDaContaCliente;
        saldo = saldoCliente;
        titular = titularCliente;
    }


    public void deposito(float quantiaDinheiro){
        setSaldo(quantiaDinheiro);
        System.out.println("Foi realizado um depósito e o valor do saldo atualizado é: " + getSaldo());
    }

    public void saque(float quantiaDinheiro){
        if (quantiaDinheiro > getSaldo()){
            System.out.println("Saldo insuficiente para saque!");
        }else{
            setSaldo(-quantiaDinheiro);
            System.out.println("Foi realizado um saque, o saldo atualizado é: " + getSaldo());
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float quantiaEmDinheiro){
        saldo = saldo + quantiaEmDinheiro;
    }
}
