package br.com.matheus.projetolocadora.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.matheus.projetolocadora.dao.EnderecoDAO;
import br.com.matheus.projetolocadora.dto.EnderecoDTO;
import br.com.matheus.projetolocadora.modelo.Endereco;

@Path("/endereco")
public class EnderecoCtrl {

	@POST
	@Produces("application/json") // formato dos dados de retorno
	@Consumes(MediaType.APPLICATION_JSON) // formato da entrada de dados
	@Path("/criarEndereco")
	public EnderecoDTO criarEndereco(EnderecoDTO enderecoDTO) {

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = new Endereco();
		try {
			this.validarCamposObrigatorios(enderecoDTO);
			endereco = this.converterDTOEmEndereco(enderecoDTO);
			enderecoDAO.criar(endereco);
		} catch (Exception e) {
			String mensagemErro = "Problemas ao criar registro: mensagem detalhada: ";
			enderecoDTO.setMensagem(mensagemErro + e.getMessage());
		}
		return enderecoDTO;

	}
	
	public void validarCamposObrigatorios(EnderecoDTO enderecoDTO) throws Exception{
		if (enderecoDTO.getRua() == null || enderecoDTO.getRua().isEmpty()) {
			throw new Exception("Campo Rua é obrigatório.");
		}
	}
	
	public Endereco converterDTOEmEndereco(EnderecoDTO enderecoDTO){
		Endereco endereco = new Endereco();
		
		endereco.setId(enderecoDTO.getId());
		endereco.setRua(enderecoDTO.getRua());
		endereco.setNumero(enderecoDTO.getNumero());
		endereco.setBairro(enderecoDTO.getBairro());
		endereco.setCidade(enderecoDTO.getCidade());
		endereco.setEstado(enderecoDTO.getEstado());
		endereco.setCep(enderecoDTO.getCep());
		endereco.setComplemento(enderecoDTO.getComplemento());
		
		return endereco;
	}
	
	public EnderecoDTO converterEnderecoEmDTO(Endereco endereco){
		EnderecoDTO enderecoDTO = new EnderecoDTO();
		
		enderecoDTO.setId(endereco.getId());
		enderecoDTO.setRua(endereco.getRua());
		enderecoDTO.setNumero(endereco.getNumero());
		enderecoDTO.setBairro(endereco.getBairro());
		enderecoDTO.setCidade(endereco.getCidade());
		enderecoDTO.setEstado(endereco.getEstado());
		enderecoDTO.setCep(endereco.getCep());
		enderecoDTO.setComplemento(endereco.getComplemento());
		
		return enderecoDTO;
	}
	
	@GET
	@Produces("application/json")
	@Path("/listarEnderecos")
	public List<EnderecoDTO> listarEnderecos() {
		List<EnderecoDTO> enderecosDTO = new ArrayList<EnderecoDTO>();
		List<Endereco> enderecos = new ArrayList<Endereco>();
		EnderecoDAO enderecoDAO = new EnderecoDAO();

		try {
			enderecos = enderecoDAO.pesq(null);

			for (Endereco endereco : enderecos) {
				EnderecoDTO enderecoDTO = this.converterEnderecoEmDTO(endereco);
				enderecosDTO.add(enderecoDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return enderecosDTO;
	}
}
