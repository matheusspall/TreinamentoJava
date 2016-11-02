package br.com.meta.aula3.exercicio5;

public class Pessoa {
    private String sexo;
    private String responsta;

    public Pessoa(String sexo, String resposta){
        this.sexo = sexo;
        this.responsta = resposta;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getResponsta() {
        return responsta;
    }

    public void setResponsta(String responsta) {
        this.responsta = responsta;
    }
    
    
}
