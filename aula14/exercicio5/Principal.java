package br.com.meta.aula14.exercicio5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nome 1: ");
        String nome1 = scanner.nextLine();

        System.out.print("nome 2: ");
        String nome2 = scanner.nextLine();

        try {
            switch (VerificarTam.verificar(nome1, nome2)) {
                case 0:
                    System.out.println("nomes com tamanhos iguais");
                    break;
                case 1:
                    System.out.println("nome1 maior");
                    break;
                case -1:
                    System.out.println("nome1 menor");
                    break;
            }
        } catch (NullPointerException ex) {
            System.out.println("Variavel nao inicializada!");
        } catch(Exception e){
            
        }
    }

}
