package br.com.meta.aula6.exerciciocaixaeletronico.pessoas;

import br.com.meta.aula6.exerciciocaixaeletronico.banco.Conta;

public class Cliente {
    
    private Conta conta;
    
    public Cliente(Conta conta){
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    
}
