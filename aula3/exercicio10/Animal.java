package br.com.meta.aula3.exercicio10;

public class Animal {
    private String animal;
    private boolean mamifero;
    private boolean quadrupede;
    private boolean carnivoro;
    private boolean herbivoro;

    public Animal(String animal, boolean mamifero, boolean quadrupede, boolean carnivoro, boolean herbivoro){
        this.animal = animal;
        this.mamifero = mamifero;
        this.quadrupede = quadrupede;
        this.carnivoro = carnivoro;
        this.herbivoro = herbivoro;
    }
    
    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    public boolean isQuadrupede() {
        return quadrupede;
    }

    public void setQuadrupede(boolean quadrupede) {
        this.quadrupede = quadrupede;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public boolean isHerbivoro() {
        return herbivoro;
    }

    public void setHerbivoro(boolean herbivoro) {
        this.herbivoro = herbivoro;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
