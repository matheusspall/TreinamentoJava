package br.com.meta.aula8.exercicio1;

public class Anfibio extends Animal {

    public Anfibio(String nomeAnimal) {
        super(nomeAnimal);
    }

    @Override
    public String mover() {

        return "Nome do Animal:" + getNomeAnimal() + "- Anfibio - Nadar!";
    }
    
    public String nadar()
    {
        return "Glub Glub";
    }
}
