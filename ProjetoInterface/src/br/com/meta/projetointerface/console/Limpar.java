package br.com.meta.projetointerface.console;

public class Limpar {
    
    public static String limparConsole(){
        String quebraLinha = "";
        for(int i = 0; i < 50; i++) quebraLinha+="\n";
        return quebraLinha;
    }
    
}
