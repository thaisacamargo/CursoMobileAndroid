package br.digitalHouse.projetoIntegrador;

public class Livro extends Produto {

    private String titulo;
    private String autor;
    private String anoLancamento; //Pode ser data
    private String codigoISBN;
    private int qtddEstoque;

    public Livro(String codigo, Double preco, String titulo, String autor, String anoLancamento, String codigoISBN, int qtddEstoque) {
        super(codigo, preco);
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codigoISBN = codigoISBN;
        this.qtddEstoque = qtddEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQtddEstoque() {
        return qtddEstoque;
    }

    public void setQtddEstoque(int qtddEstoque) {
        this.qtddEstoque = qtddEstoque;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                ", codigoISBN='" + codigoISBN + '\'' +
                ", qtddEstoque=" + qtddEstoque +
                '}';
    }
}
