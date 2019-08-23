package br.digitalHouse.entregavel1;

public class ProfessorTitular extends Professor {

    private String especialidade;

    //Construtor
    public ProfessorTitular(String especialidade, String nome, String sobrenome, Integer tempoCasa, Integer codP) {
        super(nome, sobrenome, tempoCasa, codP);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
