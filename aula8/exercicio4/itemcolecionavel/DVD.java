package br.com.meta.aula8.exercicio4.itemcolecionavel;

public class DVD extends ItemColecionavel {
    private String tipo;
    private String descricao;

    public DVD(int id, String nome, String dataAquisicao, String autor, String tipo, String descricao){
        super(id, nome, dataAquisicao, autor);
        this.tipo = tipo;
        this.descricao = descricao;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
