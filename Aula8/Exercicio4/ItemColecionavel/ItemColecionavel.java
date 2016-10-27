package Aula8.Exercicio4.ItemColecionavel;

public class ItemColecionavel {
    private int id;
    private String nome;
    private String dataAquisicao;
    private String autor;

    public ItemColecionavel(int id, String nome, String dataAquisicao, String autor){
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autor = autor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
