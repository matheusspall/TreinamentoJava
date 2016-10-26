package Aula7.Exercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o Imovel de sua preferencia:"
                + "\n1) Imovel Novo"
                + "\n2) Imovel Velho"
                + "\nOpcao: "
        );
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("------ Imovel novo ------");
                Imovel novo = new Novo(400);
                novo.setEndereco("Estrada Miguel Beltrame, 99");
                novo.setPreco(1000);
                System.out.println(novo.imprimir());
                break;

            case 2:
                System.out.println("------ Imovel velho ------");
                Imovel velho = new Velho(200);
                velho.setEndereco("Estrada Miguel Beltrame, 99");
                velho.setPreco(1000);
                System.out.println(velho.imprimir());
                break;
                
            default :
                break;
        }

    }
}
