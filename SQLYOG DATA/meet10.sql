CREATE TABLE Log_Penyewa(
LogID INT AUTO_INCREMENT PRIMARY KEY,
IDKaryawan CHAR(8),
Aktivitas VARCHAR(20),
TanggalAktivitas DATE,
NoSewa CHAR(8)
);



DELIMITER$$
CREATE TRIGGER Log_Tambah_Aktivitas_Penyewaan
AFTER INSERT ON penyewaan
FOR EACH ROW

BEGIN
INSERT INTO Log_Penyewaan(IDKaryawan, Aktivitas, TanggalAktivitas, NoSewa)
VALUES (new.idkaryawan, "Tambah Transaksi", NOW(), new.nosewa);

END$$


DELIMITER$$
CREATE TRIGGER Log_Hapus_Aktivitas_Penyewaan
AFTER DELETE ON penyewaan
FOR EACH ROW

BEGIN
INSERT INTO Log_Penyewaan(IDKaryawan, Aktivitas, TanggalAktivitas, NoSewa)
VALUES (old.idkaryawan, "Hapus Transaksi", NOW(), old.nosewa);

END$$

-- 1
DELIMITER$$
CREATE TRIGGER Subtotal_Otomatis
BEFORE INSERT ON detailsewa
FOR EACH ROW

BEGIN
INSERT INTO COLUMN subtotal

END$$

-- 2

DELIMITER$$
CREATE TRIGGER MobilDuplicate
BEFORE INSERT ON detailsewa
FOR EACH ROW

BEGIN
DECLARE mobil_exist INT;
SELECT COUNT(nopol) INTO mobil_exist
FROM detailsewa
WHERE Nopol = new.nopol AND TglAmbil = new.TglAmbil;
IF mobil_exist = 1 THEN
signal SQLSTATE '45000'
SET message_text = 'Mobil sudah disewa pada tanggal tersebut';
END IF;
END$$

DROP TRIGGER MobilDuplicate

INSERT INTO detailsewa(NoDetail,NoSewa,Nopol,KodeJenisBiaya,LamaSewa,
TglAmbil,TglKembali,Extend,SubTotal)
VALUES('DTL001','SW000001','AB0123UV','JB001',2,'2025-04-19','2025-04-21',NULL,700000);


-- 3
DELIMITER$$
CREATE TRIGGER Pesan_Berhasil
AFTER INSERT INTO penyewaan
FOR EACH ROW

BEGIN
signal SQLSTATE '45000'
SET message_text = 'Data Penyewaan berhasil ditambahkan oleh karyawan';

