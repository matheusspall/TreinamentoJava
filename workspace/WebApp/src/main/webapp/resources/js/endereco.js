function cadastroEndereco()
{
	var rua = $('#rua').val();
	var numero = $('#numero').val();
	var bairro = $('#bairro').val();
	var cidade = $('#cidade').val();
	var estado = $('#estado').val();
	var cep = $('#cep').val();
	var complemento = $('#complemento').val();
	
	var enderecoDTO = new Object();
	var operacao = "/ControleAPI/endereco/criarEndereco"
		
	enderecoDTO.rua = rua;
	enderecoDTO.numero = numero;
	enderecoDTO.bairro = bairro;
	enderecoDTO.cidade = cidade;
	enderecoDTO.estado = estado;
	enderecoDTO.cep = cep;
	enderecoDTO.complemento = complemento;
		
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(enderecoDTO), //converter enderecoDTO em JSON
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
			mensagem = 'Endereco cadastrado com sucesso';
		}
		
		mostrarModal(titulo, mensagem);
		
	});
}

function mostrarModal(titulo, mensagem){
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	
	$('#modal-mensagens').modal('show');
}

function carregarEnderecos(){
	var operacao = "/ControleAPI/endereco/listarEnderecos";
	
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data;
		var linhaCombo = '';
		
		for(i = 0; i < lista.length; i++){
			linhaCombo += '<option value = "' + lista[i].id +'">';
			linhaCombo += lista[i].rua;
			linhaCombo += ", " + lista[i].numero;
			linhaCombo += ", " + lista[i].bairro;
			linhaCombo += ", " + lista[i].cep;
			linhaCombo += '</option>';
		}
		$('#endereco-usuario').append(linhaCombo);
	});
}

$(document).ready(function(){
	carregarEnderecos();
})