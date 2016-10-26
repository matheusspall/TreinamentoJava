package Aula7.Exercicio2;

public class Normal extends Ingresso{

    @Override
    public void setValor(int valor) {
        super.setValor(valor);
    }
    
    @Override
    public String imprimirValor() {
        return "Ingresso Normal: " + getValor();
    }
    
}
