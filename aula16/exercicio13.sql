SELECT
	v.nome as vinho, vr.valor as valor
FROM
	vinho v, vinho_revendedor vr
WHERE
	vr.cod_vinho = v.codigo
ORDER BY
	vr.valor DESC