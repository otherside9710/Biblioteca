/*
Navicat MySQL Data Transfer

Source Server         : LocalHost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : biblioteca

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-11-20 23:24:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for administradores
-- ----------------------------
DROP TABLE IF EXISTS `administradores`;
CREATE TABLE `administradores` (
`adm_codigo`  int(50) NOT NULL AUTO_INCREMENT ,
`adm_nombre`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`adm_apellido`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`adm_cedula`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`adm_direccion`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`adm_telefono`  varchar(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
PRIMARY KEY (`adm_codigo`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
AUTO_INCREMENT=3

;

-- ----------------------------
-- Records of administradores
-- ----------------------------
BEGIN;
INSERT INTO `administradores` VALUES ('1', 'Julio', 'sarmiento', '123123', 'calle2', '123123'), ('2', 'ruber', 'regino', '12435623', 'calle41', '21341245');
COMMIT;

-- ----------------------------
-- Table structure for estudiantes
-- ----------------------------
DROP TABLE IF EXISTS `estudiantes`;
CREATE TABLE `estudiantes` (
`es_codigo`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_NumCarnet`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`es_nombre`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_apellido`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_direccion`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_telefono`  varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_email`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_sexo`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_pasatiempo`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_departamento`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
`es_municipio`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL ,
PRIMARY KEY (`es_NumCarnet`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci

;

-- ----------------------------
-- Records of estudiantes
-- ----------------------------
BEGIN;
INSERT INTO `estudiantes` VALUES ('001', '1231231', 'Julio', 'ce', 'sadas', '23423', 'jsarmiento@gmail.com', 'Hombre', 'asdasdas', 'Amazonas', 'Abejorral'), ('002', '393741', 'Julio', 'Sarmiento', 'NM', '3114110213', 'jsarmientop.inca@gmail.com', 'Hombre', 'Programar', 'Atlántico', 'Repelón');
COMMIT;

-- ----------------------------
-- Table structure for libros
-- ----------------------------
DROP TABLE IF EXISTS `libros`;
CREATE TABLE `libros` (
`li_codigo`  int(11) NOT NULL AUTO_INCREMENT ,
`li_nombre`  varchar(80) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`li_editorial`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`li_genero`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`li_autor`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`li_ubicacion`  varchar(60) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`li_estado`  varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`li_añoEdicion`  varchar(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
PRIMARY KEY (`li_codigo`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
AUTO_INCREMENT=7

;

-- ----------------------------
-- Records of libros
-- ----------------------------
BEGIN;
INSERT INTO `libros` VALUES ('1', 'Juego de tronos', 'HarperCollins', 'Fantasia ', 'George R. R. Martin', 'Seccion Ficcion', 'Prestado', '1996'), ('2', 'Choque de reyes ', 'HarperCollins', 'Fantasía', 'George R. R. Martin', 'Seccion Ficcion ', 'Disponible', '1998 '), ('4', 'Tormenta de espadas', 'HarperCollins', 'Fantasia', 'George R. R. Martin', 'Seccion Ficcion ', 'Disponible', '2000'), ('5', 'Festín de cuervos', 'HarperCollins', 'Fantasia', 'George R. R. Martin', 'Seccion Ficcion ', 'Prestado', '2005'), ('6', 'Danza de dragones', 'HarperCollins', 'Fantasia', 'George R. R. Martin', 'Seccion Ficcion ', 'Prestado', '2011');
COMMIT;

-- ----------------------------
-- Table structure for prestamos
-- ----------------------------
DROP TABLE IF EXISTS `prestamos`;
CREATE TABLE `prestamos` (
`pr_codigoPrestamo`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`pr_numeroPrestamo`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`pr_fechaPrestamo`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`pr_fechaDevolucion`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`pr_Entregado`  tinyint(4) NOT NULL ,
PRIMARY KEY (`pr_codigoPrestamo`, `pr_numeroPrestamo`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci

;

-- ----------------------------
-- Records of prestamos
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
`codigo`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`tipo_rol`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
INDEX `codigo` (`codigo`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci

;

-- ----------------------------
-- Records of roles
-- ----------------------------
BEGIN;
INSERT INTO `roles` VALUES ('1', 'admin'), ('2', 'estudiante');
COMMIT;

-- ----------------------------
-- Table structure for usuarios
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
`codigo`  varchar(60) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`usuario`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`tipouser`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
`password`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL ,
PRIMARY KEY (`codigo`),
INDEX `id` (`codigo`) USING BTREE ,
INDEX `rol` (`tipouser`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci

;

-- ----------------------------
-- Records of usuarios
-- ----------------------------
BEGIN;
INSERT INTO `usuarios` VALUES ('0001', 'otherside', '1', '123'), ('0004', 'tocayo12', '2', '1234'), ('001', 'admin', '1', '1'), ('002', 'carlos', '2', '2'), ('003', '2', '1', '123'), ('1407', 'rubertel', '1', '2017');
COMMIT;

-- ----------------------------
-- Auto increment value for administradores
-- ----------------------------
ALTER TABLE `administradores` AUTO_INCREMENT=3;

-- ----------------------------
-- Auto increment value for libros
-- ----------------------------
ALTER TABLE `libros` AUTO_INCREMENT=7;
