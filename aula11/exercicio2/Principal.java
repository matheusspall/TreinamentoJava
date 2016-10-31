package br.com.meta.aula11.exercicio2;

import br.com.meta.aula11.exercicio2.pessoa.Mulher;
import br.com.meta.aula11.exercicio2.pessoa.Homem;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nome, dataNasc;
        Double peso, altura;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu sexo:"
                + "\n1) Masculino"
                + "\n2) Feminino"
                + "\nOpcao: ");
        int opSexo = scanner.nextInt();

        switch (opSexo) {
            case 1:
                System.out.print("Nome: ");
                nome = scanner.next();
                
                System.out.print("Data Nascimento (dd/mm/aaaa): ");
                dataNasc = scanner.next();
                
                System.out.print("Peso: ");
                peso = scanner.nextDouble();
                
                System.out.print("Altura: ");
                altura = scanner.nextDouble();
                
                Homem h1 = new Homem(nome, dataNasc, peso, altura);
                System.out.println("\n");
                System.out.println(h1.imprimir());
                System.out.println(h1.resultadoIMC());
                break;
            
            case 2:
                System.out.print("Nome: ");
                nome = scanner.next();
                
                System.out.print("Data Nascimento (dd/mm/aaaa): ");
                dataNasc = scanner.next();
                
                System.out.print("Peso: ");
                peso = scanner.nextDouble();
                
                System.out.print("Altura: ");
                altura = scanner.nextDouble();
                
                Mulher m1 = new Mulher(nome, dataNasc, peso, altura);
                System.out.println("\n");
                System.out.println(m1.imprimir());
                System.out.println(m1.resultadoIMC());
                break;
         
            default:
                break;
        }

    }
}
