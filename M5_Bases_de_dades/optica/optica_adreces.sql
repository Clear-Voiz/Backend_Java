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
-- Table structure for table `adreces`
--

DROP TABLE IF EXISTS `adreces`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adreces` (
  `id_adreces` int NOT NULL AUTO_INCREMENT,
  `carrer` varchar(45) DEFAULT NULL,
  `numero` varchar(5) DEFAULT NULL,
  `pis` varchar(10) DEFAULT NULL,
  `porta` varchar(10) DEFAULT NULL,
  `ciutat` varchar(100) DEFAULT NULL,
  `CP` varchar(10) DEFAULT NULL COMMENT 'Codi postal',
  `pais` varchar(45) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL COMMENT 'número de telefon. Espai extra per si es volen afegir caràcters adicionas com ara guions, espais, etc. i pels prefixos dels telèfons estrangers',
  PRIMARY KEY (`id_adreces`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adreces`
--

LOCK TABLES `adreces` WRITE;
/*!40000 ALTER TABLE `adreces` DISABLE KEYS */;
INSERT INTO `adreces` VALUES (1,'C/ Santa Paciència','3','2n','3a','Manresa','08241','Espanya','973994488'),(2,'C/ Borrell','24',NULL,NULL,'Banyoles','17820','Espanya','982317612'),(3,'C/Frankfurt','17','SS',NULL,'Múnich','84429','Alemanya','+21 674839203'),(4,'Av. infinita','28',NULL,NULL,'Barcelona','08002','Espanya','948578534'),(5,'C/ Sèquia Comptal','11','4t','B','Barcelona','08021','Espanya','923485757'),(6,'C/ August','16','1','1','Tarragona','43001','Espanya','972-32-11-23'),(7,'Plaça del Vi','32','',NULL,'Girona','17492','Espanya','917238494'),(8,'Manhattan','24','21è','4t','Nova York','10004','EEUU','+17 434989131'),(9,'C/ Verdi','1','3r','C','Barcelona','08021','Espanya','932 49 88 48'),(10,'Carretera de Terrassa','87','2n','3a','Sabadell','08202','Espanya','670923567');
/*!40000 ALTER TABLE `adreces` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-04 21:22:09
