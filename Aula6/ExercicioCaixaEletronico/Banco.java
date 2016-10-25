package Aula6.ExercicioCaixaEletronico;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Cedula c50 = new Cedula();
        Cedula c20 = new Cedula();
        Cedula c10 = new Cedula();
        Cedula c5 = new Cedula();
        Cedula c2 = new Cedula();

        c50.setValor(50);
        c20.setValor(20);
        c10.setValor(10);
        c5.setValor(5);
        c2.setValor(2);

        CaixaCedula cc50 = new CaixaCedula();
        CaixaCedula cc20 = new CaixaCedula();
        CaixaCedula cc10 = new CaixaCedula();
        CaixaCedula cc5 = new CaixaCedula();
        CaixaCedula cc2 = new CaixaCedula();

        cc50.setCedula(c50);
        cc50.setQtdCedula(10);
        cc20.setCedula(c20);
        cc20.setQtdCedula(10);
        cc10.setCedula(c10);
        cc10.setQtdCedula(10);
        cc5.setCedula(c5);
        cc5.setQtdCedula(10);
        cc2.setCedula(c2);
        cc2.setQtdCedula(10);

        CaixaEletronico caixaEle = new CaixaEletronico();
        caixaEle.adicionarCaixaCedula(cc50);
        caixaEle.adicionarCaixaCedula(cc20);
        caixaEle.adicionarCaixaCedula(cc10);
        caixaEle.adicionarCaixaCedula(cc5);
        caixaEle.adicionarCaixaCedula(cc2);

        Funcionario f1 = new Funcionario();
        Cliente c1 = new Cliente();

        Scanner scanner = new Scanner(System.in);
        BANCO: //etiqueta de bloco
        while (true) {
            System.out.print("---------- Banco Meta ----------"
                    + "\n1) Administrador"
                    + "\n2) Cliente"
                    + "\n99) Sair"
                    + "\nOperacao: ");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1: //ADM
                    System.out.print("Digite a senha: ");
                    String senhaDigitada = scanner.next();

                    if (senhaDigitada.equals(f1.getSenha())) {
                        ADM: //etiqueta de bloco
                        while (true) {
                            System.out.print("\nVoce esta conectado como administrador do sistema!"
                                    + "\nO que deseja fazer?"
                                    + "\n\n1) Repor cedulas"
                                    + "\n2) Visualizar total disponível"
                                    + "\n99) Sair"
                                    + "\nOperacao: ");
                            int operacaoAdm = scanner.nextInt();

                            switch (operacaoAdm) {
                                case 1:
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
                                case 2:
                                    System.out.println("Total disponivel: R$" + caixaEle.getTotalDinheiro() + ",00\nCedulas disponiveis:\n" + caixaEle.getTotalCedulas() + "\n");
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

                    CLIENTE: //etiqueta de bloco
                    while (true) {
                        System.out.print("\nBem-vindo ao Banco Meta!"
                                + "\nO que deseja fazer?"
                                + "\n\n1) Saque"
                                + "\n99) Sair"
                                + "\nOperacao: ");
                        int operacaoCliente = scanner.nextInt();

                        switch (operacaoCliente) {
                            case 1:
                                if (!caixaEle.cedulasDisponiveis().equals("")) {
                                    System.out.println("Cedulas disponiveis: " + caixaEle.cedulasDisponiveis());
                                    System.out.print("\nInforme o valor que deseja sacar: ");
                                    int valorSaque = scanner.nextInt();

                                    System.out.println(caixaEle.efetuarSaque(valorSaque));
                                }else{
                                    System.out.println("Desculpe, nao ha cedulas disponiveis!");
                                }

                                break;
                            default:
                                break CLIENTE;
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
