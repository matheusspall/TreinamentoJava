package Aula8.Exercicio1;

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
