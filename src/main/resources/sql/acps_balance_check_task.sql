SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for acps_balance_check_task
-- ----------------------------
DROP TABLE IF EXISTS `acps_balance_check_task`;
CREATE TABLE `acps_balance_check_task`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sino_chem_order_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易流水号',
  `acct_num` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '子账户账号',
  `cust_id` bigint(20) NULL DEFAULT NULL COMMENT '客户ID',
  `dr_cr` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'dr借方 cr贷方',
  `trans_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易时间',
  `tran_type` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易类型',
  `cur_type` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '货币类型',
  `tran_amt` decimal(20, 4) NULL DEFAULT NULL COMMENT '交易金额',
  `cur_bal_after_trans` decimal(20, 4) NULL DEFAULT NULL COMMENT '交易后金额',
  `cur_bal_before_trans` decimal(20, 4) NULL DEFAULT NULL COMMENT '交易前金额',
  `acct_trans_dtl_sq` bigint(20) NULL DEFAULT NULL COMMENT '对应交易表ID',
  `banalce_status` int(2) NULL DEFAULT 0 COMMENT '余额状态 0初始化 1 成功 2失败',
  `offset_num` int(2) NULL DEFAULT 0 COMMENT '异常重试次数',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 217 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
