package br.com.meta.aula3.exercicio1;

public class MontadoraAuto {

    private Automovel auto;
    private int qtdFabricada;
    private int porcentagemDefeito;

    public Automovel getAuto() {
        return auto;
    }

    public void setAuto(Automovel auto) {
        this.auto = auto;
    }

    public int getQtdFabricada() {
        return qtdFabricada;
    }

    public void setQtdFabricada(int qtdFabricada) {
        this.qtdFabricada = qtdFabricada;
    }

    public int getPorcentagemDefeito() {
        return porcentagemDefeito;
    }

    public void setPorcentagemDefeito(int porcentagemDefeito) {
        this.porcentagemDefeito = porcentagemDefeito;
    }
}
