package br.com.meta.aula5.exercicio6;

public class Moto {

    private String marca;
    private String modelo;
    private String cor;
    private int marcha;

    public Moto(String marca, String modelo, String cor, int marcha){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
    }
    
    public void marchaAcima(){
        if (marcha < 5) marcha++;
    }
    
    public void marchaAbaixo(){
        if (marcha > 0) marcha--;
    }
    
    public String imprimir() {
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nMarcha: " + marcha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

}
