package br.com.meta.projetointerface.funcionario.professor;

import br.com.meta.projetointerface.interfaces.IProfessor;

public class Dentista implements IProfessor {

    private String nome;
    private int idade;
    
    public Dentista(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public void darAula() {
        System.out.println("Dentista - darAula");
    }

    @Override
    public void lancarNotas() {
        System.out.println("Dentista - lancarNotas");
    }

    @Override
    public String dadosPessoais() {
        return "Dentista\nNome: " + getNome() + "\nIdade: " + getIdade();
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
