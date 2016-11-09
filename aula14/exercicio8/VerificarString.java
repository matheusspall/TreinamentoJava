package br.com.meta.aula14.exercicio8;

public class VerificarString {

    public static void ehLetras(String string) throws Exception {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLetter(string.charAt(i))) {
                throw new Exception();
            }
        }
    }

    public static void ehMaiuscula(String string) throws Exception {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isUpperCase(string.charAt(i))) {
                throw new Exception();
            }
        }
    }

}
