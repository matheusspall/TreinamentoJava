package Aula8.Exercicio3;

public class TestaContas {

    public static void main(String[] args) {

        AtualizarConta atualizarConta = new AtualizarConta();

        Conta cc = new ContaCorrente();
        System.out.println("Saldo cc: " + cc.getSaldo());
        cc.depositar(1000);
        System.out.println("Saldo cc: " + cc.getSaldo());
        atualizarConta.addConta(cc);

        Conta cp = new ContaPoupanca();
        System.out.println("Saldo cp: " + cp.getSaldo());
        cp.depositar(1000);
        System.out.println("Saldo cp: " + cp.getSaldo());
        atualizarConta.addConta(cp);
        

        atualizarConta.atualizar(10);
        System.out.println("Atualizacao de 10%:");
        System.out.println("Saldo cc: " + cc.getSaldo());
        System.out.println("Saldo cp: " + cp.getSaldo());
    }
}
