package br.com.meta.aula8.exercicio1;

public class Ave extends Animal {

    public Ave(String nomeAnimal) {
        super(nomeAnimal);
    }
    
    @Override
    public String mover() {
        return "Nome do Animal:" + getNomeAnimal() + "- Ave - Voar!";
    }
    
    public String voar()
    {
        return "vooooa!";
    }
    
}
