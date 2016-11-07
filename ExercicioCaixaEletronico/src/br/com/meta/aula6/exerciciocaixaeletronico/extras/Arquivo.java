package br.com.meta.aula6.exerciciocaixaeletronico.extras;

import br.com.meta.aula6.exerciciocaixaeletronico.banco.Movimentacao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivo {

    public static void gravarMovimentacaoTXT(ArrayList<Movimentacao> lista){
        FileWriter arq = null;
        try {
            arq = new FileWriter("Movimentacao_Banco.txt");
        } catch (IOException ex) {}
        
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("Movimentacoes%n");
        for (Movimentacao movimentacao : lista) {
            gravarArq.printf(" ---------- ");
            gravarArq.printf("%nAG: " + movimentacao.getConta().getNumAgencia());
            gravarArq.printf("%nConta: " + movimentacao.getConta().getNumConta());
            gravarArq.printf("%nSaldo: " + movimentacao.getConta().getSaldo() + " - " + movimentacao.getConta().getSaldoPorExtenso());
            gravarArq.printf("%n ---------- %n");
        }
        try {
            arq.close();
        } catch (IOException ex) {}
    }
}
