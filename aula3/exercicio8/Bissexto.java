package br.com.meta.aula3.exercicio8;

public class Bissexto {
    private int ano;

    public boolean verificarAno(){
        if ((((ano % 400) == 0) || ((ano % 4) == 0)) && (ano % 100) != 0) return true;
        else return false;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
