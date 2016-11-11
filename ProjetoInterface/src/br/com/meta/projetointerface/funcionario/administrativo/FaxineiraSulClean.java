package br.com.meta.projetointerface.funcionario.administrativo;

import br.com.meta.projetointerface.interfaces.IFaxineira;

public class FaxineiraSulClean implements IFaxineira {

    private String nome;
    private int idade;
    
    public FaxineiraSulClean(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public void varrer() {
        System.out.println("FaxineiraSulClean - Varrer");
    }

    @Override
    public void lavar() {
        System.out.println("FaxineiraSulClean - lavar");
    }

    @Override
    public void tirarLixo() {
        System.out.println("FaxineiraSulClean - tirarLixo");
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