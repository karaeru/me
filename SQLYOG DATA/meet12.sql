DELIMITER $$

CREATE FUNCTION HitungSubtotal (NoSewaInput CHAR(8))
RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE total INT;
	
	SELECT SUM(SubTotal)
	INTO total
	FROM detailsewa
	WHERE NoSewa = NoSewaInput;
	RETURN IFNULL(total, 0);
END$$

SELECT HitungSubtotal('SW000001') AS SubTotal

DELIMITER //

CREATE FUNCTION totalmobilsewa(NIKPenyewaInput CHAR(16))
    RETURNS INT
    DETERMINISTIC
    BEGIN
    DECLARE TotalMobil INT;
    SELECT COUNT(*) INTO TotalMobil
    FROM detailsewa
	JOIN penyewaan ON detailsewa.`NoSewa` = penyewaan.`NoSewa`
    
    WHERE penyewaan.`NIKPenyewa`= NIKPenyewaInput;
	RETURN TotalMobil;
    END//


DELIMITER;

SELECT totalmobilsewa(3201010101010003) AS total


SELECT 
detailsewa.NoDetail, detailsewa.NoSewa,detailsewa.Nopol, mobil.TipeKendaraan,
detailsewa.TglAmbil, detailsewa.TglKembali, jenisbiaya.JenisBiaya, jenisbiaya.Harga,
detailsewa.LamaSewa, detailsewa.SubTotal,
	(SELECT HitungSubtotal (detailsewa2.NoSewa) 
	 FROM detailsewa AS detailsewa2 
	 WHERE detailsewa2.NoSewa = detailsewa.NoSewa 
	 LIMIT 1) AS TotalPerSewa_Function

FROM
	detailsewa
JOIN mobil ON detailsewa.Nopol = mobil.Nopol
JOIN jenisbiaya ON detailsewa.KodeJenisBiaya = jenisbiaya.KodeJenisBiaya
ORDER BY detailsewa.NoSewa, detailsewa.NoDetail;



SELECT Nopol, TipeKendaraan, HargaBeli
FROM mobil
WHERE HargaBeli >
(SELECT AVG(HargaBeli)FROM mobil)


SELECT NoSewa
FROM detailsewa
	(SELECT SUM(LamaSewa)FROM detailsewa)