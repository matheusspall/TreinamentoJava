package br.com.meta.aula8.exercicio3;

import java.util.ArrayList;

public class AtualizarConta{
    private ArrayList<Conta> listaContas = new ArrayList<>();
    
    public void atualizar(float taxaPercentual){
        for(Conta conta : listaContas){
            if(conta instanceof ContaCorrente){
                conta.atualizaConta(2 * taxaPercentual);
            }else if(conta instanceof ContaPoupanca){
                conta.atualizaConta(3 * taxaPercentual);
            }else{
                conta.atualizaConta(taxaPercentual);
            }
        }
    }
    
    public void addConta(Conta conta){
        getListaContas().add(conta);
    }

    public ArrayList<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(ArrayList<Conta> listaContas) {
        this.listaContas = listaContas;
    }
}
