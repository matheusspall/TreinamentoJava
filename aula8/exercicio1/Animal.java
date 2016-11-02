package br.com.meta.aula8.exercicio1;

public class Animal {

    private String nomeAnimal;

    public Animal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    
    public void setNomeAnimal(String nomeAnimal)
    {
    	this.nomeAnimal = nomeAnimal;
    }
    
    public String getNomeAnimal()
    {
    	return this.nomeAnimal;
    }

    public String mover() {
        return "Nome do Animal:" + getNomeAnimal() + "- Animal - Mover!";
    }
}
