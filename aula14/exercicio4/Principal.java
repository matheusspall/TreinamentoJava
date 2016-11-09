package br.com.meta.aula14.exercicio4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int[] metodo = null;

        System.out.print("Informe um numero inteiro: ");

        try {
            num = scanner.nextInt();
            metodo = Vetor.inicializa(num);

            for (int i = 0; i < metodo.length; i++) {
                System.out.print("v[" + i + "] = ");
                try {
                    metodo[i] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Exception 1: " + e.getMessage());
                }
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Valor negativo informado!");
        } catch (Exception e) {
            System.out.println("Exception 3: " + e.getMessage());
        }

        try{
            System.out.print("Vetor: ");
            for (int i = 0; i < metodo.length; i++) {
                System.out.print(metodo[i] + "  ");
            }
        } catch(Exception e) {
            System.out.println("Vetor nao inicializado!");
        }
    }
}
