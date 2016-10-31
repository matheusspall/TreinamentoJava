package br.com.meta.aula11.exercicio1;

public abstract class Calculadora {

    public float somar(float num1, float num2) {
        return num1 + num2;
    }

    public float subtrair(float num1, float num2) {
        return num1 - num2;
    }

    public float dividir(float num1, float num2) {
        return num1 / num2;
    }

    public float multiplicar(float num1, float num2) {
        return num1 * num2;
    }
    
    public abstract float raizQuad(float radicando);
    public abstract float potencia(float base, float exp);

}
