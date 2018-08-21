/*
 Navicat Premium Data Transfer

 Source Server         : gold_goods_acps
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : 10.144.137.22:3306
 Source Schema         : gold_goods_acps

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 20/08/2018 10:27:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bill_bank_balance
-- ----------------------------
DROP TABLE IF EXISTS `bill_bank_balance`;
CREATE TABLE `bill_bank_balance`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gateway_channel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网关渠道',
  `gateway_channel_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网关渠道号',
  `trade_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易类型',
  `bill_date` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '对账日期',
  `trans_sq` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '序号',
  `third_custId` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易网会员代码',
  `acct_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '子账户',
  `tran_amount` decimal(20, 2) NULL DEFAULT NULL COMMENT '金额',
  `opt_id` bigint(20) NULL DEFAULT NULL COMMENT '操作人',
  `remark` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 655 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
