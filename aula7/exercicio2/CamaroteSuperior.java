package br.com.meta.aula7.exercicio2;

public class CamaroteSuperior extends VIP{

    private int valorAdicionalCamaroteSup;

    @Override
    public void setValor(int valor) {
        super.setValor(valor + getValorAdicionalCamaroteSup());
    }

    @Override
    public String imprimirValor() {
        return super.imprimirValor();
    }

    public int getValorAdicionalCamaroteSup() {
        return valorAdicionalCamaroteSup;
    }

    public void setValorAdicionalCamaroteSup(int valorAdicionalCamaroteSup) {
        this.valorAdicionalCamaroteSup = valorAdicionalCamaroteSup;
    }
    
}
