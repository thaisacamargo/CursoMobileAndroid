package br.digitalHouse.exercicios;

public class Coca {
    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, Double preco){
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {

        return tamanho.equals(((Coca) o).tamanho);
    }


}
