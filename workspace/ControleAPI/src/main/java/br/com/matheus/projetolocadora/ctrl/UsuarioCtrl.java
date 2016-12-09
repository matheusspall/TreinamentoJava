package br.com.matheus.projetolocadora.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.matheus.projetolocadora.dao.ClienteDAO;
import br.com.matheus.projetolocadora.dao.FuncionarioDAO;
import br.com.matheus.projetolocadora.dao.UsuarioDAO;
import br.com.matheus.projetolocadora.dto.ClienteDTO;
import br.com.matheus.projetolocadora.dto.FuncionarioDTO;
import br.com.matheus.projetolocadora.dto.UsuarioDTO;
import br.com.matheus.projetolocadora.modelo.Cliente;
import br.com.matheus.projetolocadora.modelo.Funcionario;
import br.com.matheus.projetolocadora.modelo.Usuario;

@Path("/usuario")
public class UsuarioCtrl {

	@POST
	@Produces("application/json") // formato dos dados de retorno
	@Consumes(MediaType.APPLICATION_JSON) // formato da entrada de dados
	@Path("/criarFuncionario")
	public FuncionarioDTO criarFuncionario(FuncionarioDTO funcionarioDTO){
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = new Funcionario();
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		
		usuarioDTO = funcionarioDTO.getUsuarioDTO();
		
		try{
			this.validarCamposObrigatorios(usuarioDTO);
			usuario = this.converterDTOEmUsuario(usuarioDTO);
			Integer id = usuarioDAO.criar(usuario);
			funcionarioDTO.getUsuarioDTO().setId(id);
			this.validarCamposObrigatorios(funcionarioDTO);
			funcionario = this.converterDTOEmFuncionario(funcionarioDTO);
			funcionarioDAO.criar(funcionario);
		}catch(Exception e){
			String mensagemErro = "Problemas ao criar registro: mensagem detalhada: ";
			funcionarioDTO.setMensagem(mensagemErro + e.getMessage());
		}
		return funcionarioDTO;
	}

	@POST
	@Produces("application/json") // formato dos dados de retorno
	@Consumes(MediaType.APPLICATION_JSON) // formato da entrada de dados
	@Path("/criarCliente")
	public ClienteDTO criarCliente(ClienteDTO clienteDTO){
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		
		usuarioDTO = clienteDTO.getUsuarioDTO();
		
		try{
			this.validarCamposObrigatorios(usuarioDTO);
			usuario = this.converterDTOEmUsuario(usuarioDTO);
			Integer id = usuarioDAO.criar(usuario);
			clienteDTO.getUsuarioDTO().setId(id);
			cliente = this.converterDTOEmCliente(clienteDTO);
			clienteDAO.criar(cliente);
		}catch(Exception e){
			String mensagemErro = "Problemas ao criar registro: mensagem detalhada: ";
			clienteDTO.setMensagem(mensagemErro + e.getMessage());
		}
		return clienteDTO;
	}
	
	public void validarCamposObrigatorios(UsuarioDTO usuarioDTO) throws Exception{
		if (usuarioDTO.getNome() == null || usuarioDTO.getNome().isEmpty()) {
			throw new Exception("Campo Nome é Obrigatório.");
		}
		
		if(usuarioDTO.getEnderecoDTO() == null || usuarioDTO.getEnderecoDTO().getId() == null){
			throw new Exception("Campo Endereço é Obrigatório.");
		}
	}
	
	public void validarCamposObrigatorios(FuncionarioDTO funcionarioDTO) throws Exception{
		if (funcionarioDTO.getLogin() == null || funcionarioDTO.getLogin().isEmpty()) {
			throw new Exception("Campo Login é Obrigatório.");
		}
		
		if(funcionarioDTO.getSenha() == null || funcionarioDTO.getSenha().isEmpty()){
			throw new Exception("Campo Senha é Obrigatório.");
		}
	}
	
	public Cliente converterDTOEmCliente(ClienteDTO clienteDTO){
		Cliente cliente = new Cliente();
		
		cliente.setId(clienteDTO.getId());
		cliente.setUsuario(this.converterDTOEmUsuario(clienteDTO.getUsuarioDTO()));
		
		return cliente;
	}
	
	public Funcionario converterDTOEmFuncionario(FuncionarioDTO funcionarioDTO){
		Funcionario funcionario = new Funcionario();
		
		funcionario.setId(funcionarioDTO.getId());
		funcionario.setLogin(funcionarioDTO.getLogin());
		funcionario.setSenha(funcionarioDTO.getSenha());
		funcionario.setSalario(funcionarioDTO.getSalario());
		
		funcionario.setUsuario(this.converterDTOEmUsuario(funcionarioDTO.getUsuarioDTO()));
		
		return funcionario;
	}
	
	public Usuario converterDTOEmUsuario(UsuarioDTO usuarioDTO){
		Usuario usuario = new Usuario();
		
		usuario.setId(usuarioDTO.getId());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setCelular(usuarioDTO.getCelular());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setEndereco(new EnderecoCtrl().converterDTOEmEndereco(usuarioDTO.getEnderecoDTO()));
		
		return usuario;
	}
	
	public UsuarioDTO converterUsuarioEmDTO(Usuario usuario){
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		
		usuarioDTO.setId(usuario.getId());
		usuarioDTO.setNome(usuario.getNome());
		usuarioDTO.setCelular(usuario.getCelular());
		usuarioDTO.setEmail(usuario.getEmail());
		usuarioDTO.setEnderecoDTO(new EnderecoCtrl().converterEnderecoEmDTO(usuario.getEndereco()));
		
		return usuarioDTO;
	}
	
	@GET
	@Produces("application/json")
	@Path("/listarCliente")
	public List<ClienteDTO> listarCliente() {
		List<ClienteDTO> clientesDTO = new ArrayList<ClienteDTO>();
		List<Cliente> clientes = new ArrayList<Cliente>();
		ClienteDAO clienteDAO = new ClienteDAO();

		try {
			clientes = clienteDAO.pesq(null);

			for (Cliente cliente : clientes) {
				ClienteDTO clienteDTO = this.converterClienteEmDTO(cliente);
				clientesDTO.add(clienteDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return clientesDTO;
	}
	
	@GET
	@Produces("application/json")
	@Path("/listarFuncionario")
	public List<FuncionarioDTO> listarFuncionario() {
		List<FuncionarioDTO> funcionariosDTO = new ArrayList<FuncionarioDTO>();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		try {
			funcionarios = funcionarioDAO.pesq(null);

			for (Funcionario funcionario : funcionarios) {
				FuncionarioDTO funcionarioDTO = this.converterFuncionarioEmDTO(funcionario);
				funcionariosDTO.add(funcionarioDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return funcionariosDTO;
	}
	
	public ClienteDTO converterClienteEmDTO(Cliente cliente){
		ClienteDTO clienteDTO = new ClienteDTO();
		
		clienteDTO.setId(cliente.getId());
		clienteDTO.setUsuarioDTO(this.converterUsuarioEmDTO(cliente.getUsuario()));
		
		return clienteDTO;
	}
	
	public FuncionarioDTO converterFuncionarioEmDTO(Funcionario funcionario){
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
		
		funcionarioDTO.setId(funcionario.getId());
		funcionarioDTO.setLogin(funcionario.getLogin());
		funcionarioDTO.setSenha(funcionario.getSenha());
		funcionarioDTO.setSalario(funcionario.getSalario());
		funcionarioDTO.setUsuarioDTO(this.converterUsuarioEmDTO(funcionario.getUsuario()));
		
		return funcionarioDTO;
	}
	
}
