package br.digitalHouse;

public class TestaCadastro {

    public static void main(String[] args) {
        Data novaData = new Data(10,02,1995);

        Cliente novoCliente = new Cliente("Thais",novaData,321);
        novoCliente.imprimeDados();

        Funcionario novoFuncionario = new Funcionario("Thata", novaData,2000);
        novoFuncionario.calculaImposto();

        Gerente novoGerente = new Gerente("Gerentinho da Silva", novaData,5000,"Comercial");
        novoGerente.calculaImposto();
        novoGerente.imprimeDados();


        CadastroPessoas novoCadastro = new CadastroPessoas();
        novoCadastro.cadastrarPessoa(novoCliente);
        novoCadastro.cadastrarPessoa(novoFuncionario);
        novoCadastro.cadastrarPessoa(novoGerente);
        novoCadastro.imprimeCadastro();
    }


}
