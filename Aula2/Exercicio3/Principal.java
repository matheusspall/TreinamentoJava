package Aula2.Exercicio3;

public class Principal {

    public static void main(String[] args) {
        Quadrado quad = new Quadrado();

        quad.setLado(5);
        
        System.out.println("Area: "+quad.area());
        System.out.println("Perimetro: "+quad.perimetro());
    }
}
