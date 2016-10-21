package Aula3.Exercicio10;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //mamifero, quadrupede, carnivoro, herbivoro
        Animal leao = new Animal("leao", true, true, true, false);
        Animal cavalo = new Animal("cavalo", true, true, false, true);
        Animal homem = new Animal("homem", true, false, true, true);
        Animal macaco = new Animal("macaco", true, true, false, true);
        Animal avestruz = new Animal("avestruz", false, false, false, true);
        Animal pinguim = new Animal("pinguim", false, false, true, false);
        Animal pato = new Animal("pato", false, false, false, true);
        Animal aguia = new Animal("aguia", false, false, true, false);
        Animal tartaruga = new Animal("tartaruga", false, true, true, true);
        Animal crocodilo = new Animal("crocodilo", false, true, true, false);
        Animal cobra = new Animal("cobra", false, false, true, false);

        Zoo zoo = new Zoo();
        zoo.adicionarAnimal(leao);
        zoo.adicionarAnimal(cavalo);
        zoo.adicionarAnimal(homem);
        zoo.adicionarAnimal(macaco);
        zoo.adicionarAnimal(avestruz);
        zoo.adicionarAnimal(pinguim);
        zoo.adicionarAnimal(pato);
        zoo.adicionarAnimal(aguia);
        zoo.adicionarAnimal(tartaruga);
        zoo.adicionarAnimal(crocodilo);
        zoo.adicionarAnimal(cobra);

        System.out.print("Eh mamifero (true or false)? ");
        boolean mamifero = scanner.nextBoolean();
        
        System.out.print("Eh quadrupede (true or false)? ");
        boolean quadrupede = scanner.nextBoolean();
        
        System.out.print("Eh carnivoro (true or false)? ");
        boolean carnivoro = scanner.nextBoolean();
        
        System.out.print("Eh herbivoro (true or false)? ");
        boolean herbivoro = scanner.nextBoolean();
        
        System.out.println("\n" + zoo.verificarAnimal(mamifero, quadrupede, carnivoro, herbivoro));
    }
}
