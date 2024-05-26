-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: musica
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `musica`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `musica` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `musica`;

--
-- Table structure for table `cantantes`
--

DROP TABLE IF EXISTS `cantantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cantantes` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `nombre` char(80) NOT NULL,
  `pais` char(80) NOT NULL,
  `integrantes` int(5) NOT NULL,
  `generomusical_id` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `generomusical_id` (`generomusical_id`),
  CONSTRAINT `cantantes_ibfk_1` FOREIGN KEY (`generomusical_id`) REFERENCES `generosmusicales` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cantantes`
--

LOCK TABLES `cantantes` WRITE;
/*!40000 ALTER TABLE `cantantes` DISABLE KEYS */;
INSERT INTO `cantantes` VALUES (1,'Andres Cepeda','Colombia',2,4),(2,'Juanes','Colombia',2,7);
/*!40000 ALTER TABLE `cantantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generosmusicales`
--

DROP TABLE IF EXISTS `generosmusicales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `generosmusicales` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `genero` char(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generosmusicales`
--

LOCK TABLES `generosmusicales` WRITE;
/*!40000 ALTER TABLE `generosmusicales` DISABLE KEYS */;
INSERT INTO `generosmusicales` VALUES (1,'Rock'),(3,'Metal'),(4,'Salsa'),(5,'Merengue'),(6,'Tango'),(7,'Porro'),(8,'Electronica'),(9,'Pop');
/*!40000 ALTER TABLE `generosmusicales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'musica'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-26  1:57:15
