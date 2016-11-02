package br.com.meta.aula2.exercicio5;

public class Casa {
    private String cor;
    private Porta porta1, porta2, porta3;

    public String getCor() {
        return cor;
    }

//    public void setCor(String cor) {
//        this.cor = cor;
//    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    public void pinta(String s){
        cor = s;
    }
    
    public int quantasPortasEstaoAbertas(){
        int cont = 0;
        if (porta1.estaAberta()) cont++;
        if (porta2.estaAberta()) cont++;
        if (porta3.estaAberta()) cont++;
        return cont;
    }
    
    public int totalDePortasFechadas(){
        int cont = 0;
        if (!porta1.estaAberta()) cont++;
        if (!porta2.estaAberta()) cont++;
        if (!porta3.estaAberta()) cont++;
        return cont;
    }
    
}
