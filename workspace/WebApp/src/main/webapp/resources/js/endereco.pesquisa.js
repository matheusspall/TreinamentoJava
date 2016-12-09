function listarEnderecos(){
	var operacao = "/ControleAPI/endereco/listarEnderecos";
		
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
		linhaTabela += "RUA";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "NUMERO";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "BAIRRO";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "CIDADE";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "ESTADO";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "CEP";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "COMPLEMENTO";
		linhaTabela += '</td>';
		
		linhaTabela += '</tr>';
		
		for(i = 0; i < lista.length; i++){
			linhaTabela = linhaTabela + '<tr>';
			
			linhaTabela +='<td class = "id">';
			linhaTabela += lista[i].id;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].rua;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].numero;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].bairro;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].cidade;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].estado;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].cep;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].complemento;
			linhaTabela += '</td>';
			
			linhaTabela += '</tr>';
		}
		$('#lista').append(linhaTabela);
	});
}

//automatizar a listagem quando clicada no botão "Listar Categorias"
//quando terminar de carregar a página pesquisa.html, executa a função listarCategorias()
$(document).ready(function(){
	listarEnderecos();
})