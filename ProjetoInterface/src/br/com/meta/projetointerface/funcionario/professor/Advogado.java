package br.com.meta.projetointerface.funcionario.professor;

import br.com.meta.projetointerface.interfaces.IProfessor;

public class Advogado implements IProfessor {

    private String nome;
    private int idade;
    
    public Advogado(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public void darAula() {
        System.out.println("Advogado - darAula");
    }

    @Override
    public void lancarNotas() {
        System.out.println("Advogado - lancarNotas");
    }

    @Override
    public String dadosPessoais() {
        return "Advogado\nNome: " + getNome() + "\nIdade: " + getIdade();
    }

    @Override
    public Boolean temAutorizacao() {
        return true;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getIdade() {
        return idade;
    }
    
}