CREATE TABLE CLIENT (
  ID_Client CHAR(8) PRIMARY KEY,
  Nama_Client VARCHAR(50) NOT NULL,
  Nama_PT VARCHAR(50) NOT NULL
);


CREATE TABLE Member (
  ID_Anggota CHAR(8) PRIMARY KEY,
  Nama_Pelanggan VARCHAR(50) NULL,
  Jenis_Pelanggan ENUM('Umum', 'Pria Mhs', 'Wanita') NOT NULL,
  Alamat VARCHAR(50) NULL,
  Status_Anggota ENUM('Aktif', 'Tidak Aktif') NOT NULL
);


CREATE TABLE Personal_Trainer (
  ID_PT CHAR(8) PRIMARY KEY,
  Nama_PT VARCHAR(50) NOT NULL,
  Spesialis VARCHAR(30) NOT NULL
);

CREATE TABLE Daftar_Paket (
  Kode_Paket CHAR(8) PRIMARY KEY,
  Nama_Paket VARCHAR(50) NULL,
  Durasi_Paket VARCHAR(15) NULL,
  Harga_Paket INT NOT NULL
);


CREATE TABLE Transaksi (
  ID_Transaksi CHAR(8) PRIMARY KEY,
  ID_Anggota CHAR(8) NULL,
  ID_Client CHAR(8) NULL,
  Nama_Paket ENUM('Bulanan Pria Mhs', 'Bulanan Umum', 'Bulanan Wanita', 'Insidental', 'Visit Wanita',
   'Visit Mhs', 'Visit Pria', 'Personal Trainer') NOT NULL,
  Tanggal DATE NOT NULL,
  Jml_Bayar INT NOT NULL,
  
  CONSTRAINT FOREIGN KEY (ID_Client) REFERENCES CLIENT(ID_Client),
  CONSTRAINT FOREIGN KEY (ID_Anggota) REFERENCES Member(ID_Anggota)
);


CREATE TABLE Detail_Transaksi (
  ID_Detail CHAR(8) PRIMARY KEY,
  ID_Transaksi CHAR(8) NOT NULL,
  Kode_Paket CHAR(8) NOT NULL,
  Tanggal DATE NULL,
  Jml_Bayar INT NULL,
  Metode_Bayar ENUM('Tunai', 'Transfer/QRIS')NULL,
  
  CONSTRAINT FOREIGN KEY (ID_Transaksi) REFERENCES Transaksi(ID_Transaksi),
  CONSTRAINT FOREIGN KEY (Kode_Paket) REFERENCES Daftar_Paket(Kode_Paket)
);


CREATE TABLE Sesi (
  ID_Sesi CHAR(8) PRIMARY KEY,
  ID_PT CHAR(8) NOT NULL,
  ID_Client CHAR(8) NOT NULL,
  No_Lat SMALLINT NOT NULL,
  Tanggal DATE NULL,
  Berat_Badan SMALLINT NULL,
  Ket_Lat VARCHAR(30) NULL,
  Reps VARCHAR(20) NULL,
  
  CONSTRAINT FOREIGN KEY (ID_PT) REFERENCES Personal_Trainer(ID_PT),
  CONSTRAINT FOREIGN KEY (ID_Client) REFERENCES CLIENT(ID_Client)
);

CREATE TABLE backup_transaksi (
  ID_Backup CHAR(8) PRIMARY KEY,
  ID_Transaksi CHAR(8) NULL,
  ID_Anggota CHAR(8) NULL,
  ID_Client CHAR(8) NULL,
  Nama_Paket ENUM('Bulanan Pria Mhs', 'Bulanan Umum', 'Bulanan Wanita', 'Insidental', 'Visit Wanita',
   'Visit Mhs', 'Visit Pria', 'Personal Trainer') NOT NULL,
  Tanggal DATE NOT NULL,
  Jml_Bayar INT NOT NULL,
  
  CONSTRAINT FOREIGN KEY (ID_Transaksi) REFERENCES transaksi(ID_Transaksi),
  CONSTRAINT FOREIGN KEY (ID_Client) REFERENCES CLIENT(ID_Client),
  CONSTRAINT FOREIGN KEY (ID_Anggota) REFERENCES Member(ID_Anggota)
);
