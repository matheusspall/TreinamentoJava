package br.com.meta.projetointerface.interfaces;

import br.com.meta.projetointerface.aluno.Aluno;
import java.util.ArrayList;

public interface IControleAluno {
    
    int pesquisarIndiceAluno(String email);
    
    void adicionar(Aluno aluno);

    Aluno get(int indice);

    void excluir(int indice);

    ArrayList<Aluno> listagem();
}
