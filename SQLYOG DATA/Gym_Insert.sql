INSERT INTO Member(ID_Anggota, Nama_Pelanggan, Jenis_Pelanggan, Alamat, Status_Anggota)
VALUES('M0765', 'Devan', 'Pria Mhs', 'Cebongan', 'Aktif'),
('M0822', 'Oliv', 'Wanita', 'Sinduadi', 'Aktif'),
('M0920', 'Qonita Nur', 'Wanita', 'Jombor', 'Aktif'),
('M0812', 'Fahmi', 'Pria Mhs', 'Jl. Jambon', 'Aktif'),
('M0843', 'Rizal', 'Pria Mhs', 'Jl. Magelang', 'Aktif'),
('M0659', 'Janu', 'Umum', 'Jl. Kebon Agung', 'Aktif'),
('M0823', 'Aji Adi', 'Pria Mhs', 'Bantul', 'Aktif'),
('M0498', 'Alisa','Wanita', 'Mlati', 'Tidak Aktif'),
('M0946', 'Pandu', 'Pria Mhs', 'Trihanggo', 'Aktif'),
('M0922', 'Dillah', 'Wanita', 'Jambon', 'Aktif'),
('M0941', 'Vivi', 'Wanita', 'Trihanggo', 'Aktif'),
('M0874', 'Rahayu', 'Wanita', 'Jl. Magelang', 'Aktif'),
('M0732', 'Angga', 'Umum', 'Plaosan RT.4', 'Tidak Aktif');


INSERT INTO CLIENT(ID_Client, Nama_Client, Nama_PT) 
VALUES ('CL001', 'Wijaya', 'Aryo'),
('CL002', 'Hendrawan', 'Aryo'),
('CL003', 'Alif', 'Monica'),
('CL004', 'Karina', 'Monica'),
('CL005', 'Bayu', 'Aryo'),
('CL006', 'Rina', 'Monica');


INSERT INTO Personal_Trainer(ID_PT, Nama_PT, Spesialis)
VALUES ('PT030', 'Aryo', 'Otot'),
('PT031', 'Monica', 'Bakar Lemak'),
('PT032', 'Ayu', 'Lower Body'),
('PT033', 'Putra', 'Bakar Lemak');


INSERT INTO Daftar_Paket(Kode_Paket, Nama_Paket, Durasi_Paket, Harga_Paket) 
VALUES ('P001', 'Paket Bulanan Pria Mhs', '1 Bulan', 130000),
('P002', 'Paket Bulanan Wanita', '1 Bulan', 80000),
('P003', 'Insidental', 'Harian', 25000),
('P004', 'Umum', '1 Bulan', 140000),
('P005', 'Visit Wanita', 'Harian', 15000),
('P006', 'Visit Mhs', 'Harian', 17000),
('P007', 'Visit Pria', 'Harian', 20000),
('P008', 'Personal Trainer', '4x Pertemuan', 450000);


INSERT INTO Transaksi (ID_Transaksi, ID_Anggota, ID_Client, Nama_Paket, Tanggal, Jml_Bayar)
VALUES ('T411', 'M0765', NULL, 'Bulanan Pria Mhs', '2025-03-10', 130000),
('T412', NULL, NULL, 'Insidental', '2025-03-10', 25000),
('T413', NULL, NULL, 'Insidental', '2025-03-17', 25000),
('T414', NULL, NULL, 'Insidental', '2025-03-17', 25000),
('T415', 'M0920', NULL, 'Bulanan Wanita', '2025-03-19', 80000),
('T416', 'M0812', NULL, 'Bulanan Pria Mhs', '2025-03-20', 130000),
('T417', 'M0843', NULL, 'Bulanan Pria Mhs', '2025-03-25', 130000),
('T418', NULL, NULL, 'Insidental', '2025-03-25', 25000),
('T419', 'M0659', NULL, 'Bulanan Umum', '2025-04-06', 140000),
('T420', NULL, NULL, 'Insidental', '2025-04-08', 25000),
('T421', 'M0823', NULL, 'Bulanan Pria Mhs', '2025-04-10', 130000),
('T422', 'M0946', NULL, 'Bulanan Pria Mhs', '2025-04-14', 130000),
('T423', 'M0922', NULL, 'Bulanan Wanita', '2025-04-20', 80000),
('T425', NULL, NULL, 'Insidental', '2025-04-24', 25000),
('T426', NULL, NULL, 'Insidental', '2025-04-25', 25000),
('T427', 'M0941', NULL, 'Bulanan Wanita', '2025-04-30', 80000),
('T428', NULL, NULL, 'Insidental', '2025-04-30', 25000),
('T429', 'M0874', NULL, 'Bulanan Wanita', '2025-05-01', 80000),
('T430', NULL, NULL, 'Insidental', '2025-05-01', 25000);


