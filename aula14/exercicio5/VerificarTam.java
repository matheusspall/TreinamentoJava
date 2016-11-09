package br.com.meta.aula14.exercicio5;

public class VerificarTam {

    public static int verificar(String nome1, String nome2) throws Exception{

        int tam1 = nome1.length(), tam2 = nome2.length();
        
        if(tam1 == 0 || tam2 == 0){
            throw new NullPointerException();
        }

        if (tam1 == tam2) {
            return 0;
        } else if (tam1 > tam2) {
            return 1;
        } else {
            return -1;
        }
    }

}
