package br.com.meta.aula2.exercicio1;

public class Principal {
    
    public static void main(String[] args) {
        
        Pessoa matheus = new Pessoa();
        
        matheus.setNome("Matheus Spall");
        matheus.setIdade(22);
        
        System.out.println(matheus.retornaNomeIdade());
        
        matheus.fazAniversario();
        matheus.fazAniversario();
        matheus.fazAniversario();
        
        System.out.println(matheus.retornaNomeIdade());
        
        matheus.fazAniversario();
        matheus.fazAniversario();
        
        System.out.println(matheus.retornaNomeIdade());
        
    }
    
}
