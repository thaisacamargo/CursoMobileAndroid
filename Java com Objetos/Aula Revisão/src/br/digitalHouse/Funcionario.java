package br.digitalHouse;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String novoNome, Data novoNascimento, float novoSalario) {
        super(novoNome, novoNascimento);
        salario = novoSalario;
    }

    public Funcionario(String novoNome, Data novoNascimento) {
        super(novoNome, novoNascimento);
    }

    public float calculaImposto(){
        float imposto = (float) (salario * 0.03);
        System.out.println("Salario teste: "+this.salario);
        System.out.println("O valor do imposto é: "+ imposto);
        return imposto;
    }

    @Override
    public void imprimeDados() {
        float salarioComImposto = salario - calculaImposto();
        System.out.println("O valor final do imposto é de: " + salarioComImposto);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float novoSalario) {
        salario = novoSalario;
    }
}
