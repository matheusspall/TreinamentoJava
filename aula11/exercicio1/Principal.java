package br.com.meta.aula11.exercicio1;

public class Principal {
    public static void main(String[] args) {
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        System.out.println("2^4 = " + cc.potencia(2, 4));
        System.out.println("Raiz de 64 = " + cc.raizQuad(64));
    }
}
