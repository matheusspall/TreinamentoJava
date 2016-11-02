package br.com.meta.aula7.exercicio1;

public class Imovel {

    private String endereco;
    private int preco;

    public String imprimir() {
        return "Endereco: " + getEndereco() + "\nPreco: " + getPreco();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
