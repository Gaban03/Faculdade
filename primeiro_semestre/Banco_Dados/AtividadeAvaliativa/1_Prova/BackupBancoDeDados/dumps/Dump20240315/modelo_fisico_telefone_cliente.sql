-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: modelo_fisico
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
-- Table structure for table `telefone_cliente`
--

DROP TABLE IF EXISTS `telefone_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefone_cliente` (
  `id_telefone` int NOT NULL AUTO_INCREMENT,
  `telefones` varchar(45) DEFAULT NULL,
  `status_whatsapp` tinyint DEFAULT NULL,
  `CLIENTE_PJ_cnpj` varchar(45) DEFAULT NULL,
  `CLIENTE_PF_cpf` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_telefone`),
  KEY `fk_TELEFONE_CLIENTE_CLIENTE_PJ_idx` (`CLIENTE_PJ_cnpj`),
  KEY `fk_TELEFONE_CLIENTE_CLIENTE_PF1_idx` (`CLIENTE_PF_cpf`),
  CONSTRAINT `fk_TELEFONE_CLIENTE_CLIENTE_PF1` FOREIGN KEY (`CLIENTE_PF_cpf`) REFERENCES `cliente_pf` (`cpf`),
  CONSTRAINT `fk_TELEFONE_CLIENTE_CLIENTE_PJ` FOREIGN KEY (`CLIENTE_PJ_cnpj`) REFERENCES `cliente_pj` (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefone_cliente`
--

LOCK TABLES `telefone_cliente` WRITE;
/*!40000 ALTER TABLE `telefone_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefone_cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-15 21:30:14
