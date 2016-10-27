package Aula8.Exercicio2;

public class ContaCorrente extends Conta{
    
    @Override
    public void atualizaConta(float taxaPercentual) {
        super.atualizaConta(2 * taxaPercentual);
    }

    @Override
    public void depositar(float valor) {
        super.depositar(valor - 0.10f);
    }
}
