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
-- Table structure for table `proveidors`
--

DROP TABLE IF EXISTS `proveidors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveidors` (
  `id_proveidors` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(60) DEFAULT NULL,
  `adreces_id_adreces` int NOT NULL,
  `fax` varchar(50) DEFAULT NULL,
  `NIF` varchar(17) DEFAULT NULL,
  PRIMARY KEY (`id_proveidors`),
  KEY `fk_proveidors_adreces1_idx` (`adreces_id_adreces`),
  CONSTRAINT `fk_proveidors_adreces1` FOREIGN KEY (`adreces_id_adreces`) REFERENCES `adreces` (`id_adreces`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveidors`
--

LOCK TABLES `proveidors` WRITE;
/*!40000 ALTER TABLE `proveidors` DISABLE KEYS */;
INSERT INTO `proveidors` VALUES (1,'Crystal',1,'634 64 24 94','B-35474954'),(2,'Diver-gent',2,'245435304','A-42348254'),(3,'Oculus',3,'4234589101','B-51374922'),(4,'Vist i no vist',4,'843498845','B-4015726');
/*!40000 ALTER TABLE `proveidors` ENABLE KEYS */;
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
