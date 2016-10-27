package Aula8.Exercicio2;

public class ContaPoupanca extends Conta{

    @Override
    public void atualizaConta(float taxaPercentual) {
        super.atualizaConta(3 * taxaPercentual);
    }
    
}
