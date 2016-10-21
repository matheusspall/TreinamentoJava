package Aula2.Exercicio2Refatorado;

public class Combustivel {

    private double preco;
    private double precoDesconto;
    private double litros;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPrecoDesconto(double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public double valorTotal() {
        if (litros > 10) {
            return litros * precoDesconto;
        } else {
            return litros * preco;
        }
    }

}
