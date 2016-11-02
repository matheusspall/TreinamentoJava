
package br.com.meta.aula3.exercicio9;

public class Financeira {
    private double salario;
    private double valorFinanciamento;
    
    public Financeira(double salario, double valorFinanciamento){
        this.salario = salario;
        this.valorFinanciamento = valorFinanciamento;
    }
    
    public String validarFinanciamento(){
        if ((getValorFinanciamento() / 5) <= getSalario()) {
            return "Financiamento Concedido!";
        }else{
            return "Financemento Negado!";
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorFinanciamento() {
        return valorFinanciamento;
    }

    public void setValorFinanciamento(double valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }
}
