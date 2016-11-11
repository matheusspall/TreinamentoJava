package br.com.meta.projetointerface.funcionario.administrativo;

import br.com.meta.projetointerface.interfaces.IFaxineira;

public class FaxineiraCiaDasDiaristas implements IFaxineira {

    private String nome;
    private int idade;
    
    public FaxineiraCiaDasDiaristas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public void varrer() {
        System.out.println("FaxineiraCiaDasDiaristas - Varrer");
    }

    @Override
    public void lavar() {
        System.out.println("FaxineiraCiaDasDiaristas - lavar");
    }

    @Override
    public void tirarLixo() {
        System.out.println("FaxineiraCiaDasDiaristas - tirarLixo");
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