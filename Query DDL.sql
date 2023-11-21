USE project_basdat;

-- DROP TABLE nota;
-- DROP TABLE transaksi;
-- DROP TABLE barang;
-- DROP TABLE stok_barang;
-- DROP TABLE metode_pembelian;

CREATE TABLE barang
(
    kode_barang INT IDENTITY(1,1) NOT NULL ,
    nama_barang VARCHAR(100) UNIQUE,
    harga INT,
    PRIMARY KEY (kode_barang)
)

CREATE TABLE metode_pembelian
(
    kode_metode CHAR(2) NOT NULL,
    nama_metode VARCHAR(50) NOT NULL,
    PRIMARY KEY (kode_metode)
)

CREATE TABLE stok_barang
(
    kode_barang INT NOT NULL,
    ukuran VARCHAR(10) NOT NULL,
    offlen INT,
    shopee INT,
    tokopedia INT,
    PRIMARY KEY (kode_barang , ukuran),
    FOREIGN KEY (kode_barang) REFERENCES barang(kode_barang)
)

CREATE TABLE nota
(
    no_nota INT NOT NULL IDENTITY(1,1),
    total_barang INT,
    total_harga INT,
    tanggal_transaksi DATETIME DEFAULT CURRENT_TIMESTAMP,
    metode_pembelian CHAR(2),
    PRIMARY KEY (no_nota),
    FOREIGN KEY (metode_pembelian) REFERENCES metode_pembelian(kode_metode)
)

CREATE TABLE transaksi
(
    no_nota INT NOT NULL,
    kode_barang INT NOT NULL,
    ukuran VARCHAR(10) NOT NULL,
    jumlah_barang INT,
    total_harga_barang INT,
    PRIMARY KEY (no_nota, kode_barang, ukuran),
    FOREIGN KEY (no_nota) REFERENCES nota(no_nota),
    FOREIGN KEY (kode_barang) REFERENCES barang(kode_barang)
)