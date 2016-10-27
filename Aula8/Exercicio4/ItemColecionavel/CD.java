package Aula8.Exercicio4.ItemColecionavel;

public class CD extends ItemColecionavel {
    private String genero;
    private String nomeMusica;

    public CD (int id, String nome, String dataAquisicao, String autor, String genero, String nomeMusica){
        super(id, nome, dataAquisicao, autor);
        this.genero = genero;
        this.nomeMusica = nomeMusica;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
}
