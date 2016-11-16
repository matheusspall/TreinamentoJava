SELECT 
	dados.vinicola
FROM (SELECT
			va.nome as vinicola, COUNT(*) as qtd_vinho
		FROM
			vinicola va
		INNER JOIN vinho vo ON
			vo.fk_vinicola = va.codigo
		GROUP BY
			va.nome) as dados
WHERE
	dados.qtd_vinho > 2