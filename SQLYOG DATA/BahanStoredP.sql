-- NO 1

START TRANSACTION
DELIMITER $$
CREATE PROCEDURE pindah_detailsewa()
BEGIN
INSERT INTO backupdetailsewa (NoSewa, Nopol, KodeJenisBiaya, LamaSewa,TglAmbil,
TglKembali, Extend, SubTotal)
SELECT NoSewa, Nopol, KodeJenisBiaya, LamaSewa,TglAmbil,
TglKembali, Extend, SubTotal FROM detailsewa;

END $$

CALL pindah_detailsewa()


SELECT * FROM detailsewa

ALTER TABLE
DELETE FROM backupdetailsewa
WHERE NoSewa = 'SW00009'


-- NO 2

DELIMITER $$
CREATE PROCEDURE hapus_mobil(
IN kode INT(11)
)
BEGIN
DELETE FROM mobil WHERE KodeMerk = kode;
DELETE FROM merkmobil WHERE KodeMerk = kode;

END $$

CALL hapus_mobil(10)


-- NO 3

DELIMITER $$
CREATE PROCEDURE gantiIDK(
IN IDSewa CHAR(8),
IN IDKar CHAR(8)
)
BEGIN 
UPDATE penyewaan
SET IdKaryawan = IDKar
WHERE NoSewa = IDSewa;
END $$

CALL gantiIDK('SW00009','KR000001')








-- bahan
INSERT  INTO `mobil`(`Nopol`,`KodeMerk`,`TipeKendaraan`,`ThnBuat`,`Warna`,`HargaBeli`) VALUES 
('AB6321YK',9,'Porsche 718 Cayman',2020,'Merah',1795000000),
('AB1000BJ',9,'Porsche 718 Boxster',2018,'Hitam',180000000)

INSERT  INTO `merkmobil`(`KodeMerk`,`NamaMerk`) VALUES 
(10,'BMW')