package br.com.meta.aula7.exercicio4;

public class Principal {

    public static void main(String[] args) {
        
        Vendedor v1 = new Vendedor(1000);
        v1.addVendaMes();
        v1.addVendaMes();
        v1.addVendaMes();
        v1.addVendaMes();
        System.out.println("Vendedor:\n" + v1.imprimirSalario());

        Administrador a1 = new Administrador(2000);
        a1.addHoraExtra();
        a1.addHoraExtra();
        a1.addHoraExtra();
        System.out.println("Adm:\n" + a1.imprimirSalario());
        
    }
}
