-- ----------------------------
--  Table structure for `@init.dbPrefix@system_info`
-- ----------------------------
CREATE TABLE IF NOT EXISTS `@init.dbPrefix@system_info` (
  `version_code` varchar(64) NOT NULL,
  `version_id` int(11) NOT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `description` varchar(256),
  PRIMARY KEY (`version_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `@init.dbPrefix@action_log`
-- ----------------------------
CREATE TABLE IF NOT EXISTS `@init.dbPrefix@action_log` (
  `id` int unsigned PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `optr_id` varchar(36),
  `client_ip` varchar(64),
  `module_id` varchar(36),
  `func_type` varchar(36),
  `hints` varchar(256),
  `detail` varchar(2048),
  `action_time` datetime(3) DEFAULT CURRENT_TIMESTAMP(3)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;