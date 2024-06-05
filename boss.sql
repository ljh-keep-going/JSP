/*
SQLyog v10.2 
MySQL - 5.5.27 : Database - boss
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`boss` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `boss`;

/*Table structure for table `attendance` */

DROP TABLE IF EXISTS `attendance`;

CREATE TABLE `attendance` (
  `attendanceId` int(50) NOT NULL AUTO_INCREMENT,
  `attendanceName` varchar(255) NOT NULL,
  `attendanceDept` varchar(255) NOT NULL,
  `attendancePost` varchar(255) NOT NULL,
  `attendanceGet` varchar(255) NOT NULL,
  `attendanceLate` varchar(255) NOT NULL,
  `attendanceAdd` varchar(255) NOT NULL,
  `attendanceCard` varchar(255) NOT NULL,
  `attendanceCond` varchar(255) NOT NULL,
  PRIMARY KEY (`attendanceId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `attendance` */

insert  into `attendance`(`attendanceId`,`attendanceName`,`attendanceDept`,`attendancePost`,`attendanceGet`,`attendanceLate`,`attendanceAdd`,`attendanceCard`,`attendanceCond`) values (1,'雷佳豪','管理层','20','5','10','99999','123456','666666');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `employeeId` int(50) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) NOT NULL,
  `employeeSex` varchar(255) NOT NULL,
  `employeeAge` varchar(255) NOT NULL,
  `employeeDept` varchar(255) NOT NULL,
  `employeepost` varchar(255) NOT NULL,
  `employeeTel` int(50) NOT NULL,
  `employeeEmail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employeeId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `employee` */

insert  into `employee`(`employeeId`,`employeeName`,`employeeSex`,`employeeAge`,`employeeDept`,`employeepost`,`employeeTel`,`employeeEmail`) values (1,'程雅丽','女','21','销售','员工',99999,'123456789'),(3,'雷佳豪','男','20','销售','员工',1,'20030416'),(4,'孙泽纯','男','20','管理层','管理员',123456,'21554123');

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `employeeNo` int(50) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) NOT NULL,
  `employeeId` int(50) NOT NULL,
  `salaryMonth` varchar(255) NOT NULL,
  `basicSalary` int(50) NOT NULL,
  `overtimePay` int(50) NOT NULL,
  `bonus` int(50) NOT NULL,
  `finalSalary` int(50) NOT NULL,
  PRIMARY KEY (`employeeNo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

/*Data for the table `salary` */

insert  into `salary`(`employeeNo`,`employeeName`,`employeeId`,`salaryMonth`,`basicSalary`,`overtimePay`,`bonus`,`finalSalary`) values (3,'雷佳豪',3,'六月',5000,2000,3000,10000),(4,'程雅丽',1,'六月',4000,1000,2000,7000),(5,'孙泽纯',4,'六月',6000,2000,3000,11000);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(50) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `userType` int(11) NOT NULL DEFAULT '0' COMMENT '0代表员工，1代表管理员',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `user` */

insert  into `user`(`userId`,`userName`,`password`,`userType`) values (1,'ljh','123',0),(2,'szc','456',1),(4,'cyl','789',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
