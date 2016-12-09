package br.com.matheus.projetolocadora.ctrl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.matheus.projetolocadora.dao.ClienteDAO;
import br.com.matheus.projetolocadora.dao.FuncionarioDAO;
import br.com.matheus.projetolocadora.dao.LocacaoDAO;
import br.com.matheus.projetolocadora.dao.LocacaoMidiaDAO;
import br.com.matheus.projetolocadora.dao.MidiaDAO;
import br.com.matheus.projetolocadora.dto.ClienteDTO;
import br.com.matheus.projetolocadora.dto.FuncionarioDTO;
import br.com.matheus.projetolocadora.dto.LocacaoDTO;
import br.com.matheus.projetolocadora.dto.MidiaDTO;
import br.com.matheus.projetolocadora.modelo.Funcionario;
import br.com.matheus.projetolocadora.modelo.Locacao;
import br.com.matheus.projetolocadora.modelo.LocacaoMidia;

@Path("/locacao")
public class LocacaoCtrl {
	
	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/criarLocacao")
	public LocacaoDTO criarLocacao(LocacaoDTO locacaoDTO) {

		Locacao locacao = new Locacao();
		LocacaoDAO locacaoDAO = new LocacaoDAO();
		LocacaoMidiaDAO locacaoMidiaDAO = new LocacaoMidiaDAO();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		ClienteDAO clienteDAO = new ClienteDAO();
		MidiaDAO midiaDAO = new MidiaDAO();
		LocacaoMidia locacaoMidia = new LocacaoMidia();

		try {
			this.validarCamposObrigatorios(locacaoDTO);
			
			FuncionarioDTO funcionarioDTO = new UsuarioCtrl().converterFuncionarioEmDTO(funcionarioDAO.pesqPorId(locacaoDTO.getFuncionarioDTO().getId()));
			locacaoDTO.setFuncionarioDTO(funcionarioDTO);
			
			ClienteDTO clienteDTO = new UsuarioCtrl().converterClienteEmDTO(clienteDAO.pesqPorId(locacaoDTO.getClienteDTO().getId()));
			locacaoDTO.setClienteDTO(clienteDTO);
			
			MidiaDTO midiaDTO = new MidiaCtrl().converterMidiaEmDTO(midiaDAO.pesqPorId(locacaoDTO.getMidiaDTO().getId()));
			locacaoDTO.setMidiaDTO(midiaDTO);
			
			locacao = this.converterDTOEmLocacao(locacaoDTO);
			locacaoDAO.criar(locacao);
			
			locacaoMidia.setLocacao(locacao);
			locacaoMidia.setMidia(locacao.getCodMidia());
			locacaoMidiaDAO.criar(locacaoMidia);
		} catch (Exception e) {
			String mensagem = "Problemas ao criar registro na base. Mensagem Detalhada: ";
			locacaoDTO.setMensagem(mensagem + e.getMessage());
		}
		return locacaoDTO;
	}

	public void validarCamposObrigatorios(LocacaoDTO locacaoDTO) throws Exception{
		if(locacaoDTO.getMidiaDTO() == null || locacaoDTO.getMidiaDTO().getId() == null){
			throw new Exception("Campo Filme é obrigatório.");
		}
		if(locacaoDTO.getFuncionarioDTO() == null || locacaoDTO.getFuncionarioDTO().getId() == null){
			throw new Exception("Campo Funcionário é obrigatório.");
		}
		if(locacaoDTO.getClienteDTO() == null || locacaoDTO.getClienteDTO().getId() == null){
			throw new Exception("Campo Cliente é obrigatório.");
		}
	}
	
	public Locacao converterDTOEmLocacao(LocacaoDTO locacaoDTO){
		Locacao locacao = new Locacao();
		
		locacao.setId(locacaoDTO.getId());
		locacao.setCliente(new UsuarioCtrl().converterDTOEmCliente(locacaoDTO.getClienteDTO()));
		locacao.setFuncionario(new UsuarioCtrl().converterDTOEmFuncionario(locacaoDTO.getFuncionarioDTO()));
		locacao.setCodMidia(new MidiaCtrl().converterDTOEmMidia(locacaoDTO.getMidiaDTO()));
		locacao.setDataDevolucao(locacaoDTO.getDataDevolucao());
		locacao.setDataEmprestimo(locacaoDTO.getDataEmprestimo());
		locacao.setObs(locacaoDTO.getObs());
		locacao.setPagaDevolucao(locacaoDTO.getPagaDevolucao());
		locacao.setValor(locacaoDTO.getValor());
		
		return locacao;
	}
}
