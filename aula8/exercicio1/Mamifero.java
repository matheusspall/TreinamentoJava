package br.com.meta.aula8.exercicio1;

public class Mamifero extends Animal{
    
    public Mamifero(String nomeAnimal) {
        super(nomeAnimal);
    }

    @Override
    public String mover() {

        return "Nome do Animal:" + getNomeAnimal() + "- Mamifero - Correr!";
    }
    
    public String correr()
    {
        return "cooore!";
    }
    
}
