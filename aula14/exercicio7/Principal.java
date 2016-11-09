package br.com.meta.aula14.exercicio7;

public class Principal {
    
    public static void main(String[] args) {
        
        try {
            new Metodo(args);
            System.out.println("Sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
