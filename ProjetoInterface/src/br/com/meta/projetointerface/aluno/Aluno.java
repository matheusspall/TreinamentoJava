package br.com.meta.projetointerface.aluno;

public class Aluno {

    private String nome;
    private String email;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String pais;
    private String telefone;

    public Aluno(String nome, String email, String endereco, String bairro, String cidade, String cep, String estado, String pais, String telefone) throws Exception{
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.pais = pais;
        this.telefone = telefone;
        validaDados();
    }

    private void validaDados() throws Exception{
        if (nome == null || email == null || bairro == null || cidade == null || cep == null || estado == null || pais == null || telefone == null) {
            throw new NullPointerException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
