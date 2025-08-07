-- AREA SELECT --

SELECT * FROM Member
WHERE Status_Anggota = 'Aktif';


SELECT * FROM Member
WHERE Status_Anggota = 'Tidak Aktif';


SELECT Nama_Paket, Harga_Paket
FROM Daftar_Paket
WHERE Harga_Paket > 100000;


-- AREA JOIN --

SELECT transaksi.`ID_Transaksi`, member.`ID_Anggota`, member.`Nama_Pelanggan`, transaksi.`Nama_Paket`, transaksi.`Tanggal`, transaksi.`Jml_Bayar`
FROM transaksi
JOIN Member ON transaksi.`ID_Anggota`= member.`ID_Anggota`;


SELECT sesi.`ID_Sesi`, client.`Nama_Client`, personal_trainer.`Nama_PT`, sesi.`Tanggal`, sesi.`Ket_Lat`
FROM sesi  
JOIN CLIENT ON sesi.`ID_Client` = client.`ID_Client`
JOIN Personal_Trainer ON sesi.`ID_PT` = personal_trainer.`ID_PT`;


-- AREA VIEW --

CREATE VIEW Transaksi_Insidental
AS (SELECT * FROM Transaksi
WHERE Nama_Paket = 'Insidental');

SELECT * FROM transaksi_insidental;


CREATE VIEW Transaksi_Client
AS (SELECT * FROM Transaksi
WHERE ID_Anggota IS NULL AND ID_Client IS NOT NULL);

SELECT * FROM transaksi_client;


CREATE VIEW Transaksi_Member
AS (SELECT * FROM Transaksi
WHERE ID_Client IS  NULL AND ID_Anggota IS NOT NULL);

SELECT * FROM transaksi_member;


-- AREA STORED PROCEDURE --

DELIMITER$$

CREATE PROCEDURE Cari_Anggota_ByJenis(
    IN jenis ENUM('Umum', 'Pria Mhs', 'Wanita')
)
BEGIN
    SELECT ID_Anggota, Nama_Pelanggan, Alamat, Status_Anggota
    FROM Member
    WHERE Jenis_Pelanggan = jenis;
END$$

DELIMITER ;

CALL Cari_Anggota_ByJenis('Pria Mhs');



DELIMITER$$

CREATE PROCEDURE Laporan_Pendapatan_Bulanan(
    IN bulan INT,
    IN tahun INT
)
BEGIN
    SELECT SUM(Jml_Bayar) AS Total_Pendapatan
    FROM Transaksi
    WHERE MONTH(Tanggal) = bulan AND YEAR(Tanggal) = tahun;
END$$

DELIMITER ;

CALL Laporan_Pendapatan_Bulanan(4, 2025);


-- AREA	TRIGGER --

DELIMITER$$

CREATE TRIGGER backup_after_insert_transaksi
AFTER INSERT ON Transaksi
FOR EACH ROW
BEGIN
    INSERT INTO backup_transaksi (
        ID_Backup, ID_Transaksi, ID_Anggota, ID_Client, Nama_Paket, Tanggal, Jml_Bayar)
    VALUES (
        CONCAT('B', NEW.ID_Transaksi), 
        NEW.ID_Transaksi, NEW.ID_Anggota, NEW.ID_Client, NEW.Nama_Paket,
        NEW.Tanggal, NEW.Jml_Bayar
    );
END$$

DELIMITER ;

DROP TRIGGER backup_after_insert_transaksi

INSERT INTO Transaksi (ID_Transaksi, ID_Anggota, ID_Client, Nama_Paket, Tanggal, Jml_Bayar)
VALUES ('T438', NULL, NULL, 'Insidental', '2025-03-11', 25000)

INSERT INTO Transaksi (ID_Transaksi, ID_Anggota, ID_Client, Nama_Paket, Tanggal, Jml_Bayar)
VALUES ('T439', NULL, NULL, 'Insidental', '2025-03-11', 25000)



DELIMITER$$

CREATE TRIGGER gagalkan_delete_PT_Aktif
BEFORE DELETE ON Personal_Trainer
FOR EACH ROW
BEGIN
    DECLARE jumlah_sesi INT;
    SELECT COUNT(*) INTO jumlah_sesi FROM Sesi WHERE ID_PT = OLD.ID_PT;
    IF jumlah_sesi > 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Tidak dapat menghapus trainer yang masih memiliki sesi aktif.';
    END IF;
END$$

DELIMITER ;

DELETE FROM personal_Trainer
WHERE ID_PT = 'PT030'

-- AREA FUNCTION --

DELIMITER$$

CREATE FUNCTION Hitung_Pendapatan_ByPaket(
    kode_paket_input CHAR(8)
)
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE total_pendapatan INT;

    SELECT SUM(Jml_Bayar) INTO total_pendapatan
    FROM Detail_Transaksi
    WHERE Kode_Paket = kode_paket_input;


    RETURN IFNULL(total_pendapatan, 0);
END$$

DELIMITER ;


SELECT
    Kode_Paket, Nama_Paket, Harga_Paket, Hitung_Pendapatan_ByPaket(Kode_Paket) AS Total_Pendapatan_Dihasilkan
FROM Daftar_Paket
ORDER BY
    Total_Pendapatan_Dihasilkan DESC;