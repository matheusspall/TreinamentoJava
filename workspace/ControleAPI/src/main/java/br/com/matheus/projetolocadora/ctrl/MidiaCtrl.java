package br.com.matheus.projetolocadora.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.matheus.projetolocadora.dao.FilmeDAO;
import br.com.matheus.projetolocadora.dao.MidiaDAO;
import br.com.matheus.projetolocadora.dto.FilmeDTO;
import br.com.matheus.projetolocadora.dto.ListFilmeDTO;
import br.com.matheus.projetolocadora.dto.MidiaDTO;
import br.com.matheus.projetolocadora.modelo.Filme;
import br.com.matheus.projetolocadora.modelo.Midia;

@Path("/midia")
public class MidiaCtrl {
	
	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/criarMidia")
	public MidiaDTO criarMidia(MidiaDTO midiaDTO) {

		Midia midia = new Midia();
		MidiaDAO midiaDAO = new MidiaDAO();
		FilmeDAO filmeDAO = new FilmeDAO();

		try {
			this.validarCamposObrigatorios(midiaDTO);
			midiaDTO.setFilmeDTO(new FilmeCtrl().converterFilmeEmDTO(filmeDAO.pesqPorId(midiaDTO.getFilmeDTO().getId())));
			midia = this.converterDTOEmMidia(midiaDTO);
			midiaDAO.criar(midia);
		} catch (Exception e) {
			String mensagem = "Problemas ao criar registro na base. Mensagem Detalhada: ";
			midiaDTO.setMensagem(mensagem + e.getMessage());
		}
		return midiaDTO;
	}
	
	public void validarCamposObrigatorios(MidiaDTO midiaDTO) throws Exception{
		if (midiaDTO.getFilmeDTO() == null || midiaDTO.getFilmeDTO().getId() == null) {
			throw new Exception("Campo Filme é obrigatório.");
		}
	}
	
	public Midia converterDTOEmMidia(MidiaDTO midiaDTO){
		Midia midia = new Midia();
		
		midia.setId(midiaDTO.getId());
		midia.setFilme(new FilmeCtrl().converterDTOEmFilme(midiaDTO.getFilmeDTO()));
		midia.setInutilizada(midiaDTO.getInutilizada());
		midia.setCodigoBarras(midiaDTO.getCodigoBarras());
		midia.setTipoMidia(new TipoMidiaCtrl().converterDTOEmTipoMidia(midiaDTO.getTipoMidiaDTO()));
		
		return midia;
	}
	
	@GET
	@Produces("application/json")
	@Path("/listarMidia")
	public List<MidiaDTO> listarMidia() {
		
		List<Midia> midias = new ArrayList<Midia>();
		List<MidiaDTO> midiasDTO = new ArrayList<MidiaDTO>();
		MidiaDAO midiaDAO = new MidiaDAO();

		try {
			midias = midiaDAO.pesq(null);

			for (Midia midia : midias) {
				MidiaDTO midiaDTO = new MidiaDTO();
				midiaDTO = this.converterMidiaEmDTO(midia);
				midiasDTO.add(midiaDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return midiasDTO;

	}
	
	public MidiaDTO converterMidiaEmDTO(Midia midia){
		MidiaDTO midiaDTO = new MidiaDTO();
		
		midiaDTO.setId(midia.getId());
		midiaDTO.setFilmeDTO(new FilmeCtrl().converterFilmeEmDTO(midia.getFilme()));
		midiaDTO.setTipoMidiaDTO(new TipoMidiaCtrl().converterTipoMidiaEmDTO(midia.getTipoMidia()));
		midiaDTO.setInutilizada(midia.getInutilizada());
		midiaDTO.setCodigoBarras(midia.getCodigoBarras());
		
		return midiaDTO;
	}

}
