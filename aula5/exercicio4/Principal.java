package br.com.meta.aula5.exercicio4;

public class Principal {

    public static void main(String[] args) {
        
        Moto xre300 = new Moto();
        
        xre300.setMarca("honda");
        xre300.setModelo("xre300");
        xre300.setCor("preta");
        xre300.setMarcha(0);
        
        System.out.println(xre300.imprimir());
        
    }
}
