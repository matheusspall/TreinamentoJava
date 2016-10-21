package Aula3.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Automovel modeloX = new Automovel();
        modeloX.setModelo("modeloX");
        
        MontadoraAuto montadoraAutoX = new MontadoraAuto();
        montadoraAutoX.setAuto(modeloX);
        montadoraAutoX.setQtdFabricada(120);
         
        Automovel modeloY = new Automovel();
        modeloY.setModelo("modeloY");
        
        MontadoraAuto montadoraAutoY = new MontadoraAuto();
        montadoraAutoY.setAuto(modeloY);
        montadoraAutoY.setQtdFabricada(40);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Porcentagem de modeloX com defeito: ");
        montadoraAutoX.setPorcentagemDefeito(scanner.nextInt());
        
        System.out.print("Porcentagem de modeloY sem defeito: ");
        montadoraAutoY.setPorcentagemDefeito(100 - scanner.nextInt());
        
        Montadora fiat = new Montadora();
        fiat.adicionarAuto(montadoraAutoX);
        fiat.adicionarAuto(montadoraAutoY);
        
        System.out.println("modeloX com defeito: "+montadoraAutoX.getPorcentagemDefeito()+"%");
        System.out.println("modeloY com defeito: "+montadoraAutoY.getPorcentagemDefeito()+"%");
        System.out.println("total fabricado: "+fiat.totalAutoFabricado());
        System.out.println("total com defeito: "+fiat.totalAutoComDefeito());
        System.out.println("total de carros com defeito: "+fiat.percentagemTotalAutoComDefeito()+"%");
        
    }
}
