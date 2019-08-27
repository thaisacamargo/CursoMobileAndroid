package br.digitalHouse.entregavel1;

import java.util.*;

public class Curso {
    private String nome;
    private Integer codC; //código do curso
    private ProfessorTitular profTitular;
    private ProfessorAdjunto profAdjunto;
    private Integer qtddAlunos;
    private Map<Integer,Aluno> listaAlunosMatriculados = new HashMap<>();


    public Curso(String nome, Integer codC, Integer qtddAlunos) {
        this.nome = nome;
        this.codC = codC;
        this.qtddAlunos = qtddAlunos;
    }

    public Boolean adicionarUmAluno(Integer codigA, Aluno umAluno){
        if (this.qtddAlunos >0){
            qtddAlunos = qtddAlunos -1;
            listaAlunosMatriculados.put(codigA, umAluno);
            return true;
        }else {
            return false;
        }
    }

    public void excluirAluno(Integer codigA, Aluno umAluno){
        if (listaAlunosMatriculados.containsKey(codigA)){
            listaAlunosMatriculados.remove(codigA);
            System.out.println("\n**EXCLUIR ALUNO:**\n O aluno de código "+codigA + " foi removido da lista de alunos matriculados no curso");
        }else {
            System.out.println("\n**EXCLUIR ALUNO:**\nNão existe aluno com o código "+codigA+ " matriculado neste cuso!");
        }

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
        return (List<Aluno>) listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = (Map<Integer, Aluno>) listaAlunosMatriculados;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codC, curso.codC);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codC=" + codC +
                ", profTitular=" + profTitular +
                ", profAdjunto=" + profAdjunto +
                ", qtddAlunos=" + qtddAlunos +
                ", listaAlunosMatriculados=" + listaAlunosMatriculados +
                '}';
    }
}
