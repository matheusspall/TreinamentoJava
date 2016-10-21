package Aula5.Exercicio1;

public class Principal {

    public static void main(String[] args) {

        Pessoa matheus = new Pessoa();
        matheus.setNome("Matheus Spall");
        matheus.setEndereco("Est. Miguel Beltrame");
        matheus.setTelefone(91546068);
        System.out.println(matheus.imprimir());

    }
}
