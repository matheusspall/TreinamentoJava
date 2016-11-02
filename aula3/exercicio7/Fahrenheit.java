package br.com.meta.aula3.exercicio7;

public class Fahrenheit {
    private double graus;

    public Fahrenheit(double graus){
        this.graus = graus;
    }
    
    public Fahrenheit(){ }
    
    public double getGraus() {
        return graus;
    }

    public void setGraus(double graus) {
        this.graus = graus;
    }
    
    public double converterParaCelsius(){
        return ((graus - 32) * 5 / 9);
    }
}
