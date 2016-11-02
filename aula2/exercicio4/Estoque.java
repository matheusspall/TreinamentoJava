package br.com.meta.aula2.exercicio4;

public class Estoque {

    private String nome;
    private int qtdAtual, qtdMinima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        if (qtdAtual > 0) {
            this.qtdAtual = qtdAtual;
        }
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        if (qtdMinima > 0) {
            this.qtdMinima = qtdMinima;
        }
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public void mudarQtdMinima(int qtdMinima) {
        if (qtdMinima > 0) {
            this.qtdMinima = qtdMinima;
        }
    }

    public void repor(int qtd) {
        qtdAtual += qtd;
    }

    public void darBaixa(int qtd) {
        if (qtd < qtdAtual) {
            qtdAtual -= qtd;
        }
    }

    public String mostra() {
        return "Produto: " + nome + "\nQtd. Minima: " + qtdMinima + "\nQtd. Atual: " + qtdAtual;
    }

    public boolean precisaRepor() {
        if (qtdAtual <= qtdMinima) {
            return true;
        } else {
            return false;
        }
    }

}
