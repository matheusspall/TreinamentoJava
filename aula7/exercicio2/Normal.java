package br.com.meta.aula7.exercicio2;

public class Normal extends Ingresso{

    @Override
    public void setValor(int valor) {
        super.setValor(valor);
    }
    
    @Override
    public String imprimirValor() {
        return "Ingresso Normal: " + getValor();
    }
    
}
