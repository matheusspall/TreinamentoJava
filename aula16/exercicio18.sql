SELECT
	DISTINCT va.nome as vinicola, r.nome as revendedor
FROM
	vinho vo
INNER JOIN vinho_revendedor vr ON
	vr.cod_vinho = vo.codigo
INNER JOIN revendedor r ON
	r.codigo = vr.cod_revendedor
INNER JOIN vinicola va ON
	va.codigo = vo.fk_vinicola
ORDER BY
	1