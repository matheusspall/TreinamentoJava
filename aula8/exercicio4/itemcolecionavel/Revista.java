package br.com.meta.aula8.exercicio4.itemcolecionavel;

public class Revista extends ItemColecionavel {
    private int anoPublicacao;
    private String volume;
    private String editora;
    private String assunto;

    public Revista(int id, String nome, String dataAquisicao, String autor, int anoPublicacao, String volume, String editora, String assunto){
        super(id, nome, dataAquisicao, autor);
        this.anoPublicacao = anoPublicacao;
        this.volume = volume;
        this.editora = editora;
        this.assunto = assunto;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
