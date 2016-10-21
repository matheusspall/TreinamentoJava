package Aula1;


import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoGas = 3.39, precoAlcoolAte10L = 2.57, precoAlcoolAcima10L = 2.10;

        System.out.println("Litros de Gasolina");
        double litrosGas = scanner.nextDouble();

        System.out.println("Litros de Alcool");
        double litrosAlcool = scanner.nextDouble();

        double valorTotal = litrosGas * precoGas;

        if (litrosAlcool > 10) {
            valorTotal = +litrosAlcool * precoAlcoolAcima10L;
        } else {
            valorTotal = +litrosAlcool * precoAlcoolAte10L;
        }

        if (((litrosAlcool + litrosGas) > 20) || valorTotal > 70.00) {
            valorTotal = valorTotal * 0.9;
        }

        System.out.println("Valor Total: " + valorTotal);
    }

}
