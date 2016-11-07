package br.com.meta.aula6.exerciciocaixaeletronico.banco;

import br.com.meta.aula6.exerciciocaixaeletronico.caixaeletronico.CaixaEletronico;
import br.com.meta.aula6.exerciciocaixaeletronico.cedula.CaixaCedula;
import br.com.meta.aula6.exerciciocaixaeletronico.cedula.Cedula;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Cliente;
import br.com.meta.aula6.exerciciocaixaeletronico.pessoas.Funcionario;
import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    
    public void inicializarCaixaEletronico(CaixaEletronico caixaEle){
        Cedula c50 = new Cedula();
        Cedula c20 = new Cedula();
        Cedula c10 = new Cedula();
        Cedula c5 = new Cedula();
        Cedula c2 = new Cedula();

        c50.setValor(50);
        c20.setValor(20);
        c10.setValor(10);
        c5.setValor(5);
        c2.setValor(2);

        CaixaCedula cc50 = new CaixaCedula();
        CaixaCedula cc20 = new CaixaCedula();
        CaixaCedula cc10 = new CaixaCedula();
        CaixaCedula cc5 = new CaixaCedula();
        CaixaCedula cc2 = new CaixaCedula();

        cc50.setCedula(c50);
        cc50.setQtdCedula(0);
        cc20.setCedula(c20);
        cc20.setQtdCedula(0);
        cc10.setCedula(c10);
        cc10.setQtdCedula(0);
        cc5.setCedula(c5);
        cc5.setQtdCedula(0);
        cc2.setCedula(c2);
        cc2.setQtdCedula(0);
        
        caixaEle.adicionarCaixaCedula(cc50);
        caixaEle.adicionarCaixaCedula(cc20);
        caixaEle.adicionarCaixaCedula(cc10);
        caixaEle.adicionarCaixaCedula(cc5);
        caixaEle.adicionarCaixaCedula(cc2);
    }
    
    public Cliente validarCliente(int agencia, int conta, String senha){
        for(Cliente cliente : listaCliente){
            if (cliente.getConta().getNumAgencia() == agencia 
                    && cliente.getConta().getNumConta()== conta 
                    && cliente.getConta().getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }
    
    public Funcionario validarFuncionario(String login, String senha){
        for(Funcionario funcionario : listaFuncionario){
            if (funcionario.getLogin().equals(login) && funcionario.getSenha().equals(senha)) {
                return funcionario;
            }
        }
        return null;
    }
    
    public void addCliente(Cliente cliente){
        getListaCliente().add(cliente);
    }
    
    public void removeCliente(Cliente cliente){
        getListaCliente().remove(cliente);
    }
    
    public void addFuncionario(Funcionario funcionario){
        getListaFuncionario().add(funcionario);
    }
    
    public void removeFuncionario(Funcionario funcionario){
        getListaFuncionario().remove(funcionario);
    }

    public ArrayList getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ArrayList getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(ArrayList listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }
    
    
    
}
