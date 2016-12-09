function cadastrarTipoMidia()
{
	var descricao = $('#descricao-tipo-midia').val();
	var tipoMidiaDTO = new Object();
	var operacao = "/ControleAPI/tipoMidia/criarTipoMidia"

	tipoMidiaDTO.descricao = descricao;
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(tipoMidiaDTO), //converter tipoMidiaDTO em JSON
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
			//alert("Tipo Midia cadastrada com sucesso");
			titulo = 'Sucesso';
			mensagem = 'Tipo Midia cadastrada com sucesso';
		}
		
		mostrarModal(titulo, mensagem);
		
	});
}

function mostrarModal(titulo, mensagem){
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	
	$('#modal-mensagens').modal('show');
}

function carregarTipoMidia(){
	var operacao = "/ControleAPI/tipoMidia/listarTipoMidia";
	
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data;
		var linhaCombo = '';
		
		for(i = 0; i < lista.length; i++){
			linhaCombo += '<option value = "' + lista[i].id +'">';
			linhaCombo += lista[i].descricao;
			linhaCombo += '</option>';
		}
		$('#tipo-midia').append(linhaCombo);
	});
}

$(document).ready(function(){
	carregarTipoMidia();
})