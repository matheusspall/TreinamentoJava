package Aula2.Exercicio2Refatorado;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Combustivel gasolina = new Combustivel();
        Combustivel alcool = new Combustivel();
        Bomba bomba = new Bomba();

        gasolina.setPreco(3.39);
        gasolina.setPrecoDesconto(3.39);
        alcool.setPreco(2.57);
        alcool.setPrecoDesconto(2.10);

        System.out.print("Litros de Gasolina: ");
        gasolina.setLitros(scanner.nextDouble());

        System.out.print("Litros de Alcool: ");
        alcool.setLitros(scanner.nextDouble());

        bomba.setGasolina(gasolina);
        bomba.setAlcool(alcool);
        
        System.out.println("Valor Total: " + String.format("%.2f", bomba.valorTotal()));
    }
}
