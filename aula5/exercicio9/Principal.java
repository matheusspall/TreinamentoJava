package br.com.meta.aula5.exercicio9;

public class Principal {

    public static void main(String[] args) {
        
        Letra a = new Letra();
        
        System.out.println("Letra 'a': " + a.vogalOuConsoante("a"));
        
        int codASCLetra = '$';
        System.out.println("ASCII " + codASCLetra + ": " + a.vogalOuConsoante(codASCLetra));
        
    }
}
