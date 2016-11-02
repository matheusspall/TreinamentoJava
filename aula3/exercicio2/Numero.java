package br.com.meta.aula3.exercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class Numero {
    private ArrayList<Integer> listaNum = new ArrayList<>();

    public ArrayList<Integer> getListaNum() {
        return listaNum;
    }

    public void setListaNum(ArrayList<Integer> listaNum) {
        this.listaNum = listaNum;
    }
    
    public void adicionarNumero(int num){
        listaNum.add(num);
    }
    
    public void ordenarLista(){
        Collections.sort(listaNum);
    }
    
    public int getMaiorNumero(){
        ordenarLista();
        return listaNum.get(listaNum.size()-1);
    }
    
    public int getMenorNumero(){
        ordenarLista();
        return listaNum.get(0);
    }
    
    public int getMediaNumero(){
        int media=0;
        for(Integer item : listaNum){
            media += item;
        }
        return (media / listaNum.size());
    }
    
}
