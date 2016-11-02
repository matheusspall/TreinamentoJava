package br.com.meta.aula11.exercicio2.pessoa;

public abstract class PessoaIMC extends Pessoa{
    
    private double peso;
    private double altura;
    
    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return (peso / (Math.pow(altura, 2)));
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    public abstract String resultadoIMC();

    @Override
    public String imprimir() {
        return super.imprimir() + ""
                + "\nPeso: " + peso + ""
                + "\nAltura: " + altura;
        
    }
}
