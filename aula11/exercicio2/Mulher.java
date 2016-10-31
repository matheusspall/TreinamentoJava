package br.com.meta.aula11.exercicio2;

public class Mulher extends PessoaIMC{
    
    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String resultadoIMC() {
        String resultado = "";
        
        double calcularIMC = super.calcularIMC();
        
        if(calcularIMC < 19){
            resultado = "IMC < 19 : Abaixo do peso ideal";
        }else if(19 <= calcularIMC && calcularIMC < 25.8){
            resultado = "19 < IMC < 25.8 : Peso ideal";
        }else if(25.8 < calcularIMC){
            resultado = "25.8 < IMC : Acima do peso ideal";
        }
        return resultado;
    }
    
}
