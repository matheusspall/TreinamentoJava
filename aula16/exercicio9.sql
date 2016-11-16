SELECT
	v.nome as vinho
FROM
	vinho_revendedor vr
INNER JOIN vinho v ON
	v.codigo NOT IN (SELECT vr2.cod_vinho FROM vinho_revendedor vr2)
GROUP BY 
	v.nome
