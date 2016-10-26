package Aula7.Exercicio1;

public class Novo extends Imovel{

    private int adicionalPreco;
    
    public Novo(int adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }
    
    @Override
    public void setPreco(int preco) {
        super.setPreco(preco + adicionalPreco);
    }
    
    @Override
    public String imprimir() {
        return super.imprimir();
    }

    public int getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(int adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }
    
    
    
}
