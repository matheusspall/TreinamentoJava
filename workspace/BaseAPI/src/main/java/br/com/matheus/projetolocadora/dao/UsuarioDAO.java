package br.com.matheus.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.matheus.projetolocadora.modelo.Usuario;
import br.com.matheus.projetolocadora.util.PesquisaBean;

public class UsuarioDAO extends GenericoDAO<Usuario, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Usuario o = (Usuario) pesquisaBean.getEntidade();
		
		if(o == null) {
			return;
		}
	}

}
