package br.com.meta.aula3.exercicio9;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Informe o valor do financiamento pretendido: ");
        double valorFinanciamento = scanner.nextDouble();

        Financeira f = new Financeira(salario, valorFinanciamento);

        System.out.println(f.validarFinanciamento());
        System.out.println("Obrigado por nos consultar");
    }
}
