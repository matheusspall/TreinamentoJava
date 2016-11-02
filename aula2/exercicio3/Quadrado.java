package br.com.meta.aula2.exercicio3;

public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double area(){
        return Math.pow(lado, 2);
    }
    
    public double perimetro(){
        return lado*4;
    }
    
    
}
