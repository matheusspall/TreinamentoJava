package Aula8.Exercicio1;

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
