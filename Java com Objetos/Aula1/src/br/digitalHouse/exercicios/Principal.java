package br.digitalHouse.exercicios;

public class Principal {
    public static void main(String[] args) {
        Animal animalMamifero = new Animal("Bidu");

        System.out.println(animalMamifero.getNomeAnimal());

        Animal animalDomestico = new Animal();

        animalDomestico.setNomeAnimal("Julio");
        System.out.println(animalDomestico.getNomeAnimal());

        Pessoa pessoaJovem = new Pessoa("Erika");

        animalDomestico.setDonoAnimal(pessoaJovem);

        System.out.printf(pessoaJovem.getNomePessoa());
        System.out.println("\n" + animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa("Clotilde");

    }
}
