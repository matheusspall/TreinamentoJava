package br.com.meta.aula2.exercicio5;

public class Principal {

    public static void main(String[] args) {

//        Porta porta = new Porta();
//
//        porta.abre();
//        porta.fecha();
//        porta.pinta("azul");
//        porta.pinta("vermelho");
//        porta.pinta("verde");
//        porta.setDimensaoX(3);
//        porta.setDimensaoY(5);
//        porta.setDimensaoZ(1);
//        System.out.println(porta.estaAberta());
        
        //------------------------------

//        Casa casa = new Casa();
//        Porta porta1 = new Porta();
//        Porta porta2 = new Porta();
//        Porta porta3 = new Porta();
//
//        casa.pinta("verde");
//        casa.setPorta1(porta1);
//        casa.setPorta2(porta2);
//        casa.setPorta3(porta3);
//        porta1.abre();
//        porta2.fecha();
//        porta3.abre();
//        porta1.fecha();
//        porta2.abre();
//        porta3.fecha();
//        System.out.println("Portas abertas: " + casa.quantasPortasEstaoAbertas());

        //------------------------------
        
        Edificio ed = new Edificio();
        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();
        Porta p4 = new Porta();
        Porta p5 = new Porta();
        Porta p6 = new Porta();

        ed.pinta("verde");
        ed.adicionaPorta(p1);
        ed.adicionaPorta(p2);
        ed.adicionaPorta(p3);
        ed.adicionaPorta(p4);
        ed.adicionaPorta(p5);
        ed.adicionaPorta(p6);
        p1.abre();
        p2.abre();
        p3.abre();
        p4.abre();
        p5.abre();
        p6.abre();

        p2.fecha();
        p4.fecha();
        p6.fecha();

        System.out.println("Qtd. portas abertas: " + ed.quantasPortasEstaoAbertas());
        System.out.println("Total de portas: " + ed.totalDePortas());

        ed.adicionarAndar();
        ed.adicionarAndar();
        ed.adicionarAndar();
        ed.adicionarAndar();

        System.out.println("Total de andares: " + ed.totalDeAndares());

    }

}
