-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: optica
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clients` (
  `id_clients` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(99) NOT NULL,
  `adreces_id_adreces` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `data` date DEFAULT NULL COMMENT 'data de registre',
  `recomanant_id_clients` int DEFAULT NULL COMMENT 'id del client que va recomanar a un altre. Al no ser una condició indispensable es tracte d''un valor nullable',
  PRIMARY KEY (`id_clients`),
  KEY `fk_clients_adreces_idx` (`adreces_id_adreces`),
  KEY `fk_clients_clients1_idx` (`recomanant_id_clients`),
  CONSTRAINT `fk_clients_adreces` FOREIGN KEY (`adreces_id_adreces`) REFERENCES `adreces` (`id_adreces`),
  CONSTRAINT `fk_clients_clients1` FOREIGN KEY (`recomanant_id_clients`) REFERENCES `clients` (`id_clients`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (1,'Arnau Vilallonga Foix',5,'allongix@gmail.com','2021-03-22',NULL),(2,'Silvia Ferrés',6,'silver87@gmail.com','2021-03-31',1),(3,'Sergi Oliva',7,'solivant@gmail.com','2021-03-31',NULL),(4,'Mike Miller',8,'maikudesu@gmail.com','2021-04-05',2),(5,'Marcel Aspir',9,'marcaspi16@gmail.com','2021-04-05',2),(6,'Helena Graduï',10,'hellgrad@gmail.com','2021-04-19',3);
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-04 21:22:08
