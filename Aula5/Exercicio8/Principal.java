package Aula5.Exercicio8;

public class Principal {

    public static void main(String[] args) {
        
        Moto xre300 = new Moto("honda", "xre300", "preta", 0, 0, 6);
        
        System.out.println(xre300.imprimir());
        
        xre300.marchaAbaixo();
        System.out.println("\n" + xre300.imprimir());
        
        xre300.marchaAcima();
        xre300.marchaAcima();
        xre300.marchaAcima();
        System.out.println("\n" + xre300.imprimir());
        
        xre300.marchaAcima();
        xre300.marchaAcima();
        xre300.marchaAcima();
        xre300.marchaAcima();
        xre300.marchaAcima();
        xre300.marchaAcima();
        xre300.marchaAcima();
        System.out.println("\n" + xre300.imprimir());
        
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();
        System.out.println("\n" + xre300.imprimir());
        
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();
        xre300.marchaAbaixo();        
        System.out.println("\n" + xre300.imprimir());
        
        xre300.marchaAcima(2);
        System.out.println("\n" + xre300.imprimir());
        
        xre300.marchaAcima(5);
        System.out.println("\n" + xre300.imprimir());
        
        xre300.marchaAbaixo(10);
        System.out.println("\n" + xre300.imprimir());
    }
}
