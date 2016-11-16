SELECT
	v.nome as vinho,
	r.nome as revendedor,
	vr.valor as valor
FROM
	vinho_revendedor vr
INNER JOIN vinho v ON
	v.codigo = vr.cod_vinho
INNER JOIN revendedor r ON
	r.codigo = vr.cod_revendedor
	AND vr.data = '2002-07-26'
ORDER BY
	vr.valor