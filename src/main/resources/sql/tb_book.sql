/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 06/07/2024 19:55:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_book
-- ----------------------------
DROP TABLE IF EXISTS `tb_book`;
CREATE TABLE `tb_book`  (
  `ID` int NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '图书名称',
  `bst` date NULL DEFAULT NULL COMMENT '借阅时间',
  `bet` date NULL DEFAULT NULL COMMENT '归还时间',
  `borrowers` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '借阅人',
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态',
  `operations` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 433 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_book
-- ----------------------------
INSERT INTO `tb_book` VALUES (1, '三国演义', '2024-05-02', '2024-05-09', '张三', '已归还', '借阅');
INSERT INTO `tb_book` VALUES (12, '李白诗集', '2024-07-01', NULL, '刘山', '已借阅', '归还');
INSERT INTO `tb_book` VALUES (33, '三体', '2024-06-05', '2024-06-15', '燕燕', '已归还', '借阅');
INSERT INTO `tb_book` VALUES (46, '朝花夕拾', '2024-06-06', '2024-06-07', '张杰', '已归还', '借阅');
INSERT INTO `tb_book` VALUES (72, '红楼梦', '2024-06-07', '2024-06-15', '王心', '已归还', '借阅');
INSERT INTO `tb_book` VALUES (89, '三国演义', '2024-06-13', '2024-06-19', '胡会', '已归还', '借阅');
INSERT INTO `tb_book` VALUES (134, '水浒传', '2024-05-17', '2024-06-05', '黎明', '已归还', '借阅');
INSERT INTO `tb_book` VALUES (222, '十日终焉', '2024-06-11', '2024-07-02', '丽丽', '已归还', '借阅');
INSERT INTO `tb_book` VALUES (231, '马克思主义', '2024-06-07', NULL, '李银', '已借阅', '归还');
INSERT INTO `tb_book` VALUES (233, '红高粱', '2024-06-20', NULL, '李四', '已借阅', '归还');
INSERT INTO `tb_book` VALUES (325, '活着', '2024-06-15', NULL, '刘杰', '已借阅', '归还');
INSERT INTO `tb_book` VALUES (432, '龙珠', '2024-06-20', NULL, '花花', '已借阅', '归还');

SET FOREIGN_KEY_CHECKS = 1;
