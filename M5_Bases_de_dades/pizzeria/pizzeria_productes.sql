-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pizzeria
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
-- Table structure for table `productes`
--

DROP TABLE IF EXISTS `productes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productes` (
  `id_productes` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `preu` float NOT NULL,
  `descrip` varchar(120) DEFAULT NULL COMMENT 'descripció detallada del producte',
  `imatge` varbinary(300) DEFAULT NULL,
  `tipus_id_tipus` int NOT NULL,
  `categoria_id_categoria` int DEFAULT NULL COMMENT 'aquest camp etiqueta les pizzes que s''ofereixin com a producte dintre de diverses categories (familiars, de temporada, vegetarianes, etc), però com que no tots els productes són pizzes, no tots necessiten obligatòriament aquest camp així que l''he fet nullable',
  PRIMARY KEY (`id_productes`),
  KEY `fk_productes_tipus1_idx` (`tipus_id_tipus`),
  KEY `fk_productes_categoria1_idx` (`categoria_id_categoria`),
  CONSTRAINT `fk_productes_categoria1` FOREIGN KEY (`categoria_id_categoria`) REFERENCES `categoria` (`id_categoria`),
  CONSTRAINT `fk_productes_tipus1` FOREIGN KEY (`tipus_id_tipus`) REFERENCES `tipus` (`id_tipus`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productes`
--

LOCK TABLES `productes` WRITE;
/*!40000 ALTER TABLE `productes` DISABLE KEYS */;
INSERT INTO `productes` VALUES (1,'Fanta de llimona',1.2,'sabor clàssic del refresc de llimona amb gas més conegut',NULL,3,NULL),(2,'Tonno e cippola',8.7,'pizza de massa fina amb tomàta, formatge, tonyina i ceba ',NULL,1,1),(3,'Suprema',11,'Hamburguesa amb ceba, formatge, enciam, tomata, ceba fregida, ou ferrat, cogombre, mostaça casolana i ketchup',NULL,2,NULL);
/*!40000 ALTER TABLE `productes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-04 19:58:36
