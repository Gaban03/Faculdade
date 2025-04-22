CREATE DATABASE  IF NOT EXISTS `livraria` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `livraria`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: livraria
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping routines for database 'livraria'
--
/*!50003 DROP PROCEDURE IF EXISTS `relatorio_compraPorCliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `relatorio_compraPorCliente`(cpf_cliente VARCHAR(45), data_inicio DATE, data_final DATE, OUT saida VARCHAR(45), OUT saida_rotulo VARCHAR(45))
BEGIN
	IF EXISTS(
		SELECT c.cpf FROM cliente AS c
        WHERE c.cpf = cpf_cliente
    ) AND EXISTS(
		SELECT v.data_venda FROM venda AS v
        WHERE v.data_venda BETWEEN data_inicio AND data_final
    ) THEN
		BEGIN
        SELECT c.nome, v.data_venda, v.Livro_id_livro, l.titulo, l.preco FROM cliente AS c
        INNER JOIN venda AS v ON c.cpf = v.Cliente_cpf
        INNER JOIN livro AS l ON v.Livro_id_livro = l.id_livro
        WHERE c.cpf = cpf_cliente AND v.data_venda BETWEEN data_inicio AND data_final;
        END;
	ELSE
		SET saida_rotulo = "ERRO!!!";
        SET saida = "CPF inválido";
        SELECT saida_rotulo, saida;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `relatorio_qtdDeLivrosVendidos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `relatorio_qtdDeLivrosVendidos`(titulo_livro VARCHAR(45), data_inicio DATE, data_final DATE, saida VARCHAR(45), saida_rotulo VARCHAR(45))
BEGIN
	IF EXISTS (
		SELECT l.titulo FROM livro AS l
        WHERE l.titulo = titulo_livro
    ) THEN
    IF EXISTS (
		SELECT v.data_venda FROM venda AS v
        WHERE v.data_venda BETWEEN data_inicio AND data_final
    ) THEN
		BEGIN
			SELECT COUNT(l.titulo) AS 'Quantidade vendida', l.titulo FROM livro AS l
            INNER JOIN venda AS v ON l.id_livro = v.Livro_id_livro
            WHERE l.titulo = titulo_livro AND v.data_venda BETWEEN data_inicio AND data_final
            GROUP BY l.titulo;
        END;
	ELSE
		SET saida = "Nenhum livro vendido nessa data!";
        SET saida_rotulo = "ERRO!!!";
        SELECT saida_rotulo, saida;
    END IF;
	ELSE
		SET saida = "Esse titulo não existe no banco!";
        SET saida_rotulo = "ERRO!!!";
        SELECT saida_rotulo, saida;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `relatorio_TodasAsVendas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `relatorio_TodasAsVendas`()
BEGIN
	SELECT * FROM venda;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `relatorio_valorVendidoNoMes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `relatorio_valorVendidoNoMes`(data_inicio DATE, data_final DATE, OUT saida VARCHAR(45))
BEGIN
	IF EXISTS (SELECT * FROM venda WHERE data_venda BETWEEN data_inicio AND data_final) THEN
		BEGIN
			SELECT SUM(l.preco) AS "Lucro do mês"
            FROM livro AS l
            INNER JOIN venda AS v ON l.id_livro = v.Livro_id_livro
            WHERE v.data_venda BETWEEN data_inicio AND data_final;
        END;
    ELSE
        SET saida = "Nenhum lucro nesse mês!";
        SELECT saida;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `relatotio_vendaPorMes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `relatotio_vendaPorMes`(data_inicio DATE, data_final DATE, OUT saida VARCHAR(45), OUT saida_rotulo VARCHAR(45))
BEGIN
	IF EXISTS (SELECT * FROM venda WHERE data_venda BETWEEN data_inicio AND data_final) THEN
		BEGIN
        SELECT * FROM venda WHERE data_venda BETWEEN data_inicio AND data_final ORDER BY data_venda asc;
        END;
    ELSE
		SET saida_rotulo = "ERRO!!!";
        SET saida = "Nenhuma venda ocorreu nesse mês";
		SELECT saida_rotulo ,saida;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `repor_livro` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `repor_livro`(numero_livro INT, OUT saida VARCHAR(45), saida_rotulo VARCHAR(45))
BEGIN
	IF EXISTS (
    SELECT e.id_estoque, l.titulo FROM estoque AS e
    INNER JOIN livro AS l ON e.Livro_id_livro = l.id_livro
    WHERE e.Livro_id_livro = numero_livro
    ) THEN
		BEGIN
			SET saida_rotulo = "ERRO!!!";
            SET saida = "Livro já está em estoque";
		END;
	ELSE
		INSERT INTO estoque (Livro_id_livro) VALUES 
		(numero_livro);
        IF EXISTS (SELECT * FROM livro WHERE id_livro = numero_livro) THEN
			SET saida_rotulo = "SUCESSO!!!";
            SET saida = "Reposição realizada!";
		ELSE
			SET saida_rotulo = "ERRO!!!";
			SET saida = "Reposição não realizada!";
		END IF;
    END IF;
    SELECT saida_rotulo, saida;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Venda_Livro` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Venda_Livro`(id_livro_Livro INT, cpf_cliente_Cliente VARCHAR(45), data_da_venda_Venda DATE, OUT saida VARCHAR(45), saida_rotulo VARCHAR(45))
BEGIN
    IF EXISTS(
        SELECT e.Livro_id_livro 
        FROM estoque AS e
        WHERE e.Livro_id_livro = id_livro_Livro
    ) THEN 
        BEGIN
            IF EXISTS(
                SELECT c.cpf
                FROM cliente AS c
                WHERE c.cpf = cpf_cliente_Cliente
            ) THEN
                BEGIN
                    INSERT INTO venda (data_venda, Livro_id_livro, Cliente_cpf) VALUES
                    (data_da_venda_Venda, id_livro_Livro, cpf_cliente_Cliente);
                    IF ROW_COUNT() = 0 THEN
                        SET saida_rotulo = "ERRO!!!";
                        SET saida = "Venda não efetuada!";
                        SELECT saida;
                    ELSE
                        DELETE e FROM estoque AS e
                        INNER JOIN livro AS l ON e.Livro_id_livro = l.id_livro
                        WHERE e.Livro_id_livro = id_livro_Livro;
                        SET saida_rotulo = "SUCESSO!!!";
                        SELECT saida_rotulo;
                        SET saida = "Venda efetuada com sucesso!";
                        SELECT saida;
                    END IF;
                END;
            ELSE
                SET saida = "CPF inválido";
                SELECT saida;
            END IF;
        END;
    ELSE
        SET saida = "Livro não está em estoque";
        SELECT saida;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-16 11:55:08
