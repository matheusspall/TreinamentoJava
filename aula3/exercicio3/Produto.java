package br.com.meta.aula3.exercicio3;

public class Produto {
    private String nome;
    private double precoCompra, precoVenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public double percentualLucro(){
        double a = precoVenda - precoCompra;
        double b = a * 100;
        double c = b / precoVenda;
        return c;
    }
    
}
