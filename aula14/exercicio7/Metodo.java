package br.com.meta.aula14.exercicio7;

import br.com.meta.aula14.exercicio7.br.com.meta.aula14.exercicio7.exceptions.MetodoException;

public class Metodo {
    
    private String[] args;
    
    public Metodo(String[] args) throws MetodoException{
        if (args.length != 4) {
            throw new MetodoException(args.length);
        }else{
            this.args = args;
        }
    }
}
