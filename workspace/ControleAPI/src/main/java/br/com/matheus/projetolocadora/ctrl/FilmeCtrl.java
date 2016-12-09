package br.com.matheus.projetolocadora.ctrl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.matheus.projetolocadora.dao.FilmeDAO;
import br.com.matheus.projetolocadora.dto.FilmeDTO;
import br.com.matheus.projetolocadora.dto.ListFilmeDTO;
import br.com.matheus.projetolocadora.modelo.Filme;

@Path("/filme")
public class FilmeCtrl {

	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/criarFilme")
	public FilmeDTO criarFilme(FilmeDTO filmeDTO) {

		Filme filme = new Filme();
		FilmeDAO filmeDAO = new FilmeDAO();

		try {
			this.validarCamposObrigatorios(filmeDTO);
			filme = this.converterDTOEmFilme(filmeDTO);
			filmeDAO.criar(filme);
		} catch (Exception e) {
			String mensagem = "Problemas ao criar registro na base. Mensagem Detalhada: ";
			filmeDTO.setMensagem(mensagem + e.getMessage());
		}

		return filmeDTO;
	}

	public Filme converterDTOEmFilme(FilmeDTO filmeDTO) {
		Filme filme = new Filme();
		Calendar anoCalendar = Calendar.getInstance();
		Calendar duracaoCalendar = Calendar.getInstance();

		try{
			SimpleDateFormat sdfDuracao = new SimpleDateFormat("hh:mm");
			anoCalendar.set(Integer.parseInt(filmeDTO.getAno()), 0, 1, 0, 0, 0);
			duracaoCalendar.setTime(sdfDuracao.parse(filmeDTO.getDuracao()));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		filme.setId(filmeDTO.getId());
		filme.setDescricao(filmeDTO.getDescricao());
		filme.setAno(anoCalendar);
		filme.setResumo(filmeDTO.getResumo());
		filme.setClassificacao(filmeDTO.getClassificacao());
		filme.setDuracao(duracaoCalendar);
		filme.setCategoria(new CategoriaCtrl().converterDTOEmCategoria(filmeDTO.getCategoriaDTO()));

		return filme;
	}

	public FilmeDTO converterFilmeEmDTO(Filme filme) {
		FilmeDTO filmeDTO = new FilmeDTO();
		String ano = null, duracao = null;
		
		try{
			SimpleDateFormat sdfDuracao = new SimpleDateFormat("hh:mm");
			
			ano = String.valueOf(filme.getAno().get(Calendar.YEAR));
			duracao = sdfDuracao.format(filme.getDuracao().getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		filmeDTO.setId(filme.getId());
		filmeDTO.setDescricao(filme.getDescricao());
		filmeDTO.setAno(ano);
		filmeDTO.setResumo(filme.getResumo());
		filmeDTO.setClassificacao(filme.getClassificacao());
		filmeDTO.setDuracao(duracao);
		filmeDTO.setCategoriaDTO(new CategoriaCtrl().converterCategoriaEmDTO(filme.getCategoria()));

		return filmeDTO;
	}

	public void validarCamposObrigatorios(FilmeDTO filmeDTO) throws Exception {

		if (filmeDTO.getDescricao() == null || filmeDTO.getDescricao().isEmpty()) {
			throw new Exception("Campo Descrição é obrigatório.");
		}

		if (filmeDTO.getCategoriaDTO() == null || filmeDTO.getCategoriaDTO().getId() == null) {
			throw new Exception("Campo Categoria é obrigatório.");
		}

	}

	@GET
	@Produces("application/json")
	@Path("/listarFilmes")
	public ListFilmeDTO listarFilmes() {
		
		List<Filme> filmes = new ArrayList<Filme>();
		List<FilmeDTO> filmesDTO = new ArrayList<FilmeDTO>();
		FilmeDAO filmeDAO = new FilmeDAO();
		ListFilmeDTO listFilmeDTO = new ListFilmeDTO();

		try {
			filmes = filmeDAO.pesq(null);

			for (Filme filme : filmes) {
				FilmeDTO filmeDTO = new FilmeDTO();
				filmeDTO = this.converterFilmeEmDTO(filme);
				filmesDTO.add(filmeDTO);
			}

			listFilmeDTO.setRetorno(filmesDTO);
		} catch (Exception e) {
			String mensagem = "Erro ao listar filmes. Mensagem Detalha: ";
			listFilmeDTO.setMensagem(mensagem + e.getMessage());
		}
		return listFilmeDTO;

	}

}
