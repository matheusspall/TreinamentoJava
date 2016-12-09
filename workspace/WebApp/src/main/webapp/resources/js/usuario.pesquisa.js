function listarCliente(){
	var operacao = "/ControleAPI/usuario/listarCliente";
		
	$.ajax({
		url: operacao
	}).done(function(data){
		var lista = data;
		var linhaTabela = '';
		
		$('#lista').html(''); //limpa o html da tabela
		
		console.info(data);
		
		linhaTabela += '<tr>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "ID";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "NOME";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "CELULAR";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "EMAIL";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "ENDERECO";
		linhaTabela += '</td>';
		
		linhaTabela += '</tr>';
		
		for(i = 0; i < lista.length; i++){
			linhaTabela += '<tr>';
			
			linhaTabela += '<td class = "id">';
			linhaTabela += lista[i].id;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].usuarioDTO.nome;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].usuarioDTO.celular;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].usuarioDTO.email;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].usuarioDTO.enderecoDTO.rua + ", " 
				+ lista[i].usuarioDTO.enderecoDTO.numero + ", " 
				+ lista[i].usuarioDTO.enderecoDTO.bairro + ", "
				+ lista[i].usuarioDTO.enderecoDTO.cidade;
			linhaTabela += '</td>';
			
			linhaTabela += '</tr>';
		}
		$('#lista').append(linhaTabela);
	});
}

function listarFuncionario(){
	var operacao = "/ControleAPI/usuario/listarFuncionario";
		
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
		linhaTabela += "NOME";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "LOGIN";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "CELULAR";
		linhaTabela += '</td>';
		
		linhaTabela += '<td class = "cabecalho">';
		linhaTabela += "EMAIL";
		linhaTabela += '</td>';
		
		linhaTabela += '</tr>';
		
		for(i = 0; i < lista.length; i++){
			linhaTabela += '<tr>';
			
			linhaTabela += '<td class = "id">';
			linhaTabela += lista[i].id;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].usuarioDTO.nome;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].login;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].usuarioDTO.celular;
			linhaTabela += '</td>';
			
			linhaTabela += '<td class = "descricao">';
			linhaTabela += lista[i].usuarioDTO.email;
			linhaTabela += '</td>';
			
			linhaTabela += '</tr>';
		}
		$('#lista').append(linhaTabela);
	});
}

