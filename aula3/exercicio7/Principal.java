package br.com.meta.aula3.exercicio7;

public class Principal {

    public static void main(String[] args) {
        
        Fahrenheit t = new Fahrenheit();
        
        for (int i = 50; i <= 150; i+=2) {
            t.setGraus(i);
            System.out.println(i + " Fahrenheit = " + t.converterParaCelsius() + " Celsius");
        }
    }
}
