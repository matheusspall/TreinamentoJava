package br.com.meta.aula7.exercicio2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o tipo do Ingresso:"
                + "\n1) Normal"
                + "\n2) VIP"
                + "\nOpcao: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                Normal ingNormal = new Normal();
                ingNormal.setValor(50);
                System.out.println(ingNormal.imprimirValor());
                break;

            case 2:

                System.out.print("\nInforme o camarote:"
                        + "\n1) Camarote Superior"
                        + "\n2) Camarote Inferior"
                        + "\nOpcao: ");
                int opVip = scanner.nextInt();

                switch (opVip) {
                    case 1:
                        CamaroteSuperior ingressoCamSup = new CamaroteSuperior();
                        ingressoCamSup.setValorAdicionalCamaroteSup(500);
                        ingressoCamSup.setValorAdicionalVip(200);
                        ingressoCamSup.setValor(50);
                        System.out.println("Ingresso Camarote Superior - " + ingressoCamSup.imprimirValor());
                        break;

                    case 2:
                        CamaroteInferior ingressoCamInf = new CamaroteInferior();
                        ingressoCamInf.setLocalizacao("Arquibancada");
                        ingressoCamInf.setValorAdicionalVip(200);
                        ingressoCamInf.setValor(50);
                        System.out.println("Ingresso Camarote Inferior - " + ingressoCamInf.imprimirValor() + " - Localizacao: " + ingressoCamInf.getLocalizacao());
                        break;

                    default:
                        break;
                }

                break;

            default:
                break;
        }
    }
}
