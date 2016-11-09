package br.com.meta.aula14.exercicio8;

public class Principal {

    public static void main(String[] args) {

        String palavra = "MATHEUS";

        try {
            VerificarString.ehLetras(palavra);
            try {
                VerificarString.ehMaiuscula(palavra);
                System.out.println("Palavra correta");
            } catch (Exception e) {
                System.out.println("Palavra com letra minuscula!");
            }
        } catch (Exception e) {
            System.out.println("Palavra com caracter nao letra!");
        }

    }

}
