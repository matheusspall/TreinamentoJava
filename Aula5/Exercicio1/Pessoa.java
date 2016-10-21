package Aula5.Exercicio1;

public class Pessoa {

    private String nome;
    private String endereco;
    private int telefone;

    public String imprimir() {
        return "Nome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
