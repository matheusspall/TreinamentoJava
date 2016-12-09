function cadastrarMidia()
{
	var filme = $('#filme-midia').val();
	var tipoMidia = $('#tipo-midia').val();
	var inutilizada = $("#inutilizada").is(":checked");
	var codBarras = $('#codBarras').val();
	
	var midiaDTO = new Object();
	
	if(inutilizada){
		midiaDTO.inutilizada = true;
	}else{
		midiaDTO.inutilizada = false;
	}
	midiaDTO.codigoBarras = codBarras;

	midiaDTO.filmeDTO = new Object();
	midiaDTO.filmeDTO.id = filme;
	
	midiaDTO.tipoMidiaDTO = new Object(); 
	midiaDTO.tipoMidiaDTO.id = tipoMidia;
	
	var operacao = "/ControleAPI/midia/criarMidia"
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(midiaDTO), //converter midiaDTO em JSON
		contentType: "application/json"
	}).done(function(data){
		var mensagem = '';
		var titulo = '';
		if(data.mensagem != undefined && data.mensagem != null && data.mensagem != '')
		{
			//alert(data.mensagem);
			titulo = 'Atencao';
			mensagem = data.mensagem;
		}else{
			//alert("Midia cadastrada com sucesso");
			titulo = 'Sucesso';
			mensagem = 'Midia cadastrado com sucesso';
		}
		
		mostrarModal(titulo, mensagem);
		
	});
}

function mostrarModal(titulo, mensagem){
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	
	$('#modal-mensagens').modal('show');
}

function carregarFilmes(){
	var operacao = "/ControleAPI/midia/listarMidia";
	
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data;
		var linhaCombo = '';
		
		$(lista).each(function(idx, obj){
			linhaCombo += '<option value = "' + obj.id +'">';
			linhaCombo += obj.filmeDTO.descricao;
			linhaCombo += '</option>';
		});
		$('#cod-midia').append(linhaCombo);
	});
}

$(document).ready(function(){
	carregarFilmes();
})