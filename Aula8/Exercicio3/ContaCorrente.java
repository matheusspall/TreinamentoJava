package Aula8.Exercicio3;

public class ContaCorrente extends Conta{
    
    @Override
    public void depositar(float valor) {
        super.depositar(valor - 0.10f);
    }
}
