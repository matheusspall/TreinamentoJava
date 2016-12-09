function consultarCategoria()
{

	var idCategoria = $('#cod-categoria').val();
	var operacao = '/ControleAPI/categoria/' + idCategoria;
	
	$.ajax({
		url: operacao
	}).done(function(data){
		console.log(data);
		if(data.mensagem != null && data.mensagem != '')
		{
			$('#descricao-categoria').html(data.mensagem);
		}else{
			$('#descricao-categoria').html(data.descricao);
		}
		
	});
}