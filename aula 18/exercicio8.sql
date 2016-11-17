CREATE TRIGGER T_VALIDA_VINICOLA 
ON meta.dbo.vinicola
INSTEAD OF INSERT
AS
	IF EXISTS (SELECT nome FROM inserted WHERE nome = 'Spall vinicola')
	BEGIN
		print 'Vin�cola n�o existe mais!';
	END
	ELSE
	BEGIN
		print 'Vin�cola permitida!';
	END