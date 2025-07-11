CREATE PROCEDURE `cadastro_aluno` (
nome_aluno VARCHAR(45),cpf_aluno VARCHAR(45),sexo_aluno VARCHAR(15),estado_aluno CHAR(2),
cidade_aluno VARCHAR(45), rua_aluno VARCHAR(45), numero_aluno INT, telefone_fixo_aluno VARCHAR(45),
telefone_celular_aluno VARCHAR(45), OUT saida VARCHAR(80), saida_rotulo VARCHAR(80)
)
BEGIN
	IF EXISTS(SELECT * FROM aluno WHERE nome = nome_aluno)THEN
    BEGIN
		SET saida_rotulo = "ERRO!!!";
        SET saida = "Este aluno já foi cadastrado!";
	END;
    ELSE 
		INSERT INTO aluno(nome,cpf,sexo,estado,cidade,rua,numero,telefone_fixo,telefone_celular)
        VALUES(nome_aluno, cpf_aluno,sexo_aluno,estado_aluno,cidade_aluno,rua_aluno,numero_aluno,
        telefone_fixo_aluno,telefone_celular_aluno);
	IF ROW_COUNT() = 0 THEN
		SET saida_rotulo = "ERRO!!";
        SET saida = "O aluno não foi cadastrado!";
    ELSE
		SET saida_rotulo = "SUCESSO!!!";
        SET saida = "Aluno cadastrado com sucesso!";
	END IF;
END IF;
SELECT saida_rotulo,saida;
END
