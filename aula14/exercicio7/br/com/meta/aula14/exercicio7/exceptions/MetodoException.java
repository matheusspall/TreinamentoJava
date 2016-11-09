package br.com.meta.aula14.exercicio7.br.com.meta.aula14.exercicio7.exceptions;

public class MetodoException extends Exception{
    
    private int numArgumentos;
    
    public MetodoException(int numArgumentos){
        this.numArgumentos = numArgumentos;
    }

    @Override
    public String getMessage() {
        return "Quantidade de argumentos incorreta, eh necessario 4 argumentos e foi informado " + numArgumentos + "!";
    }
    
    
}
