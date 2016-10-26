package Aula7.Exercicio3;

public class Mamifero extends Animal{
    
    private String alimento;
    
    public Mamifero (String nome, String cor, String alimento,int comprimento, float velocidade, int patas){
        super(nome, cor, comprimento, velocidade, patas);
        setAlimento(alimento);
    }

    @Override
    public String dados() {
        return "Animal: " + super.getNome()
                + "\nCor: " + super.getCor()
                + "\nAmbiente: " + super.getAmbiente()
                + "\nComprimento: " + super.getComprimento()
                + "\nVelocidade: " + super.getVelocidade()
                + "\nNumero de Patas: " + super.getNumPatas()
                + "\nAlimento: " + getAlimento();
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    
    
}
