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
    nip CHAR(16) NOT NULL,
    nik CHAR(16),
    kelas INT,
    golongan INT,
    status_pegawai VARCHAR(7),
    total_cuti INT,
    total_izin INT,
    FOREIGN KEY (nik) REFERENCES data_pegawai(nik),
    FOREIGN KEY (kelas) REFERENCES jabatan(kelas),
    FOREIGN KEY (golongan) REFERENCES gaji_pokok(golongan)
)