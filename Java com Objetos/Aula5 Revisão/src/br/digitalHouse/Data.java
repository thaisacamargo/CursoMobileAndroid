package br.digitalHouse;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //construtor
    public Data(int novoDia, int novoMes, int novoAno){
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;
    }

    //Gets
    public int getDia() {
        return dia;
    }
    public int getAno() {
        return ano;
    }
    public int getMes() {
        return mes;
    }

    //Sets
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
