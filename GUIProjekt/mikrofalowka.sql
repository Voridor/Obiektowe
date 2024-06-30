-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Cze 30, 2024 at 03:09 PM
-- Wersja serwera: 10.4.32-MariaDB
-- Wersja PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mikrofalowka`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `jedzenie`
--

CREATE TABLE `jedzenie` (
  `id` int(11) NOT NULL,
  `nazwa` varchar(45) NOT NULL,
  `optymalnyczasgotowania` time NOT NULL,
  `czas_+-` time NOT NULL,
  `temperatura` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jedzenie`
--

INSERT INTO `jedzenie` (`id`, `nazwa`, `optymalnyczasgotowania`, `czas_+-`, `temperatura`) VALUES
(1, 'pizza', '00:05:00', '00:00:30', 200),
(2, 'rosół', '00:10:00', '00:00:30', 200),
(3, 'pierogi', '00:05:00', '00:00:05', 250);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `jedzenie`
--
ALTER TABLE `jedzenie`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`),
  ADD UNIQUE KEY `Nazwa_UNIQUE` (`nazwa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jedzenie`
--
ALTER TABLE `jedzenie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
