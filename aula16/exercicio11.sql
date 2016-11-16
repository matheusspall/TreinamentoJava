SELECT 
	va.nome as vinicola,
	vo.nome as vinho
FROM
	vinho vo
RIGHT JOIN vinicola va ON
	va.codigo = vo.fk_vinicola