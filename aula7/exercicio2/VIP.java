package br.com.meta.aula7.exercicio2;

public class VIP extends Ingresso{
    private int valorAdicionalVip;

    @Override
    public void setValor(int valor) {
        super.setValor(valor + getValorAdicionalVip());
    }

    public int getValorAdicionalVip() {
        return valorAdicionalVip;
    }

    public void setValorAdicionalVip(int valorAdicionalVip) {
        this.valorAdicionalVip = valorAdicionalVip;
    }
    
}
