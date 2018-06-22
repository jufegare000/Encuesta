-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 22-06-2018 a las 16:39:39
-- Versión del servidor: 5.7.21
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_encuesta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_encuesta`
--

DROP TABLE IF EXISTS `tbl_encuesta`;
CREATE TABLE IF NOT EXISTS `tbl_encuesta` (
  `idencuesta` int(11) NOT NULL AUTO_INCREMENT,
  `respuesta` varchar(30) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  `comentarios` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idencuesta`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_ocupacion`
--

DROP TABLE IF EXISTS `tbl_ocupacion`;
CREATE TABLE IF NOT EXISTS `tbl_ocupacion` (
  `idocup` varchar(2) NOT NULL,
  `descripcion` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idocup`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuario`
--

DROP TABLE IF EXISTS `tbl_usuario`;
CREATE TABLE IF NOT EXISTS `tbl_usuario` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nom_user` varchar(10) NOT NULL,
  `pass` varchar(6) NOT NULL,
  `tipousuario` varchar(2) DEFAULT NULL,
  `descrtipo` varchar(50) DEFAULT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `fechaNac` date DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`id_user`, `nom_user`, `pass`, `tipousuario`, `descrtipo`, `nombre`, `fechaNac`) VALUES
(1, 'admon', '12345', '1', 'Administrador', 'Juan Gabriel Perez', '1980-07-04');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
