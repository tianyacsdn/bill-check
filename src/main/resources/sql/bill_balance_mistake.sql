SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bill_balance_mistake
-- ----------------------------
DROP TABLE IF EXISTS `bill_balance_mistake`;
CREATE TABLE `bill_balance_mistake`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `acct_num` varchar(28) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '虚拟子账户账号',
  `cust_id` bigint(20) NOT NULL COMMENT '客户ID',
  `acct_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '虚拟子账户名称(可用于别名)',
  `acct_type` int(1) NOT NULL COMMENT '虚拟子账户类型(收款子账户:0,付款子账户:1)',
  `bank_total_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '银行虚拟子账户总余额(总余额=可用余额+冻结金额)',
  `acps_total_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '平台虚拟子账户总余额(总余额=可用余额+冻结金额)',
  `bank_available_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '银行虚拟子账户可用余额(可用余额=可提现余额+在途金额)',
  `acps_available_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '平台虚拟子账户可用余额(可用余额=可提现余额+在途金额)',
  `bank_available_draw_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '银行虚拟子账户可提现余额',
  `acps_available_draw_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '平台虚拟子账户可提现余额',
  `bank_frozen_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '银行虚拟子账户冻结金额',
  `acps_frozen_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '平台虚拟子账户冻结金额',
  `check_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '对账时间',
  `create_time` timestamp(0) NULL DEFAULT NULL,
  `update_time` timestamp(0) NULL DEFAULT NULL,
  `remark` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `opt_id` bigint(20) NULL DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
