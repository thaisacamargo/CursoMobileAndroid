package br.digitalHouse.entregavel1;

public class Main {

    public static void main(String[] args) {

    //Instanciando objetos
        DigitalHouseManager sistema = new DigitalHouseManager();

        ProfessorTitular professorTitular1 = new ProfessorTitular("Android","André", "Sanches",0,1);
        ProfessorTitular professorTitular2 = new ProfessorTitular("Git","Joana", "Moraes",0,2);
        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto(12,"Thainá","Meira", 0,3);
        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto(16,"Julia","Nery", 0,4);

        Curso curso1 = new Curso("Android",20002,2);
        Curso curso2 = new Curso("Full Stack",20001,3);

        Aluno aluno1 = new Aluno("Aluno 1", "Sobrenome1",123);
        Aluno aluno2 = new Aluno("Aluno 2", "Sobrenome2",124);
        Aluno aluno3 = new Aluno("Aluno 3", "Sobrenome3",125);
        Aluno aluno4 = new Aluno("Aluno 4", "Sobrenome4",126);
        Aluno aluno5 = new Aluno("Aluno 5", "Sobrenome5",127);


        //Registrar alunos
        sistema.registrarAluno(aluno1.getNome(),aluno1.getSobrenome(),aluno1.getCodA());
        sistema.registrarAluno(aluno2.getNome(),aluno2.getSobrenome(),aluno2.getCodA());
        sistema.registrarAluno(aluno3.getNome(),aluno3.getSobrenome(),aluno3.getCodA());
        sistema.registrarAluno(aluno4.getNome(),aluno4.getSobrenome(),aluno4.getCodA());
        sistema.registrarAluno(aluno5.getNome(),aluno5.getSobrenome(),aluno5.getCodA());

        //Registrar Professores
        sistema.registrarProfessorAdjunto(professorAdjunto1.getNome(),professorAdjunto1.getSobrenome(),professorAdjunto1.getCodP(),professorAdjunto1.getQtddHoras());
        sistema.registrarProfessorAdjunto(professorAdjunto2.getNome(),professorAdjunto2.getSobrenome(),professorAdjunto2.getCodP(),professorAdjunto2.getQtddHoras());

        sistema.registrarProfessorTitular(professorTitular1.getNome(),professorTitular1.getSobrenome(),professorTitular1.getCodP(),professorTitular1.getEspecialidade());
        sistema.registrarProfessorTitular(professorTitular2.getNome(),professorTitular2.getSobrenome(),professorTitular2.getCodP(),professorTitular2.getEspecialidade());

        //Registrar Cursos
        sistema.registrarCurso(curso1.getNome(),curso1.getCodC(),curso1.getQtddAlunos());
        sistema.registrarCurso(curso2.getNome(),curso2.getCodC(),curso2.getQtddAlunos());

        //Alocar Professores
        sistema.alocarProfessores(20001,1,3);
        sistema.alocarProfessores(20002,2,4);

        sistema.matricularAluno(aluno5.getCodA(),curso2.getCodC());
        sistema.matricularAluno(aluno3.getCodA(),curso1.getCodC());
        sistema.matricularAluno(aluno2.getCodA(),curso1.getCodC());
       // sistema.matricularAluno(aluno1.getCodA(),curso1.getCodC());

        sistema.matricularAluno(aluno3.getCodA(),curso2.getCodC());

        sistema.consultarCurso(aluno3.getCodA());
    }
}