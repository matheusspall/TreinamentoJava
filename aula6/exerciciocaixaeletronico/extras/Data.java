
package br.com.meta.aula6.exerciciocaixaeletronico.extras;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    public static String getDataAtual() {
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(hoje);
    }

}
