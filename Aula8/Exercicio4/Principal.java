package Aula8.Exercicio4;

import Aula8.Exercicio4.Catalogo.*;
import Aula8.Exercicio4.ItemColecionavel.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int id = 0;
        String nome = "", dataAquisicao = "", autor = ""; 
        
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        PRINCIPAL:
        while (true) {
            System.out.print("-------------- Catalogo Meta --------------"
                    + "\nO que deseja fazer?"
                    + "\n1) Listar Catalogo"
                    + "\n2) Adicionar Item"
                    + "\n99) Sair"
                    + "\nOpcao: ");
            int opPrincipal = scanner.nextInt();

            switch (opPrincipal) {
                case 1:
                    System.out.println(catalogo.imprimirColecao());
                    break;

                case 2:
                    ADDITEM:
                    while (true) {
                        System.out.print("-------------- Adicionar Item no Catalogo --------------"
                                + "\nQual tipo do item?"
                                + "\n1) CD"
                                + "\n2) DVD"
                                + "\n3) Livro"
                                + "\n4) Revista"
                                + "\n99) Sair"
                                + "\nOpcao: ");
                        int opAdd = scanner.nextInt();
                        
                        switch(opAdd){
                            case 1:
                                System.out.print("ID: ");
                                id = scanner.nextInt();
                                System.out.print("Nome: ");
                                nome = scanner.next();
                                System.out.print("Data Aquisicao: ");
                                dataAquisicao = scanner.next();
                                System.out.print("Autor: ");
                                autor = scanner.next();
                                System.out.print("Genero: ");
                                String generoCD = scanner.next();
                                System.out.print("Nomes Musicas: ");
                                String nomeMusicaCD = scanner.next();
                                ItemColecionavel cd = new CD(id, nome, dataAquisicao, autor, generoCD, nomeMusicaCD);
                                catalogo.addItemColecionavel(cd);
                                break;
                                
                            case 2:
                                System.out.print("ID: ");
                                id = scanner.nextInt();
                                System.out.print("Nome: ");
                                nome = scanner.next();
                                System.out.print("Data Aquisicao: ");
                                dataAquisicao = scanner.next();
                                System.out.print("Autor: ");
                                autor = scanner.next();
                                System.out.print("Tipo: ");
                                String tipoDVD = scanner.next();
                                System.out.print("Descricao: ");
                                String descricaoDVD = scanner.next();
                                ItemColecionavel dvd = new DVD(id, nome, dataAquisicao, autor, tipoDVD, descricaoDVD);
                                catalogo.addItemColecionavel(dvd);
                                break;
                                
                            case 3:
                                System.out.print("ID: ");
                                id = scanner.nextInt();
                                System.out.print("Nome: ");
                                nome = scanner.next();
                                System.out.print("Data Aquisicao: ");
                                dataAquisicao = scanner.next();
                                System.out.print("Autor: ");
                                autor = scanner.next();
                                System.out.print("Nome Editora: ");
                                String nomeEditoraLivro = scanner.next();
                                System.out.print("Ano Publicacao: ");
                                int anoPublicacaoLivro = scanner.nextInt();
                                ItemColecionavel livro = new Livro(id, nome, dataAquisicao, autor, nomeEditoraLivro, anoPublicacaoLivro);
                                catalogo.addItemColecionavel(livro);
                                break;
                                
                            case 4:
                                System.out.print("ID: ");
                                id = scanner.nextInt();
                                System.out.print("Nome: ");
                                nome = scanner.next();
                                System.out.print("Data Aquisicao: ");
                                dataAquisicao = scanner.next();
                                System.out.print("Autor: ");
                                autor = scanner.next();
                                System.out.print("Ano Publicacao: ");
                                int anoPublicacaoRevista = scanner.nextInt();
                                System.out.print("Volume: ");
                                String volumeRevista = scanner.next();
                                System.out.print("Editora: ");
                                String editoraRevista = scanner.next();
                                System.out.print("Assunto: ");
                                String assuntoRevista = scanner.next();
                                ItemColecionavel revista = new Revista(id, nome, dataAquisicao, autor, anoPublicacaoRevista, volumeRevista, editoraRevista, assuntoRevista);
                                catalogo.addItemColecionavel(revista);
                                break;
                                
                            default :
                                break ADDITEM;
                        }
                    }
                    break;
                default :
                    break PRINCIPAL;
            }

        }

        ItemColecionavel livro1 = new Livro(0, "livro 1", "01/01/2000", "Autor Livro 1", "Editora 1", 1999);
        ItemColecionavel dvd1 = new DVD(0, "dvd 1", "01/01/2000", "Autor DVD 1", "Terror", "Bagual e meio");
        ItemColecionavel revista1 = new Revista(0, "revista 1", "01/01/2000", "Autor Revista 1", 1999, "3", "Editora Revista 1", "Assunto revista 1");

    }

}
