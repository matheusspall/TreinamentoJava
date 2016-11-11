package br.com.meta.projetointerface.aluno;

import br.com.meta.projetointerface.interfaces.IControleAluno;
import java.util.ArrayList;

public class ControleAluno implements IControleAluno{
    
    private ArrayList<Aluno> alunos;

    public ControleAluno(){
        alunos = new ArrayList<>();
    }
    
    @Override
    public int pesquisarIndiceAluno(String email) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getEmail().equals(email)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void adicionar(Aluno aluno) {
        getAlunos().add(aluno);
    }

    @Override
    public Aluno get(int indice) {
        return getAlunos().get(indice);
    }

    @Override
    public void excluir(int indice) {
        getAlunos().remove(indice);
    }

    @Override
    public ArrayList<Aluno> listagem() {
        return getAlunos();
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}
