package br.com.meta.aula6.exerciciocaixaeletronico;

import br.com.meta.aula6.exerciciocaixaeletronico.banco.Conta;
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Banco;
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Movimentacao;
import br.com.meta.aula6.exerciciocaixaeletronico.extras.Data;
import br.com.meta.aula6.exerciciocaixaeletronico.caixaeletronico.CaixaEletronico;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Funcionario;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Cliente;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Banco banco = new Banco();

        CaixaEletronico caixaEle = new CaixaEletronico();
        banco.inicializarCaixaEletronico(caixaEle);

        banco.addFuncionario(new Funcionario("gerente", "123"));
        banco.addCliente(new Cliente(new Conta(1, 1, "123")));

        Scanner scanner = new Scanner(System.in);
        BANCO: //etiqueta de bloco
        while (true) {
            System.out.print("---------- Banco Meta ----------"
                    + "\n1) Administrador"
                    + "\n2) Cliente"
                    + "\n99) Sair do sistema"
                    + "\nOperacao: ");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1: //ADM
                    scanner.nextLine();
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    Funcionario funcionario = banco.validarFuncionario(login, senha);

                    if (!funcionario.equals(null)) {
                        ADM: //etiqueta de bloco
                        while (true) {
                            System.out.print("\nVoce esta conectado como administrador do sistema!"
                                    + "\nO que deseja fazer?"
                                    + "\n\n1) Repor cedulas"
                                    + "\n2) Visualizar total disponível"
                                    + "\n3) Extrato"
                                    + "\n4) Esvaziar cédulas"
                                    + "\n5) Aprovacao de depositos"
                                    + "\n99) Logoff"
                                    + "\nOperacao: ");
                            int operacaoAdm = scanner.nextInt();

                            switch (operacaoAdm) {
                                case 1: //REPOR CEDULAS
                                    System.out.print("Qtd. de Cedula 50 : ");
                                    caixaEle.getListaCaixaEle().get(0).addCedula(scanner.nextInt());

                                    System.out.print("Qtd. de Cedula 20 : ");
                                    caixaEle.getListaCaixaEle().get(1).addCedula(scanner.nextInt());

                                    System.out.print("Qtd. de Cedula 10 : ");
                                    caixaEle.getListaCaixaEle().get(2).addCedula(scanner.nextInt());

                                    System.out.print("Qtd. de Cedula 5 : ");
                                    caixaEle.getListaCaixaEle().get(3).addCedula(scanner.nextInt());

                                    System.out.print("Qtd. de Cedula 2 : ");
                                    caixaEle.getListaCaixaEle().get(4).addCedula(scanner.nextInt());

                                    System.out.println("\nReposicao concluida com sucesso.\n");
                                    break;

                                case 2: //CONSULTAR TOTAL DISPONIVEL
                                    System.out.println("Total disponivel: R$" + caixaEle.getTotalDinheiro() + ",00\nCedulas disponiveis:\n" + caixaEle.getTotalCedulas() + "\n");
                                    break;
                                    
                                case 3: //EXTRATO DE MOVIMENTACOES
                                    break;
                                    
                                case 4: //ESVAZIAR CEDULAS
                                    break;
                                    
                                case 5: //APROVACAO DE DEPOSITOS
                                    break;

                                default:
                                    System.out.println("\nVoce nao esta mais conectado como Administrador do sistema.\n\n");
                                    break ADM;
                            }
                        }

                    } else {
                        System.out.println("Senha incorreta!");
                    }

                    break;

                case 2: //CLIENTE

                    System.out.print("AG: ");
                    int agencia = scanner.nextInt();

                    System.out.print("Conta: ");
                    int conta = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Senha: ");
                    senha = scanner.nextLine();

                    Cliente cliente = banco.validarCliente(agencia, conta, senha);

                    if (cliente != null) {

                        CLIENTE: //etiqueta de bloco
                        while (true) {
                            System.out.print("\nBem-vindo ao Banco Meta!"
                                    + "\nO que deseja fazer?"
                                    + "\n\n1) Saque"
                                    + "\n2) Consultar Saldo"
                                    + "\n3) Extrato de movimentacao"
                                    + "\n4) Deposito"
                                    + "\n99) Voltar ao Menu Principal"
                                    + "\nOperacao: ");
                            int operacaoCliente = scanner.nextInt();

                            switch (operacaoCliente) {
                                case 1: //SAQUE
                                    if (!caixaEle.cedulasDisponiveis().equals("")) {

                                        System.out.println("Cedulas disponiveis: " + caixaEle.cedulasDisponiveis());
                                        System.out.print("\nInforme o valor que deseja sacar: ");
                                        int valorSaque = scanner.nextInt();
                                        if (cliente.getConta().getSaldo() > valorSaque) {
                                            String resultado = caixaEle.efetuarSaque(valorSaque);
                                            if (resultado.equals("Valor informado maior que o disponivel.")
                                                    || resultado.equals("Valor informado nao pode ser sacado.")) {
                                                System.out.println(resultado);
                                            } else {
                                                System.out.println(resultado);
                                                cliente.getConta().removeSaldo(valorSaque);
                                                caixaEle.addMovimentacao(new Movimentacao("Saque", Data.getDataAtual(), valorSaque, cliente.getConta()));
                                            }
                                        }else{
                                            System.out.println("Valor informado maior que o disponivel na conta.");
                                        }

                                    } else {
                                        System.out.println("Desculpe, nao ha cedulas disponiveis!");
                                    }
                                    break;

                                case 2: //CONSULTAR SALDO
                                    System.out.println("Saldo : " + cliente.getConta().getSaldo() + ""
                                            + "\n" + cliente.getConta().getSaldoPorExtenso());
                                    break;
                                    
                                case 3: //EXTRATO DE MOVIMENTACAO
                                    System.out.println("Movimentacao:\n" + caixaEle.getMovimentacaoConta(cliente.getConta()));
                                    break;
                                    
                                case 4: //DEPOSITO
                                    System.out.print("Informe o valor que deseja depositar: ");
                                    int valorDeposito = scanner.nextInt();
                                    if (valorDeposito > 0) {
                                        cliente.getConta().addSaldo(valorDeposito);
                                        caixaEle.addMovimentacao(new Movimentacao("Deposito", Data.getDataAtual(), valorDeposito, cliente.getConta()));
                                    }
                                    break;

                                default:
                                    break CLIENTE;
                            }
                        }
                    }

                    break;

                default:
                    System.out.println("\n\n\nObrigado por usar nosso sistema.\n\n\n");
                    break BANCO;
            }
        }
    }

}
