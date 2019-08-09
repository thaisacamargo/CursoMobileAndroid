package br.digitalHouse.inferfaces;

public class Cachorro extends Animal implements Saudavel {


    //construtor
    public Cachorro (String novaRaca){
        super(novaRaca);
    }

    //método da interface
    @Override
    public boolean animalSaudavel(String diagnostico) {
        if (diagnostico != null && !diagnostico.equals("")){
            System.out.println("O cahorro " + getRaca()+" está com o seguinte diagnóstico: " + diagnostico);
            return true;
        }else{
            System.out.println("Não possui diagnostico");
            return false;
        }
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Estamos somando as idades!!!!!");
        return setIdade(getIdade()+novaIdade);
    }

    @Override
    public void seDivertir() {
        System.out.println("O doguinho está se divertindo! UHULLLL :D");
    }
}
