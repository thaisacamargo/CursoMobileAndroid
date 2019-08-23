package br.digitalHouse.entregavel1;

import java.util.Objects;

public abstract class Professor {
    private String nome;
    private String sobrenome;
    private Integer tempoCasa;
    private Integer codP; //código de professor

    //Construtor
    public Professor(String nome, String sobrenome, Integer tempoCasa, Integer codP) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
        this.codP = codP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodP() {
        return codP;
    }

    public void setCodP(Integer codP) {
        this.codP = codP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codP, professor.codP);
    }

}
