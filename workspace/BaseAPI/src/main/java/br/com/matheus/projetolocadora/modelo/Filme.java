package br.com.matheus.projetolocadora.modelo;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Filme")
public class Filme {

//	@EmbeddedId         //usado para demonstração de chave composta
//	private FilmePK pk;
	
	@Id
	@Column(name = "cod_filme")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (vários para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_categoria")
	private Categoria categoria;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "filme") //informa para hibernate o tipo de relacionamento (um para vários) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	private List<Midia> midias;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "ano")
	private Calendar ano;
	
	@Column(name = "resumo")
	private String resumo;
	
	@Column(name = "classificacao")
	private Integer classificacao;
	
	@Column(name = "duracao")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar duracao;

	/*usado para demonstração de chave composta
	
	public FilmePK getPk() {
		return pk;
	}

	public void setPk(FilmePK pk) {
		this.pk = pk;
	}

	*/

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getAno() {
		return ano;
	}

	public void setAno(Calendar ano) {
		this.ano = ano;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	public Calendar getDuracao() {
		return duracao;
	}

	public void setDuracao(Calendar duracao) {
		this.duracao = duracao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Midia> getMidias() {
		return midias;
	}

	public void setMidias(List<Midia> midias) {
		this.midias = midias;
	}
	
}
