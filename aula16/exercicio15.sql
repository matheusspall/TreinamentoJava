SELECT
	DISTINCT r.nome as revendedor
FROM
	vinho_revendedor vr
INNER JOIN revendedor r ON
	r.codigo = vr.cod_revendedor
INNER JOIN vinho v ON
	v.codigo = vr.cod_vinho
	AND NOT v.nome = 'vFritz'