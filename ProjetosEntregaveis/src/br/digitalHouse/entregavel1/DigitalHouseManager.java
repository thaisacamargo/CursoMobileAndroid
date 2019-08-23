package br.digitalHouse.entregavel1;

import java.util.HashMap;
import java.util.Map;

public class DigitalHouseManager {
    private Map<Integer, Aluno> listaAlunos = new HashMap<>();
    private Map <Integer, Professor> listaProfessores = new HashMap<>();
    private Map <Integer, Curso> listaCursos = new HashMap<>();
    private Map<Integer, Matricula> listaMatricula = new HashMap<>();


    public void registrarCurso(String nome, Integer codigoC, Integer qtddAlunos){
        if (listaCursos.containsKey(codigoC)){
            System.out.println("Não é possível registrar este curso, pois já existe um curso cadastrado com este código!\n");
        }else {
            Curso novoCurso = new Curso(nome,codigoC,qtddAlunos);
            listaCursos.put(codigoC,novoCurso);
            System.out.println("O curso de código " + codigoC + "foi cadastrado com sucesso!");
        }

    }

    public void excluirCurso(Integer codigoC){
        if (listaCursos.containsKey(codigoC)){
           // System.out.println("Tem certeza que deseja remover o curso? \n Para confirmar Digite 1 \n Para cancelar digite qualquer outro valor");
            listaCursos.remove(codigoC);
            System.out.println("O curso de código " + codigoC + "foi removido com sucesso");
        }else {
            System.out.println("Não existe curso cadastrado com esse código! \n");
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoP, Integer quantidadeDeHoras){

        if (listaProfessores.containsKey(codigoP)){
            System.out.println("Não é possível registrar este professor, pois já existe um professor cadastrado com este código!\n");
        }else {
            Professor novoProfessor = new ProfessorAdjunto(quantidadeDeHoras,nome,sobrenome,0,codigoP);
            listaProfessores.put(codigoP,novoProfessor);
            System.out.println("O professor adjunto de código " + codigoP + "foi cadastrado com sucesso!");
        }
    }

    void registrarProfessorTitular(String nome, String sobrenome, Integer codigoP, String especialidade){
        if (listaProfessores.containsKey(codigoP)){
            System.out.println("Não é possível registrar este professor, pois já existe um professor cadastrado com este código!\n");
        }else {
            Professor novoProfessor = new ProfessorTitular(especialidade,nome,sobrenome,0,codigoP);
            listaProfessores.put(codigoP,novoProfessor);
            System.out.println("O professor titular de código " + codigoP + "foi cadastrado com sucesso!");
        }
    }

    public void excluirProfessor(Integer codigoP){
        if (listaProfessores.containsKey(codigoP)){
            // System.out.println("Tem certeza que deseja remover o curso? \n Para confirmar Digite 1 \n Para cancelar digite qualquer outro valor");
            listaProfessores.remove(codigoP);
            System.out.println("O professor de código " + codigoP + "foi removido com sucesso");
        }else {
            System.out.println("Não existe professor cadastrado com esse código! \n");
        }
    }

    public void registrarAluno(String nome, String sobrenome, Integer codigoA){
        Aluno novoAluno = new Aluno(nome,sobrenome,codigoA);
        listaAlunos.put(codigoA,novoAluno);
        System.out.println("O aluno foi registrado");
    }


}
