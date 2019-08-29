package br.digitalHouse.entregavel1;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Curso {
    private String nome;
    private Integer codC; //código do curso
    private ProfessorTitular profTitular;
    private ProfessorAdjunto profAdjunto;
    private Integer qtddAlunos;
    private Map<Integer,Aluno> listaAlunosMatriculados = new HashMap<>();


    //Construtor
    public Curso(String nome, Integer codC, Integer qtddAlunos) {
        this.nome = nome;
        this.codC = codC;
        this.qtddAlunos = qtddAlunos;
    }

    //Métodos necessários
    public Boolean adicionarUmAluno(Aluno umAluno){
        if (this.qtddAlunos >0){
            qtddAlunos = qtddAlunos -1;
            List<Aluno> lista = new ArrayList<>();
            lista.add(0,umAluno);
            this.setListaAlunosMatriculados(lista);
            return true;
        }else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        Integer codigoA = umAluno.getCodA();
        if (listaAlunosMatriculados.containsKey(codigoA)){
            listaAlunosMatriculados.remove(codigoA);
            System.out.println("\n**EXCLUIR ALUNO:**\n O aluno de código "+codigoA + " foi removido da lista de alunos matriculados no curso");
        }else {
            System.out.println("\n**EXCLUIR ALUNO:**\nNão existe aluno com o código "+codigoA+ " matriculado neste cuso!");
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

    public Map<Integer, Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        Aluno aluno = listaAlunosMatriculados.get(0);
        this.listaAlunosMatriculados.put(aluno.getCodA(),aluno);
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
