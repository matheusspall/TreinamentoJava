package Aula5.Exercicio3;

public class Principal {

    public static void main(String[] args) {

        Retangulo ret = new Retangulo(4, 6);

        System.out.println(ret.imprimir());

        ret.setComprimento(8);
        ret.setLargura(9);
        ret.calcularArea();
        ret.calcularPerimetro();
        System.out.println("\n" + ret.imprimir());
        
        ret.setComprimento(12);
        ret.setLargura(23);
        ret.calcularTudo();
        System.out.println("\n" + ret.imprimir());
    }
}
