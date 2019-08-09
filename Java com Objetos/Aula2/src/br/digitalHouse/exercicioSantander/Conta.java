package br.digitalHouse.exercicioSantander;

public abstract class Conta {
    private float saldo;
    private Cliente cliente;

    public Conta(float saldoCliente){

    }

    public abstract void depositarDinheiro(float valor);
    public abstract void sacarDinheiro (float valor);

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
