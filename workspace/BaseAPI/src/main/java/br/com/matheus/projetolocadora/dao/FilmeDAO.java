package br.com.matheus.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.matheus.projetolocadora.modelo.Filme;
import br.com.matheus.projetolocadora.modelo.FilmePK;
import br.com.matheus.projetolocadora.util.PesquisaBean;

public class FilmeDAO extends GenericoDAO<Filme, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Filme o = (Filme) pesquisaBean.getEntidade();
		
		if(o == null) {
			return;
		}
	}

}
