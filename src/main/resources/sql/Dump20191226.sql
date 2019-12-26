-- MySQL dump 10.13  Distrib 8.0.18, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: manage
-- ------------------------------------------------------
-- Server version	8.0.13

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
-- Table structure for table `dept_inf`
--

DROP TABLE IF EXISTS `dept_inf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept_inf` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept_inf`
--

LOCK TABLES `dept_inf` WRITE;
/*!40000 ALTER TABLE `dept_inf` DISABLE KEYS */;
INSERT INTO `dept_inf` VALUES ('CS','测试部',NULL),('CW','财务部','企业的财务管理'),('PP','品牌部',NULL),('RLZY','人力资源部','为企业及时提供合格的人才和人力'),('SJ','设计部','研发技术，处理产品技术问题'),('WLGG','网络公关部',NULL),('XS','销售部',NULL),('XXCB','信息采编部','收集同业情况。线路产品销售服务'),('XZ','行政部','企业的办公秩序以及行政事务管理'),('YF','研发部','研发公司产品'),('YXCH','营销策划部','树立企业形象和产品形象，……'),('ZX','咨询部',NULL);
/*!40000 ALTER TABLE `dept_inf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_inf`
--

DROP TABLE IF EXISTS `employee_inf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_inf` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `sex` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `education` varchar(100) DEFAULT NULL,
  `card_id` varchar(100) DEFAULT NULL,
  `job_id` varchar(100) DEFAULT NULL,
  `dept_id` varchar(100) DEFAULT NULL,
  `create_date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  KEY `employee_inf_ibfk_1` (`job_id`,`dept_id`),
  CONSTRAINT `employee_inf_ibfk_1` FOREIGN KEY (`job_id`, `dept_id`) REFERENCES `job_inf` (`id`, `dept_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='_';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_inf`
--

LOCK TABLES `employee_inf` WRITE;
/*!40000 ALTER TABLE `employee_inf` DISABLE KEYS */;
INSERT INTO `employee_inf` VALUES (1,'彭万里','男','1','1156777828@qq.com','研究生','340822199905240211','CS02','CS','1'),(2,'高大山','女','18325657365','1156777828@qq.com','本科','340822199905240211','CS01','CS',NULL),(3,'谢大海','男','18325657365','1156777828@qq.com','研究生','340822199905240211','CS01','CS',NULL),(4,'马宏宇','女','18325657365','1156777828@qq.com','本科','340822199905240211','CS01','CS',NULL),(5,'林莽','女','18325657365','1156777828@qq.com','本科','340822199905240211','CS01','CS',NULL),(6,'黄强辉','男','18325657365','1156777828@qq.com','研究生','340822199905240211','CS01','CS',NULL),(7,'章汉夫','男','18325657365','1156777828@qq.com','本科','340822199905240211','CS01','CS',NULL),(8,'范长江','女','18325657365','1156777828@qq.com','研究生','340822199905240211','CS01','CS',NULL),(9,'林君雄','男','18325657365','1156777828@qq.com','本科','340822199905240211','CS01','CS',NULL),(10,'李四光','男','18325657365','1156777828@qq.com','研究生','340822199905240211','CS03','CS',NULL),(11,'甘铁生','女','18325657365','1156777828@qq.com','本科','340822199905240211','XS01','XS',NULL),(12,'张伍绍祖','男','18325657365','1156777828@qq.com','本科','340822199905240211','CS02','CS',NULL),(13,'马继祖','男','18325657365','1156777828@qq.com','本科','340822199905240211','CW03','CW',NULL),(14,'程孝先','男','18325657365','1156777828@qq.com','本科','340822199905240211','CW05','CW',NULL),(15,'余克勤','男','18325657365','1156777828@qq.com','研究生','340822199905240211','CS01','CS',NULL),(16,'吴克俭','男','18325657365','1156777828@qq.com','本科','340822199905240211','PL03','RLZY',NULL),(17,'杨惟义','女','18325657365','1156777828@qq.com','本科','340822199905240211','CS01','CS',NULL),(18,'李文信','男','18325657365','1156777828@qq.com','本科','340822199905240211','PP01','PP',NULL),(19,'王德茂','男','18325657365','1156777828@qq.com','本科','340822199905240211','XS02','XS',NULL),(20,'李书诚','女','18325657365','1156777828@qq.com','研究生','340822199905240211','PP01','PP',NULL),(21,'杨勇','男','18325657365','1156777828@qq.com','本科','340822199905240211','CW05','CW',NULL),(22,'高尚德','男','18325657365','18325657365','研究生','340822199905240211','CS04','CS',NULL),(23,'李开富','男','18325657365','18325657365','本科','340822199905240211','CS01','CS',NULL),(24,'节振国','男','18325657365','1156777828@qq.com','本科','340822199905240211','PL02','RLZY',NULL),(25,'关玉和','男','18325657365','1156777828@qq.com','本科','340822199905240211','PP01','PP',NULL),(26,'王仁兴','男','18325657365','1156777828@qq.com','本科','340822199905240211','XS03','XS',NULL),(27,'吴家栋','男','18325657365','1156777828@qq.com','本科','340822199905240211','YF02','YF',NULL),(28,'孙书贤','男','18325657365','1156777828@qq.com','本科','340822199905240211','YF02','YF',NULL),(29,'孙卫东','男','18325657365','1156777828@qq.com','本科','340822199905240211','YF02','YF',NULL),(30,'孙子函','男','18325657365','1156777828@qq.com','本科','340822199905240211','PL02','RLZY',NULL),(31,'孙婉宛','男','18325657365','1156777828@qq.com','本科','340822199905240211','YF03','YF',NULL),(34,'张国柱','男','18325657365','1156777828@qq.com','本科','340822199905240211','PL03','RLZY',NULL),(35,'李际泰','男','18325657365','1156777828@qq.com','本科','340822199905240211','PL03','RLZY',NULL),(36,'刘造时','男','18325657365','1156777828@qq.com','本科','340822199905240211','CS01','CS',NULL);
/*!40000 ALTER TABLE `employee_inf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_inf`
--

DROP TABLE IF EXISTS `job_inf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `job_inf` (
  `id` varchar(100) NOT NULL,
  `dept_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  KEY `id` (`id`,`dept_id`),
  CONSTRAINT `job_inf_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `dept_inf` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_inf`
--

LOCK TABLES `job_inf` WRITE;
/*!40000 ALTER TABLE `job_inf` DISABLE KEYS */;
INSERT INTO `job_inf` VALUES ('CS01','CS','测试经理','指定部门年度发展规划，制定测试团队日常工作制度'),('CS02','CS','测试组长','根据部门年度发展规划制度小组年度计划，对整个测试项目进行管理，对最终的产品质量负责'),('CS03','CS','高级测试工程师','辅助测试组长完成小组年度计划并执行'),('CS04','CS','测试工程师','服从项目管理和组长管理，执行小组年度计划，并按计划汇报执行总结'),('CW01','CW','财务经理','负责公司的整个财务经营状况'),('CW02','CW','财务副经理','协助财务经理工作'),('CW03','CW','财务主管','负责总账等主要财务工作'),('CW04','CW','一般会计','日常记账'),('CW05','CW','出纳','负责现金和银行的日记账'),('PL01','RLZY','人力资源部经理','进行培训等人力资源开发方面的工作'),('PL02','RLZY','人力资源主管','全面负责招聘工作，协助部门经理进行培训等人力资源开发方面的工作。'),('PL03','RLZY','招聘专员','协助人力资源主管做好招聘工作及其他临时性工作'),('PP01','PP','品牌部经理','负责按照公司总体战略提炼.整合企业品牌资源,提升品牌价值'),('PP02','PP','品牌策划主管','负责企业品牌包装与形象策划，进行差异性品牌传播'),('PP03','PP','品牌设计设计专员','负责品牌设计和策划'),('XS01','XS','销售总监\r\n\r\n销售总监','负责整个销售部门'),('XS02','XS','营销主管','对销售类型的主要管事者·负责产品在当地的推广、执行、客户沟通、跟踪工作'),('XS03','XS','营销专员','策划销售，活动，调研市场动态，走向'),('XZ01','XZ','行政主管','负责公司整体的行政，管理行政文员'),('XZ02','XZ','行政文员','负责处理公司行政事务'),('YF01','YF','研发总监','根据公司发展战略，拟定公司中远期研发计划，把握研发方向；指导并监督研发部门执行公司研发战略和年度研发计划；控制产品开发进度，调整计划；组建优秀的产品研发团队，审核及培训考核有关技术人员。'),('YF02','YF','研发经理','制定新产品研发计划，论证计划可行性；监督管理研发工作进度及质量；研究新产品开发、根据不同领域的客户要求，提出有效的解决方案。'),('YF03','YF','研发人员','关键资料的收集整理；编制计算机程序；进行实验、测试和分析；为实验、测试和分析准备材料和设备；记录测量数据、进行计算和编制图表；从事统计调查。');
/*!40000 ALTER TABLE `job_inf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice_inf`
--

DROP TABLE IF EXISTS `notice_inf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `context` varchar(100) DEFAULT NULL,
  `create_date` varchar(100) DEFAULT NULL,
  `user_id` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice_inf`
--

LOCK TABLES `notice_inf` WRITE;
/*!40000 ALTER TABLE `notice_inf` DISABLE KEYS */;
INSERT INTO `notice_inf` VALUES (1,'通知','明天上午10点钟全体成员会议室开会','2019.2.55','001');
/*!40000 ALTER TABLE `notice_inf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_inf`
--

DROP TABLE IF EXISTS `user_inf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(100) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `create_date` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_inf`
--

LOCK TABLES `user_inf` WRITE;
/*!40000 ALTER TABLE `user_inf` DISABLE KEYS */;
INSERT INTO `user_inf` VALUES (3,'ltwo','张三','2019.5.13','123456'),(4,'litao','测试用户','22','li111333');
/*!40000 ALTER TABLE `user_inf` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-26  8:24:11
