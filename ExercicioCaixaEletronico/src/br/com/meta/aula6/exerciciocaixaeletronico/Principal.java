package br.com.meta.aula6.exerciciocaixaeletronico;

import br.com.meta.aula6.exerciciocaixaeletronico.banco.Conta;
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Banco;
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Movimentacao;
import br.com.meta.aula6.exerciciocaixaeletronico.extras.Data;
import br.com.meta.aula6.exerciciocaixaeletronico.caixaeletronico.CaixaEletronico;
import br.com.meta.aula6.exerciciocaixaeletronico.extras.Arquivo;
import br.com.meta.aula6.exerciciocaixaeletronico.extras.LimparConsole;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Funcionario;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Cliente;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int operacao = 0, operacaoAdm = 0;

        Banco banco = new Banco();
        CaixaEletronico caixaEle = new CaixaEletronico();

        banco.inicializarCaixaEletronico(caixaEle);
        banco.addFuncionario(new Funcionario("gerente", "123"));
        banco.addFuncionario(new Funcionario("bancario", "123"));
        banco.addCliente(new Cliente(new Conta(1, 1, "123")));
        banco.addCliente(new Cliente(new Conta(2, 2, "123")));

        BANCO: //etiqueta de bloco
        while (true) {
            System.out.print("---------- Banco Meta ----------"
                    + "\n1) Administrador"
                    + "\n2) Cliente"
                    + "\n99) Sair do sistema"
                    + "\nOperacao: ");
            try {
                operacao = scanner.nextInt();
            } catch (Exception e) {
                operacao = 0;
                System.out.println(e.getMessage());
            } finally {
                scanner.nextLine(); //limpar buffer
            }

            switch (operacao) {
                case 1: //ADM
                    System.out.println(LimparConsole.limparConsole());
                    System.out.print("Login: ");
                    String login = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    Funcionario funcionario = banco.validarFuncionario(login, senha);

                    if (funcionario != null) {
                        System.out.println(LimparConsole.limparConsole());
                        Conta conta = new Conta(999, 999, "123");

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
                            try {
                                operacaoAdm = scanner.nextInt();
                            } catch (Exception e) {
                                operacaoAdm = 0;
                            } finally {
                                scanner.nextLine(); //limpar o buffer
                            }

                            switch (operacaoAdm) {
                                case 1: //REPOR CEDULAS
                                    System.out.println(LimparConsole.limparConsole());
                                    int totalCaixaAntes = caixaEle.getTotalDinheiro();

                                    System.out.print("Qtd. de Cedula 50 : ");
                                    try {
                                        caixaEle.getListaCaixaEle().get(0).addCedula(scanner.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 20 : ");
                                    try {
                                        caixaEle.getListaCaixaEle().get(1).addCedula(scanner.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 10 : ");
                                    try {
                                        caixaEle.getListaCaixaEle().get(2).addCedula(scanner.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 5 : ");
                                    try {
                                        caixaEle.getListaCaixaEle().get(3).addCedula(scanner.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 2 : ");
                                    try {
                                        caixaEle.getListaCaixaEle().get(4).addCedula(scanner.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine(); //limpar o buffer
                                    }

                                    int totalCaixaDepois = caixaEle.getTotalDinheiro();

                                    caixaEle.addMovimentacao(new Movimentacao("Reposicao", Data.getDataAtual(), (totalCaixaDepois - totalCaixaAntes), conta));
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("\nReposicao concluida com sucesso.\n");
                                    break;

                                case 2: //CONSULTAR TOTAL DISPONIVEL
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("Total disponivel: R$" + caixaEle.getTotalDinheiro() + ",00\nCedulas disponiveis:\n" + caixaEle.getTotalCedulas() + "\n");
                                    break;

                                case 3: //EXTRATO DE MOVIMENTACOES
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("Movimentacao:\n" + caixaEle.getMovimentacaoBanco());
                                    break;

                                case 4: //ESVAZIAR CEDULAS
                                    caixaEle.addMovimentacao(new Movimentacao("Esvaziar", Data.getDataAtual(), caixaEle.getTotalDinheiro(), conta));
                                    caixaEle.esvaziarCaixaEletronico();
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("Caixa Eletrônico esvaziado com sucesso!");
                                    break;

                                case 5: //APROVACAO DE DEPOSITOS
                                    Movimentacao movimentacao = caixaEle.getMovimentacaoAprovar();
                                    if (movimentacao != null) {
                                        System.out.println(LimparConsole.limparConsole());
                                        System.out.println("AG: " + movimentacao.getConta().getNumAgencia() + ""
                                                + "  Conta: " + movimentacao.getConta().getNumConta() + ""
                                                + "\nTipo Operacao: " + movimentacao.getTipoOperacao() + ""
                                                + "\nValor: " + movimentacao.getValor());

                                        scanner.nextLine(); //esvazia o buffer

                                        System.out.print("Aprovar movimentacao? (s/n)");
                                        if (scanner.nextLine().equals("s")) {
                                            movimentacao.setValidado(true);
                                            movimentacao.setTipoOperacao("Deposito");
                                            Cliente cliente = banco.validarCliente(movimentacao.getConta().getNumAgencia(), movimentacao.getConta().getNumConta(), movimentacao.getConta().getSenha());
                                            cliente.getConta().addSaldo(movimentacao.getValor());
                                        }
                                        System.out.println(LimparConsole.limparConsole());
                                    } else {
                                        System.out.println(LimparConsole.limparConsole());
                                        System.out.println("Nao ha movimentacoes para serem aprovadas!");
                                    }
                                    break;

                                default:
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("\nVoce nao esta mais conectado como Administrador do sistema.\n\n");
                                    break ADM;
                            }
                        }

                    } else {
                        System.out.println(LimparConsole.limparConsole());
                        System.out.println("Dados incorretos!");
                    }
                    break;

                case 2: //CLIENTE
                    int agencia = 0,
                     conta = 0,
                     operacaoCliente = 0,
                     valorSaque = 0,
                     valorDeposito = 0;

                    System.out.println(LimparConsole.limparConsole());

                    System.out.print("AG: ");
                    try {
                        agencia = scanner.nextInt();
                    } catch (Exception e) {

                    } finally {
                        scanner.nextLine(); //limpar o buffer
                    }

                    System.out.print("Conta: ");
                    try {
                        conta = scanner.nextInt();
                    } catch (Exception e) {

                    } finally {
                        scanner.nextLine(); //limpar o buffer
                    }

                    System.out.print("Senha: ");
                    senha = scanner.nextLine();

                    Cliente cliente = banco.validarCliente(agencia, conta, senha);

                    if (cliente != null) {

                        System.out.println(LimparConsole.limparConsole());

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
                            try {
                                operacaoCliente = scanner.nextInt();
                            } catch (Exception e) {
                                operacaoCliente = 0;
                            } finally {
                                scanner.nextLine(); //limpar o buffer
                            }

                            switch (operacaoCliente) {
                                case 1: //SAQUE
                                    System.out.println(LimparConsole.limparConsole());
                                    if (!caixaEle.cedulasDisponiveis().equals("")) {

                                        System.out.println("Cedulas disponiveis: " + caixaEle.cedulasDisponiveis());
                                        System.out.print("\nInforme o valor que deseja sacar: ");
                                        try {
                                            valorSaque = scanner.nextInt();
                                        } catch (Exception e) {

                                        } finally {
                                            scanner.nextLine(); //limpar o buffer
                                        }

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
                                        } else {
                                            System.out.println(LimparConsole.limparConsole());
                                            System.out.println("Valor informado maior que o disponivel na conta.");
                                        }
                                    } else {
                                        System.out.println(LimparConsole.limparConsole());
                                        System.out.println("Desculpe, nao ha cedulas disponiveis!");
                                    }
                                    break;

                                case 2: //CONSULTAR SALDO
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("Saldo : " + cliente.getConta().getSaldo() + ""
                                            + "\n" + cliente.getConta().getSaldoPorExtenso());
                                    break;

                                case 3: //EXTRATO DE MOVIMENTACAO
                                    System.out.println(LimparConsole.limparConsole());
                                    scanner.nextLine(); //esvaziar o buffer
                                    String movimentacao = caixaEle.getMovimentacaoConta(cliente.getConta());
                                    if (!movimentacao.equals("")) {
                                        System.out.println("Movimentacao:\n" + movimentacao);

                                        System.out.println("Deseja gravar em arquivo texto (.txt)? s/n");
                                        if (scanner.nextLine().equals("s")) {
                                            Arquivo.gravarMovimentacaoTXT(caixaEle.getListaMovimentacao());
                                        } else {
                                            System.out.println(LimparConsole.limparConsole());
                                        }
                                    } else {
                                        System.out.println("Nao existe movimentacao nessa conta!");
                                    }
                                    break;

                                case 4: //DEPOSITO
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.print("Informe o valor que deseja depositar: ");
                                    try {
                                        valorDeposito = scanner.nextInt();
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine();
                                    }
                                    if (valorDeposito > 0) {
                                        caixaEle.addMovimentacao(new Movimentacao("Deposito pendente", Data.getDataAtual(), valorDeposito, cliente.getConta()));
                                    }
                                    break;

                                default:
                                    System.out.println(LimparConsole.limparConsole());
                                    break CLIENTE;
                            }
                        }
                    } else {
                        System.out.println(LimparConsole.limparConsole());
                        System.out.println("Cliente nao encontrado!");
                    }

                    break;

                default:
                    System.out.println(LimparConsole.limparConsole());
                    System.out.print("Deseja encerrar esse programa? (s/n)");
                    String resposta = scanner.nextLine();
                    if (resposta.equals("s")) {
                        System.out.println(LimparConsole.limparConsole());
                        System.out.println("\n\n\nObrigado por usar nosso sistema.\n\n\n");
                        break BANCO;
                    } else {
                        resposta = "";
                        System.out.println(LimparConsole.limparConsole());
                        break;
                    }
            }
        }
    }

}
