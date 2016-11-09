package br.com.meta.aula14.exercicio2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Numero 1: ");
        try {
            num1 = scanner.nextDouble();

            System.out.print("Numero 2: ");
            try {
                num2 = scanner.nextDouble();

                try {
                    System.out.printf(num1 + "/" + num2 + " = " + "%.2f", OperacoesMath.dividir(num1, num2)); //java trata divisao por 0 e apresenta "Infinity" como resposta
                } catch (ArithmeticException e) {
                    System.out.print("getMessage: " + e.getMessage());
                }
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Numero informado no formato errado!");
            }
        } catch (Exception e) {
            System.out.println("Numero informado no formato errado!");
        }
    }
}
