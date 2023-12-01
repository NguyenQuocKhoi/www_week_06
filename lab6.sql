-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               11.1.2-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table lab6.post: ~7 rows (approximately)
INSERT INTO `post` (`published`, `author_id`, `created_at`, `id`, `parent_id`, `published_at`, `updated_at`, `title`, `meta_title`, `content`, `summary`) VALUES
	(b'1', 3, '2023-11-17 12:30:00.000000', 9, NULL, '2023-11-17 12:30:00.000000', NULL, 'Lap trinh www', 'Meta Title 5', 'Content 5', 'Summary 5'),
	(b'1', 4, '2023-11-17 13:45:00.000000', 10, NULL, '2023-11-17 13:45:00.000000', NULL, 'Lap trinh di dong', 'Meta Title 6', 'Content 6', 'Summary 6'),
	(b'1', 3, '2023-11-17 12:30:00.000000', 11, NULL, '2023-11-17 12:30:00.000000', NULL, 'Nhap mon lap trinh', 'Meta Title 7', 'Content 7', 'Summary 7'),
	(b'1', 4, '2023-11-17 13:45:00.000000', 12, NULL, '2023-11-17 13:45:00.000000', NULL, 'Ky thua lap trinh', 'Meta Title 8', 'Content 8', 'Summary 8'),
	(b'1', 5, '2023-11-17 12:30:00.000000', 13, NULL, '2023-11-17 12:30:00.000000', NULL, 'Lap trinh www', 'Meta Title 9', 'Content 9', 'Summary 9'),
	(b'1', 6, '2023-11-17 13:45:00.000000', 14, NULL, '2023-11-17 13:45:00.000000', NULL, 'Lap trinh di dong', 'Meta Title 10', 'Content 10', 'Summary 10'),
	(b'0', 3, '2023-11-29 13:49:03.245259', 15, NULL, '2023-11-29 13:49:03.245259', '2023-11-29 13:49:03.245259', 'daaa', 'aaa', 'aaaa', 'aaaa');

-- Dumping data for table lab6.post_comment: ~4 rows (approximately)
INSERT INTO `post_comment` (`published`, `created_at`, `id`, `parent_id`, `post_id`, `published_at`, `user_id`, `title`, `content`) VALUES
	(b'1', '2023-11-17 12:30:00.000000', 13, NULL, 10, '2023-11-17 12:36:00.000000', 3, 'Comment Title 9', 'Comment Content 9'),
	(b'1', '2023-11-17 13:45:00.000000', 14, NULL, 10, '2023-11-17 13:48:00.000000', 3, 'Comment Title 8', 'Comment Content 8'),
	(b'1', '2023-11-17 12:30:00.000000', 15, NULL, 10, '2023-11-17 12:36:00.000000', 6, 'Comment Title 9', 'Comment Content 9'),
	(b'1', '2023-11-17 13:45:00.000000', 16, NULL, 10, '2023-11-17 13:48:00.000000', 5, 'Comment Title 8', 'Comment Content 8');

-- Dumping data for table lab6.user: ~7 rows (approximately)
INSERT INTO `user` (`id`, `last_login`, `registered_at`, `mobile`, `password_hash`, `email`, `first_name`, `last_name`, `middle_name`, `intro`, `profile`) VALUES
	(3, '2023-11-17 12:30:00.000000', '2023-11-01 08:00:00.000000', '1234567890', 'hash1', 'user1@email.com', 'John', 'Doe', NULL, 'Introduction 1', 'Profile 1'),
	(4, '2023-11-17 13:45:00.000000', '2023-11-02 09:15:00.000000', '9876543210', 'hash2', 'user2@email.com', 'Jane', 'Smith', NULL, 'Introduction 2', 'Profile 2'),
	(5, '2023-11-18 13:45:00.000000', '2023-11-02 09:15:00.000000', '9876543218', 'hash2', 'user3@email.com', 'Jackson', 'Smith', NULL, 'Introduction 3', 'Profile 3'),
	(6, '2023-11-18 13:45:00.000000', '2023-11-02 09:15:00.000000', '9876543217', 'hash5', 'user4@email.com', 'John', 'Smith', NULL, 'Introduction 3', 'Profile 3'),
	(7, '2023-11-29 13:26:38.465342', '2023-11-29 13:26:38.465342', '222', '222', 'email_1@gmail.com', '222', '222', '222', '222', ''),
	(8, '2023-11-29 13:26:47.860345', '2023-11-29 13:26:47.860345', '222', '222', 'khoi@gmail.com', '222', '222', '222', '222', ''),
	(9, '2023-11-29 13:31:21.298986', '2023-11-29 13:31:21.298986', '313131', '3131', 'khoi1@gmail.com', '31313', '3131', '11313', '3131', '3131');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
