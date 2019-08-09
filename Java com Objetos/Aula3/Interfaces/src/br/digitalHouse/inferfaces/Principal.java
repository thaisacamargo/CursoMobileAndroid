package br.digitalHouse.inferfaces;

public class Principal {

    public static void main(String[] args) {
        Cachorro novocachorro = new Cachorro("fofinho");

        novocachorro.animalSaudavel("está feliz e saudável");
        novocachorro.calculoIdadeAnimal(13);
        System.out.println("A idade total é:" + novocachorro.getIdade());
        novocachorro.seDivertir();
    }
}
