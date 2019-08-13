package br.digitalHouse.exercicio;

public class Principal {
    public static void main(String[] args) {

        class Impressora1 extends Impressora{
            @Override
            public void adicionarImprimivel(Imprimivel umImprimivel) {
                super.adicionarImprimivel(umImprimivel);
                umImprimivel.imprimir();
            }

            @Override
            public void imprimirTudo() {
                super.imprimirTudo();
            }
        }


        Contrato novoContrato = new Contrato("Novo Contrato", "contrato");
        Foto novaFoto = new Foto("Nova foto", "foto");
        Documento novoDocumento = new Documento("Novo documento", "documento");

        Impressora1 impressora1 = new Impressora1();
        impressora1.adicionarImprimivel(novoContrato);
        impressora1.adicionarImprimivel(novaFoto);
        impressora1.adicionarImprimivel(novoDocumento);

        impressora1.imprimirTudo();

    }
}
