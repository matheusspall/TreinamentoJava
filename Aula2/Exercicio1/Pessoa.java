package Aula2.Exercicio1;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void fazAniversario() {
        idade++;
    }

    public String retornaNomeIdade() {
        return "Nome: " + nome + "\tIdade: " + idade;
    }
}
