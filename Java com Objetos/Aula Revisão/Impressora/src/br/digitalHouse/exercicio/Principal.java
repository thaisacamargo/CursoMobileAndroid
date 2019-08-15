package br.digitalHouse.exercicio;

public class Principal {
    public static void main(String[] args) {

        Contrato novoContrato = new Contrato("Novo Contrato", "contrato");
        Foto novaFoto = new Foto("Nova foto", "foto");
        Documento novoDocumento = new Documento("Novo documento", "documento");
        Impressora impressora1 = new Impressora();
        
        impressora1.adicionarImprimivel(novoContrato);
        impressora1.adicionarImprimivel(novaFoto);
        impressora1.adicionarImprimivel(novoDocumento);

        impressora1.imprimirTudo();

    }
}
