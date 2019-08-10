package br.digitalHouse;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private int qtdAtual;
    private Pessoa pessoa;
    private List<Pessoa> pessoas = new ArrayList<>();


    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void imprimeCadastro(){
        for (int i=0; i<pessoas.size(); i++){
            System.out.println(pessoas.get(i).toString());
        }
    }
}
