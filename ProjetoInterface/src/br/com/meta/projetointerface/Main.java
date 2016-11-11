package br.com.meta.projetointerface;

import br.com.meta.projetointerface.aluno.Aluno;
import br.com.meta.projetointerface.console.Limpar;
import br.com.meta.projetointerface.funcionario.administrativo.*;
import br.com.meta.projetointerface.funcionario.professor.*;
import br.com.meta.projetointerface.excecoes.FuncionarioException;
import br.com.meta.projetointerface.interfaces.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int op = 0, opProf = 0, opAluno = 0, opFaxineira = 0, idade = 0;
        String nome = null, email = null, endereco = null, bairro = null, cidade = null, cep = null, estado = null, pais = null, telefone = null;

        try {
            Universidade ufsm = new Universidade();

            SISTEMA:
            while (true) {
                System.out.print("------------- Menu Universidade -------------"
                        + "\n1) Jardineiro"
                        + "\n2) Faxineira"
                        + "\n3) Professor"
                        + "\n4) Aluno"
                        + "\n5) Dia de limpeza"
                        + "\n99) Sair"
                        + "\nOpcao: ");
                try {
                    op = scanner.nextInt();
                } catch (Exception e) {
                    op = 0;
                } finally {
                    scanner.nextLine(); //esvaziar buffer
                }
                switch (op) {
                    case 1: { //JARDINEIRO
                        System.out.println(Limpar.limparConsole());
                        System.out.print("Nome: ");
                        nome = scanner.nextLine();
                        System.out.print("Idade: ");
                        try {
                            idade = scanner.nextInt();
                        } catch (Exception e) {

                        } finally {
                            scanner.nextLine(); //esvaziar buffer
                        }
                        Jardineiro jardineiro = new Jardineiro(nome, idade);
                        ufsm.setJardineiro(jardineiro);
                        System.out.println("Jardineiro (a) adicionado com sucesso!");
                        try {
                            System.out.println("Processando...");
                            Thread.sleep(2500);
                            System.out.println(Limpar.limparConsole());
                        } catch (InterruptedException ex) {

                        }
                        break;
                    }
                    case 2: { //FAXINEIRA
                        System.out.println(Limpar.limparConsole());
                        System.out.print("Nome: ");
                        nome = scanner.nextLine();
                        System.out.print("Idade: ");
                        try {
                            idade = scanner.nextInt();
                        } catch (Exception e) {

                        } finally {
                            scanner.nextLine(); //esvaziar buffer
                        }
                        System.out.print("\nEmpresa: "
                                + "\n1) Cia das diaristas"
                                + "\n2) Sul Clean"
                                + "\n99) Voltar"
                                + "\nOpcao: ");
                        try {
                            opFaxineira = scanner.nextInt();
                        } catch (Exception e) {
                            opFaxineira = 0;
                        } finally {
                            scanner.nextLine(); //esvaziar buffer
                        }
                        switch (opFaxineira) {
                            case 1: {
                                IFaxineira faxineira = new FaxineiraCiaDasDiaristas(nome, idade);
                                ufsm.setFaxineira(faxineira);
                                System.out.println("Faxineiro (a) adicionado com sucesso!");
                                break;
                            }
                            case 2: {
                                IFaxineira faxineira = new FaxineiraSulClean(nome, idade);
                                ufsm.setFaxineira(faxineira);
                                System.out.println("Faxineiro (a) adicionado com sucesso!");
                                break;
                            }
                            default: break;
                        }

                        try {
                            System.out.println("Processando...");
                            Thread.sleep(2500);
                            System.out.println(Limpar.limparConsole());
                        } catch (InterruptedException ex) {

                        }
                        break;
                    }
                    case 3: { //PROFESSOR
                        System.out.print(Limpar.limparConsole());
                        PROFESSOR:
                        while (true) {
                            System.out.print("------------- Menu Professor -------------"
                                    + "\n1) Dentista"
                                    + "\n2) Advogado"
                                    + "\n3) Listar professores"
                                    + "\n99) Voltar menu principal"
                                    + "\nOpcao: ");
                            try {
                                opProf = scanner.nextInt();
                            } catch (Exception e) {
                                opProf = 0;
                            } finally {
                                scanner.nextLine(); //esvaziar buffer
                            }

                            switch (opProf) {
                                case 1: { //DENTISTA
                                    System.out.println(Limpar.limparConsole());
                                    System.out.print("Nome: ");
                                    nome = scanner.nextLine();
                                    System.out.print("Idade: ");
                                    try {
                                        idade = scanner.nextInt();
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine(); //esvaziar buffer
                                    }
                                    IProfessor dentista = new Dentista(nome, idade);
                                    ufsm.adicionarProfessor(dentista);
                                    System.out.println("Professor Dentista adicionado com sucesso!");
                                    try {
                                        System.out.println("Processando...");
                                        Thread.sleep(2500);
                                        System.out.println(Limpar.limparConsole());
                                    } catch (InterruptedException ex) {

                                    }
                                    break;
                                }
                                case 2: { //ADVOGADO
                                    System.out.println(Limpar.limparConsole());
                                    System.out.print("Nome: ");
                                    nome = scanner.nextLine();
                                    System.out.print("Idade: ");
                                    try {
                                        idade = scanner.nextInt();
                                    } catch (Exception e) {

                                    } finally {
                                        scanner.nextLine(); //esvaziar buffer
                                    }
                                    IProfessor advogado = new Advogado(nome, idade);
                                    ufsm.adicionarProfessor(advogado);
                                    System.out.println("Professor Advogado adicionado com sucesso!");
                                    try {
                                        System.out.println("Processando...");
                                        Thread.sleep(2500);
                                        System.out.println(Limpar.limparConsole());
                                    } catch (InterruptedException ex) {

                                    }
                                    break;
                                }
                                case 3: { //LISTAR PROFESSORES
                                    System.out.println(Limpar.limparConsole());
                                    ufsm.listarProfessores();
                                    break;
                                }
                                default: {
                                    System.out.println(Limpar.limparConsole());
                                    break PROFESSOR;
                                }
                            }
                        }
                        break;
                    }
                    case 4: {
                        System.out.println(Limpar.limparConsole());
                        ALUNO:
                        while (true) {
                            System.out.print("------------- Menu Aluno -------------"
                                    + "\n1) Adicionar"
                                    + "\n2) Excluir"
                                    + "\n3) Editar"
                                    + "\n4) Listar"
                                    + "\n99) Voltar menu principal"
                                    + "\nOpcao: ");
                            try {
                                opAluno = scanner.nextInt();
                            } catch (Exception e) {
                                opAluno = 0;
                            } finally {
                                scanner.nextLine(); //esvazia o buffer
                            }

                            switch (opAluno) {
                                case 1: { //ADICIONAR
                                    System.out.println(Limpar.limparConsole());
                                    System.out.print("------------- Adicionar aluno -------------"
                                            + "\nNome: ");
                                    nome = scanner.nextLine();
                                    System.out.print("Email: ");
                                    email = scanner.nextLine();
                                    System.out.print("Endereco: ");
                                    endereco = scanner.nextLine();
                                    System.out.print("Bairro: ");
                                    bairro = scanner.nextLine();
                                    System.out.print("cidade: ");
                                    cidade = scanner.nextLine();
                                    System.out.print("cep: ");
                                    cep = scanner.nextLine();
                                    System.out.print("estado: ");
                                    estado = scanner.nextLine();
                                    System.out.print("pais: ");
                                    pais = scanner.nextLine();
                                    System.out.print("telefone: ");
                                    telefone = scanner.nextLine();

                                    try {
                                        ufsm.getControleAluno().adicionar(new Aluno(nome, email, endereco, bairro, cidade, cep, estado, pais, telefone));
                                        System.out.println("Aluno adicionado com sucesso!");
                                        try {
                                            System.out.println("Processando...");
                                            Thread.sleep(2500);
                                            System.out.println(Limpar.limparConsole());
                                        } catch (InterruptedException ex) {

                                        }
                                    } catch (NullPointerException e) {
                                        System.out.println("Dados incompletos!");
                                        try {
                                            System.out.println("Processando...");
                                            Thread.sleep(2500);
                                            System.out.println(Limpar.limparConsole());
                                        } catch (InterruptedException ex) {

                                        }
                                    } catch (Exception ex) {

                                    }
                                    break;
                                }
                                case 2: { //EXCLUIR
                                    System.out.println(Limpar.limparConsole());
                                    System.out.print("Email do aluno: ");
                                    email = scanner.nextLine();
                                    int indice = ufsm.getControleAluno().pesquisarIndiceAluno(email);

                                    if (indice != -1) {
                                        ufsm.getControleAluno().excluir(indice);
                                        System.out.println("Aluno excluido com sucesso!");
                                    } else {
                                        System.out.println("Nao existe este email cadastrado!");
                                    }
                                    try {
                                        System.out.println("Processando...");
                                        Thread.sleep(2500);
                                        System.out.println(Limpar.limparConsole());
                                    } catch (InterruptedException ex) {

                                    }
                                    break;
                                }
                                case 3: { //EDITAR
                                    System.out.println(Limpar.limparConsole());
                                    System.out.print("Email do aluno: ");
                                    email = scanner.nextLine();
                                    int indice = ufsm.getControleAluno().pesquisarIndiceAluno(email);

                                    if (indice != -1) {
                                        System.out.println(Limpar.limparConsole());
                                        Aluno aluno = ufsm.getControleAluno().get(indice);
                                        System.out.println("------------- Dados do aluno -------------"
                                                + "\nNome: " + aluno.getNome()
                                                + "\nEmail: " + aluno.getEmail()
                                                + "\nEndereco: " + aluno.getEndereco()
                                                + "\nBairro: " + aluno.getBairro()
                                                + "\nCidade: " + aluno.getCidade()
                                                + "\nCEP: " + aluno.getCep()
                                                + "\nEstado: " + aluno.getEstado()
                                                + "\nPais: " + aluno.getPais()
                                                + "\nTelefone: " + aluno.getTelefone() + ""
                                                + "\n------------- Informe os novos dados do aluno -------------");
                                        System.out.print("Nome: ");
                                        nome = scanner.nextLine();
                                        if (!nome.equals("")) {
                                            aluno.setNome(nome);
                                        }

                                        System.out.print("Email: ");
                                        email = scanner.nextLine();
                                        if (!email.equals("")) {
                                            aluno.setEmail(email);
                                        }

                                        System.out.print("Endereco: ");
                                        endereco = scanner.nextLine();
                                        if (!endereco.equals("")) {
                                            aluno.setEndereco(endereco);
                                        }

                                        System.out.print("Bairro: ");
                                        bairro = scanner.nextLine();
                                        if (!bairro.equals("")) {
                                            aluno.setBairro(bairro);
                                        }

                                        System.out.print("Cidade: ");
                                        cidade = scanner.nextLine();
                                        if (!cidade.equals("")) {
                                            aluno.setCidade(cidade);
                                        }

                                        System.out.print("CEP: ");
                                        cep = scanner.nextLine();
                                        if (!cep.equals("")) {
                                            aluno.setCep(cep);
                                        }

                                        System.out.print("Estado: ");
                                        estado = scanner.nextLine();
                                        if (!estado.equals("")) {
                                            aluno.setEstado(estado);
                                        }

                                        System.out.print("Pais: ");
                                        pais = scanner.nextLine();
                                        if (!pais.equals("")) {
                                            aluno.setPais(pais);
                                        }

                                        System.out.print("Telefone: ");
                                        telefone = scanner.nextLine();
                                        if (!telefone.equals("")) {
                                            aluno.setTelefone(telefone);
                                        }

                                        System.out.println("Aluno atualizado com sucesso!");
                                    } else {
                                        System.out.println("Nao existe este email cadastrado!");
                                    }

                                    try {
                                        System.out.println("Processando...");
                                        Thread.sleep(2500);
                                        System.out.println(Limpar.limparConsole());
                                    } catch (InterruptedException ex) {

                                    }

                                    break;
                                }
                                case 4: { //LISTAR
                                    System.out.println(Limpar.limparConsole());
                                    ArrayList<Aluno> listaAlunos = ufsm.getControleAluno().listagem();
                                    if (listaAlunos != null) {
                                        int cont = 1;
                                        for (Aluno aluno : listaAlunos) {
                                            System.out.println("--- Aluno " + cont + " ---"
                                                    + "\nNome: " + aluno.getNome()
                                                    + "\nEmail: " + aluno.getEmail()
                                                    + "\nEndereco: " + aluno.getEndereco()
                                                    + "\nBairro: " + aluno.getBairro()
                                                    + "\nCidade: " + aluno.getCidade()
                                                    + "\nCEP: " + aluno.getCep()
                                                    + "\nEstado: " + aluno.getEstado()
                                                    + "\nPais: " + aluno.getPais()
                                                    + "\nTelefone: " + aluno.getTelefone() + "\n");
                                            cont++;
                                        }
                                    } else {
                                        System.out.println("Nao ha alunos cadastrados no sistema!");
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println(Limpar.limparConsole());
                                    break ALUNO;
                                }
                            }

                        }
                        break;
                    }
                    case 5: {
                        System.out.println(Limpar.limparConsole());
                        try {
                            ufsm.diaDaLimpeza();
                        } catch (Exception ex) {
                            System.out.println("Falta de pessoal para fazer a limpeza!");
                        }
                        break;
                    }
                    default: {
                        System.out.println(Limpar.limparConsole());
                        System.out.println("Obrigado por utilizar nosso sistema!");
                        break SISTEMA;
                    }
                }
            }
        } catch (FuncionarioException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
