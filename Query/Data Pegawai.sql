-- Inserting data into the jabatan table
INSERT INTO jabatan (kelas, nama_jabatan) VALUES
(1, 'Staf magang'),
(2, 'Staf ahli'),
(3, 'manajer'),
(4, 'senior manajer'),
(5, 'kepala cabang'),
(6, 'presiden'),
(7, 'Direktur');

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
