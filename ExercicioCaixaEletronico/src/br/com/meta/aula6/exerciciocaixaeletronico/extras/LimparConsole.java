package br.com.meta.aula6.exerciciocaixaeletronico.extras;

public class LimparConsole {
    
    public static String limparConsole(){
        String quebraLinha = "";
        for(int i = 0; i < 50; i++) quebraLinha+="\n";
        return quebraLinha;
    }
    
}
