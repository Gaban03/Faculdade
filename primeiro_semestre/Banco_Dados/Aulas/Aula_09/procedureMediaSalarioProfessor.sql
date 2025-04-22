CREATE DEFINER=`root`@`localhost` PROCEDURE `media_salario_profs`()
BEGIN
	SELECT AVG(salario) AS media_salarial_Professores
    FROM colaboradores WHERE cargo="Professor";
END