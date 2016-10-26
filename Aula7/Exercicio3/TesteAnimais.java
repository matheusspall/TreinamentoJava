
package Aula7.Exercicio3;

public class TesteAnimais {
    public static void main(String[] args) {
        
        System.out.println("Zoo:\n----------------------------------------");
        
        Animal camelo = new Mamifero("Camelo", "Amarelo", "Capim", 150, 2, 4);
        System.out.println(camelo.dados());
        
        System.out.println("---------------------------------------------");
        
        Animal tubarao = new Peixe("Tubarao", "Barbatanas e cauda", 300, 1.5f);
        System.out.println(tubarao.dados());
        
        System.out.println("---------------------------------------------");
        
        Animal urso = new Mamifero("Urso-do-Canada", "Vermelho", "Mel", 180, 0.5f, 4);
        System.out.println(urso.dados());
    }
}
