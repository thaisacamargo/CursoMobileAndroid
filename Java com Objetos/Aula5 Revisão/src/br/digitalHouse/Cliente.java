package br.digitalHouse;

public class Cliente extends Pessoa {

    private int codigo;

    public Cliente(String novoNome, Data novoNascimento, int novoCodigo) {
        super(novoNome, novoNascimento);
        codigo = novoCodigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println(" Nome: " + getNome() + " \n data de nascimento: " + getNascimento().toString() + " \n código: " + codigo);
    }

    //Gets

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
