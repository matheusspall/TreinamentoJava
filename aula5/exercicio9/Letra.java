package br.com.meta.aula5.exercicio9;

public class Letra {

    public String vogalOuConsoante(String letra) {
        if (ehVogal(letra)) {
            return "eh Vogal";
        } else {
            return "eh Consoante";
        }
    }

    public boolean ehVogal(String letra) {
        if (letra.equals("a")
                || letra.equals("A")
                || letra.equals("e")
                || letra.equals("E")
                || letra.equals("i")
                || letra.equals("I")
                || letra.equals("o")
                || letra.equals("O")
                || letra.equals("u")
                || letra.equals("U")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ehConsoante(String letra) {
        if (letra.equals("a")
                || letra.equals("A")
                || letra.equals("e")
                || letra.equals("E")
                || letra.equals("i")
                || letra.equals("I")
                || letra.equals("o")
                || letra.equals("O")
                || letra.equals("u")
                || letra.equals("U")) {
            return false;
        } else {
            return true;
        }
    }

    public String vogalOuConsoante(int letra) {
        if (ehLetra(letra)) {
            if (ehVogal(letra)) {
                return "eh Vogal";
            } else {
                return "eh consoante";
            }
        }else{
            return "nao eh letra";
        }
    }

    public boolean ehLetra(int letra) {
        if ((letra >= 65 && letra <= 90) || (letra >= 97 && letra <= 122)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ehVogal(int letra) {
        if (letra == 97
                || letra == 65
                || letra == 101
                || letra == 69
                || letra == 105
                || letra == 73
                || letra == 111
                || letra == 79
                || letra == 117
                || letra == 85) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ehConsoante(int letra) {
        if (letra == 97
                || letra == 65
                || letra == 101
                || letra == 69
                || letra == 105
                || letra == 73
                || letra == 111
                || letra == 79
                || letra == 117
                || letra == 85) {
            return false;
        } else {
            return true;
        }
    }

}
