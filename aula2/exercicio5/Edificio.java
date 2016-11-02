package br.com.meta.aula2.exercicio5;

import java.util.ArrayList;

public class Edificio {
    private String cor;
    private int totalDePortas, totalDeAndares;
    private ArrayList<Porta> portas = new ArrayList<>();

    public String getCor() {
        return cor;
    }

//    public void setCor(String cor) {
//        this.cor = cor;
//    }

//    public int getTotalDePortas() {
//        return totalDePortas;
//    }

    public void setTotalDePortas(int totalDePortas) {
        this.totalDePortas = totalDePortas;
    }

//    public int getTotalDeAndares() {
//        return totalDeAndares;
//    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }
    
    public void pinta(String s){
        cor = s;
    }
    
    public int quantasPortasEstaoAbertas(){
        int cont = 0;
        for(int i = 0; i < portas.size()-1; i++){
            if (portas.get(i).estaAberta()) cont++;
        }
        return cont;
    }
    
    public void adicionaPorta(Porta p){
        portas.add(p);
    }
    
    public int totalDePortas(){
        return portas.size();
    }
    
    public void adicionarAndar(){
        totalDeAndares++;
    }
    
    public int totalDeAndares(){
        return totalDeAndares;
    }
    
}
