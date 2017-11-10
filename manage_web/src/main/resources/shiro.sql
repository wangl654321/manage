/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.20 : Database - shiro
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shiro` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `shiro`;

/*Table structure for table `sys_permission` */

DROP TABLE IF EXISTS `sys_permission`;

CREATE TABLE `sys_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '资源名称',
  `type` varchar(32) NOT NULL COMMENT '资源类型：menu,button,',
  `url` varchar(128) DEFAULT NULL COMMENT '访问url地址',
  `percode` varchar(128) DEFAULT NULL COMMENT '权限代码字符串',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父结点id',
  `parentids` varchar(128) DEFAULT NULL COMMENT '父结点id列表串',
  `sortstring` varchar(128) DEFAULT NULL COMMENT '排序号',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='资源列表';

/*Data for the table `sys_permission` */

insert  into `sys_permission`(`id`,`name`,`type`,`url`,`percode`,`parentid`,`parentids`,`sortstring`,`available`) values (1,'权限','','',NULL,0,'0/','0','1'),(11,'商品管理','menu','/item/queryItem.action',NULL,1,'0/1/','1.','1'),(12,'商品新增','permission','/item/add.action','item:create',11,'0/1/11/','','1'),(13,'商品修改','permission','/item/editItem.action','item:update',11,'0/1/11/','','1'),(14,'商品删除','permission','','item:delete',11,'0/1/11/','','1'),(15,'商品查询','permission','/item/queryItem.action','item:query',11,'0/1/11/',NULL,'1'),(21,'用户管理','menu','/user/query.action','user:query',1,'0/1/','2.','1'),(22,'用户新增','permission','','user:create',21,'0/1/21/','','1'),(23,'用户修改','permission','','user:update',21,'0/1/21/','','1'),(24,'用户删除','permission','','user:delete',21,'0/1/21/','','1');

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '名称',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色名称';

/*Data for the table `sys_role` */

insert  into `sys_role`(`id`,`name`,`available`) values (1,'商品管理员','1'),(2,'用户管理员','1');

/*Table structure for table `sys_role_permission` */

DROP TABLE IF EXISTS `sys_role_permission`;

CREATE TABLE `sys_role_permission` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sys_role_id` varchar(32) NOT NULL COMMENT '角色id',
  `sys_permission_id` varchar(32) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='角色权限表';

/*Data for the table `sys_role_permission` */

insert  into `sys_role_permission`(`id`,`sys_role_id`,`sys_permission_id`) values (1,'1','12'),(2,'2','11'),(3,'1','21'),(4,'2','15'),(5,'1','22'),(6,'2','13');

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `usercode` varchar(32) NOT NULL COMMENT '账号',
  `name` varchar(64) NOT NULL COMMENT '姓名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐',
  `locked` char(1) DEFAULT NULL COMMENT '账号是否锁定，1：锁定，0未锁定',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`usercode`,`name`,`password`,`email`,`phone`,`salt`,`locked`) values (1,'lisi','李四','bf07fd8bbc73b6f70b8319f2ebb87483',NULL,NULL,'uiwueylm','0'),(2,'zhangsan','张三','cb571f7bd7a6f73ab004a70322b963d5',NULL,NULL,'eteokues','0'),(3,'wangl','wangl','a98646c207ab64e729de251ee55ec6e9','228974337@qq.com',NULL,'228974337@qq.com','0');

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sys_user_id` varchar(32) NOT NULL COMMENT '用户id',
  `sys_role_id` varchar(32) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户角色表';

/*Data for the table `sys_user_role` */

insert  into `sys_user_role`(`id`,`sys_user_id`,`sys_role_id`) values (1,'zhangsan','1'),(2,'lisi','2');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
