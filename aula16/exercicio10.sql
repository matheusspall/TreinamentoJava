SELECT
	va.nome as vinicola
FROM
	vinicola va
INNER JOIN vinho vo ON
	va.codigo NOT IN (SELECT v.fk_vinicola FROM vinho v)
GROUP BY 
	va.nome