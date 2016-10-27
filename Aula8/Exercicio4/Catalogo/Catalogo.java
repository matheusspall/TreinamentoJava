package Aula8.Exercicio4.Catalogo;

import Aula8.Exercicio4.ItemColecionavel.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Catalogo {
    private ArrayList<ItemColecionavel> listaItem = new ArrayList<>();
    
    public void addItemColecionavel (ItemColecionavel item){
        getListaItem().add(item);
    }
    
    public String imprimirColecao(){
        String conteudo = "";
        agruparPorTipo();
        for(ItemColecionavel item : listaItem) {
            
            if (item instanceof CD) {
                conteudo += "-------- CD: " + item.getNome() + " --------\n";
            }else if (item instanceof DVD) {
                conteudo += "-------- DVD: " + item.getNome() + " --------\n";
            }else if (item instanceof Livro) {
                conteudo += "-------- LIVRO: " + item.getNome() + " --------\n";
            }else if (item instanceof Revista) {
                conteudo += "-------- REVISTA: " + item.getNome() + " --------\n";
            }
            
            conteudo += "Data Aquisicao: " + item.getDataAquisicao() + "\n";
            conteudo += "Autor: " + item.getAutor() + "\n";
        }
        return conteudo;
    }
    
    public void agruparPorTipo(){
        
        Collections.sort(listaItem, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if((o1 instanceof CD) && !(o2 instanceof CD)) {
                    return -1;
                }else if((o1 instanceof DVD) && !(o2 instanceof DVD) && ((o2 instanceof Livro) ||  (o2 instanceof Revista))) {
                    return -1;
                }else if((o1 instanceof Livro) && (o2 instanceof Revista)) {
                    return -1;
                }else{
                    return +1;
                }
            }
        });
        
    }

    public ArrayList<ItemColecionavel> getListaItem() {
        return listaItem;
    }

    public void setListaItem(ArrayList<ItemColecionavel> listaItem) {
        this.listaItem = listaItem;
    }
}
