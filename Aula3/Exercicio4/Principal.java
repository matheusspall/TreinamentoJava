package Aula3.Exercicio4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Material mat = new Material();
        mat.setIntervalo(50);

        System.out.print("Massa Inicial (g): ");
        mat.setMassaInicial(scanner.nextDouble());
        String tempo = mat.calcularTempoTamanhoMenor();
        
        System.out.println("Massa Inicial: "+mat.getMassaInicial());
        System.out.println("Massa Final: "+mat.getMassaFinal());
        System.out.println("Tempo: "+tempo);
        
    }
}
