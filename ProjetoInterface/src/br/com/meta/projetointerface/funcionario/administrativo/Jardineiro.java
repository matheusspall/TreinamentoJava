package br.com.meta.projetointerface.funcionario.administrativo;

import br.com.meta.projetointerface.interfaces.IEpi;
import br.com.meta.projetointerface.interfaces.IJardineiro;

public class Jardineiro implements IJardineiro, IEpi {

    private String nome;
    private int idade;
    
    public Jardineiro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public void cortarGrama() {
        System.out.println("Jardineiro - cortar grama");
    }

    @Override
    public void apararArbusto() {
        System.out.println("Jardineiro - aparar arbusto");
    }

    @Override
    public Boolean temAutorizacao() {
        return true;
    }

    @Override
    public Boolean possuiEquipamento() {
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