package br.com.meta.aula5.exercicio3;

public class Retangulo {

    private int comprimento;
    private int largura;
    private int area;
    private int perimetro;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.area = 0;
        this.perimetro = 0;
    }
        
    //------ SOBRECARGA DE MÉTODOS --------
    public void setDados(int comprimento){
        setComprimento(comprimento);
    }
    
    public void setDados(int comprimento, int largura){
        setComprimento(comprimento);
        setLargura(largura);
    }
    
    public void setDados(int comprimento, int largura, int area){
        setComprimento(comprimento);
        setLargura(largura);
        setArea(area);
    }
    
    public void setDados(int comprimento, int largura, int area, int perimetro){
        setComprimento(comprimento);
        setLargura(largura);
        setArea(area);
        setPerimetro(perimetro);
    }
    //-----------------------------------
    
    public void calcularArea() {
        setArea(getComprimento() * getLargura());
    }

    public void calcularPerimetro() {
        setPerimetro((2 * getComprimento()) + (2 * getLargura()));
    }
    
    public void calcularTudo(){
        setArea(getComprimento() * getLargura());
        setPerimetro((2 * getComprimento()) + (2 * getLargura()));
    }

    public String imprimir() {
        return "Comprimento: " + getComprimento()
                + "\nLargura: " + getLargura()
                + "\nArea: " + getArea()
                + "\nPerimetro: " + getPerimetro();
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

}
