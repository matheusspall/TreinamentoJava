package br.com.matheus.projetolocadora.dto;

import java.math.BigDecimal;
import java.util.Calendar;

public class LocacaoDTO extends BaseDTO{

	private Integer id;
	private FuncionarioDTO funcionarioDTO;
	private ClienteDTO clienteDTO;
	private MidiaDTO midiaDTO;
	private Calendar dataEmprestimo;
	private Calendar dataDevolucao;
	private String obs;
	private BigDecimal valor;
	private Boolean pagaDevolucao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public FuncionarioDTO getFuncionarioDTO() {
		return funcionarioDTO;
	}
	public void setFuncionarioDTO(FuncionarioDTO funcionarioDTO) {
		this.funcionarioDTO = funcionarioDTO;
	}
	public ClienteDTO getClienteDTO() {
		return clienteDTO;
	}
	public void setClienteDTO(ClienteDTO clienteDTO) {
		this.clienteDTO = clienteDTO;
	}
	public MidiaDTO getMidiaDTO() {
		return midiaDTO;
	}
	public void setMidiaDTO(MidiaDTO midiaDTO) {
		this.midiaDTO = midiaDTO;
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Boolean getPagaDevolucao() {
		return pagaDevolucao;
	}
	public void setPagaDevolucao(Boolean pagaDevolucao) {
		this.pagaDevolucao = pagaDevolucao;
	}
	
	
	
}
