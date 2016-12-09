package br.com.matheus.projetolocadora.dto;

public class MidiaDTO extends BaseDTO{

	private Integer id;
	private FilmeDTO filmeDTO;
	private Boolean inutilizada;
	private Integer codigoBarras;
	private TipoMidiaDTO tipoMidiaDTO;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getInutilizada() {
		return inutilizada;
	}
	public void setInutilizada(Boolean inutilizada) {
		this.inutilizada = inutilizada;
	}
	public Integer getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(Integer codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public FilmeDTO getFilmeDTO() {
		return filmeDTO;
	}
	public void setFilmeDTO(FilmeDTO filmeDTO) {
		this.filmeDTO = filmeDTO;
	}
	public TipoMidiaDTO getTipoMidiaDTO() {
		return tipoMidiaDTO;
	}
	public void setTipoMidiaDTO(TipoMidiaDTO tipoMidiaDTO) {
		this.tipoMidiaDTO = tipoMidiaDTO;
	}
	
}
