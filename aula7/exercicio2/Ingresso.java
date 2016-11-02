package br.com.meta.aula7.exercicio2;

public class Ingresso {
    private int valor;
    
    public String imprimirValor(){
        return "Valor: " + getValor();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
