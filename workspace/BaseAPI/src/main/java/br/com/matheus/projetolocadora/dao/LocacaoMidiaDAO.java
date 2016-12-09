package br.com.matheus.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.matheus.projetolocadora.modelo.LocacaoMidia;
import br.com.matheus.projetolocadora.util.PesquisaBean;

public class LocacaoMidiaDAO extends GenericoDAO<LocacaoMidia, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		
		LocacaoMidia o = (LocacaoMidia) pesquisaBean.getEntidade();
		
		if(o == null) {
			return;
		}
	}
	
}
