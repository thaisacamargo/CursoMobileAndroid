package br.digitalHouse.entregavel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codC; //código do curso
    private ProfessorTitular profTitular;
    private ProfessorAdjunto profAdjunto;
    private Integer qtddAlunos;
    private List<Aluno> listaAlunosMatriculados = new ArrayList<>();


    public Curso(String nome, Integer codC, Integer qtddAlunos) {
        this.nome = nome;
        this.codC = codC;
        this.qtddAlunos = qtddAlunos;
    }

    public Boolean adicionarUmAluno(Aluno umAluno){
        if (this.qtddAlunos >0){
            return true;
        }else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodC() {
        return codC;
    }

    public void setCodC(Integer codC) {
        this.codC = codC;
    }

    public ProfessorTitular getProfTitular() {
        return profTitular;
    }

    public void setProfTitular(ProfessorTitular profTitular) {
        this.profTitular = profTitular;
    }

    public ProfessorAdjunto getProfAdjunto() {
        return profAdjunto;
    }

    public void setProfAdjunto(ProfessorAdjunto profAdjunto) {
        this.profAdjunto = profAdjunto;
    }

    public Integer getQtddAlunos() {
        return qtddAlunos;
    }

    public void setQtddAlunos(Integer qtddAlunos) {
        this.qtddAlunos = qtddAlunos;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codC, curso.codC);
    }
}
