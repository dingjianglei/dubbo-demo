/*
Navicat MySQL Data Transfer

Source Server         : local_mysql1.2
Source Server Version : 50528
Source Host           : localhost:3307
Source Database       : dubbo_alei

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-09-18 20:14:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for T_USER
-- ----------------------------
DROP TABLE IF EXISTS `T_USER`;
CREATE TABLE `T_USER` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '记录版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of T_USER
-- ----------------------------
INSERT INTO `T_USER` VALUES ('1', 'dingjianglei', '10', '上海', 'djl', '0');
