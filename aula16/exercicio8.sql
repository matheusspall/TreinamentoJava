SELECT
	COUNT(vr.codigo) AS QTD_REVENDE
FROM
	vinho_revendedor vr
INNER JOIN vinho v ON
	v.nome = 'vVo Bepe'
	AND v.codigo = vr.cod_vinho
INNER JOIN revendedor r ON
	r.codigo = vr.cod_revendedor