package Aula3.Exercicio10;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> listaAnimais = new ArrayList<>();

    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public void setListaAnimais(ArrayList<Animal> listaAnimais) {
        this.listaAnimais = listaAnimais;
    }

    public void adicionarAnimal(Animal animal) {
        listaAnimais.add(animal);
    }

    public String verificarAnimal(boolean mamifero, boolean quadrupede, boolean carnivoro, boolean herbivoro) {
        for (int i = 0; i < listaAnimais.size(); i++) {
            if ((listaAnimais.get(i).isMamifero() == mamifero) && 
                    (listaAnimais.get(i).isQuadrupede() == quadrupede) && 
                    (listaAnimais.get(i).isCarnivoro() == carnivoro) && 
                    (listaAnimais.get(i).isHerbivoro() == herbivoro)
                ){
                return "Entao o animal escolhido foi: " + listaAnimais.get(i).getAnimal();
            }
        }
        return "Nao foi possivel encontrar um animal que correspondesse aos dados de entrada!";
    }
}
