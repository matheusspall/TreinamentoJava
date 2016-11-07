package br.com.meta.aula6.exerciciocaixaeletronico.banco;

public class Movimentacao {

    private String tipoOperacao;
    private String data;
    private int valor;
    private Conta conta;
    private boolean validado;

    public Movimentacao(String tipoOperacao, String data, int valor, Conta conta) {
        this.tipoOperacao = tipoOperacao;
        this.data = data;
        this.valor = valor;
        this.conta = conta;
        this.validado = tipoOperacao.equals("Reposicao") || tipoOperacao.equals("Esvaziar");
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

}
