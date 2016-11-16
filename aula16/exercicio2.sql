SELECT 
	v.nome as vinho, vi.nome as vinicola
FROM
	vinho v
INNER JOIN vinicola vi ON
	v.fk_vinicola = vi.codigo
ORDER BY
	2