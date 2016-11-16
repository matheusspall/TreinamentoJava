SELECT
	v.nome as vinho, r.nome as revendedor
FROM
	vinho_revendedor vr
INNER JOIN vinho v ON
	v.codigo = vr.cod_vinho
INNER JOIN revendedor r ON
	r.codigo = vr.cod_revendedor
ORDER BY
	2