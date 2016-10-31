package br.com.meta.aula11.exercicio1.calculadora;

import br.com.meta.aula11.exercicio1.calculadora.Calculadora;

public class CalculadoraCientifica extends Calculadora{

    @Override
    public float raizQuad(float radicando) {
        return (float) Math.sqrt(radicando);
    }

    @Override
    public float potencia(float base, float exp) {
        return (float) Math.pow(base, exp);
    }
    
}
