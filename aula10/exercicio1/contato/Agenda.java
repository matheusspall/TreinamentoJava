package br.com.meta.aula10.exercicio1.contato;

import br.com.meta.aula10.exercicio1.contato.Contato;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> agenda = new ArrayList<>();

    public void addContato(Contato contato) {
        agenda.add(contato);
    }

    public void removeContato(Contato contato) {
        agenda.remove(contato);
    }

    public Contato pesquisarPorTelefone(String telefone) {
        for (Contato contato : agenda) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        return null;
    }

    public Contato pesquisarPorNome(String nome) {
        for (Contato contato : agenda) {
            if (contato.getNome().contains(nome)) {
                return contato;
            }
        }
        return null;
    }

    public ArrayList<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contato> agenda) {
        this.agenda = agenda;
    }
}