INSERT INTO Transaksi (ID_Transaksi, ID_Anggota, ID_Client, Nama_Paket, Tanggal, Jml_Bayar) VALUES
('T431', NULL, 'CL001', 'Personal Trainer', '2025-03-17', 450000),
('T432', NULL, 'CL002', 'Personal Trainer', '2025-03-20', 450000),
('T433', NULL, 'CL003', 'Personal Trainer', '2025-03-21', 450000),
('T434', NULL, 'CL004', 'Personal Trainer', '2025-03-20', 450000),
('T435', NULL, 'CL005', 'Personal Trainer', '2025-03-29', 450000),
('T436', NULL, 'CL006', 'Personal Trainer', '2025-03-30', 450000);


INSERT INTO Detail_Transaksi (ID_Detail, ID_Transaksi, Kode_Paket, Tanggal, Jml_Bayar, Metode_Bayar)
VALUES ('D001', 'T411', 'P001', '2025-03-10', 130000, 'Transfer/QRIS'),
('D002', 'T412', 'P002', '2025-03-10', 80000, 'Transfer/QRIS'),
('D003', 'T413', 'P003', '2025-03-17', 25000, 'Transfer/QRIS'),
('D004', 'T414', 'P003', '2025-03-17', 25000, 'Tunai'),
('D005', 'T415', 'P002', '2025-03-19', 80000, 'Tunai'),
('D006', 'T416', 'P001', '2025-03-20', 130000, 'Transfer/QRIS'),
('D007', 'T417', 'P001', '2025-03-25', 130000, 'Transfer/QRIS')

INSERT INTO Detail_Transaksi (ID_Detail, ID_Transaksi, Kode_Paket, Tanggal, Jml_Bayar, Metode_Bayar)
VALUES ('D008', 'T418', 'P003', '2025-03-25', 25000, 'Tunai'),
('D009', 'T419', 'P004', '2025-04-06', 140000, 'Transfer/QRIS'),
('D010', 'T420', 'P003', '2025-04-08', 25000, 'Transfer/QRIS'),
('D011', 'T421', 'P001', '2025-04-10', 130000, 'Transfer/QRIS'),
('D012', 'T422', 'P001', '2025-04-14', 130000, 'Tunai'),
('D013', 'T423', 'P002', '2025-04-20', 80000, 'Tunai'),
('D015', 'T425', 'P006', '2025-04-24', 15000, 'Transfer/QRIS'),
('D016', 'T426', 'P003', '2025-04-25', 25000, 'Tunai'),
('D017', 'T427', 'P002', '2025-04-30', 80000, 'Tunai'),
('D018', 'T428', 'P002', '2025-04-30', 80000, 'Tunai'),
('D019', 'T429', 'P002', '2025-05-01', 80000, 'Tunai'),
('D020', 'T430', 'P003', '2025-05-01', 25000, 'Tunai'),
('D021', 'T431', 'P008', '2025-03-17', 450000, 'Transfer/QRIS'),
('D022', 'T432', 'P008', '2025-03-20', 450000, 'Tunai'),
('D023', 'T433', 'P008', '2025-03-21', 450000, 'Transfer/QRIS'),
('D024', 'T434', 'P008', '2025-03-20', 450000, 'Tunai'),
('D025', 'T435', 'P008', '2025-03-29', 450000, 'Transfer/QRIS'),
('D026', 'T436', 'P008', '2025-03-30', 450000, 'Tunai');


INSERT INTO Sesi (ID_Sesi,ID_PT, ID_Client, No_Lat, Tanggal, Berat_Badan, Ket_Lat, Reps)
VALUES('SS001', 'PT030', 'CL001', 1, '2025-03-17', 62.0, 'Full Body', '12x4'),
('SS002', 'PT030', 'CL001', 2, '2025-03-23', 62.0, 'Upper', '12x4'),
('SS003', 'PT030', 'CL001', 3, '2025-03-28', 61.0, 'Lower', '12x4'),
('SS004', 'PT030', 'CL002', 1, '2025-03-20', 65.0, 'Full Body', '15x5'),
('SS005', 'PT030', 'CL002', 2, '2025-03-24', 64.5, 'Full Body', '15x5'),
('SS006', 'PT031', 'CL003', 1, '2025-03-21', 55.0, 'Lower', '12x3'),
('SS007', 'PT031', 'CL003', 2, '2025-03-25', 54.5, 'Upper', '12x3'),
('SS008', 'PT031', 'CL003', 3, '2025-03-29', 54.0, 'Full Body', '12x4'),
('SS009', 'PT031', 'CL004', 1, '2025-03-20', 59.0, 'Full Body', '12x3'),
('SS010', 'PT030', 'CL005', 1, '2025-03-29', 70.0, 'Upper', '10x5'),
('SS011', 'PT031', 'CL006', 1, '2025-03-30', 62.0, 'Cardio', '30 menit');
