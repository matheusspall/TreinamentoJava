function listarFilmes(){
	var operacao = "/ControleAPI/filme/listarFilmes";
		
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
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "CATEGORIA";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "ANO";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "CLASSIFICACAO";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "DURACAO";
		linhaTabela += '</td>';
		
		linhaTabela += '</tr>';
		
		$(lista.retorno).each(function(idx, obj){
			linhaTabela += '<tr>';
			
			linhaTabela +=  '<td class = "id">';
			linhaTabela += obj.id;
			linhaTabela += '</td>';

			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.descricao;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.categoriaDTO.descricao;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.ano;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.classificacao;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.duracao;
			linhaTabela += '</td>';

			linhaTabela += '</tr>';

		});

		$('#lista').append(linhaTabela);
	});
}

//automatizar a listagem quando clicada no botão "Listar Categorias"
//quando terminar de carregar a página pesquisa.html, executa a função listarCategorias()
$(document).ready(function(){
	listarFilmes();
})