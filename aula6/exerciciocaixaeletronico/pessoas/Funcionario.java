package br.com.meta.aula6.exerciciocaixaeletronico.pessoas;

public class Funcionario {

    private String login;
    private String senha;

    public Funcionario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
