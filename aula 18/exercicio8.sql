CREATE TRIGGER T_VALIDA_VINICOLA 
ON meta.dbo.vinicola
INSTEAD OF INSERT
AS
	IF EXISTS (SELECT nome FROM inserted WHERE nome = 'Spall vinicola')
	BEGIN
		print 'Vinícola não existe mais!';
	END
	ELSE
	BEGIN
		print 'Vinícola permitida!';
	END