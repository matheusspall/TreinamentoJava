package Aula3.Exercicio3;

public class Principal {

    public static void main(String[] args) {
        
        Produto sabao = new Produto();
        sabao.setNome("sabao");
        sabao.setPrecoCompra(2.99);
        sabao.setPrecoVenda(3.59);
        
        Produto vasoura = new Produto();
        vasoura.setNome("vasoura");
        vasoura.setPrecoCompra(7.99);
        vasoura.setPrecoVenda(8.00);
        
        Produto chinelo = new Produto();
        chinelo.setNome("chinelo");
        chinelo.setPrecoCompra(5.50);
        chinelo.setPrecoVenda(15.50);
        
        Produto mochila = new Produto();
        mochila.setNome("mochila");
        mochila.setPrecoCompra(53.50);
        mochila.setPrecoVenda(115.00);
        
        Loja atacadao = new Loja();
        atacadao.adicionarProduto(sabao);
        atacadao.adicionarProduto(vasoura);
        atacadao.adicionarProduto(chinelo);
        atacadao.adicionarProduto(mochila);
        
        System.out.println("Qtd produtos com lucro menor 10%: " + atacadao.getNumProdutosLucroMenor10());
        System.out.println("Qtd produtos com lucro entre 10% e 20%: " + atacadao.getNumProdutosLucroEntre10e20());
        System.out.println("Qtd produtos com lucro maior 20%: " + atacadao.getNumProdutosLucroMaior20());
        System.out.println("Vaor total em Compras: "+atacadao.getValorTotalCompra());
        System.out.println("Vaor total em Vendas: "+atacadao.getValorTotalVenda());
    }
}
