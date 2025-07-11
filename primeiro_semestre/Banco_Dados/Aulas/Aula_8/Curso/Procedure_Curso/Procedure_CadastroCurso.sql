CREATE DEFINER=`root`@`localhost` PROCEDURE `cadastro_curso`(
nome_do_curso VARCHAR(45),aulas_curso VARCHAR(45),valor_curso VARCHAR(15),turno_curso VARCHAR(45),
OUT saida VARCHAR(80), saida_rotulo VARCHAR(80)
)
BEGIN
	IF EXISTS(SELECT * FROM curso WHERE nome_curso = nome_do_curso)THEN
    BEGIN
		SET saida_rotulo = "ERRO!!!";
        SET saida = "Este curso já foi cadastrado!";
	END;
    ELSE 
		INSERT INTO curso(nome_curso,aulas,valor,turno)
        VALUES(nome_do_curso,aulas_curso,valor_curso,turno_curso);
	IF ROW_COUNT() = 0 THEN
		SET saida_rotulo = "ERRO!!";
        SET saida = "Curso não foi cadastrado!";
    ELSE
		SET saida_rotulo = "SUCESSO!!!";
        SET saida = "Curso cadastrado com sucesso!";
	END IF;
END IF;
SELECT saida_rotulo,saida;
END