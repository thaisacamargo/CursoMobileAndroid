package br.digitalHouse.exercicioSantander;

public class Chque {
    private float valor;
    private float bancoEmissor;
    private float data;

    public float getValor() {
        return valor;
    }

    public float getBancoEmissor() {
        return bancoEmissor;
    }

    public float getData() {
        return data;
    }

    public void setBancoEmissor(float bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public void setData(float data) {
        this.data = data;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
