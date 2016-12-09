package br.com.matheus.projetolocadora.BaseAPI;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.matheus.projetolocadora.dao.CategoriaDAO;
import br.com.matheus.projetolocadora.dao.FilmeDAO;
import br.com.matheus.projetolocadora.modelo.Categoria;
import br.com.matheus.projetolocadora.modelo.Filme;
//import br.com.matheus.projetolocadora.modelo.FilmePK;
import br.com.matheus.projetolocadora.util.PesquisaBean;


public class App 
{
    public static void main( String[] args )
    {
//    	App aplicacao = new App();
    	
        Categoria categoria =  new Categoria();
        CategoriaDAO dao = new CategoriaDAO();
        PesquisaBean pesquisaBean = new PesquisaBean(categoria);
        List<Categoria> categorias = new ArrayList<Categoria>();
        
//        categoria.setDescricao("T");
        
        try {
            categorias = dao.pesq(pesquisaBean, null);
            
//            for(Categoria retorno : categorias) {
//            	System.out.println(retorno.getDescricao());
//            }

//            aplicacao.criarFilme(categorias.get(0));
//            System.out.println("Filme criado com sucesso!");
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    
    public void criarFilme(Categoria categoria) throws Exception{
    	
    	Filme filme = new Filme();
//    	FilmePK pk = new FilmePK();   //usado para demonstração de chave composta
    	FilmeDAO dao = new FilmeDAO();
    	
//    	pk.setCategoria(categoria);   //usado para demonstração de chave composta
//    	filme.setPk(pk);              //usado para demonstração de chave composta
    	filme.setCategoria(categoria);
    	filme.setDescricao("Paranormal");
    	filme.setAno(Calendar.getInstance());
    	filme.setResumo("No final todos morrem");
    	filme.setClassificacao(18);
    	
    	Calendar duracao = Calendar.getInstance();
    	duracao.set(Calendar.HOUR_OF_DAY, 2);
    	duracao.set(Calendar.MINUTE, 0);
    	filme.setDuracao(duracao);
    	
    	dao.criar(filme);
    	
    }
}
