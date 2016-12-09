function listarTipoMidia(){
	var operacao = "/ControleAPI/tipoMidia/listarTipoMidia";
		
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data;
		var linhaTabela = '';
		
		$('#lista').html(''); //limpa o html da tabela
		
		linhaTabela += '<tr>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "ID";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "DESCRICAO";
		linhaTabela += '</td>';
		
		linhaTabela += '</tr>';
		
		for(i = 0; i < lista.length; i++){
			linhaTabela = linhaTabela + '<tr>';
			
			linhaTabela = linhaTabela + '<td class = "id">';
			linhaTabela = linhaTabela + lista[i].id;
			linhaTabela = linhaTabela + '</td>';
			
			linhaTabela = linhaTabela + '<td class = "descricao">';
			linhaTabela = linhaTabela + lista[i].descricao;
			linhaTabela = linhaTabela + '</td>';
			
			linhaTabela = linhaTabela + '</tr>';
		}
		$('#lista').append(linhaTabela);
	});
}

//automatizar a listagem quando clicada no botão "Listar Categorias"
//quando terminar de carregar a página pesquisa.html, executa a função listarCategorias()
$(document).ready(function(){
	listarTipoMidia();
})