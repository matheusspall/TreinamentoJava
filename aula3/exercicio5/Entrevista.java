package br.com.meta.aula3.exercicio5;

import java.util.ArrayList;

public class Entrevista {

    private ArrayList<Pessoa> entrevistados = new ArrayList<>();

    public ArrayList<Pessoa> getEntrevistados() {
        return entrevistados;
    }

    public void setEntrevistados(ArrayList<Pessoa> entrevistados) {
        this.entrevistados = entrevistados;
    }

    public void adicionarEntrevista(Pessoa pessoa) {
        entrevistados.add(pessoa);
    }

    public int getVotosSim() {
        int cont = 0;
        for (Pessoa p : entrevistados) {
            if (p.getResponsta().equals("sim")) {
                cont++;
            }
        }
        return cont;
    }

    public double getPercMulheresSim() {
        double cont = 0;
        for (Pessoa p : entrevistados) {
            if (p.getSexo().equals("Feminino") && p.getResponsta().equals("sim")) {
                cont++;
            }
        }
        double a = cont / entrevistados.size();
        return a * 100;
    }

    public double getPercHomensNao() {
        double cont = 0;
        for (Pessoa p : entrevistados) {
            if (p.getSexo().equals("Masculino") && p.getResponsta().equals("nao")) {
                cont++;
            }
        }
        double a = cont / entrevistados.size();
        return a * 100;
    }
}
