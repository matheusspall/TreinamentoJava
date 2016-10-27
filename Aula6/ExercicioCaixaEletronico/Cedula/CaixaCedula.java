package Aula6.ExercicioCaixaEletronico.Cedula;

import Aula6.ExercicioCaixaEletronico.Cedula.Cedula;

public class CaixaCedula {

    private Cedula cedula;
    private int qtdCedula;
    
    public Cedula getCedula() {
        return cedula;
    }

    public void setCedula(Cedula cedula) {
        this.cedula = cedula;
    }

    public int getQtdCedula() {
        return qtdCedula;
    }

    public void setQtdCedula(int qtdCedula) {
        this.qtdCedula = qtdCedula;
    }
    
    public int getValorTotal(){
        return (getQtdCedula() * (getCedula().getValor()));
    }
    
    public void addCedula(int qtd){
        qtdCedula += qtd;
    }
    
    public void addCedula(){
        qtdCedula++;
    }
    
    public void removeCedula(){
        qtdCedula--;
    }
}
