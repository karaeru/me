-- 1

DELIMITER$$

CREATE FUNCTION TotalLamaSewa(NoSewaDulu CHAR(8))
RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE TotalLama INT;
	
	SELECT SUM(LamaSewa)
	INTO TotalLama
	FROM detailsewa
	WHERE NoSewa = NoSewaDulu;
	RETURN IFNULL(TotalLama, 0);
END$$


SELECT TotalLamaSewa('SW000001')

-- 2

DELIMITER$$

CREATE FUNCTION totalBayarKaryawan (KaryawanId CHAR(8))
RETURNS INT
DETERMINISTIC

BEGIN
DECLARE total INT;

SELECT SUM(TotalBayar) INTO total
FROM penyewaan

WHERE `IdKaryawan` = KaryawanId;
RETURN IFNULL(total, 0);

END$$

SELECT totalBayarKaryawan('KR000002')


-- 3

SELECT 
penyewa.NIKPenyewa, penyewa.NamaPenyewa,
penyewaan.NoSewa, detailsewa.NoDetail
FROM detailsewa
JOIN penyewaan ON detailsewa.NoSewa = penyewaan.NoSewa
JOIN penyewa ON penyewaan.NIKPenyewa = penyewa.NIKPenyewa
WHERE penyewa.NamaPenyewa = "Eka Putri"



-- 4

SELECT
penyewa.NamaPenyewa, penyewa.`NIKPenyewa`,
MAX(detailsewa.SubTotal) AS Transaksi
FROM detailsewa
JOIN penyewaan ON detailsewa.NoSewa = penyewaan.NoSewa
JOIN penyewa ON penyewaan.NIKPenyewa = penyewa.NIKPenyewa
GROUP BY penyewa.NamaPenyewa 
ORDER BY Transaksi DESC LIMIT 1

