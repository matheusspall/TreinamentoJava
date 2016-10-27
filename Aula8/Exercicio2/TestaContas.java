package Aula8.Exercicio2;

public class TestaContas {
    public static void main(String[] args) {
        
        System.out.println("\nConta Corrente:");
        Conta cc = new ContaCorrente();
        System.out.println("Saldo cc: " + cc.getSaldo());
        cc.depositar(1000);
        System.out.println("Saldo cc: " + cc.getSaldo());
        cc.atualizaConta(10);
        System.out.println("Atualizacao de 10%");
        System.out.println("Saldo cc: " + cc.getSaldo());
        
        System.out.println("\nConta Poupanca:");
        Conta cp = new ContaPoupanca();
        System.out.println("Saldo cp: " + cp.getSaldo());
        cp.depositar(1000);
        System.out.println("Saldo cp: " + cp.getSaldo());
        cp.atualizaConta(10);
        System.out.println("Atualizacao de 10%");
        System.out.println("Saldo cp: " + cp.getSaldo());
        
    }
}
