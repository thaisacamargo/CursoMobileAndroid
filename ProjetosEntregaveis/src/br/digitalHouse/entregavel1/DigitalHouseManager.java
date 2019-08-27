package br.digitalHouse.entregavel1;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.*;

public class DigitalHouseManager {
    private Map<Integer, Aluno> listaAlunos = new HashMap<>();
    private Map <Integer, Professor> listaProfessores = new HashMap<>();
    private Map <Integer, Curso> listaCursos = new HashMap<>();
    private List<Matricula> listaMatricula = new ArrayList<>();
    private Map<String,Integer> alunoMatricula = new HashMap<>();


    public void registrarCurso(String nome, Integer codigoC, Integer qtddAlunos){
        if (listaCursos.containsKey(codigoC)){
            System.out.println("\n REGISTRAR CURSO: \nNão é possível registrar este curso, pois já existe um curso cadastrado com este código!\n");
        }else {
            Curso novoCurso = new Curso(nome,codigoC,qtddAlunos);
            listaCursos.put(codigoC,novoCurso);
            System.out.println("\n REGISTRAR CURSO: \nO curso de código " + codigoC + " foi cadastrado com sucesso!");
            //System.out.println("Lista de cursos: \n"+ listaCursos.toString());
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
            System.out.println("\nREGISTRAR PROF. ADJUNTO:\nNão é possível registrar este professor, pois já existe um professor cadastrado com este código!\n");
        }else {
            Professor novoProfessor = new ProfessorAdjunto(quantidadeDeHoras,nome,sobrenome,0,codigoP);
            listaProfessores.put(codigoP,novoProfessor);
            System.out.println("PROFESSOR: "+ novoProfessor);
            System.out.println("\nREGISTRAR PROF. ADJUNTO:\nO professor adjunto de código " + codigoP + " foi cadastrado com sucesso!");
            //System.out.println("Lista de profs: " + listaProfessores.toString());
        }
    }

    void registrarProfessorTitular(String nome, String sobrenome, Integer codigoP, String especialidade){
        if (listaProfessores.containsKey(codigoP)){
            System.out.println("\nREGISTRAR PROF. TITULAR:\nNão é possível registrar este professor, pois já existe um professor cadastrado com este código!\n");

        }else {
            Professor novoProfessor = new ProfessorTitular(especialidade,nome,sobrenome,0,codigoP);
            listaProfessores.put(codigoP,novoProfessor);
            System.out.println("\nREGISTRAR PROF. TITULAR:\nO professor titular de código " + codigoP + " foi cadastrado com sucesso!");
            //System.out.println("Lista de profs: " + listaProfessores.toString());
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

    public void matricularAluno(Integer codigoA, Integer codigoC){
        if (listaAlunos.containsKey(codigoA) && listaCursos.containsKey(codigoC)) {
            Aluno aluno = listaAlunos.get(codigoA);
            Curso curso = listaCursos.get(codigoC);
            //System.out.println("CURSO: "+ curso);

            if(curso.adicionarUmAluno(codigoA,aluno)){

                Matricula matricula = new Matricula(aluno,curso);
                listaMatricula.add(matricula);
                System.out.println("\nA matricula foi realizada com sucesso!");

            }else {
                System.out.println("\nNão foi possível realizar a matrícula, pois não há vagas no curso escolhido!");
            }
        }else {
            System.out.println("Aluno ou curso não encontrado! ");
        }
    }

    public void alocarProfessores(Integer codigoC, Integer codigoPT, Integer codigoPA){
        if (listaCursos.containsKey(codigoC)){
            Curso curso = listaCursos.get(codigoC);
            if(listaProfessores.containsKey(codigoPT)){
                ProfessorTitular profTitular = (ProfessorTitular) listaProfessores.get(codigoPT);
                curso.setProfTitular(profTitular);
                System.out.println("Foi alocalo ao curso o professor titular de código "+codigoPT);
            }else {
                System.out.println("O professor títular de código "+ codigoPT + "não está registrado no sistema! " +
                        "\nNão é possível alocalo-lo ao curso!");
            }
            if (listaProfessores.containsKey(codigoPA)){
                ProfessorAdjunto profAdjunto = (ProfessorAdjunto) listaProfessores.get(codigoPA);
                curso.setProfAdjunto(profAdjunto);
                System.out.println("Foi alocalo ao curso o professor adjunto de código "+codigoPA);
            }else {
                System.out.println("O professor títular de código "+ codigoPA + "não está registrado no sistema!" +
                        "\nNão é possível alocalo-lo ao curso!");
            }
        }else {
            System.out.println("\nNão foi possível encontrar um curso com o código "+ codigoC);
        }
    }

    public void consultarCurso(Integer codigoA) {
        if (listaAlunos.containsKey(codigoA)) {
            int contador = 0;
            for (int i = 0; i < listaMatricula.size(); i++) {

                if (listaMatricula.get(i).getAluno().getCodA().equals(codigoA)) {
                    System.out.println("O aluno "+ listaMatricula.get(i).getAluno().getNome() + " está matriculado no curso: " + listaMatricula.get(i).getCurso().getNome());
                    contador = contador + 1;
                }
            }
            if(contador == 0){
                System.out.println("\n O aluno "+ listaAlunos.get(codigoA).getNome() + " de código "+ codigoA + " não está matriculado em nenhum curso!");
            }
        }else {
            System.out.println("O aluno buscado não está registrado no sistema!");
        }




    }


}
