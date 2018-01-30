CREATE DATABASE  IF NOT EXISTS `booking` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `booking`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: booking
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `addressid` int(11) NOT NULL AUTO_INCREMENT,
  `street1` varchar(45) NOT NULL,
  `street2` varchar(45) DEFAULT NULL,
  `city` varchar(45) NOT NULL,
  `zipcode` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  PRIMARY KEY (`addressid`),
  UNIQUE KEY `addressid_UNIQUE` (`addressid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`addressid`, `street1`, `street2`, `city`, `zipcode`, `state`) VALUES (1,'1000 N 4th st',NULL,'Fairfield','52557','IA');
INSERT INTO `address` (`addressid`, `street1`, `street2`, `city`, `zipcode`, `state`) VALUES (2,'1302 S Main st',NULL,'Fairfield','52556','IA');
INSERT INTO `address` (`addressid`, `street1`, `street2`, `city`, `zipcode`, `state`) VALUES (3,'1500 4th st',NULL,'Fairfield','52557','IA');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customerid` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `cellphone` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `addressid` int(11) DEFAULT NULL,
  `paymentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`customerid`),
  UNIQUE KEY `customerid_UNIQUE` (`customerid`),
  KEY `fk_customer_address_idx` (`addressid`),
  KEY `fk_customer_payment_idx` (`paymentid`),
  CONSTRAINT `fk_customer_address` FOREIGN KEY (`addressid`) REFERENCES `address` (`addressid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer_payment` FOREIGN KEY (`paymentid`) REFERENCES `payment` (`paymentid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customerid`, `firstname`, `lastname`, `cellphone`, `email`, `addressid`, `paymentid`) VALUES (1,'LUAT','NGUYEN','8484669338','LUATNGUYEN@GMAIL.COM',1,1);
INSERT INTO `customer` (`customerid`, `firstname`, `lastname`, `cellphone`, `email`, `addressid`, `paymentid`) VALUES (2,'KIMTEY','CHAV','1234567890','KIMTEYCHAV@GMAIL.COM',2,2);
INSERT INTO `customer` (`customerid`, `firstname`, `lastname`, `cellphone`, `email`, `addressid`, `paymentid`) VALUES (3,'ENKH','ENKH','0987654321','ENKH@GMAIL.COM',3,3);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `paymentid` int(11) NOT NULL AUTO_INCREMENT,
  `cardtype` varchar(45) DEFAULT NULL,
  `holdername` varchar(45) DEFAULT NULL,
  `cardnumber` varchar(45) DEFAULT NULL,
  `expiredmonth` varchar(45) DEFAULT NULL,
  `expiredyear` varchar(45) DEFAULT NULL,
  `ccv` varchar(45) DEFAULT NULL,
  `addressid` int(11) DEFAULT NULL,
  PRIMARY KEY (`paymentid`),
  UNIQUE KEY `paymentid_UNIQUE` (`paymentid`),
  KEY `fk_payment_address_idx` (`addressid`),
  CONSTRAINT `fk_payment_address` FOREIGN KEY (`addressid`) REFERENCES `address` (`addressid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` (`paymentid`, `cardtype`, `holdername`, `cardnumber`, `expiredmonth`, `expiredyear`, `ccv`, `addressid`) VALUES (1,'VISA','LUAT V NGUYEN','1111222233334444','12','2020','311',1);
INSERT INTO `payment` (`paymentid`, `cardtype`, `holdername`, `cardnumber`, `expiredmonth`, `expiredyear`, `ccv`, `addressid`) VALUES (2,'DISCOVER','KIMTEY CHAV','2222333344445555','01','2030','002',2);
INSERT INTO `payment` (`paymentid`, `cardtype`, `holdername`, `cardnumber`, `expiredmonth`, `expiredyear`, `ccv`, `addressid`) VALUES (3,'MASTERCARD','ENKH','1234567887654321','06','2021','123',3);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `customerid` int(11) DEFAULT NULL,
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `fd_user_customer_idx` (`customerid`),
  CONSTRAINT `fd_user_customer` FOREIGN KEY (`customerid`) REFERENCES `customer` (`customerid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `customerid`) VALUES (1,'luatnguyen','123',1);
INSERT INTO `user` (`id`, `username`, `password`, `customerid`) VALUES (2,'kimtey','123',2);
INSERT INTO `user` (`id`, `username`, `password`, `customerid`) VALUES (3,'enkh','123',3);
INSERT INTO `user` (`id`, `username`, `password`, `customerid`) VALUES (4,'tam','123',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-30  3:34:53
