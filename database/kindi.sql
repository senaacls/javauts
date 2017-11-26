-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Nov 26, 2017 at 01:13 PM
-- Server version: 5.7.20-0ubuntu0.17.10.1
-- PHP Version: 7.1.8-1ubuntu1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kindi`
--

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `no` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `nama` varchar(50) NOT NULL,
  `ukuran` varchar(2) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` decimal(18,2) NOT NULL,
  `diskon` decimal(18,2) NOT NULL,
  `jumlahbayar` decimal(18,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`no`, `tanggal`, `nama`, `ukuran`, `jumlah`, `harga`, `diskon`, `jumlahbayar`) VALUES
('N01', '2017-11-26', 'Rina', 'S', 1, '60000.00', '0.00', '60000.00'),
('N02', '2017-11-26', 'Andi', 'M', 5, '70000.00', '7000.00', '343000.00'),
('N03', '2017-11-26', 'Ve', 'L', 4, '80000.00', '0.00', '320000.00'),
('N04', '2017-11-26', 'Xu', 'XL', 1, '100000.00', '0.00', '100000.00'),
('N05', '2017-11-26', 'Leona', 'M', 20, '70000.00', '7000.00', '1393000.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`no`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
