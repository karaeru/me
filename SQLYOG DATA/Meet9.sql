/*Table structure for table `jenisbiaya` */
DROP TABLE IF EXISTS `jenisbiaya`;

CREATE TABLE `jenisbiaya` (
  `KodeJenisBiaya` CHAR(5) NOT NULL,
  `JenisBiaya` VARCHAR(40) NOT NULL,
  `Harga` INT DEFAULT NULL,
  PRIMARY KEY (`KodeJenisBiaya`)
);

/*Data for the table `jenisbiaya` */

INSERT  INTO `jenisbiaya`(`KodeJenisBiaya`,`JenisBiaya`,`Harga`) VALUES 
('JB001','Sewa Harian',350000),
('JB002','Sewa Mingguan',2000000),
('JB003','Sewa Bulanan',7500000),
('JB004','Supir Per Hari',150000);

/*Table structure for table `karyawan` */

DROP TABLE IF EXISTS `karyawan`;

CREATE TABLE `karyawan` (
  `IdKaryawan` CHAR(8) NOT NULL,
  `NamaKaryawan` VARCHAR(48) NOT NULL,
  `JenisKelamin` ENUM('Pria','Wanita') NOT NULL,
  `NoHP` VARCHAR(16) NOT NULL,
  `Alamat` VARCHAR(128) DEFAULT NULL,
  PRIMARY KEY (`IdKaryawan`)
);

/*Data for the table `karyawan` */

INSERT  INTO `karyawan`(`IdKaryawan`,`NamaKaryawan`,`JenisKelamin`,`NoHP`,`Alamat`) VALUES 
('KR000001','Ahmad Fauzi','Pria','081234567801','Jl. Merdeka No. 10, Jakarta'),
('KR000002','Siti Nurhaliza','Wanita','082145678902','Jl. Kartini No. 5, Bandung'),
('KR000003','Bambang Hartono','Pria','083156789012','Jl. Gajah Mada No. 7, Surabaya'),
('KR000004','Dewi Lestari','Wanita','084167890123','Jl. Diponegoro No. 11, Yogyakarta'),
('KR000005','Eko Prasetyo','Pria','085178901234','Jl. Sudirman No. 9, Semarang'),
('KR000006','Fitri Handayani','Wanita','086189012345','Jl. Ahmad Yani No. 3, Medan'),
('KR000007','Guntur Wijaya','Pria','087190123456','Jl. Pemuda No. 14, Palembang'),
('KR000008','Hani Wulandari','Wanita','088201234567','Jl. Dr. Soetomo No. 6, Malang');

/*Table structure for table `merkmobil` */

DROP TABLE IF EXISTS `merkmobil`;

CREATE TABLE `merkmobil` (
  `KodeMerk` INT NOT NULL AUTO_INCREMENT,
  `NamaMerk` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`KodeMerk`)
);

/*Data for the table `merkmobil` */

INSERT  INTO `merkmobil`(`KodeMerk`,`NamaMerk`) VALUES 
(1,'Toyota'),
(2,'Honda'),
(3,'Suzuki'),
(4,'Mitsubishi'),
(5,'Nissan'),
(6,'Daihatsu'),
(7,'Mazda'),
(8,'Hyundai');

/*Table structure for table `mobil` */

DROP TABLE IF EXISTS `mobil`;

CREATE TABLE `mobil` (
  `Nopol` CHAR(9) NOT NULL,
  `KodeMerk` INT NOT NULL,
  `TipeKendaraan` VARCHAR(64) NOT NULL,
  `ThnBuat` YEAR NOT NULL,
  `Warna` CHAR(8) DEFAULT NULL,
  `HargaBeli` INT DEFAULT NULL,
  PRIMARY KEY (`Nopol`),
  KEY `KodeMerk_idx` (`KodeMerk`),
  CONSTRAINT `KodeMerk` FOREIGN KEY (`KodeMerk`) REFERENCES `merkmobil` (`KodeMerk`)
);

/*Data for the table `mobil` */

