SELECT * FROM detailsewa
SELECT * FROM JenisBiaya
SELECT * FROM penyewaan
SELECT * FROM mobil
SELECT * FROM penyewa
SELECT * FROM karyawan
SELECT * FROM merkmobil

SELECT penyewaan.`NIKPenyewa`, penyewa.`NamaPenyewa`
FROM penyewaan JOIN penyewa
ON penyewa.`NIKPenyewa`= penyewaan.`NIKPenyewa`
GROUP BY NIKPenyewa

SELECT * FROM NotaSewa
WHERE TglPesan BETWEEN "2024/04/01" AND "2024/04/30"

CREATE VIEW NotaSewa AS
SELECT penyewaan.`NoSewa`, penyewaan.`NIKPenyewa`, penyewa.`NamaPenyewa`,
karyawan.`NamaKaryawan`, penyewaan.`TglPesan`, penyewaan.`TglAmbil`,
penyewaan.`TglKembali`, detailsewa.`Nopol`, mobil.`TipeKendaraan`,
JenisBiaya.`JenisBiaya`, JenisBiaya.`Harga`, detailsewa.`TotalBayar`
FROM penyewaan 
JOIN penyewa ON penyewaan.`NIKPenyewa`= penyewa.`NIKPenyewa`
JOIN detailsewa ON penyewaan.`NoSewa` = detailsewa.`NoSewa`
JOIN karyawan ON penyewaan.`IdKaryawan`= karyawan.`IdKaryawan`
JOIN mobil ON detailsewa.`Nopol` = mobil.`Nopol`
JOIN JenisBiaya ON detailsewa.`KodeJenisBiaya` = JenisBiaya.`KodeJenisBiaya`



WHERE penyewaan.`NoSewa` = "SW000001"

-- 1
SELECT penyewaan.`NoSewa`, penyewa.`NamaPenyewa`, penyewaan.`TglAmbil`
FROM penyewaan
JOIN penyewa ON penyewaan.`NIKPenyewa` = penyewa.`NIKPenyewa`

-- 2
SELECT karyawan.`NamaKaryawan`
FROM penyewaan
JOIN karyawan ON penyewaan.`IdKaryawan` = karyawan.`IdKaryawan`
GROUP BY NamaKaryawan

-- 3
SELECT mobil.`Nopol`, mobil.`TipeKendaraan`, merkmobil.`NamaMerk`
FROM mobil
JOIN merkmobil ON mobil.`KodeMerk` = merkmobil.`KodeMerk`

-- 4
SELECT detailsewa.`NoDetail`, JenisBiaya.`JenisBiaya`, detailsewa.`TotalBayar`
FROM detailsewa
JOIN JenisBiaya ON detailsewa.`KodeJenisBiaya`= JenisBiaya.`KodeJenisBiaya`

-- 5
SELECT penyewaan.`NoSewa`, penyewa.`NamaPenyewa`, karyawan.`NamaKaryawan`
FROM penyewaan
JOIN penyewa ON penyewaan.`NIKPenyewa` = penyewa.`NIKPenyewa`
JOIN karyawan ON penyewaan.`IdKaryawan` = karyawan.`IdKaryawan`

-- 6
SELECT detailsewa.`NoDetail`, mobil.`Nopol`, mobil.`TipeKendaraan`, merkmobil.`NamaMerk`
FROM detailsewa
JOIN mobil ON detailsewa.`Nopol` = mobil.`Nopol`
JOIN merkmobil ON mobil.`KodeMerk` = merkmobil.`KodeMerk`

-- 7 
SELECT penyewaan.`NoSewa`, JenisBiaya.`KodeJenisBiaya`, JenisBiaya.`JenisBiaya`, detailsewa.`TotalBayar`
FROM detailsewa
JOIN jenisbiaya ON detailsewa.`KodeJenisBiaya` = jenisbiaya.`KodeJenisBiaya`
JOIN penyewaan ON detailsewa.`NoSewa` = penyewaan.`NoSewa`

-- 8
SELECT penyewa.`NamaPenyewa`, penyewaan.`NoSewa`, detailsewa.`NoDetail`, detailsewa.`TotalBayar`
FROM penyewaan
JOIN penyewa ON penyewaan.`NIKPenyewa` = penyewa.`NIKPenyewa`
JOIN detailsewa ON penyewaan.`NoSewa` = detailsewa.`NoSewa`

-- 9
SELECT detailsewa.`NoDetail`, mobil.`Nopol`, penyewaan.`TglAmbil`, detailsewa.`TotalBayar`
FROM detailsewa
JOIN mobil ON detailsewa.`Nopol` = mobil.`Nopol`
JOIN penyewaan ON detailsewa.`NoSewa`= penyewaan.`NoSewa`

-- 10
SELECT mobil.`Nopol`, mobil.`TipeKendaraan`, merkmobil.`NamaMerk`, detailsewa.`TotalBayar`
FROM detailsewa
JOIN mobil ON detailsewa.`Nopol` = mobil.`Nopol`
JOIN merkmobil ON mobil.`KodeMerk` = merkmobil.`KodeMerk`