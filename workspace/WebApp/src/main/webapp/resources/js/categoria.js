function consultarCategoria()
{
	var idCategoria = $('#cod-categoria').val();
	var operacao = '/ControleAPI/categoria/' + idCategoria;
	
	$.ajax({
		method: "GET", //default
		url: operacao
	}).done(function(data){
		if(data.mensagem != null && data.mensagem != '')
		{
			$('#descricao-categoria').html(data.mensagem);
		}else{
			$('#descricao-categoria').html(data.descricao);
		}
		
	});
}

function cadastrarCategoria()
{
	var descricao = $('#descricao-categoria').val();
	var categoriaDTO = new Object();
	var operacao = "/ControleAPI/categoria/criarCategoria"

	categoriaDTO.descricao = descricao;
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(categoriaDTO), //converter categoriaDTO em JSON
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
			//alert("Categoria cadastrada com sucesso");
			titulo = 'Sucesso';
			mensagem = 'Categoria cadastrada com sucesso';
		}
		
		mostrarModal(titulo, mensagem);
		
	});
}

function mostrarModal(titulo, mensagem){
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	
	$('#modal-mensagens').modal('show');
}


function carregarCategorias(){
	var operacao = "/ControleAPI/categoria/listarCategorias";
	
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
		$('#categoria').append(linhaCombo);
	});
}

$(document).ready(function(){
	carregarCategorias();
})