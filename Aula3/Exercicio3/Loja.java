package Aula3.Exercicio3;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Produto> estoque = new ArrayList<>();

    public ArrayList<Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<Produto> estoque) {
        this.estoque = estoque;
    }

    public void adicionarProduto(Produto prod) {
        estoque.add(prod);
    }

    public int getNumProdutosLucroMenor10() {
        int cont = 0;
        for (Produto item : estoque) {
            if (item.percentualLucro() < 10) {
                cont++;
            }
        }
        return cont;
    }
    
    public int getNumProdutosLucroEntre10e20() {
        int cont = 0;
        for (Produto item : estoque) {
            if ((10 < item.percentualLucro()) && (item.percentualLucro() < 20)) {
                cont++;
            }
        }
        return cont;
    }
    
    public int getNumProdutosLucroMaior20() {
        int cont = 0;
        for (Produto item : estoque) {
            if (item.percentualLucro() > 20) {
                cont++;
            }
        }
        return cont;
    }
    
    public double getValorTotalCompra(){
        double total = 0;
        for (Produto item : estoque){
            total += item.getPrecoCompra();
        }
        return total;
    }
    
    public double getValorTotalVenda(){
        double total = 0;
        for (Produto item : estoque){
            total += item.getPrecoVenda();
        }
        return total;
    }
    
    public double getLucroTotal(){
        double valorCompra = getValorTotalCompra();
        double valorVenda = getValorTotalVenda();
        return (valorCompra / valorVenda) * 100;
    }
}
