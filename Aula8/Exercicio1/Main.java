package Aula8.Exercicio1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> jaula = new ArrayList<>();

        jaula.add(new Anfibio("anf1"));
        jaula.add(new Ave("ave1"));
        jaula.add(new Mamifero("ma1"));
        jaula.add(new Anfibio("anf2"));
        jaula.add(new Ave("ave2"));
        jaula.add(new Mamifero("ma2"));
        jaula.add(new Anfibio("anf1"));
        jaula.add(new Ave("ave3"));
        jaula.add(new Mamifero("ma3"));
        jaula.add(new Mamifero("ma4"));

        processarAnimais(jaula);
    }

    public static void processarAnimais(ArrayList<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.mover());
            if (animal instanceof Anfibio) {
                System.out.println(((Anfibio) animal).nadar());
            } else if (animal instanceof Mamifero) {
                System.out.println(((Mamifero) animal).correr());
            } else if (animal instanceof Ave) {
                System.out.println(((Ave) animal).voar());
            }
            System.out.println();
        }
    }

}
