package br.com.matheus.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.matheus.projetolocadora.modelo.Cliente;
import br.com.matheus.projetolocadora.util.PesquisaBean;

public class ClienteDAO extends GenericoDAO<Cliente, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		
		Cliente o = (Cliente) pesquisaBean.getEntidade();
		
		if(o == null) {
			return;
		}
	}

	
	
}
