package Aula1;


import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        int codigo, anoNasc, idade;
        double nota1 = 0.0f, horaCursos = 0.0f, tempoExperiencia = 0.0f;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Código do candidato: ");
        codigo = scanner.nextInt();

        System.out.print("Ano de Nascimento: ");
        anoNasc = scanner.nextInt();
        idade = 2016 - anoNasc;

        System.out.print("Nota primeira etapa: ");
        nota1 = scanner.nextDouble();

        System.out.print("Horas de cursos realizados: ");
        horaCursos = scanner.nextDouble();

        System.out.print("Tempo de experiencia na area (anos): ");
        tempoExperiencia = scanner.nextDouble();

        if (nota1 >= 8.0f || (tempoExperiencia >= 2 && idade <= 30) || horaCursos > 1000.0f) {
            System.out.println("Codigo: " + codigo + "\nIdade: " + idade + "\nAprovado para a Segunda etapa");
        } else {
            System.out.println("Codigo: " + codigo + "\nIdade: " + idade + "\nReprovado");
        }

    }

}
