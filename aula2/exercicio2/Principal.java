package br.com.meta.aula2.exercicio2;

public class Principal {

    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        System.out.println(lamp.observa());
        lamp.setLigada(true);
        System.out.println(lamp.observa());
        lamp.setLigada(false);
        System.out.println(lamp.observa());

    }
}
