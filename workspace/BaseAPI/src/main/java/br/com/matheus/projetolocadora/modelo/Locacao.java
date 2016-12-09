package br.com.matheus.projetolocadora.modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Locacao")
public class Locacao {

	@Id
	@Column(name = "cod_locacao")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (vários para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_funcionario")
	private Funcionario funcionario;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (vários para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_cliente")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (vários para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_midia")
	private Midia codMidia;
	
	@Column(name = "data_emprestimo")
	private Calendar dataEmprestimo;
	
	@Column(name = "data_devolucao")
	private Calendar dataDevolucao;
	
	@Column(name = "obs")
	private String obs;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "paga_devolucao")
	private Boolean pagaDevolucao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locacao")
	private List<LocacaoMidia> locacoesMidia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Boolean getPagaDevolucao() {
		return pagaDevolucao;
	}

	public void setPagaDevolucao(Boolean pagaDevolucao) {
		this.pagaDevolucao = pagaDevolucao;
	}

	public Midia getCodMidia() {
		return codMidia;
	}

	public void setCodMidia(Midia codMidia) {
		this.codMidia = codMidia;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<LocacaoMidia> getLocacoesMidia() {
		return locacoesMidia;
	}

	public void setLocacoesMidia(List<LocacaoMidia> locacoesMidia) {
		this.locacoesMidia = locacoesMidia;
	}
	
}
