SELECT
	COUNT(*) as qtd_vinhos
FROM
	vinho v
INNER JOIN vinicola vi ON
	v.fk_vinicola = vi.codigo
	AND vi.nome = 'Spall vinicola'