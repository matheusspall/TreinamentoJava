function cadastrarFilme()
{
	var descricao = $('#descricao').val();
	var categoria = $('#categoria').val();
	var ano = $('#ano').val();
	var resumo = $('#resumo').val();
	var classificacao = $('#classificacao').val();
	var duracao = $('#duracao').val();
	
	var filmeDTO = new Object();
	var operacao = "/ControleAPI/filme/criarFilme"

	filmeDTO.descricao = descricao;
	
	filmeDTO.categoriaDTO = new Object();
	filmeDTO.categoriaDTO.id = categoria;
	
	filmeDTO.ano = ano;
	filmeDTO.resumo = resumo;
	filmeDTO.classificacao = classificacao;
	filmeDTO.duracao = duracao;
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(filmeDTO), //converter filmeDTO em JSON
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
			//alert("Filme cadastrada com sucesso");
			titulo = 'Sucesso';
			mensagem = 'Filme cadastrado com sucesso';
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
	var operacao = "/ControleAPI/filme/listarFilmes";
	
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data.retorno;
		var linhaCombo = '';
		
		$(lista).each(function(idx, obj){
			linhaCombo += '<option value = "' + obj.id +'">';
			linhaCombo += obj.descricao;
			linhaCombo += '</option>';
		});
		$('#filme-midia').append(linhaCombo);
	});
}

$(document).ready(function(){
	carregarFilmes();
})