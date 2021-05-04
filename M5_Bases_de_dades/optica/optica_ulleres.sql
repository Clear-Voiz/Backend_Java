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
-- Table structure for table `ulleres`
--

DROP TABLE IF EXISTS `ulleres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ulleres` (
  `id_ulleres` int NOT NULL AUTO_INCREMENT,
  `marca_id_marca` int NOT NULL,
  `unitats` int DEFAULT NULL,
  `grad_e` float DEFAULT NULL COMMENT 'graduació esquerra',
  `grad_d` float DEFAULT NULL,
  `tipus_id_tipus` int NOT NULL,
  `col_montura` varchar(45) NOT NULL COMMENT 'color de la montura',
  `col_vidre_e` varchar(45) DEFAULT NULL COMMENT 'color del vidre esquerra',
  `col_vidre_d` varchar(45) DEFAULT NULL COMMENT 'color del vidre dret',
  `preu` int DEFAULT NULL,
  `treballadors_id_treballadors` int NOT NULL,
  PRIMARY KEY (`id_ulleres`),
  KEY `fk_ulleres_marca1_idx` (`marca_id_marca`),
  KEY `fk_ulleres_tipus1_idx` (`tipus_id_tipus`),
  KEY `fk_ulleres_treballadors1_idx` (`treballadors_id_treballadors`),
  CONSTRAINT `fk_ulleres_marca1` FOREIGN KEY (`marca_id_marca`) REFERENCES `marca` (`id_marca`),
  CONSTRAINT `fk_ulleres_tipus1` FOREIGN KEY (`tipus_id_tipus`) REFERENCES `tipus` (`id_tipus`),
  CONSTRAINT `fk_ulleres_treballadors1` FOREIGN KEY (`treballadors_id_treballadors`) REFERENCES `treballadors` (`id_treballadors`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ulleres`
--

LOCK TABLES `ulleres` WRITE;
/*!40000 ALTER TABLE `ulleres` DISABLE KEYS */;
INSERT INTO `ulleres` VALUES (1,4,2,0.25,0.25,1,'fúcsia','blau cel','blau cel',387,2),(2,2,1,-0.25,1.5,3,'negra','marró','marró',189,3);
/*!40000 ALTER TABLE `ulleres` ENABLE KEYS */;
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
