package br.digitalHouse.projetoIntegrador;

public class Produto {
    private String codigo;
    private Double preco;

    public Produto(String codigo, Double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
