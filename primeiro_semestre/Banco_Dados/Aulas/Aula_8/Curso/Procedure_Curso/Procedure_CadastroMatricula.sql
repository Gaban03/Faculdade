CREATE DEFINER=`root`@`localhost` PROCEDURE `cadastro_matricula`(
id_aluno INT, id_curso INT, data_inicio_curso VARCHAR(45),
OUT saida VARCHAR(80), saida_rotulo VARCHAR(80)
)
BEGIN
IF EXISTS(SELECT * FROM associativa_realiza WHERE CURSO_id_curso = id_curso AND ALUNO_id_aluno = id_aluno)THEN
    BEGIN
		SET saida_rotulo = "ERRO!!!";
        SET saida = "Este aluno já está mastriculado neste curso!";
	END;
    ELSE 
		INSERT INTO associativa_realiza(ALUNO_id_aluno,CURSO_id_curso,data_inicio)
			VALUES(id_aluno,id_curso,data_inicio_curso);
	IF ROW_COUNT() = 0 THEN
		SET saida_rotulo = "ERRO!!";
        SET saida = "Matricula não realizada!";
    ELSE
		SET saida_rotulo = "SUCESSO!!!";
        SET saida = "Matricula realizada com sucesso!";
	END IF;
END IF;
SELECT saida_rotulo,saida;
END