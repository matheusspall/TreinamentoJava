package br.com.meta.aula2.exercicio4;

public class Principal {

    public static void main(String[] args) {
        Estoque estoque1 = new Estoque();
        Estoque estoque2 = new Estoque();
        Estoque estoque3 = new Estoque();
        
        estoque1.setNome("Impressora Jato de Tinta");
        estoque1.setQtdAtual(13);
        estoque1.setQtdMinima(2);
        
        estoque2.setNome("Monitor LCD 17 polegadas");
        estoque2.setQtdAtual(11);
        estoque2.setQtdMinima(13);
        
        estoque3.setNome("Mouse");
        estoque3.setQtdAtual(6);
        estoque3.setQtdMinima(2);
        
        System.out.println(estoque1.mostra()+"\n");
        System.out.println(estoque2.mostra()+"\n");
        System.out.println(estoque3.mostra()+"\n");
        
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(3);
        
        System.out.println("Repor estoque1?"+estoque1.precisaRepor());
        System.out.println("Repor estoque2? "+estoque2.precisaRepor());
        System.out.println("Repor estoque3? "+estoque3.precisaRepor()+"\n");
        
        System.out.println(estoque1.mostra()+"\n");
        System.out.println(estoque2.mostra()+"\n");
        System.out.println(estoque3.mostra()+"\n");
    }
}
