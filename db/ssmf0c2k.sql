-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmf0c2k
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssmf0c2k`
--

/*!40000 DROP DATABASE IF EXISTS `ssmf0c2k`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmf0c2k` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmf0c2k`;

--
-- Table structure for table `biyesheng`
--

DROP TABLE IF EXISTS `biyesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `biyesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xueshengshouji` varchar(200) DEFAULT NULL COMMENT '学生手机',
  `yuanxizhanghao` varchar(200) NOT NULL,
  `yuanxi` varchar(200) NOT NULL,
  `banji` varchar(200) NOT NULL,
  `jiuyezhuangtai` varchar(200) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=1667792779947 DEFAULT CHARSET=utf8 COMMENT='毕业生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biyesheng`
--

LOCK TABLES `biyesheng` WRITE;
/*!40000 ALTER TABLE `biyesheng` DISABLE KEYS */;
INSERT INTO `biyesheng` VALUES (21,'2022-11-07 03:44:44','学号1','123456','学生姓名1','男','upload/biyesheng_touxiang1.jpg','13823888881','院系账号1','院系1','班级1','已就业'),(22,'2022-11-07 03:44:44','学号2','123456','学生姓名2','男','upload/biyesheng_touxiang2.jpg','13823888882','院系账号2','院系2','班级2','已就业'),(23,'2022-11-07 03:44:44','学号3','123456','学生姓名3','男','upload/biyesheng_touxiang3.jpg','13823888883','院系账号3','院系3','班级3','已就业'),(24,'2022-11-07 03:44:44','学号4','123456','学生姓名4','男','upload/biyesheng_touxiang4.jpg','13823888884','院系账号4','院系4','班级4','已就业'),(25,'2022-11-07 03:44:44','学号5','123456','学生姓名5','男','upload/biyesheng_touxiang5.jpg','13823888885','院系账号5','院系5','班级5','已就业'),(26,'2022-11-07 03:44:44','学号6','123456','学生姓名6','男','upload/biyesheng_touxiang6.jpg','13823888886','院系账号6','院系6','班级6','已就业'),(27,'2022-11-07 03:44:44','学号7','123456','学生姓名7','男','upload/biyesheng_touxiang7.jpg','13823888887','院系账号7','院系7','班级7','已就业'),(28,'2022-11-07 03:44:44','学号8','123456','学生姓名8','男','upload/biyesheng_touxiang8.jpg','13823888888','院系账号8','院系8','班级8','已就业'),(1667792779946,'2022-11-07 03:46:19','111','111','A学生','男','upload/1667792765311.jpg','13899999999','院系账号1','院系1','202班','待就业');
/*!40000 ALTER TABLE `biyesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bubanshenqing`
--

DROP TABLE IF EXISTS `bubanshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bubanshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `yuanxizhanghao` varchar(200) DEFAULT NULL COMMENT '院系账号',
  `yuanxi` varchar(200) DEFAULT NULL,
  `banji` varchar(200) DEFAULT NULL,
  `shenqingshijian` date DEFAULT NULL,
  `bubancailiao` varchar(200) NOT NULL,
  `bubanneirong` longtext,
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1667792862002 DEFAULT CHARSET=utf8 COMMENT='补办申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bubanshenqing`
--

LOCK TABLES `bubanshenqing` WRITE;
/*!40000 ALTER TABLE `bubanshenqing` DISABLE KEYS */;
INSERT INTO `bubanshenqing` VALUES (71,'2022-11-07 03:44:44','学号1','学生姓名1','院系账号1','院系1','班级1','2022-11-07','补办材料1','补办内容1','是',''),(72,'2022-11-07 03:44:44','学号2','学生姓名2','院系账号2','院系2','班级2','2022-11-07','补办材料2','补办内容2','是',''),(73,'2022-11-07 03:44:44','学号3','学生姓名3','院系账号3','院系3','班级3','2022-11-07','补办材料3','补办内容3','是',''),(74,'2022-11-07 03:44:44','学号4','学生姓名4','院系账号4','院系4','班级4','2022-11-07','补办材料4','补办内容4','是',''),(75,'2022-11-07 03:44:44','学号5','学生姓名5','院系账号5','院系5','班级5','2022-11-07','补办材料5','补办内容5','是',''),(76,'2022-11-07 03:44:44','学号6','学生姓名6','院系账号6','院系6','班级6','2022-11-07','补办材料6','补办内容6','是',''),(77,'2022-11-07 03:44:44','学号7','学生姓名7','院系账号7','院系7','班级7','2022-11-07','补办材料7','补办内容7','是',''),(78,'2022-11-07 03:44:44','学号8','学生姓名8','院系账号8','院系8','班级8','2022-11-07','补办材料8','补办内容8','是',''),(1667792862001,'2022-11-07 03:47:41','111','A学生','院系账号1','院系1','202班','2022-11-07','A材料','无','待审核','');
/*!40000 ALTER TABLE `bubanshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shixijiuye`
--

DROP TABLE IF EXISTS `shixijiuye`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shixijiuye` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `yuanxizhanghao` varchar(200) DEFAULT NULL COMMENT '院系账号',
  `yuanxi` varchar(200) DEFAULT NULL,
  `banji` varchar(200) DEFAULT NULL,
  `shixihetong` varchar(200) NOT NULL,
  `shixigangwei` varchar(200) NOT NULL,
  `shixigongsi` varchar(200) NOT NULL,
  `shixixinzi` float NOT NULL,
  `shixikaishi` date NOT NULL,
  `shixijieshu` date NOT NULL,
  `beizhu` varchar(200) DEFAULT NULL,
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1667792813054 DEFAULT CHARSET=utf8 COMMENT='实习就业';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shixijiuye`
--

LOCK TABLES `shixijiuye` WRITE;
/*!40000 ALTER TABLE `shixijiuye` DISABLE KEYS */;
INSERT INTO `shixijiuye` VALUES (51,'2022-11-07 03:44:44','学号1','学生姓名1','院系账号1','院系1','班级1','upload/1667793002223.docx','实习岗位1','实习公司1',100,'2022-11-07','2022-11-07','备注1','是',''),(52,'2022-11-07 03:44:44','学号2','学生姓名2','院系账号2','院系2','班级2','','实习岗位2','实习公司2',2,'2022-11-07','2022-11-07','备注2','是',''),(53,'2022-11-07 03:44:44','学号3','学生姓名3','院系账号3','院系3','班级3','','实习岗位3','实习公司3',3,'2022-11-07','2022-11-07','备注3','是',''),(54,'2022-11-07 03:44:44','学号4','学生姓名4','院系账号4','院系4','班级4','','实习岗位4','实习公司4',4,'2022-11-07','2022-11-07','备注4','是',''),(55,'2022-11-07 03:44:44','学号5','学生姓名5','院系账号5','院系5','班级5','','实习岗位5','实习公司5',5,'2022-11-07','2022-11-07','备注5','是',''),(56,'2022-11-07 03:44:44','学号6','学生姓名6','院系账号6','院系6','班级6','','实习岗位6','实习公司6',6,'2022-11-07','2022-11-07','备注6','是',''),(57,'2022-11-07 03:44:44','学号7','学生姓名7','院系账号7','院系7','班级7','','实习岗位7','实习公司7',7,'2022-11-07','2022-11-07','备注7','是',''),(58,'2022-11-07 03:44:44','学号8','学生姓名8','院系账号8','院系8','班级8','','实习岗位8','实习公司8',8,'2022-11-07','2022-11-07','备注8','是',''),(1667792813053,'2022-11-07 03:46:52','111','A学生','院系账号1','院系1','202班','upload/1667792796482.docx','A岗位','A公司',2000,'2022-11-08','2022-12-30','无','待审核','');
/*!40000 ALTER TABLE `shixijiuye` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1667792779946,'111','biyesheng','毕业生','pvvtkishzvi4l85mquuu2qd7pcd690l5','2022-11-07 03:46:24','2022-11-07 04:46:24'),(2,11,'院系账号1','yuanxijiaoshi','院系教师','ktx3hfp1jyigt0fj4ko1rtnsni76686u','2022-11-07 03:47:54','2022-11-07 04:47:54'),(3,1,'admin','users','管理员','7brqk5hl0gwur39j3q8psgeyeylow5nr','2022-11-07 03:50:28','2022-11-07 04:50:28');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2022-11-07 03:44:44');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinxigenggaishenqing`
--

DROP TABLE IF EXISTS `xinxigenggaishenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinxigenggaishenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `yuanxizhanghao` varchar(200) DEFAULT NULL COMMENT '院系账号',
  `yuanxi` varchar(200) DEFAULT NULL,
  `banji` varchar(200) DEFAULT NULL,
  `shenqingleixing` varchar(200) NOT NULL,
  `shenqingshijian` date DEFAULT NULL,
  `genggaineirong` longtext,
  `genggaiwenjian` varchar(200) DEFAULT NULL,
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1667792851952 DEFAULT CHARSET=utf8 COMMENT='信息更改申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinxigenggaishenqing`
--

LOCK TABLES `xinxigenggaishenqing` WRITE;
/*!40000 ALTER TABLE `xinxigenggaishenqing` DISABLE KEYS */;
INSERT INTO `xinxigenggaishenqing` VALUES (61,'2022-11-07 03:44:44','学号1','学生姓名1','院系账号1','院系1','班级1','就业信息','2022-11-07','更改内容1','','是',''),(62,'2022-11-07 03:44:44','学号2','学生姓名2','院系账号2','院系2','班级2','就业信息','2022-11-07','更改内容2','','是',''),(63,'2022-11-07 03:44:44','学号3','学生姓名3','院系账号3','院系3','班级3','就业信息','2022-11-07','更改内容3','','是',''),(64,'2022-11-07 03:44:44','学号4','学生姓名4','院系账号4','院系4','班级4','就业信息','2022-11-07','更改内容4','','是',''),(65,'2022-11-07 03:44:44','学号5','学生姓名5','院系账号5','院系5','班级5','就业信息','2022-11-07','更改内容5','','是',''),(66,'2022-11-07 03:44:44','学号6','学生姓名6','院系账号6','院系6','班级6','就业信息','2022-11-07','更改内容6','','是',''),(67,'2022-11-07 03:44:44','学号7','学生姓名7','院系账号7','院系7','班级7','就业信息','2022-11-07','更改内容7','','是',''),(68,'2022-11-07 03:44:44','学号8','学生姓名8','院系账号8','院系8','班级8','就业信息','2022-11-07','更改内容8','','是',''),(1667792851951,'2022-11-07 03:47:31','111','A学生','院系账号1','院系1','202班','就业信息','2022-11-07','信息更改111','','待审核','');
/*!40000 ALTER TABLE `xinxigenggaishenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuanxi`
--

DROP TABLE IF EXISTS `yuanxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuanxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuanxi` varchar(200) DEFAULT NULL COMMENT '院系',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1667793069513 DEFAULT CHARSET=utf8 COMMENT='院系';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuanxi`
--

LOCK TABLES `yuanxi` WRITE;
/*!40000 ALTER TABLE `yuanxi` DISABLE KEYS */;
INSERT INTO `yuanxi` VALUES (31,'2022-11-07 03:44:44','院系1'),(32,'2022-11-07 03:44:44','院系2'),(33,'2022-11-07 03:44:44','院系3'),(34,'2022-11-07 03:44:44','院系4'),(35,'2022-11-07 03:44:44','院系5'),(36,'2022-11-07 03:44:44','院系6'),(37,'2022-11-07 03:44:44','院系7'),(38,'2022-11-07 03:44:44','院系8'),(1667793069512,'2022-11-07 03:51:08','A院系');
/*!40000 ALTER TABLE `yuanxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuanxijiaoshi`
--

DROP TABLE IF EXISTS `yuanxijiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuanxijiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuanxizhanghao` varchar(200) NOT NULL COMMENT '院系账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jiaoshixingming` varchar(200) NOT NULL COMMENT '教师姓名',
  `yuanxi` varchar(200) NOT NULL,
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuanxizhanghao` (`yuanxizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='院系教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuanxijiaoshi`
--

LOCK TABLES `yuanxijiaoshi` WRITE;
/*!40000 ALTER TABLE `yuanxijiaoshi` DISABLE KEYS */;
INSERT INTO `yuanxijiaoshi` VALUES (11,'2022-11-07 03:44:44','院系账号1','123456','教师姓名1','院系1','男','upload/yuanxijiaoshi_zhaopian1.jpg','13823888881'),(12,'2022-11-07 03:44:44','院系账号2','123456','教师姓名2','院系2','男','upload/yuanxijiaoshi_zhaopian2.jpg','13823888882'),(13,'2022-11-07 03:44:44','院系账号3','123456','教师姓名3','院系3','男','upload/yuanxijiaoshi_zhaopian3.jpg','13823888883'),(14,'2022-11-07 03:44:44','院系账号4','123456','教师姓名4','院系4','男','upload/yuanxijiaoshi_zhaopian4.jpg','13823888884'),(15,'2022-11-07 03:44:44','院系账号5','123456','教师姓名5','院系5','男','upload/yuanxijiaoshi_zhaopian5.jpg','13823888885'),(16,'2022-11-07 03:44:44','院系账号6','123456','教师姓名6','院系6','男','upload/yuanxijiaoshi_zhaopian6.jpg','13823888886'),(17,'2022-11-07 03:44:44','院系账号7','123456','教师姓名7','院系7','男','upload/yuanxijiaoshi_zhaopian7.jpg','13823888887'),(18,'2022-11-07 03:44:44','院系账号8','123456','教师姓名8','院系8','男','upload/yuanxijiaoshi_zhaopian8.jpg','13823888888');
/*!40000 ALTER TABLE `yuanxijiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhengshijiuye`
--

DROP TABLE IF EXISTS `zhengshijiuye`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhengshijiuye` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `yuanxizhanghao` varchar(200) DEFAULT NULL COMMENT '院系账号',
  `yuanxi` varchar(200) DEFAULT NULL,
  `banji` varchar(200) DEFAULT NULL,
  `qianyueleixing` varchar(200) NOT NULL,
  `qianyuegongsi` varchar(200) NOT NULL,
  `qianyuegangwei` varchar(200) NOT NULL,
  `qianyueshijian` date NOT NULL,
  `qianyuehetong` varchar(200) NOT NULL,
  `zhengshixinzi` float NOT NULL,
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1667792838117 DEFAULT CHARSET=utf8 COMMENT='正式就业';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhengshijiuye`
--

LOCK TABLES `zhengshijiuye` WRITE;
/*!40000 ALTER TABLE `zhengshijiuye` DISABLE KEYS */;
INSERT INTO `zhengshijiuye` VALUES (41,'2022-11-07 03:44:44','学号1','学生姓名1','院系账号1','院系1','班级1','线上','签约公司1','签约岗位1','2022-11-07','',1,'是',''),(42,'2022-11-07 03:44:44','学号2','学生姓名2','院系账号2','院系2','班级2','线上','签约公司2','签约岗位2','2022-11-07','',2,'是',''),(43,'2022-11-07 03:44:44','学号3','学生姓名3','院系账号3','院系3','班级3','线上','签约公司3','签约岗位3','2022-11-07','',3,'是',''),(44,'2022-11-07 03:44:44','学号4','学生姓名4','院系账号4','院系4','班级4','线上','签约公司4','签约岗位4','2022-11-07','',4,'是',''),(45,'2022-11-07 03:44:44','学号5','学生姓名5','院系账号5','院系5','班级5','线上','签约公司5','签约岗位5','2022-11-07','',5,'是',''),(46,'2022-11-07 03:44:44','学号6','学生姓名6','院系账号6','院系6','班级6','线上','签约公司6','签约岗位6','2022-11-07','',6,'是',''),(47,'2022-11-07 03:44:44','学号7','学生姓名7','院系账号7','院系7','班级7','线上','签约公司7','签约岗位7','2022-11-07','',7,'是',''),(48,'2022-11-07 03:44:44','学号8','学生姓名8','院系账号8','院系8','班级8','线上','签约公司8','签约岗位8','2022-11-07','',8,'是',''),(1667792838116,'2022-11-07 03:47:17','111','A学生','院系账号1','院系1','202班','线下','A公司','A岗位','2022-12-29','upload/1667792836558.docx',5000,'是','审核毕业生的就页信息');
/*!40000 ALTER TABLE `zhengshijiuye` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-08 10:44:13
