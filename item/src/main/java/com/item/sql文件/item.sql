/*
 Navicat MySQL Data Transfer

 Source Server         : 
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : 
 Source Schema         : item

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 09/09/2022 11:20:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品id',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名字',
  `desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品描述',
  `price` double(10, 2) NULL DEFAULT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', '测试', '测试', 0.01);

SET FOREIGN_KEY_CHECKS = 1;