INSERT  INTO `mobil`(`Nopol`,`KodeMerk`,`TipeKendaraan`,`ThnBuat`,`Warna`,`HargaBeli`) VALUES 
('AB0123UV',2,'Honda Mobilio E CVT',2018,'Abu',215000000),
('AB1122WX',3,'Suzuki Ignis GX',2020,'Kuning',175000000),
('AB1234CD',1,'Avanza 1.3 G MT',2020,'Hitam',210000000),
('AB2233YZ',4,'Mitsubishi Outlander',2021,'Merah',355000000),
('AB2345EF',2,'Brio Satya E CVT',2021,'Putih',180000000),
('AB3344AA',5,'Nissan Serena HWS',2019,'Hitam',420000000),
('AB3456GH',3,'Ertiga GX MT',2019,'Abu',195000000),
('AB4455BB',6,'Daihatsu Terios R',2022,'Silver',260000000),
('AB4567IJ',4,'Xpander Ultimate AT',2022,'Silver',265000000),
('AB5566CC',7,'Mazda CX-3 Touring',2023,'Putih',390000000),
('AB5678KL',5,'Livina EL AT',2020,'Merah',240000000),
('AB6789MN',6,'Sigra R MT',2021,'Putih',150000000),
('AB7890OP',7,'Mazda 2 GT',2023,'Biru',310000000),
('AB8901QR',8,'Hyundai Stargazer Prime',2022,'Hitam',295000000),
('AB9012ST',1,'Toyota Rush TRD',2019,'Putih',245000000);

/*Table structure for table `penyewa` */

DROP TABLE IF EXISTS `penyewa`;

CREATE TABLE `penyewa` (
  `NIKPenyewa` CHAR(16) NOT NULL,
  `NamaPenyewa` VARCHAR(64) NOT NULL,
  `AlamatPenyewa` VARCHAR(128) NOT NULL,
  `NoHpPenyewa` VARCHAR(16) NOT NULL,
  PRIMARY KEY (`NIKPenyewa`)
);

/*Data for the table `penyewa` */

INSERT  INTO `penyewa`(`NIKPenyewa`,`NamaPenyewa`,`AlamatPenyewa`,`NoHpPenyewa`) VALUES 
('3201010101010001','Andi Wijaya','Jl. Melati No. 10, Bandung','081234567890'),
('3201010101010002','Budi Santoso','Jl. Kenanga No. 5, Jakarta','082112345678'),
('3201010101010003','Citra Lestari','Jl. Mawar No. 7, Surabaya','085623456789'),
('3201010101010004','Dedi Pratama','Jl. Flamboyan No. 3, Yogyakarta','081298765432'),
('3201010101010005','Eka Putri','Jl. Anggrek No. 12, Semarang','082233445566'),
('3201010101010006','Fajar Nugroho','Jl. Dahlia No. 2, Medan','083344556677'),
('3201010101010007','Gina Rahmawati','Jl. Teratai No. 14, Palembang','085211122233'),
('3201010101010008','Hendra Saputra','Jl. Cendana No. 6, Malang','081355566677');

/*Table structure for table `penyewaan` */

DROP TABLE IF EXISTS `penyewaan`;

CREATE TABLE `penyewaan` (
  `NoSewa` CHAR(8) NOT NULL,
  `NIKPenyewa` CHAR(16) NOT NULL,
  `IdKaryawan` CHAR(8) DEFAULT NULL,
  `TglPesan` DATE NOT NULL,
  `TotalBayar` INT DEFAULT NULL,
  PRIMARY KEY (`NoSewa`),
  KEY `IdKaryawan_idx` (`IdKaryawan`),
  CONSTRAINT `IdKaryawan` FOREIGN KEY (`IdKaryawan`) REFERENCES `karyawan` (`IdKaryawan`)
);

/*Data for the table `penyewaan` */

INSERT  INTO `penyewaan`(`NoSewa`,`NIKPenyewa`,`IdKaryawan`,`TglPesan`,`TotalBayar`) VALUES 
('SW000001','3201010101010001','KR000001','2024-03-31',1400000),
('SW000002','3201010101010002','KR000002','2024-04-03',350000),
('SW000003','3201010101010003','KR000003','2025-04-01',350000),
('SW000004','3201010101010004','KR000004','2025-04-27',2000000),
('SW000005','3201010101010005','KR000005','2024-04-10',1400000);

/*Table structure for table `detailsewa` */

DROP TABLE IF EXISTS `detailsewa`;
CREATE TABLE `detailsewa` (
  `NoDetail` CHAR(8) NOT NULL,
  `NoSewa` CHAR(8) DEFAULT NULL,
  `Nopol` CHAR(9) DEFAULT NULL,
  `KodeJenisBiaya` CHAR(5) DEFAULT NULL,
  `LamaSewa` SMALLINT DEFAULT NULL,
  `TglAmbil` DATE DEFAULT NULL,
  `TglKembali` DATE DEFAULT NULL,
  `Extend` SMALLINT DEFAULT NULL,
  `SubTotal` INT DEFAULT NULL,
  PRIMARY KEY (`NoDetail`),
  KEY `NoSewa_idx` (`NoSewa`),
  KEY `Nopol_idx` (`Nopol`),
  KEY `KodeJenisBiaya_idx` (`KodeJenisBiaya`),
  CONSTRAINT `KodeJenisBiaya` FOREIGN KEY (`KodeJenisBiaya`) REFERENCES `jenisbiaya` (`KodeJenisBiaya`),
  CONSTRAINT `Nopol` FOREIGN KEY (`Nopol`) REFERENCES `mobil` (`Nopol`),
  CONSTRAINT `NoSewa` FOREIGN KEY (`NoSewa`) REFERENCES `penyewaan` (`NoSewa`)
);

