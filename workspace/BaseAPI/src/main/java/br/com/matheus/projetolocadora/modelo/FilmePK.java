package br.com.matheus.projetolocadora.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable //para indicar que é uma chave composta
public class FilmePK implements Serializable{

	@Column(name = "cod_filme")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codFilme;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (vários para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_categoria")
	private Categoria categoria;

	public Integer getCodFilme() {
		return codFilme;
	}

	public void setCodFilme(Integer codFilme) {
		this.codFilme = codFilme;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
