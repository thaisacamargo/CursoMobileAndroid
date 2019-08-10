package br.digitalHouse;

public class Gerente extends  Funcionario implements Imposto{
    private String area;

    public Gerente(String novoNome, Data novoNascimento, float NovoSalario, String novaArea) {
        super(novoNome, novoNascimento, NovoSalario);
        area = novaArea;
    }

    @Override
    public float calculaImposto() {
        float imposto = (float) (getSalario() * 0.05);
       // System.out.println("salario super: "+ super.getSalario());
        System.out.println(" A área do gerente é: "+ area + " e o valor do imposto é: " + imposto);
        return imposto;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Dados do gerente: "+ getNome());
    }

    //gets e sets
    public String getArea() {
        return area;
    }

    public void setArea(String novaArea) {
        area = novaArea;
    }
}
