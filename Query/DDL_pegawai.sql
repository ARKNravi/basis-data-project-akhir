USE project_basdat;

CREATE TABLE tunjangan_keluarga
(
    status_pernikahan VARCHAR(15),
    jumlah_anak INT,
    tunjangan INT,
    PRIMARY KEY (status_pernikahan, jumlah_anak)
)

CREATE TABLE data_pegawai
(
    nik CHAR(16) NOT NULL,
    nama VARCHAR(90) NOT NULL,
    pendidikan VARCHAR(50),
    tempat VARCHAR(90),
    tanggal_lahir DATE,
    jenis_kelamin CHAR(1),
    npwp CHAR(15),
    status_pernikahan VARCHAR(15),
    jumlah_anak INT,
    nomor_rekening VARCHAR(30),
    alamat VARCHAR(100),
    PRIMARY KEY (nik),
    FOREIGN KEY (status_pernikahan,jumlah_anak) REFERENCES tunjangan_keluarga(status_pernikahan,jumlah_anak)
)

CREATE TABLE jabatan
(
    kelas INT NOT NULL,
    nama_jabatan VARCHAR(50) UNIQUE,
    PRIMARY KEY (kelas)
)

CREATE TABLE gaji_pokok
(
    golongan INT NOT NULL,
    gaji INT,
    PRIMARY KEY (golongan)
)

CREATE TABLE detail_pegawai
(
    nip INT IDENTITY(1,1) NOT NULL,
    nik CHAR(16),
    kelas INT,
    golongan INT,
    status_pegawai VARCHAR(7),
    total_cuti INT,
    total_izin INT,
    PRIMARY KEY(nip),
    FOREIGN KEY (nik) REFERENCES data_pegawai(nik),
    FOREIGN KEY (kelas) REFERENCES jabatan(kelas),
    FOREIGN KEY (golongan) REFERENCES gaji_pokok(golongan)
)

CREATE TABLE userlog (
    username VARCHAR(255) NOT NULL,
    userpassword VARCHAR(255) NOT NULL,
    PRIMARY KEY(username,userpassword)
)

-- Inserting data into the jabatan table
INSERT INTO jabatan (kelas, nama_jabatan) VALUES
(1, 'Staf magang'),
(2, 'Staf ahli'),
(3, 'manajer'),
(4, 'senior manajer'),
(5, 'kepala cabang'),
(7, 'presiden'),
(6, 'Direktur');

-- Inserting data into the gaji_pokok table
INSERT INTO gaji_pokok (golongan, gaji) VALUES
(1, 5000000),
(2, 6000000),
(3, 7000000),
(4, 7500000),
(5, 8000000),
(6, 9000000),
(7, 9500000);

-- Inserting data into the tunjangan_keluarga table
INSERT INTO tunjangan_keluarga (status_pernikahan, jumlah_anak, tunjangan) VALUES
('Belum Menikah', 0, 0),
('Menikah', 0, 50000),
('Menikah', 1, 150000),
('Menikah', 2, 250000),
('Menikah', 3, 350000);