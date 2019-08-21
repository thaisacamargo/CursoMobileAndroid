package br.digitalHouse.projetoIntegrador;

public class Colecao extends Produto {

    private String descricao;

    public Colecao(String descricao, String codigo, Double preco) {
        super(codigo, preco);
        this.descricao = descricao;
    }
}
