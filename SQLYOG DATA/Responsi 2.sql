
-- 1
DELIMITER $$

CREATE TRIGGER Cegah_Minimal_Stok
 BEFORE UPDATE ON barang
    FOR EACH ROW 
    BEGIN
	DECLARE minimal INT;
	SELECT (minimal_stok) INTO minimal 
	FROM barang
	WHERE stok=old.stok;
	
	IF new.stok < minimal
	THEN
	signal SQLSTATE '45000'
	SET message_text = 'Stok tidak bisa dikurangi sampai minimal stok';
	END IF;

    END$$

DELIMITER ;

UPDATE barang
SET stok = 13
WHERE kode_barang = 'BRG-002'

DROP TRIGGER Cegah_minimal_stok


-- 2


DELIMITER $$
CREATE PROCEDURE Insert_Detail_Log_Update(
IN IDdet INT(11),
IN IDpeng INT(11),
IN kodeBar CHAR(20),
IN jml INT(11),
IN tgl DATE,
IN jenisTran ENUM('barang_masuk', 'pengiriman'),
IN keterang TEXT
)
BEGIN 
INSERT INTO  detail_pengiriman(`id_detail`,`id_pengiriman`,`kode_barang`,`jumlah`)
VALUES(IDdet, IDpeng, kodeBar, jml);

INSERT INTO log_stok(`kode_barang`,`tanggal`,`jenis_transaksi`,`jumlah`,`keterangan`)
values(kodeBar, tgl, jenisTran, jml, keterang);

update barang
set stok = (stokAwal - jml)
where kode_barang = kodeBar;

END $$

drop procedure `Insert_Detail_Log_Update`

delete from detail_pengiriman
where id_detail = 15

delete from log_stok
where id_log = 2

call Insert_Detail_Log_Update (15, 3, 'BRG-002', 2, '2025-06-21', 'pengiriman', 'Pengiriman alat IT untuk pembukaan kantor')


-- 3


-- 4



CREATE VIEW DataPengirimLengkap 
    AS select pengiriman.tanggal, pengiriman.tujuan, barang.nama_barang, karyawan.nama_karyawan, detail_pengiriman.jumlah
 from pengiriman
 
 join detail_pengiriman on pengiriman.id_pengiriman = detail_pengiriman.id_pengiriman
 join barang on detail_pengiriman.kode_barang = barang.kode_barang
 join detail_barang_masuk on detail_pengiriman.id_detail = detail_barang_masuk.id_detail
 join barang_masuk on detail_barang_masuk.id_barang_masuk = barang_masuk.id_barang_masuk
 join karyawan on barang_masuk.id_karyawan = karyawan.id_karyawan
 

 
 group by pengiriman.tanggal
 order by tanggal desc limit 5
