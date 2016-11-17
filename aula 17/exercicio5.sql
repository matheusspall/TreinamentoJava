CREATE PROCEDURE P_LISTAR_REVENDEDOR_VINHO 
	@vinho VARCHAR(50)
AS 
	SELECT
		DISTINCT r.nome as revendedor
	FROM
		vinho_revendedor vr
	INNER JOIN vinho v ON
		v.codigo = vr.cod_vinho
		AND v.nome = @vinho
	INNER JOIN revendedor r ON
		r.codigo = vr.cod_revendedor

EXEC P_LISTAR_REVENDEDOR_VINHO 'vFacao'