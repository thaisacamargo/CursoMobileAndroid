package br.digitalHouse.exercicioSantander;

public class ContaPoupanca extends Conta {
    private float taxaJuros;

    public ContaPoupanca(float saldoCliente) {
        super(saldoCliente);
    }

    @Override
    public void depositarDinheiro(float valor) {
        super.setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacarDinheiro(float valor) {
        if(valor<=super.getSaldo()){
            super.setSaldo(getSaldo()-valor);
            System.out.println("Você depositou: "+valor + " Seu saldo atual é: " + super.getSaldo());
        }else {
            System.out.println("Você não tem saldo suficiente para este saque, seu saldo disponível é: " + super.getSaldo());
        }
    }

    public void recolherJuros(float valor){
        System.out.println("O valor recolhido é: "+valor);
    }
}
