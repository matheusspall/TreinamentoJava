package Aula3.Exercicio1;

import java.util.ArrayList;

public class Montadora {

    private ArrayList<MontadoraAuto> listaAutomovel = new ArrayList<>();

    public void adicionarAuto(MontadoraAuto auto) {
        listaAutomovel.add(auto);
    }

    public int totalAutoFabricado() {
        int total = 0;
        for (int i = 0; i < listaAutomovel.size(); i++) {
            total += listaAutomovel.get(i).getQtdFabricada();
        }
        return total;
    }

    public double totalAutoComDefeito() {
        double total = 0.0f;
        
        for(MontadoraAuto auto : listaAutomovel)
        {
            double perDef = auto.getPorcentagemDefeito();
            int qtdFab = auto.getQtdFabricada();
            total += (perDef / 100) * qtdFab;
        }
        
        return total;
    }

    public double percentagemTotalAutoComDefeito() {
        return (totalAutoComDefeito() / totalAutoFabricado()) * 100;
    }

}