/*Data for the table `detailsewa` */

INSERT  INTO `detailsewa`(`NoDetail`,`NoSewa`,`Nopol`,`KodeJenisBiaya`,`LamaSewa`,`TglAmbil`,`TglKembali`,`Extend`,`SubTotal`) VALUES 
('DTL001','SW000001','AB0123UV','JB001',2,'2025-04-19','2025-04-21',NULL,700000),
('DTL002','SW000001','AB1234CD','JB001',2,'2025-04-19','2025-04-21',NULL,700000),
('DTL003','SW000002','AB2345EF','JB001',1,'2025-04-29','2025-04-29',NULL,350000),
('DTL004','SW000003','AB2233YZ','JB001',1,'2025-04-01','2025-05-09',NULL,350000),
('DTL005','SW000004','AB9012ST','JB002',7,'2025-04-27','2025-05-03',NULL,2000000),
('DTL006','SW000005','AB6789MN','JB001',1,'2025-05-05','2025-05-06',NULL,350000),
('DTL007','SW000005','AB4567IJ','JB001',1,'2025-05-05','2025-05-05',NULL,350000),
('DTL008','SW000005','AB7890OP','JB001',2,'2025-05-05','2025-05-07',NULL,700000);

DESC backupdetailsewa

DROP TABLE IF EXISTS `backupdetailsewa`;

CREATE TABLE `backupdetailsewa` (
   NoDetail CHAR(8) PRIMARY KEY,
  `NoSewa` CHAR(8) DEFAULT NULL,
  `Nopol` CHAR(9) DEFAULT NULL,
  `KodeJenisBiaya` CHAR(5) DEFAULT NULL,
  `LamaSewa` SMALLINT DEFAULT NULL,
  `TglAmbil` DATE DEFAULT NULL,
  `TglKembali` DATE DEFAULT NULL,
  `Extend` SMALLINT DEFAULT NULL,
  `SubTotal` INT DEFAULT NULL,
  KEY `NoSewa` (`NoSewa`),
  KEY `Nopol` (`Nopol`),
  KEY `KodeJenisBiaya` (`KodeJenisBiaya`),
  CONSTRAINT `backupdetailsewa_ibfk_1` FOREIGN KEY (`NoSewa`) REFERENCES `penyewaan` (`NoSewa`),
  CONSTRAINT `backupdetailsewa_ibfk_2` FOREIGN KEY (`Nopol`) REFERENCES `mobil` (`Nopol`),
  CONSTRAINT `backupdetailsewa_ibfk_3` FOREIGN KEY (`KodeJenisBiaya`) REFERENCES `jenisbiaya` (`KodeJenisBiaya`)
);

/*Data for the table `backupdetailsewa` */


SELECT COUNT(nopol) AS JumlahMobil
FROM mobil

SELECT SUM(HargaBeli) AS totalharga
FROM mobil

SELECT * FROM penyewaan

SELECT penyewa.`NamaPenyewa`, COUNT(penyewaan.`NIKPenyewa`) AS totalsewa
FROM penyewa 
JOIN penyewaan ON penyewa.`NIKPenyewa` = penyewaan.`NIKPenyewa`
WHERE NamaPenyewa = 'Citra Lestari'

SELECT karyawan.`NamaKaryawan`, penyewaan.`NoSewa`, penyewaan.`TglPesan`,
SUM(TotalBayar) AS TotalNilaiTransaksi
FROM penyewaan
JOIN karyawan ON penyewaan.`IdKaryawan` = karyawan.`IdKaryawan`
WHERE TglPesan = "2024-04-10" AND NamaKaryawan = "Eko Prasetyo"



DESC backupdetailsewa

DROP TABLE IF EXISTS backupdetailsewa



DELIMITER $$
CREATE PROCEDURE backupdetail(
ND CHAR(8)
)
BEGIN
INSERT INTO backupdetailsewa 
SELECT * FROM detailsewa WHERE NoDetail = ND;

DELETE FROM detailsewa WHERE NoDetail = ND;
END $$

CALL bakcupdetail('SD0009')

DROP PROCEDURE bakcupdetail

DELETE FROM backupdetailsewa WHERE NoDetail = 'SD0009'