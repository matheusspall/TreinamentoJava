package br.com.meta.aula3.exercicio6;

import java.util.ArrayList;

public class Vestibular {

    private ArrayList<Curso> listaCursos = new ArrayList<>();

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public void adicionarCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public String getCursoMaiorCandVaga() {
        int maior = 0, codigo=0;
        for (Curso curso : listaCursos) {
            if (curso.getCandVaga() > maior){
                maior = (int) curso.getCandVaga();
                codigo = curso.getCodigo();
            }
            
        }
        return "Relacao Candidato-Vaga: " + maior + "\nCodigo Curso: " + codigo;
    }
    
    public int getTotalCandVest(){
        int cont = 0;
        for (Curso curso : listaCursos) {
            cont += curso.getTotalCand();
        }
        return cont;
    }
}
