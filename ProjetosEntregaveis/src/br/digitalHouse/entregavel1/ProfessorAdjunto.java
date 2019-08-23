package br.digitalHouse.entregavel1;

public class ProfessorAdjunto extends Professor {

    private Integer qtddHoras;

    //Construtor
    public ProfessorAdjunto(Integer qtddHoras, String nome, String sobrenome, Integer tempoCasa, Integer codP) {
        super(nome, sobrenome, tempoCasa, codP);
        this.qtddHoras = qtddHoras;
    }

    public Integer getQtddHoras() {
        return qtddHoras;
    }

    public void setQtddHoras(Integer qtddHoras) {
        this.qtddHoras = qtddHoras;
    }
}
