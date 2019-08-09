package br.digitalHouse.herancaClasseAbstrata;

public class Principal {
    public static void main(String[] args) {

        Crianca bebe = new Crianca("Maria","feminino");

        //Pessoa adulto = new Pessoa("Mario","masculino");

        System.out.println(bebe.getNome());
        System.out.println(bebe.getSexo());

        bebe.estudar(true);

        //adulto.estudar(false);

        //adulto.cadastroPessoa("Thais");
        //adulto.cadastroPessoa("Thais", "Camargo");
        //adulto.cadastroPessoa("Thais", "Camargo","feminino");

    }

}
