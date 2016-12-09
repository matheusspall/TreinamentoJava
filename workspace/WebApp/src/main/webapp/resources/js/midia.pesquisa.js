function listarMidias(){
	var operacao = "/ControleAPI/midia/listarMidia";
		
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
		linhaTabela += "FILME";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "TIPO DE MIDIA";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "INUTILIZADA";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "CODIGO BARRAS";
		linhaTabela += '</td>';
		
		linhaTabela += '</tr>';
		
		$(lista).each(function(idx, obj){
			linhaTabela += '<tr>';
			
			linhaTabela +=  '<td class = "id">';
			linhaTabela += obj.id;
			linhaTabela += '</td>';

			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.filmeDTO.descricao;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.tipoMidiaDTO.descricao;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.inutilizada;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += obj.codigoBarras;
			linhaTabela += '</td>';

			linhaTabela += '</tr>';

		});

		$('#lista').append(linhaTabela);
	});
}

//automatizar a listagem quando clicada no botão "Listar Categorias"
//quando terminar de carregar a página pesquisa.html, executa a função listarCategorias()
$(document).ready(function(){
	listarMidias();
})