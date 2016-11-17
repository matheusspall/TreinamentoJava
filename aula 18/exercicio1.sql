CREATE VIEW VW_LISTAR_TUDO (vinho, revendedor, data, valor)
AS
	SELECT
		v.nome as vinho,
		r.nome as revendedor,
		vr.data as data,
		vr.valor as valor
	FROM
		meta.dbo.vinho_revendedor vr
	INNER JOIN meta.dbo.vinho v ON
		v.codigo = vr.cod_vinho
	INNER JOIN meta.dbo.revendedor r ON
		r.codigo = vr.cod_revendedor

SELECT * FROM VW_LISTAR_TUDO ORDER BY valor