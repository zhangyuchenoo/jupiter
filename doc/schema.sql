DROP TABLE IF EXISTS `j_user_0`;
CREATE TABLE `j_user_0` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) NOT NULL,
  `passwd` varchar(255) NOT NULL,
  `gender` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `jupiter`.`j_user_0` 
CHANGE COLUMN `id` `id` BIGINT(20) NOT NULL AUTO_INCREMENT ;

DROP TABLE IF EXISTS `j_user_1`;
CREATE TABLE `j_user_1` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) NOT NULL,
  `passwd` varchar(255) NOT NULL,
  `gender` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `jupiter`.`j_user_1` 
CHANGE COLUMN `id` `id` BIGINT(20) NOT NULL AUTO_INCREMENT ;


-- ----------------------------
-- Table structure for id_sequence
-- ----------------------------
DROP TABLE IF EXISTS `id_sequence`;
CREATE TABLE `id_sequence` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_` varchar(100) NOT NULL,
  `val` bigint(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



