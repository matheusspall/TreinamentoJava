package Aula3.Exercicio8;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Bissexto bissexto = new Bissexto();
        
        System.out.print("Informe o ano: ");
        bissexto.setAno(scanner.nextInt());
        
        if (bissexto.verificarAno()) System.out.println(bissexto.getAno() + " eh ano bissexto!");
        else System.out.println(bissexto.getAno() + " nao eh ano bissexto!");
        
    }
}
