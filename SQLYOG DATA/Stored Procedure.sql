-- QUERY PEMBENTUKAN STORED PROCEDURE
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `transaksisewa`(
IN NoTransaksi CHAR(8),
IN NIK CHAR(16),
IN Idk CHAR(8),
IN Pesan DATE,
IN total INT,
IN ND CHAR(8),
IN Nopol  CHAR(9),
IN Jb CHAR(5),
IN Durasi SMALLINT,
IN Ambil DATE,
IN Kembali DATE,
IN P_extend SMALLINT,
IN subttl INT
)
BEGIN

INSERT INTO penyewaan (NoSewa,NIKPenyewa,IdKaryawan,TglPesan,TotalBayar)
VALUES (NoTransaksi, NIK, Idk, Pesan, NULL);

INSERT INTO detailsewa (NoDetail,NoSewa,Nopol,KodeJenisBiaya,
LamaSewa,TglAmbil, TglKembali,Extend,SubTotal)
VALUES (ND,NoTransaksi, Nopol, Jb, Durasi,Ambil,Kembali, NULL, NULL);

END$$

DELIMITER ;



-- QUERY PEMANGGILAN STORED PROCEDURE
CALL transaksisewa(
  'SW00009',             -- NoTransaksi
  '3201010101010005',     -- NIK
  'KR000002',             -- Idk (ID Karyawan)
  '2025-05-21',           -- Pesan (TglPesan)
  NULL,                   -- total (diabaikan, akan NULL)
  'SD0009',               -- ND (NoDetail)
  'AB1122WX',             -- Nopol
  'JB001',                -- Jb (KodeJenisBiaya)
  3,                      -- Durasi (LamaSewa)
  '2025-05-22',           -- Ambil (TglAmbil)
  '2025-05-23',           -- Kembali (TglKembali)
  NULL,                   -- P_extend (NULL)
  NULL                    -- subttl (NULL)
);
