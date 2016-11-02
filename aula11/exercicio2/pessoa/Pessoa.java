package br.com.meta.aula11.exercicio2.pessoa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Pessoa {

    protected String nome;
    protected String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String imprimir() {
        int diaNascimento = Integer.parseInt(dataNascimento.substring(0, 2));
        
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int anoNascimento = Integer.parseInt(dataNascimento.substring(6, 10));
        int idade = anoAtual - anoNascimento;

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = null;
        try {
            dt = df.parse(dataNascimento);
        } catch (ParseException ex) {
        }
        DateFormat df2 = new SimpleDateFormat("MMMMM", new Locale("pt", "BR"));

        return "Nome: " + nome + ""
                + "\nData de Nascimento: " + diaNascimento + " de " + df2.format(dt) + " de " + anoNascimento
                + "\nIdade: " + idade;
    }

}
