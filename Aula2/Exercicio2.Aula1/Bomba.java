package Aula2.Exercicio2Refatorado;

public class Bomba {
    
    private Combustivel gasolina, alcool;
    
    public void setGasolina(Combustivel gasolina){
        this.gasolina = gasolina;
    }
    
    public Combustivel getGasolina(){
        return gasolina;
    }
    
    public void setAlcool(Combustivel alcool){
        this.alcool = alcool;
    }
    
    public Combustivel getAlcool(){
        return alcool;
    }
    
    public double valorTotal(){
        double valorTotal = gasolina.valorTotal() + alcool.valorTotal();
        if (((alcool.getLitros() + gasolina.getLitros()) > 20) || valorTotal > 70.00) {
            valorTotal *= 0.9;
        }
        return valorTotal;
    }
    
}
