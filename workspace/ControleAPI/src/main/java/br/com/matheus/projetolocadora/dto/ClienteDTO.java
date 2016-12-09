package br.com.matheus.projetolocadora.dto;

public class ClienteDTO extends BaseDTO{

	private Integer id;
	private UsuarioDTO usuarioDTO;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
