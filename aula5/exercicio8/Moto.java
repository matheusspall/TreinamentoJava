package br.com.meta.aula5.exercicio8;

public class Moto {

    private String marca;
    private String modelo;
    private String cor;
    private int marcha;
    private int menorMarcha;
    private int maiorMarcha;

    public Moto(String marca, String modelo, String cor, int marcha, int menorMarcha, int maiorMarcha) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        this.menorMarcha = menorMarcha;
        this.maiorMarcha = maiorMarcha;
    }

    public void marchaAcima(int qtdMarchas) {
        if ((marcha + qtdMarchas) < maiorMarcha) {
            marcha += qtdMarchas;
        } else {
            while (marcha < maiorMarcha) {
                marchaAcima();
            }
        }
    }

    public void marchaAcima() {
        if (marcha < maiorMarcha) {
            marcha++;
        }
    }

    public void marchaAbaixo(int qtdMarchas) {
        if ((marcha - qtdMarchas) > menorMarcha) {
            marcha -= qtdMarchas;
        } else {
            while (marcha > menorMarcha) {
                marchaAbaixo();
            }
        }
    }

    public void marchaAbaixo() {
        if (marcha > menorMarcha) {
            marcha--;
        }
    }

    public String imprimir() {
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nMarcha: " + marcha
                + "\nMenor marcha: " + menorMarcha
                + "\nMaior marcha: " + maiorMarcha;
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

    public int getMenorMarcha() {
        return menorMarcha;
    }

    public void setMenorMarcha(int menorMarcha) {
        this.menorMarcha = menorMarcha;
    }

    public int getMaiorMarcha() {
        return maiorMarcha;
    }

    public void setMaiorMarcha(int maiorMarcha) {
        this.maiorMarcha = maiorMarcha;
    }

}
