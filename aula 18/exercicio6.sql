UPDATE meta.dbo.vinho
SET meta.dbo.vinho.quantidade = (SELECT ROUND(((30) * RAND()), 0))
WHERE meta.dbo.vinho.codigo = 11