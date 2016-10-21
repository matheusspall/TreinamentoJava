package Aula3.Exercicio2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.print("Quantos numero deseja ler? ");
        int qtdNum = scanner.nextInt();

        for (int i = 0; i < qtdNum; i++) {
            System.out.print("Numero " + i + " = ");
            numero.adicionarNumero(scanner.nextInt());
        }
        
        numero.ordenarLista();
        
        System.out.println("Maior numero: " + numero.getMaiorNumero());
        System.out.println("Menor numero: " + numero.getMenorNumero());
        System.out.println("Média: " + numero.getMediaNumero());
    }
}
