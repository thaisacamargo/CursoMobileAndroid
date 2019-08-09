package br.digitalHouse.exercicioSantander;

public class ContaCorrente extends Conta{
    private float saldoChequeEspecial;

    public ContaCorrente(float saldoCliente) {
        super(saldoCliente);
    }

    @Override
    public void depositarDinheiro(float valor) {
        super.setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacarDinheiro(float valor) {
        if(valor<=super.getSaldo()){

            super.setSaldo(getSaldo()-valor);
            System.out.println("Você sacou: "+valor + " Seu saldo atual é: " + super.getSaldo());
        }else {
            if (valor<= super.getSaldo()+ saldoChequeEspecial){
                float faltou = (getSaldo() + saldoChequeEspecial) - valor;
                saldoChequeEspecial = saldoChequeEspecial - faltou;
                System.out.println("Você sacou: "+valor + " Seu saldo atual é: 0" + "seu limite restante é: " + saldoChequeEspecial);
            }else {
                System.out.println("Você não tem saldo suficiente para este saque, seu saldo disponível é: " + super.getSaldo());
            }
        }
    }

    public void depositarCheque(Chque chequeDoCliente){
        super.setSaldo(getSaldo() + chequeDoCliente.getValor());
        System.out.println("Você depositou um cheque de " + chequeDoCliente.getValor() + "seu saldo atual é: "+getSaldo());
    }
}
