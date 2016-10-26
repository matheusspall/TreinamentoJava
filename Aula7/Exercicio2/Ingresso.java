package Aula7.Exercicio2;

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
