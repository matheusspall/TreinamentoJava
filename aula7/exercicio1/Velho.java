package br.com.meta.aula7.exercicio1;

public class Velho extends Imovel {

    private int descontoPreco;

    public Velho(int descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

    @Override
    public void setPreco(int preco) {
        super.setPreco(preco - getDescontoPreco());
    }

    @Override
    public String imprimir() {
        return super.imprimir();
    }

    public int getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(int descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

}
