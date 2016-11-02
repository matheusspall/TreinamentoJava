package br.com.meta.aula3.exercicio5;

public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Masculino", "sim");
        Pessoa p2 = new Pessoa("Feminino", "sim");
        Pessoa p3 = new Pessoa("Masculino", "sim");
        Pessoa p4 = new Pessoa("Feminino", "sim");
        Pessoa p5 = new Pessoa("Masculino", "sim");
        Pessoa p6 = new Pessoa("Feminino", "sim");
        Pessoa p7 = new Pessoa("Masculino", "sim");
        Pessoa p8 = new Pessoa("Feminino", "sim");
        Pessoa p9 = new Pessoa("Masculino", "sim");
        Pessoa p10 = new Pessoa("Masculino", "sim");
        Pessoa p11 = new Pessoa("Masculino", "nao");
        Pessoa p12 = new Pessoa("Masculino", "nao");
        Pessoa p13 = new Pessoa("Masculino", "nao");
        Pessoa p14 = new Pessoa("Feminino", "nao");
        Pessoa p15 = new Pessoa("Feminino", "nao");
        Pessoa p16 = new Pessoa("Masculino", "nao");
        Pessoa p17 = new Pessoa("Feminino", "nao");
        Pessoa p18 = new Pessoa("Masculino", "nao");
        Pessoa p19 = new Pessoa("Feminino", "nao");
        Pessoa p20 = new Pessoa("Feminino", "nao");

        Entrevista e = new Entrevista();

        e.adicionarEntrevista(p1);
        e.adicionarEntrevista(p2);
        e.adicionarEntrevista(p3);
        e.adicionarEntrevista(p4);
        e.adicionarEntrevista(p5);
        e.adicionarEntrevista(p6);
        e.adicionarEntrevista(p7);
        e.adicionarEntrevista(p8);
        e.adicionarEntrevista(p9);
        e.adicionarEntrevista(p10);
        e.adicionarEntrevista(p11);
        e.adicionarEntrevista(p12);
        e.adicionarEntrevista(p13);
        e.adicionarEntrevista(p14);
        e.adicionarEntrevista(p15);
        e.adicionarEntrevista(p16);
        e.adicionarEntrevista(p17);
        e.adicionarEntrevista(p18);
        e.adicionarEntrevista(p19);
        e.adicionarEntrevista(p20);

        System.out.println("Qtd de SIM: " + e.getVotosSim());
        System.out.println("Qtd de NAO: " + (e.getEntrevistados().size() - e.getVotosSim()));
        System.out.println("Percentagem Mulheres SIM: " + e.getPercMulheresSim()+"%");
        System.out.println("Percentagem Homens NAO: " + e.getPercHomensNao()+"%");
    }
}
