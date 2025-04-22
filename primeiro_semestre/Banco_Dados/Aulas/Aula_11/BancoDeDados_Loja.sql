CREATE DATABASE  IF NOT EXISTS `bancoloja` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bancoloja`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: bancoloja
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) NOT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Vinicius Gaban','472.039.668-28','(16)991000062'),(2,'Isabella Rocha','400.012.229-18','(11)981220312'),(3,'Grazieli Rigo','172.339.998-08','(13)981040042'),(4,'Murilo Camargo','999.000.118-41','(16)991888812'),(5,'David Buzinari','487.549.118-98','(16)991111122'),(6,'Brendha Barbosa','673.321.876-88','(11)911055092');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id_produto` int NOT NULL AUTO_INCREMENT,
  `produto` varchar(45) DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Coca-Cola','4,50'),(2,'Açai','11,50'),(3,'Paçoca','3,00'),(4,'Suco de Laranja','5,00'),(5,'Pizza','30,00'),(6,'Picolé','2,00'),(7,'HotDog','10,00'),(8,'Maçã','4,30'),(9,'Chiclete','1,50'),(10,'Pastel','15,00');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `id_venda` int NOT NULL AUTO_INCREMENT,
  `data_compra` date NOT NULL,
  `CLIENTE_id_cliente` int NOT NULL,
  `PRODUTO_id_produto` int NOT NULL,
  `qtd_vendida` int DEFAULT NULL,
  PRIMARY KEY (`id_venda`,`CLIENTE_id_cliente`,`PRODUTO_id_produto`),
  KEY `fk_VENDA_CLIENTE_idx` (`CLIENTE_id_cliente`),
  KEY `fk_VENDA_PRODUTO1_idx` (`PRODUTO_id_produto`),
  CONSTRAINT `fk_VENDA_CLIENTE` FOREIGN KEY (`CLIENTE_id_cliente`) REFERENCES `cliente` (`id_cliente`),
  CONSTRAINT `fk_VENDA_PRODUTO1` FOREIGN KEY (`PRODUTO_id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,'2024-04-01',1,3,1),(2,'2024-02-14',1,5,1),(3,'2024-04-01',2,6,2),(4,'2024-04-01',4,3,3),(5,'2024-04-12',3,2,4),(6,'2024-03-23',5,1,6),(7,'2024-06-08',4,1,2),(8,'2024-07-03',3,8,1);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'bancoloja'
--
/*!50003 DROP PROCEDURE IF EXISTS `Compras_Realizada_ProdutoEspecifico` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Compras_Realizada_ProdutoEspecifico`(nome_produto VARCHAR(45), OUT saida VARCHAR(45))
BEGIN
	IF EXISTS(SELECT * FROM produto WHERE produto = nome_produto) THEN
		BEGIN
			SELECT p.produto, v.data_compra, v.qtd_vendida FROM produto AS p
            INNER JOIN venda AS v ON p.id_produto = v.PRODUTO_id_produto
            WHERE produto = nome_produto;
        END;
    ELSE
		SET saida = 'Nenhum produto encontrado';
        SELECT saida;
    END IF;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Consultar_Compra_PorPeriodo_Data` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Consultar_Compra_PorPeriodo_Data`(data_inicio DATE, data_final DATE, OUT saida VARCHAR(45))
BEGIN
	IF EXISTS(SELECT * FROM venda WHERE data_compra BETWEEN data_inicio AND data_final) THEN
		BEGIN
			SELECT c.nome, p.produto, v.qtd_vendida, v.data_compra FROM cliente AS c
            INNER JOIN venda AS v ON c.id_cliente = v.CLIENTE_id_cliente
            INNER JOIN produto AS p ON v.PRODUTO_id_produto = p.id_produto
            WHERE data_compra BETWEEN data_inicio AND data_final;
        END;
	ELSE
		SET saida = 'Não houveram compras nesse périodo';
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

-- Dump completed on 2024-05-03 22:53:08
