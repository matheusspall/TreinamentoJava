package Aula8.Exercicio4.ItemColecionavel;

public class Livro extends ItemColecionavel{
    private String nomeEditora;
    private int anoPublicacao;

    public Livro(int id, String nome, String dataAquisicao, String autor, String nomeEditora, int anoPublicacao){
        super(id, nome, dataAquisicao, autor);
        this.nomeEditora = nomeEditora;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
