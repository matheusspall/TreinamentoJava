package br.com.meta.aula2.exercicio2;

public class Lampada {

    private boolean ligada;

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void liga() {
        ligada = true;
    }

    public void desliga() {
        ligada = false;
    }

    public String observa() {
        if (ligada) {
            return "Ligada";
        } else {
            return "Desligada";
        }
    }

}
