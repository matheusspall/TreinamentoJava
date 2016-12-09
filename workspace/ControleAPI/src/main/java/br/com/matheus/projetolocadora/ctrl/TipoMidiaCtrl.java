package br.com.matheus.projetolocadora.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.matheus.projetolocadora.dao.CategoriaDAO;
import br.com.matheus.projetolocadora.dao.TipoMidiaDAO;
import br.com.matheus.projetolocadora.dto.CategoriaDTO;
import br.com.matheus.projetolocadora.dto.TipoMidiaDTO;
import br.com.matheus.projetolocadora.modelo.Categoria;
import br.com.matheus.projetolocadora.modelo.TipoMidia;

@Path("/tipoMidia")
public class TipoMidiaCtrl {

	@POST
	@Produces("application/json") // formato dos dados de retorno
	@Consumes(MediaType.APPLICATION_JSON) // formato da entrada de dados
	@Path("/criarTipoMidia")
	public TipoMidiaDTO criarTipoMidia(TipoMidiaDTO tipoMidiaDTO) {

		TipoMidiaDAO tipoMidiaDAO = new TipoMidiaDAO();
		TipoMidia tipoMidia = new TipoMidia();
		try {
			this.validarCamposObrigatorios(tipoMidiaDTO);
			tipoMidia = this.converterDTOEmTipoMidia(tipoMidiaDTO);
			tipoMidiaDAO.criar(tipoMidia);
		} catch (Exception e) {
			String mensagemErro = "Problemas ao criar registro: mensagem detalhada: ";
			tipoMidiaDTO.setMensagem(mensagemErro + e.getMessage());
		}
		return tipoMidiaDTO;

	}

	public void validarCamposObrigatorios(TipoMidiaDTO tipoMidiaDTO) throws Exception {
		if (tipoMidiaDTO.getDescricao() == null || tipoMidiaDTO.getDescricao().isEmpty()) {
			throw new Exception("Campo Descrição é obrigatório");
		}
	}

	public TipoMidia converterDTOEmTipoMidia(TipoMidiaDTO tipoMidiaDTO) {
		TipoMidia tipoMidia = new TipoMidia();

		tipoMidia.setId(tipoMidiaDTO.getId());
		tipoMidia.setDescricao(tipoMidiaDTO.getDescricao());

		return tipoMidia;
	}

	@GET
	@Produces("application/json")
	@Path("/listarTipoMidia")
	public List<TipoMidiaDTO> listarTipoMidia() {
		List<TipoMidiaDTO> tiposMidiaDTO = new ArrayList<TipoMidiaDTO>();
		List<TipoMidia> tiposMidia = new ArrayList<TipoMidia>();
		TipoMidiaDAO tipoMidiaDAO = new TipoMidiaDAO();

		try {
			tiposMidia = tipoMidiaDAO.pesq(null);

			for (TipoMidia tipoMidia : tiposMidia) {
				TipoMidiaDTO tipoMidiaDTO = this.converterTipoMidiaEmDTO(tipoMidia);
				tiposMidiaDTO.add(tipoMidiaDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return tiposMidiaDTO;
	}

	public TipoMidiaDTO converterTipoMidiaEmDTO(TipoMidia tipoMidia) {

		TipoMidiaDTO tipoMidiaDTO = new TipoMidiaDTO();

		tipoMidiaDTO.setId(tipoMidia.getId());
		tipoMidiaDTO.setDescricao(tipoMidia.getDescricao());

		return tipoMidiaDTO;
	}

}
