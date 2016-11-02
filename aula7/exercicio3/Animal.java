package br.com.meta.aula7.exercicio3;

public class Animal {
    private String nome;
    private int comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.numPatas = patas;
    }
    
    public Animal(String nome, int comprimento, float velocidade){
        this.nome = nome;
        this.cor = "cinza";
        this.ambiente = "mar";
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.numPatas = 0;
    }
    
    public Animal (String nome, String cor, int comprimento, float velocidade, int patas){
        this.nome = nome;
        this.cor = cor;
        this.ambiente = "terra";
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.numPatas = patas;
    }
    
    public String dados(){
        return "Animal: " + nome
                + "\nCor: " + cor
                + "\nAmbiente: " + ambiente
                + "\nComprimento: " + comprimento
                + "\nVelocidade: " + velocidade
                + "\nNumero de Patas: " + numPatas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    
}
