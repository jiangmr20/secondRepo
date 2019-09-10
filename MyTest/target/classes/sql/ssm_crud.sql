/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50642
Source Host           : localhost:3306
Source Database       : ssm_crud

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2018-12-20 10:24:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_student
-- ----------------------------
DROP TABLE IF EXISTS `tbl_student`;
CREATE TABLE `tbl_student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(255) NOT NULL,
  `chinese` int(11) NOT NULL,
  `math` int(11) NOT NULL,
  `english` int(11) NOT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_student
-- ----------------------------
INSERT INTO `tbl_student` VALUES ('11', 'student11', '61', '49', '61');
INSERT INTO `tbl_student` VALUES ('12', 'student12', '58', '6', '60');
INSERT INTO `tbl_student` VALUES ('13', 'student13', '78', '9', '15');
INSERT INTO `tbl_student` VALUES ('14', 'student14', '46', '86', '89');
INSERT INTO `tbl_student` VALUES ('16', 'student16', '69', '54', '63');
INSERT INTO `tbl_student` VALUES ('17', 'student17', '52', '73', '5');
INSERT INTO `tbl_student` VALUES ('18', 'student18', '11', '40', '67');
INSERT INTO `tbl_student` VALUES ('19', 'student19', '13', '65', '85');
INSERT INTO `tbl_student` VALUES ('20', 'student20', '28', '87', '48');
INSERT INTO `tbl_student` VALUES ('21', 'student21', '79', '53', '27');
INSERT INTO `tbl_student` VALUES ('22', 'student22', '79', '11', '20');
INSERT INTO `tbl_student` VALUES ('23', 'student23', '67', '75', '71');
INSERT INTO `tbl_student` VALUES ('24', 'student24', '31', '42', '20');
INSERT INTO `tbl_student` VALUES ('25', 'student25', '72', '99', '77');
INSERT INTO `tbl_student` VALUES ('26', 'student26', '90', '16', '12');
INSERT INTO `tbl_student` VALUES ('27', 'student27', '15', '40', '52');
INSERT INTO `tbl_student` VALUES ('28', 'student28', '39', '42', '91');
INSERT INTO `tbl_student` VALUES ('29', 'student29', '27', '63', '35');
INSERT INTO `tbl_student` VALUES ('30', 'student30', '85', '19', '41');
INSERT INTO `tbl_student` VALUES ('31', 'student31', '48', '18', '46');
INSERT INTO `tbl_student` VALUES ('32', 'student32', '77', '46', '0');
INSERT INTO `tbl_student` VALUES ('33', 'student33', '64', '15', '88');
INSERT INTO `tbl_student` VALUES ('34', 'student34', '91', '89', '74');
INSERT INTO `tbl_student` VALUES ('35', 'student35', '0', '83', '12');
INSERT INTO `tbl_student` VALUES ('36', 'student36', '12', '27', '98');
INSERT INTO `tbl_student` VALUES ('37', 'student37', '6', '38', '74');
INSERT INTO `tbl_student` VALUES ('38', 'student38', '54', '46', '70');
INSERT INTO `tbl_student` VALUES ('39', 'student39', '10', '43', '86');
INSERT INTO `tbl_student` VALUES ('40', 'student40', '97', '25', '35');
INSERT INTO `tbl_student` VALUES ('41', 'student41', '3', '10', '42');
INSERT INTO `tbl_student` VALUES ('42', 'student42', '78', '64', '87');
INSERT INTO `tbl_student` VALUES ('43', 'student43', '42', '51', '28');
INSERT INTO `tbl_student` VALUES ('44', 'student44', '90', '63', '44');
INSERT INTO `tbl_student` VALUES ('45', 'student45', '30', '20', '12');
INSERT INTO `tbl_student` VALUES ('46', 'student46', '100', '61', '5');
INSERT INTO `tbl_student` VALUES ('47', 'student47', '43', '2', '81');
INSERT INTO `tbl_student` VALUES ('48', 'student48', '98', '46', '35');
INSERT INTO `tbl_student` VALUES ('49', 'student49', '40', '93', '45');
INSERT INTO `tbl_student` VALUES ('50', 'student50', '47', '1', '63');
INSERT INTO `tbl_student` VALUES ('51', 'student51', '12', '73', '27');
INSERT INTO `tbl_student` VALUES ('52', 'student52', '17', '3', '66');
INSERT INTO `tbl_student` VALUES ('53', 'student53', '18', '95', '17');
INSERT INTO `tbl_student` VALUES ('54', 'student54', '4', '69', '31');
INSERT INTO `tbl_student` VALUES ('55', 'student55', '51', '59', '42');
INSERT INTO `tbl_student` VALUES ('56', 'student56', '35', '49', '41');
INSERT INTO `tbl_student` VALUES ('57', 'student57', '58', '67', '61');
INSERT INTO `tbl_student` VALUES ('58', 'student58', '4', '40', '86');
INSERT INTO `tbl_student` VALUES ('59', 'student59', '9', '91', '23');
INSERT INTO `tbl_student` VALUES ('60', 'student60', '43', '49', '13');
INSERT INTO `tbl_student` VALUES ('61', 'student61', '21', '68', '74');
INSERT INTO `tbl_student` VALUES ('62', 'student62', '64', '0', '8');
INSERT INTO `tbl_student` VALUES ('63', 'student63', '40', '78', '68');
INSERT INTO `tbl_student` VALUES ('64', 'student64', '3', '17', '73');
INSERT INTO `tbl_student` VALUES ('65', 'student65', '15', '56', '32');
INSERT INTO `tbl_student` VALUES ('66', 'student66', '97', '84', '30');
INSERT INTO `tbl_student` VALUES ('67', 'student67', '0', '13', '63');
INSERT INTO `tbl_student` VALUES ('68', 'student68', '75', '87', '8');
INSERT INTO `tbl_student` VALUES ('69', 'student69', '82', '84', '75');
INSERT INTO `tbl_student` VALUES ('70', 'student70', '23', '91', '83');
INSERT INTO `tbl_student` VALUES ('71', 'student71', '42', '64', '90');
INSERT INTO `tbl_student` VALUES ('72', 'student72', '60', '29', '67');
INSERT INTO `tbl_student` VALUES ('73', 'student73', '46', '31', '17');
INSERT INTO `tbl_student` VALUES ('74', 'student74', '95', '20', '18');
INSERT INTO `tbl_student` VALUES ('75', 'student75', '30', '97', '93');
INSERT INTO `tbl_student` VALUES ('76', 'student76', '72', '84', '2');
INSERT INTO `tbl_student` VALUES ('77', 'student77', '59', '90', '72');
INSERT INTO `tbl_student` VALUES ('78', 'student78', '92', '39', '24');
INSERT INTO `tbl_student` VALUES ('79', 'student79', '1', '34', '65');
INSERT INTO `tbl_student` VALUES ('80', 'student80', '24', '25', '56');
INSERT INTO `tbl_student` VALUES ('81', 'student81', '0', '38', '87');
INSERT INTO `tbl_student` VALUES ('82', 'student82', '20', '39', '37');
INSERT INTO `tbl_student` VALUES ('83', 'student83', '67', '24', '21');
INSERT INTO `tbl_student` VALUES ('84', 'student84', '33', '1', '9');
INSERT INTO `tbl_student` VALUES ('85', 'student85', '42', '82', '84');
INSERT INTO `tbl_student` VALUES ('86', 'student86', '74', '16', '60');
INSERT INTO `tbl_student` VALUES ('87', 'student87', '49', '69', '95');
INSERT INTO `tbl_student` VALUES ('88', 'student88', '69', '58', '84');
INSERT INTO `tbl_student` VALUES ('89', 'student89', '44', '69', '11');
INSERT INTO `tbl_student` VALUES ('90', 'student90', '52', '25', '69');
INSERT INTO `tbl_student` VALUES ('91', 'student91', '71', '46', '17');
INSERT INTO `tbl_student` VALUES ('92', 'student92', '48', '90', '3');
INSERT INTO `tbl_student` VALUES ('93', 'student93', '48', '31', '9');
INSERT INTO `tbl_student` VALUES ('94', 'student94', '54', '42', '50');
INSERT INTO `tbl_student` VALUES ('95', 'student95', '23', '68', '69');
INSERT INTO `tbl_student` VALUES ('96', 'student96', '40', '95', '52');
INSERT INTO `tbl_student` VALUES ('97', 'student97', '75', '19', '72');
INSERT INTO `tbl_student` VALUES ('98', 'student98', '2', '96', '70');
INSERT INTO `tbl_student` VALUES ('99', 'student99', '61', '98', '5');
INSERT INTO `tbl_student` VALUES ('100', 'student100', '34', '56', '76');
INSERT INTO `tbl_student` VALUES ('101', 'sgw', '11', '11', '11');
INSERT INTO `tbl_student` VALUES ('102', 'jzh', '222', '222', '222');
INSERT INTO `tbl_student` VALUES ('103', 'cy', '323', '323', '232');
INSERT INTO `tbl_student` VALUES ('105', 'cy', '33', '323', '232');
INSERT INTO `tbl_student` VALUES ('106', '1', '323', '323', '232');

-- ----------------------------
-- Procedure structure for pro1
-- ----------------------------
DROP PROCEDURE IF EXISTS `pro1`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `pro1`(IN n INT)
BEGIN                                                                 /*??*/
    DECLARE num001 INT;
    DECLARE chineseSco INT;
    DECLARE mathSco INT;
    DECLARE englishSco INT;
    SET num001 = 1;                             /*??num001=1,num002=10*/
    SET chineseSco = 100,mathSco = 100,englishSco = 100;
    WHILE n - num001 >= 0 DO                                     /*?num001????n????????*/
      INSERT INTO tbl_student(stu_id,stu_name,chinese,math,english)
      VALUES(num001,CONCAT("student" , num001) , chineseSco,mathSco,englishSco);        /*?test??????test_name=zhangsan+num001,test_num=num002?contat??????num001???*/
      SET num001=num001+1;             /*??num001=num001+1,num002=num002*2*/
      SET chineseSco = FLOOR(RAND()*101),mathSco = FLOOR(RAND()*101),englishSco = FLOOR(RAND()*101);
    END WHILE;                                                          /*?num>100??????????????*/
  END
;;
DELIMITER ;
