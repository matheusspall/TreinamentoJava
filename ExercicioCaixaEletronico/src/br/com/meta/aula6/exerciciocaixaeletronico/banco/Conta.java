package br.com.meta.aula6.exerciciocaixaeletronico.banco;

import br.com.meta.aula6.exerciciocaixaeletronico.extras.ValorPorExtenso;

public class Conta {

    private int numAgencia;
    private int numConta;
    private String senha;
    private int saldo;

    public Conta(int numAgencia, int numConta, String senha) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.senha = senha;
        this.saldo = 0;
    }
    
    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public String getSaldoPorExtenso(){
        return ValorPorExtenso.valorPorExtenso(getSaldo());
    }
    
    public void removeSaldo(int valorSaque){
        setSaldo(getSaldo() - valorSaque);
    }
    
    public void addSaldo(int valorDeposito){
        setSaldo(getSaldo() + valorDeposito);
    }

}
