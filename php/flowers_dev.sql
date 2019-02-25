-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le: Lun 28 Janvier 2019 à 00:16
-- Version du serveur: 5.5.27-log
-- Version de PHP: 5.4.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `flowers_dev`
--

-- --------------------------------------------------------

--
-- Structure de la table `flowers`
--

CREATE TABLE IF NOT EXISTS `flowers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `image` text,
  `color` varchar(50) DEFAULT NULL,
  `category` text,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `notes`
--

CREATE TABLE IF NOT EXISTS `notes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` text,
  `content` text,
  `public` tinyint(1) DEFAULT NULL,
  `userid` int(11) NOT NULL,
  `flowerid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `flowerid` (`flowerid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `name` text NOT NULL,
  `dateNaissance` date NOT NULL,
  `grade` varchar(5) NOT NULL,
  `dateInscription` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `name`, `dateNaissance`, `grade`, `dateInscription`) VALUES
(1, 'user1@yahoo.fr', '*34D3B87A652E7F0D1D371C3DBF28E291705468C4', 'user1', '2000-01-01', '', '0000-00-00 00:00:00'),
(2, 'user2@yahoo.fr', '*12A20BE57AF67CBF230D55FD33FBAF5230CFDBC4', 'user2', '2000-01-02', 'user', '0000-00-00 00:00:00'),
(3, 'user3@yahoo.fr', '*4570676E59FAC04669A75B74C31338296F688A44', 'user3', '2000-01-03', 'user', '2019-01-26 00:00:00'),
(4, 'user4@yahoo.fr', '*9246DFDBF8341B128B1B132A4626D3AFFEF03F0C', 'user4', '2000-01-04', 'user', '2019-01-26 07:07:17'),
(5, 'user5@yahoo.fr', '*EE0AEA25B21B2D11C36B82B27BF18794AAC3861E', 'user5', '2000-01-05', 'user', '2019-01-26 07:10:53'),
(13, 'user7@hotmail.com', '*76A865995EDB4B4CE9CB9D398DB71CC35A2B4602', 'user7', '2000-02-06', 'user', '2019-01-26 10:59:03'),
(14, 'user9@gmail.com', '*D3F3421996DC3D8BA364A7907DC41B34F2D0C21B', 'user9', '2006-09-09', 'user', '2019-01-27 06:06:51'),
(15, 'user8@hotmail.fr', '*01EF180CE851BF07466F9709A3BA585286791EA0', 'user8', '2000-08-08', 'user', '2019-01-27 06:09:50'),
(16, 'user10@yahoo.fr', '*DDADA77463DE28C9DE8E431E589793C0030A6857', 'user10', '2000-03-10', 'user', '2019-01-27 07:28:21'),
(17, 'user6@yahoo.fr', '*3B90053D7CAB6AE2F262D5C1C8052543A090DEF1', 'user6', '2000-06-06', 'user', '2019-01-27 07:41:28'),
(18, 'user11@hotmail.com', '*BE94B67FFAB5074057504D8241D8A679C6525D0D', 'user11', '2000-11-11', 'user', '2019-01-27 07:56:43'),
(19, 'user@yahoo', '*D719AE36208DB411C4C27F99A7EB8FDAA2D352DC', 'user12', '2000-03-02', 'user', '2019-01-27 08:30:48'),
(20, 'user13@hotmail.fr', '*D96E731673EA31A4CFEE43FD938E3DA944506737', 'userThirteen', '2000-12-12', 'user', '2019-01-27 08:51:01');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `notes`
--
ALTER TABLE `notes`
  ADD CONSTRAINT `Notes_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `Notes_ibfk_2` FOREIGN KEY (`flowerid`) REFERENCES `flowers` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
