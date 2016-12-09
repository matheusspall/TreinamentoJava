function cadastrarUsuario()
{
	var nome = $('#nome').val();
	var celular = $('#celular').val();
	var email = $('#email').val();
	var endereco = $('#endereco-usuario').val();
	
	var tipoUsuario = $('input[name = tipo-usuario]:checked').val();
	
	var usuarioDTO = new Object();
	usuarioDTO.nome = nome;
	usuarioDTO.celular = celular;
	usuarioDTO.email = email;
	
	usuarioDTO.enderecoDTO = new Object();
	usuarioDTO.enderecoDTO.id = endereco;
	
	var operacao;
	
	if(tipoUsuario == 1){
		var login = $('#login').val();
		var senha = $('#senha').val();
		var salario = $('#salario').val();
		
		var funcionarioDTO = new Object();
		funcionarioDTO.login = login;
		funcionarioDTO.senha = senha;
		funcionarioDTO.salario = salario;
		funcionarioDTO.usuarioDTO = usuarioDTO;
		
		
		var data = JSON.stringify(funcionarioDTO);
		operacao = "/ControleAPI/usuario/criarFuncionario";
	} else {	
		var clienteDTO = new Object();
		clienteDTO.usuarioDTO = usuarioDTO;
		
		var data = JSON.stringify(clienteDTO);
		operacao = "/ControleAPI/usuario/criarCliente";
	}
	
	
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: data,
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
			//alert("Usuario cadastrada com sucesso");
			titulo = 'Sucesso';
			mensagem = 'Usuario cadastrado com sucesso';
		}
		
		mostrarModal(titulo, mensagem);
		
	});
}

function mudarTipoUsuario(){
	if ($('input[name=tipo-usuario]:checked').val() == 1){
		$('#lab-login').show();
		$('#login').show();
		$('#lab-senha').show();
		$('#senha').show();
		$('#lab-salario').show();
		$('#salario').show();
	} else if ($('input[name=tipo-usuario]:checked').val() == 0){
		$('#lab-login').hide();
		$('#login').hide();
		$('#lab-senha').hide();
		$('#senha').hide();
		$('#lab-salario').hide();
		$('#salario').hide();
	}
}

function mostrarModal(titulo, mensagem){
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	
	$('#modal-mensagens').modal('show');
}

function carregarFuncionarios(){
	var operacao = "/ControleAPI/usuario/listarFuncionario";
	
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data;
		var linhaCombo = '';
		
		$('#funcionario').html(''); //limpa o html da tabela
		
		for(i = 0; i < lista.length; i++){
			linhaCombo += '<option value = "' + lista[i].id +'">';
			linhaCombo += lista[i].usuarioDTO.nome;
			linhaCombo += '</option>';
		}
		$('#funcionario').append(linhaCombo);
	});
}

function carregarClientes(){
	var operacao = "/ControleAPI/usuario/listarCliente";
	
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data;
		var linhaCombo = '';
		
		$('#cliente').html(''); //limpa o html da tabela
		
		for(i = 0; i < lista.length; i++){
			linhaCombo += '<option value = "' + lista[i].id +'">';
			linhaCombo += lista[i].usuarioDTO.nome;
			linhaCombo += '</option>';
		}
		$('#cliente').append(linhaCombo);
	});
}

$(document).ready(function(){
	carregarFuncionarios();
	carregarClientes();
})