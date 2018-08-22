SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `acps_acct_mast`;
CREATE TABLE `acps_acct_mast`  (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户虚拟总账户ID',
  `mast_acct_num` varchar(28) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户虚拟总账户',
  `cust_id` bigint(20) NOT NULL COMMENT '客户ID',
  `total_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '用户虚拟总账户总余额(总余额=可用余额+冻结金额)',
  `available_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '用户虚拟总账户可用余额(可用余额=可提现余额+在途金额)',
  `available_draw_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '用户虚拟总账户可提现余额',
  `frozen_balance` decimal(20, 2) NULL DEFAULT 0.00 COMMENT '用户虚拟总账户冻结金额',
  `pre_minus_amt` decimal(20, 4) NULL DEFAULT NULL COMMENT '计提金额',
  `total_mod_count` int(11) NULL DEFAULT NULL,
  `cum_dr_amt` decimal(20, 4) NULL DEFAULT NULL COMMENT '账户总借记金额',
  `cum_cr_amt` decimal(20, 4) NULL DEFAULT NULL COMMENT '账户总贷记金额',
  `status` int(1) NOT NULL COMMENT '账户状态(开户中:0,开户成功:1,开户失败:2)',
	`create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `opt_id` bigint(20) NULL DEFAULT 0 COMMENT '操作员ID',
  `last_user_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后修改用户ID',
  `last_time` datetime(0) NULL DEFAULT NULL COMMENT '最后修改时间',
  `last_modify_date` datetime(0) NULL DEFAULT NULL COMMENT '最后修改日期',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `id_UNIQUE`(`id`) USING BTREE,
  UNIQUE INDEX `mast_acct_num_UNIQUE`(`mast_acct_num`) USING BTREE
) 


