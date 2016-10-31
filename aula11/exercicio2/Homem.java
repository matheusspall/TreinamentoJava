package br.com.meta.aula11.exercicio2;

public class Homem extends PessoaIMC{

    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String resultadoIMC() {
        String resultado = "";
        
        double calcularIMC = super.calcularIMC();
        
        if(calcularIMC < 20.7){
            resultado = "IMC < 20.7 : Abaixo do peso ideal";
        }else if(20.7 <= calcularIMC && calcularIMC < 26.4){
            resultado = "20.7 < IMC < 26.4 : Peso ideal";
        }else if(26.4 < calcularIMC){
            resultado = "26.4 < IMC : Acima do peso ideal";
        }
        return resultado;
    }
    
}
