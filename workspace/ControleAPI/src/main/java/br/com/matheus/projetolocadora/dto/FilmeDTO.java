package br.com.matheus.projetolocadora.dto;

import java.util.Calendar;

public class FilmeDTO extends BaseDTO {

	private Integer id;
	private CategoriaDTO categoriaDTO;
	private String descricao;
	private String ano;
	private Calendar anoCalendar;
	private String resumo;
	private Integer classificacao;
	private String duracao;
	private Calendar duracaoCalendar;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CategoriaDTO getCategoriaDTO() {
		return categoriaDTO;
	}

	public void setCategoriaDTO(CategoriaDTO categoriaDTO) {
		this.categoriaDTO = categoriaDTO;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Calendar getAnoCalendar() {
		return anoCalendar;
	}

	public void setAnoCalendar(Calendar anoCalendar) {
		this.anoCalendar = anoCalendar;
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

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Calendar getDuracaoCalendar() {
		return duracaoCalendar;
	}

	public void setDuracaoCalendar(Calendar duracaoCalendar) {
		this.duracaoCalendar = duracaoCalendar;
	}
	
	

}
