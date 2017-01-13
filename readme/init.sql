SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='市级信息';

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '石家庄', '河北');
INSERT INTO `city` VALUES ('2', '邯郸', '河北');
INSERT INTO `city` VALUES ('10', '哈哈', '哈哈哈');
INSERT INTO `city` VALUES ('11', '嘻嘻', '嘻嘻嘻嘻嘻嘻');
INSERT INTO `city` VALUES ('12', '呵呵', '呵呵呵呵呵呵');
INSERT INTO `city` VALUES ('13', '嚯嚯', '嚯嚯嚯嚯嚯嚯');


-- ----------------------------
-- Table structure for city_2015
-- ----------------------------
DROP TABLE IF EXISTS `city_2015`;
CREATE TABLE `city_2015` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='市级信息';

-- ----------------------------
-- Records of city_2015
-- ----------------------------
INSERT INTO `city_2015` VALUES ('3', '仨仨', '仨仨仨仨');
INSERT INTO `city_2015` VALUES ('4', '四四', '四四四四');


-- ----------------------------
-- Table structure for city_2016
-- ----------------------------
DROP TABLE IF EXISTS `city_2016`;
CREATE TABLE `city_2016` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='市级信息';

-- ----------------------------
-- Records of city_2016
-- ----------------------------
INSERT INTO `city_2016` VALUES ('5', '五五', '五五五五');
INSERT INTO `city_2016` VALUES ('6', '六六', '六六六六');
