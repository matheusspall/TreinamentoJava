SELECT
	va.nome as vinicola, count(*) as qtd_vinhos
FROM
	vinho vo
INNER JOIN vinicola va ON
	va.codigo = vo.fk_vinicola
GROUP BY
	va.nome