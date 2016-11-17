CREATE VIEW VW_LISTAR_VINHO_VINICOLA_REVENDEDOR (vinho, revendedor, vinicola)
AS
	SELECT
		v.nome as vinho,
		r.nome as revendedor,
		va.nome as vinicola
	FROM
		meta.dbo.vinho_revendedor vr
	INNER JOIN meta.dbo.vinho v ON
		v.codigo = vr.cod_vinho
	INNER JOIN meta.dbo.revendedor r ON
		r.codigo = vr.cod_revendedor
	INNER JOIN meta.dbo.vinicola va ON
		va.codigo = v.fk_vinicola

SELECT * FROM VW_LISTAR_VINHO_VINICOLA_REVENDEDOR