package br.com.matheus.projetolocadora.modelo;

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
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@Column(name = "cod_usuario")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "celular")
	private Integer celular;
	
	@Column(name = "email")
	private String email;
	
	@ManyToOne(fetch = FetchType.EAGER) //informa para hibernate o tipo de relacionamento (um para um) e a forma de carregamento(somente id = LAZY ou tudo = EAGER) 
	@JoinColumn(name = "cod_endereco")
	private Endereco endereco;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	private List<Funcionario> funcionarios;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	private List<Cliente> clientes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
