CREATE PROCEDURE P_LISTAR_VINHO_REVENDEDOR_VALOR 
	@data Date
AS 
	SELECT
		v.nome as vinho, r.nome as revendedor, vr.valor
	FROM
		vinho_revendedor vr
	INNER JOIN vinho v ON
		v.codigo = vr.cod_vinho
	INNER JOIN revendedor r ON
		r.codigo = vr.cod_revendedor
	WHERE
		vr.data = @data
	ORDER BY
		1

EXEC P_LISTAR_VINHO_REVENDEDOR_VALOR '2002-07-26'