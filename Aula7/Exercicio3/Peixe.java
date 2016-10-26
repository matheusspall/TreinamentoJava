package Aula7.Exercicio3;

public class Peixe extends Animal{
    
    private String caracteristica;
    
    public Peixe(String nome, String caracteristica, int comprimento, float velocidade){
        super(nome, comprimento, velocidade);
        setCaracteristica(caracteristica);
    }

    @Override
    public String dados() {
        return "Animal: " + super.getNome()
                + "\nCor: " + super.getCor()
                + "\nAmbiente: " + super.getAmbiente()
                + "\nComprimento: " + super.getComprimento()
                + "\nVelocidade: " + super.getVelocidade()
                + "\nNumero de Patas: " + super.getNumPatas()
                + "\nCaracteristica: " + getCaracteristica();
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    
    
}
