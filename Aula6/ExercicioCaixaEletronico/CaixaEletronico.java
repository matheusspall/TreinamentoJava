package Aula6.ExercicioCaixaEletronico;

import java.util.ArrayList;

public class CaixaEletronico {

    private ArrayList<CaixaCedula> listaCedulas = new ArrayList<>();

    public int getTotalDinheiro() {
        int total = 0;
        for (int i = 0; i < listaCedulas.size(); i++) {
            total += listaCedulas.get(i).getQtdCedula() * listaCedulas.get(i).getCedula().getValor();
        }
        return total;
    }

    public String getTotalCedulas() {

        int qtd50 = listaCedulas.get(0).getQtdCedula();
        int qtd20 = listaCedulas.get(1).getQtdCedula();
        int qtd10 = listaCedulas.get(2).getQtdCedula();
        int qtd5 = listaCedulas.get(3).getQtdCedula();
        int qtd2 = listaCedulas.get(4).getQtdCedula();

        return "50 - " + qtd50 + " cedulas disponiveis"
                + "\n20 - " + qtd20 + " cedulas disponiveis"
                + "\n10 - " + qtd10 + " cedulas disponiveis"
                + "\n5 - " + qtd5 + " cedulas disponiveis"
                + "\n2 - " + qtd2 + " cedulas disponiveis";
    }

    public String cedulasDisponiveis() {
        String disponivel = "";
        for (int i = 0; i < listaCedulas.size(); i++) {
            if (listaCedulas.get(i).getQtdCedula() > 0) {
                disponivel += " - " + listaCedulas.get(i).getCedula().getValor();
            }
        }
        return disponivel;
    }

    public String efetuarSaque(int valor) {
        String cedulasRetiradas = "";
        int qtdCedulaRetiradas = 0;
        
        if (valor <= getTotalDinheiro()) {
            while (valor > 0) {
                for (int i = 0; i < listaCedulas.size(); i++) {
                    
                    while ((valor >= listaCedulas.get(i).getCedula().getValor()) && listaCedulas.get(i).getQtdCedula() > 0) {
                        listaCedulas.get(i).setQtdCedula(listaCedulas.get(i).getQtdCedula() - 1);
                        valor -= listaCedulas.get(i).getCedula().getValor();
                        cedulasRetiradas += listaCedulas.get(i).getCedula().getValor() + ", ";
                        qtdCedulaRetiradas++;
                    }
                    
                }
            }
            System.out.println("qtd Cedulas retiradas: " + qtdCedulaRetiradas);
            return cedulasRetiradas;
        } else {
            return "Valor informado maior que o disponivel.";
        }
    }

    public void adicionarCaixaCedula(CaixaCedula caixa) {
        getListaCaixaEle().add(caixa);
    }

    public ArrayList<CaixaCedula> getListaCaixaEle() {
        return listaCedulas;
    }

    public void setListaCaixaEle(ArrayList<CaixaCedula> listaCedulas) {
        this.listaCedulas = listaCedulas;
    }
}
