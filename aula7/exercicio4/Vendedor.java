package br.com.meta.aula7.exercicio4;

public class Vendedor extends Pessoa{
    private final float comissao = (float) 0.05;
    private int totalVendasMes;

    public Vendedor(float salario){
        super.setSalario(salario);
    }
    
    public void addVendaMes(){
        totalVendasMes++;
    }
    
    @Override
    public String imprimirSalario(){
        return "Salario: " + (super.getSalario() + ((super.getSalario() * getComissao()) * getTotalVendasMes()));
    }
    
    public float getComissao() {
        return comissao;
    }

    public int getTotalVendasMes() {
        return totalVendasMes;
    }

    public void setTotalVendasMes(int totalVendasMes) {
        this.totalVendasMes = totalVendasMes;
    }
}
