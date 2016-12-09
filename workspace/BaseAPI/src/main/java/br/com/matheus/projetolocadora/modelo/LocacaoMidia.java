package br.com.matheus.projetolocadora.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Locacao_Midia")
public class LocacaoMidia {
	
	@Id
	@Column(name = "cod_locacao_midia")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (um para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_locacao")
	private Locacao locacao;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (um para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_midia")
	private Midia midia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}
	
}
