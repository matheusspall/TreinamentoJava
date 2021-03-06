
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Banco;
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Conta;
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Movimentacao;
import br.com.meta.aula6.exerciciocaixaeletronico.extras.Data;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Cliente;
import br.com.meta.aula6.exerciciocaixaeletronico.caixaeletronico.CaixaEletronico;
import br.com.meta.aula6.exerciciocaixaeletronico.extras.Arquivo;
import br.com.meta.aula6.exerciciocaixaeletronico.extras.LimparConsole;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Funcionario;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) throws IOException {

        int opPrincipal = 0, operacaoAdm = 0;

        input = new Scanner(System.in);

        Banco banco = new Banco();
        CaixaEletronico caixa = new CaixaEletronico();
        banco.inicializarCaixaEletronico(caixa);

        banco.addFuncionario(new Funcionario("gerente", "123"));
        banco.addCliente(new Cliente(new Conta(1, 1, "123")));

        SISTEMA:
        for (;;) {
            System.out.println(" ______________________");
            System.out.println("|                      | ");
            System.out.println("|   ESCOLHA UMA OPCAO  | ");
            System.out.println("|______________________|");
            System.out.print("\n(1) Administracao:"
                    + "\n(2) Cliente:"
                    + "\n(3) Sair"
                    + "\nOpcao:");
            try {
                opPrincipal = input.nextInt();
            } catch (Exception e) {
                opPrincipal = 0;
                System.out.println(e.getMessage());
            } finally {
                input.nextLine(); //limpar buffer
            }

            switch (opPrincipal) {

                case 1: { //ADM
                    System.out.println(LimparConsole.limparConsole());
                    System.out.print("Login: ");
                    String login = input.nextLine();

                    System.out.print("Senha: ");
                    String senha = input.nextLine();

                    Funcionario funcionario = banco.validarFuncionario(login, senha);

                    if (funcionario != null) {
                        System.out.println(LimparConsole.limparConsole());
                        Conta conta = new Conta(999, 999, "123");
                        
                        ADM: //etiqueta de bloco
                        while (true) {
                            System.out.println(" ______________________");
                            System.out.println("|                      | ");
                            System.out.println("|   ESCOLHA UMA OPCAO  | ");
                            System.out.println("|______________________|");
                            System.out.println();
                            System.out.print("\nVoce esta conectado como administrador do sistema!"
                                    + "\n\n(1) Repor cedulas"
                                    + "\n(2) Visualizar total disponível"
                                    + "\n(3) Extrato"
                                    + "\n(4) Esvaziar cédulas"
                                    + "\n(5) Aprovacao de depositos"
                                    + "\n(99) Logoff"
                                    + "\nOperacao: ");
                            try {
                                operacaoAdm = input.nextInt();
                            } catch (Exception e) {
                                operacaoAdm = 0;
                            } finally {
                                input.nextLine(); //limpar o buffer
                            }

                            switch (operacaoAdm) {
                                case 1: //REPOR CEDULAS
                                    System.out.println(LimparConsole.limparConsole());
                                    int totalCaixaAntes = caixa.getTotalDinheiro();

                                    System.out.print("Qtd. de Cedula 50 : ");
                                    try {
                                        caixa.getListaCaixaEle().get(0).addCedula(input.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        input.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 20 : ");
                                    try {
                                        caixa.getListaCaixaEle().get(1).addCedula(input.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        input.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 10 : ");
                                    try {
                                        caixa.getListaCaixaEle().get(2).addCedula(input.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        input.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 5 : ");
                                    try {
                                        caixa.getListaCaixaEle().get(3).addCedula(input.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        input.nextLine(); //limpar o buffer
                                    }

                                    System.out.print("Qtd. de Cedula 2 : ");
                                    try {
                                        caixa.getListaCaixaEle().get(4).addCedula(input.nextInt());
                                    } catch (Exception e) {

                                    } finally {
                                        input.nextLine(); //limpar o buffer
                                    }

                                    int totalCaixaDepois = caixa.getTotalDinheiro();

                                    caixa.addMovimentacao(new Movimentacao("Reposicao", Data.getDataAtual(), (totalCaixaDepois - totalCaixaAntes), conta));
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("\nReposicao concluida com sucesso.\n");
                                    break;

                                case 2: //CONSULTAR TOTAL DISPONIVEL
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("Total disponivel: R$" + caixa.getTotalDinheiro() + ",00\nCedulas disponiveis:\n" + caixa.getTotalCedulas() + "\n");
                                    break;

                                case 3: //EXTRATO DE MOVIMENTACOES
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("Movimentacao:\n" + caixa.getMovimentacaoBanco());
                                    break;

                                case 4: //ESVAZIAR CEDULAS
                                    caixa.addMovimentacao(new Movimentacao("Esvaziar", Data.getDataAtual(), caixa.getTotalDinheiro(), conta));
                                    caixa.esvaziarCaixaEletronico();
                                    System.out.println(LimparConsole.limparConsole());
                                    System.out.println("Caixa Eletrônico esvaziado com sucesso!");
                                    break;

                                case 5: //APROVACAO DE DEPOSITOS
                                    Movimentacao movimentacao = caixa.getMovimentacaoAprovar();
                                    if (movimentacao != null) {
                                        System.out.println(LimparConsole.limparConsole());
                                        System.out.println("AG: " + movimentacao.getConta().getNumAgencia() + ""
                                                + "  Conta: " + movimentacao.getConta().getNumConta() + ""
                                                + "\nTipo Operacao: " + movimentacao.getTipoOperacao() + ""
                                                + "\nValor: " + movimentacao.getValor());

                                        input.nextLine(); //esvazia o buffer

                                        System.out.print("Aprovar movimentacao? (s/n)");
                                        if (input.nextLine().equals("s")) {
                                            movimentacao.setValidado(true);
                                            movimentacao.setTipoOperacao("Deposito");
                                            Cliente cliente = banco.validarCliente(movimentacao.getConta().getNumAgencia(), movimentacao.getConta().getNumConta(), movimentacao.getConta().getSenha());
                                            cliente.getConta().addSaldo(movimentacao.getValor());
                                        } else {
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
                        System.out.println("Funcionario nao encontrado!");
                    }
                    break;
                }

                case 2: { //CLIENTE
                    int agencia = 0,
                            conta = 0,
                            operacaoCliente = 0,
                            valorSaque = 0,
                            valorDeposito = 0;

                    System.out.println(LimparConsole.limparConsole());

                    System.out.print("AG: ");
                    try {
                        agencia = input.nextInt();
                    } catch (Exception e) {

                    } finally {
                        input.nextLine(); //limpar o buffer
                    }

                    System.out.print("Conta: ");
                    try {
                        conta = input.nextInt();
                    } catch (Exception e) {

                    } finally {
                        input.nextLine(); //limpar o buffer
                    }

                    System.out.print("Senha: ");
                    String senha = input.nextLine();

                    Cliente cliente = banco.validarCliente(agencia, conta, senha);

                    if (cliente != null) {

                        System.out.println(LimparConsole.limparConsole());

                        CLIENTE: //etiqueta de bloco
                        while (true) {
                            System.out.println(" ______________________");
                            System.out.println("|                      | ");
                            System.out.println("|   ESCOLHA UMA OPCAO  | ");
                            System.out.println("|______________________|");
                            System.out.println();
                            System.out.print("(1) Saque"
                                    + "\n(2) Consultar Saldo"
                                    + "\n(3) Extrato de movimentacao"
                                    + "\n(4) Deposito"
                                    + "\n(99) Voltar ao Menu Principal"
                                    + "\nOperacao: ");
                            try {
                                operacaoCliente = input.nextInt();
                            } catch (Exception e) {
                                operacaoCliente = 0;
                            } finally {
                                input.nextLine(); //limpar o buffer
                            }

                            switch (operacaoCliente) {
                                case 1: //SAQUE
                                    System.out.println(LimparConsole.limparConsole());
                                    if (!caixa.cedulasDisponiveis().equals("")) {

                                        System.out.println("Cedulas disponiveis: " + caixa.cedulasDisponiveis());
                                        System.out.print("\nInforme o valor que deseja sacar: ");
                                        try {
                                            valorSaque = input.nextInt();
                                        } catch (Exception e) {

                                        } finally {
                                            input.nextLine(); //limpar o buffer
                                        }

                                        if (cliente.getConta().getSaldo() > valorSaque) {
                                            String resultado = caixa.efetuarSaque(valorSaque);
                                            if (resultado.equals("Valor informado maior que o disponivel.")
                                                    || resultado.equals("Valor informado nao pode ser sacado.")) {
                                                System.out.println(resultado);
                                            } else {
                                                System.out.println(resultado);
                                                cliente.getConta().removeSaldo(valorSaque);
                                                caixa.addMovimentacao(new Movimentacao("Saque", Data.getDataAtual(), valorSaque, cliente.getConta()));
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
                                    input.nextLine(); //esvaziar o buffer
                                    System.out.println("Movimentacao:\n" + caixa.getMovimentacaoConta(cliente.getConta()));

                                    if (caixa.getMovimentacaoConta(cliente.getConta()) != null) {
                                        System.out.println("Deseja gravar em arquivo texto (.txt)? s/n");
                                        if (input.nextLine().equals("s")) {
                                            Arquivo.gravarMovimentacaoTXT(caixa.getListaMovimentacao());
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
                                        valorDeposito = input.nextInt();
                                    } catch (Exception e) {

                                    } finally {
                                        input.nextLine();
                                    }

                                    if (valorDeposito > 0) {
                                        caixa.addMovimentacao(new Movimentacao("Deposito pendente", Data.getDataAtual(), valorDeposito, cliente.getConta()));
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
                }

                default: {
                    System.out.println(LimparConsole.limparConsole());
                    System.out.print("Deseja encerrar esse programa? (s/n)");
                    String resposta = input.nextLine();
                    if (resposta.equals("s")) {
                        System.out.println(LimparConsole.limparConsole());
                        System.out.println("\n\n\nObrigado por usar nosso sistema.\n\n\n");
                        break SISTEMA;
                    } else {
                        resposta = "";
                        System.out.println(LimparConsole.limparConsole());
                        break;
                    }
                }

            }
        }
    }

}
