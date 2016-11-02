package br.com.meta.aula8.exercicio2;

public class Conta {
    private float saldo;
    
    public Conta(){
        setSaldo(0);
    }

    public void depositar(float valor){
        saldo += valor;
    }
    
    public void sacar(float valor){
        if(valor < saldo){
            saldo -= valor;
        }
    }
    
    public void atualizaConta(float taxaPercentual){
        if(taxaPercentual > 0){
            saldo += (saldo * (taxaPercentual/100));
        }
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
