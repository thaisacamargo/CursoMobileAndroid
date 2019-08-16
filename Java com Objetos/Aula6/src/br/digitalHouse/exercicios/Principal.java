package br.digitalHouse.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoinha1 = new Pessoa("Thais", 123456788);
        Pessoa pessoinha2 = new Pessoa("Andrea", 123456788);

        System.out.println("------------       RG    ---------------");
        System.out.println(pessoinha1.equals(pessoinha2));


        System.out.println("------------       COCA    ---------------");

        Coca coca1 = new Coca(10,20.0);
        Coca coca2 = new Coca(10,22.0);

        System.out.println(coca1.equals(coca2));


        System.out.println("------------       ALUNO    ---------------");
        Aluno aluno1 = new Aluno("aluno1",1);
        Aluno aluno2 = new Aluno("aluno2",2);
        Aluno aluno3 = new Aluno("aluno3",3);
        Aluno aluno4 = new Aluno("aluno4",4);
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno4);

        Aluno alunoNovo = new Aluno("Aluno Novo", 2);
        System.out.println(listaAlunos.contains(alunoNovo));



        System.out.println("------------       FUNCIONÁRIO    ---------------");
        Funcionario funcionário1 = new Funcionario("funcionário1",1);
        Funcionario funcionário2 = new Funcionario("funcionário2",2);
        Funcionario funcionário3 = new Funcionario("funcionário3",3);
        Funcionario funcionário4 = new Funcionario("funcionário",4);
        List<Funcionario> listaFuncionario = new ArrayList<>();

        listaFuncionario.add(funcionário1);
        listaFuncionario.add(funcionário2);
        listaFuncionario.add(funcionário3);
        listaFuncionario.add(funcionário4);

        Funcionario funcionarioNovo = new Funcionario("Funcionário Novo", 3);
        System.out.println(listaFuncionario.contains(funcionarioNovo));


    }
}
