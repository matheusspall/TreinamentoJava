function cadastrarLocacao()
{
	var midia = $('#cod-midia').val();
	var funcionario = $('#funcionario').val();
	var cliente = $('#cliente').val();
	var dataEmprestimo = $('#dataEmprestimo').val();
	var dataDevolucao = $('#dataDevolucao').val();
	var valor = $('#valor').val();
	var pagoDevolucao = $("#pago").is(":checked");
	var obs = $('#obs').val();
	
	var locacaoDTO = new Object();
	
	locacaoDTO.dataEmprestimo = dataEmprestimo;
	locacaoDTO.dataDevolucao = dataDevolucao;
	locacaoDTO.obs = obs;
	locacaoDTO.valor = valor;
	locacaoDTO.pagaDevolucao = pagoDevolucao;
	
	locacaoDTO.funcionarioDTO = new Object();
	locacaoDTO.funcionarioDTO.id = funcionario;
	
	locacaoDTO.clienteDTO = new Object();
	locacaoDTO.clienteDTO.id = cliente;
	
	locacaoDTO.midiaDTO = new Object();
	locacaoDTO.midiaDTO.id = midia;
	
	var operacao = "/ControleAPI/locacao/criarLocacao"
	
	$.ajax({
		method: "POST",
		url: operacao,
		data: JSON.stringify(locacaoDTO), //converter locacaoDTO em JSON
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
			//alert("Locacao cadastrada com sucesso");
			titulo = 'Sucesso';
			mensagem = 'Locacao cadastrada com sucesso';
		}
		
		mostrarModal(titulo, mensagem);
		
	});
}

function mostrarModal(titulo, mensagem){
	$('#modal-title').html(titulo);
	$('#modal-mensagem').html(mensagem);
	
	$('#modal-mensagens').modal('show');
}