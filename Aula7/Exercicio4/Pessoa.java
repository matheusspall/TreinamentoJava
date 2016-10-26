package Aula7.Exercicio4;

public class Pessoa {
    private String nome;
    private int rg;
    private float salario;

    public String imprimirSalario(){
        return "Salario: ";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
