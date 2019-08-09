package br.digitalHouse.exercicioSantander;

public class Cliente {
    private int numCliente;
    private String sobrenome;
    private String rg;
    private String cpf;

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getRg() {
        return rg;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
