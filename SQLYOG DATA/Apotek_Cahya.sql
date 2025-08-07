CREATE DATABASE apotek_Cahya;

USE apotek_Cahya;

SHOW TABLES;

CREATE TABLE staff(
StaffID CHAR(4) PRIMARY KEY,
StaffName VARCHAR(50) NOT NULL,
StaffPosition VARCHAR(25));
DESC staff

ALTER TABLE customer ADD gender ENUM('Pria','Wanita') AFTER CustomerName;

ALTER TABLE staff CHANGE gender Gender ENUM('Pria', 'Wanita');


CREATE TABLE customer(
CustomerID CHAR(6) PRIMARY KEY,
CustomerName VARCHAR(50),
CustomerPhone VARCHAR(15),
CustomerEmail VARCHAR(50) UNIQUE,
CustomerAddress VARCHAR(200));
DESC customer

ALTER TABLE customer ADD Gender ENUM('Pria','Wanita') AFTER CustomerName;


CREATE TABLE penjualan(
salesID CHAR(6) PRIMARY KEY,
salesDate DATE NOT NULL,
CustomerID CHAR(6) NOT NULL,
staffID CHAR(4) NOT NULL,
FOREIGN KEY (CustomerID) REFERENCES customer (CustomerID),
FOREIGN KEY (StaffID) REFERENCES staff (StaffID));
DESC penjualan

CREATE TABLE item(
ItemID CHAR(6) PRIMARY KEY,
ItemName VARCHAR(50),
ItemPrice MEDIUMINT NOT NULL);
DESC item

CREATE TABLE detail_penjualan(
DetailID CHAR(5) PRIMARY KEY,
salesID CHAR(6) NOT NULL,
ItemID CHAR(6) NOT NULL,
Quantity TINYINT NOT NULL,
FOREIGN KEY (SalesID) REFERENCES penjualan (SalesID),
FOREIGN KEY (ItemID) REFERENCES item (ItemID));
DESC detail_penjualan