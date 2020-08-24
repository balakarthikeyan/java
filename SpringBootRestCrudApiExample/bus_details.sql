-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2020 at 02:22 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `playground`
--

-- --------------------------------------------------------

--
-- Table structure for table `bus_details`
--

CREATE TABLE `bus_details` (
  `id` int(10) UNSIGNED NOT NULL,
  `bus_no` varchar(10) DEFAULT '',
  `travels_name` varchar(100) DEFAULT '',
  `price` float(5,2) NOT NULL DEFAULT 0.00,
  `arrival_time` datetime DEFAULT NULL,
  `departure_time` datetime DEFAULT NULL,
  `source` varchar(100) DEFAULT '',
  `destination` varchar(100) DEFAULT '', 
  `seats` int(4) NOT NULL DEFAULT 0,
  `duration` varchar(10) DEFAULT '',,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bus_details`
--

INSERT INTO `bus_details` (`id`, `bus_no`, `travels_name`, `price`, `arrival_time`, `departure_time`, `duration`, `source`, `destination`, `seats`, `created_date`, `updated_date`) VALUES
(1, 'TN 01 AA 1234', 'A1 Travels', 560.00, '2020-07-01 21:30:00', '2020-07-02 05:30:00', '8', 'Chennai', 'Coimbatore', '30', '2020-07-02 00:00:00', now()),
(2, 'TN 02 AA 1234', 'Parveen Travels', 750.00, '2020-07-01 20:30:00', '2020-07-02 04:30:00', '8', 'Chennai', 'Coimbatore', '35', '2020-07-02 00:00:00', now()),
(3, 'TN 03 AA 1234', 'SRS Travels', 560.00, '2020-07-01 17:30:00', '2020-07-02 05:30:00', '12', 'Chennai', 'Coimbatore', '32', '2020-07-02 00:00:00', now()),
(4, 'TN 04 AA 1234', 'Sai Ram Travels', 750.00, '2020-07-01 18:00:00', '2020-07-02 05:00:00', '11', 'Chennai', 'Coimbatore', '35', '2020-07-02 00:00:00', now()),
(5, 'TN 05 AA 1234', 'Parveen Travels', 560.00, '2020-07-01 17:30:00', '2020-07-02 04:30:00', '1130', 'Chennai', 'Bangalore', '35', '2020-07-02 00:00:00', now()),
(6, 'TN 06 AA 1234', 'A1 Arthi Travels', 750.00, '2020-07-01 18:30:00', '2020-07-02 05:30:00', '8', 'Bangalore', 'Coimbatore', '30', '2020-07-02 00:00:00', now()),
(7, 'TN 07 AA 1234', 'Orange Travels', 560.00, '2020-07-01 17:30:00', '2020-07-02 04:30:00', '8', 'Bangalore', 'Coimbatore', '32', '2020-07-02 00:00:00', now()),
(8, 'TN 08 AA 1234', 'Orange Travels', 750.00, '2020-07-01 18:30:00', '2020-07-02 04:30:00', '10', 'Chennai', 'Bangalore', '32', '2020-07-02 00:00:00', now()),
(9, 'TN 09 AA 1234', 'Mango Travels', 560.00, '2020-07-01 21:30:00', '2020-07-02 05:30:00', '8', 'Chennai', 'Coimbatore', '30', '2020-07-02 00:00:00', now()),
(10, 'TN 10 AA 1234', 'A1 Travels', 750.00, '2020-07-01 18:30:00', '2020-07-02 06:00:00', '1130', 'Bangalore', 'Hyderabad', '30', '2020-07-02 00:00:00', now());

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bus_details`
--
ALTER TABLE `bus_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bus_details`
--
ALTER TABLE `bus_details`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
