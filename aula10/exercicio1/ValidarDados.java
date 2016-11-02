package br.com.meta.aula10.exercicio1;

class ValidarDados {

    public static boolean validarCpfCnpj(String dado) {
        int tam = dado.length();
        if (tam == 11 || tam == 14) {
            for (int i = 0; i < tam; i++) {
                if (!(dado.charAt(i) == '1')
                        && !(dado.charAt(i) == '2')
                        && !(dado.charAt(i) == '3')
                        && !(dado.charAt(i) == '4')
                        && !(dado.charAt(i) == '5')
                        && !(dado.charAt(i) == '6')
                        && !(dado.charAt(i) == '7')
                        && !(dado.charAt(i) == '8')
                        && !(dado.charAt(i) == '9')
                        && !(dado.charAt(i) == '0')) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
