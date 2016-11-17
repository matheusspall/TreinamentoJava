CREATE PROCEDURE P_MOSTRA_VINHO_QTD
AS
	SELECT 
		v.codigo, v.nome, v.quantidade
	FROM
		meta.dbo.vinho v

	UNION

	SELECT 
		0, 'TOTAL', SUM(quantidade)
	FROM
		meta.dbo.vinho

EXEC P_MOSTRA_VINHO_QTD