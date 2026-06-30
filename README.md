
# Sistem Manajemen Surat

## Deskripsi Project

Sistem Manajemen Surat adalah aplikasi desktop berbasis Java Swing yang digunakan untuk mengelola data surat masuk dan surat keluar.

Aplikasi ini menyediakan fitur untuk:

- Menampilkan data surat
- Menambahkan data surat
- Mencari data surat
- Mengedit data surat
- Menghapus data surat
- Mengurutkan data berdasarkan tanggal
- Export laporan ke format PDF

---

## Teknologi yang Digunakan

- Java JDK 26
- Java Swing (GUI)
- VS Code
- Git & GitHub
- iTextPDF 5.5.13.3
- MySQL (Laragon & phpMyAdmin)

---

## Struktur Project

```text
src/
│
├── Main.java
├── view/
│   ├── DashboardFrame.java
│   └── PdfExporter.java
│
├── model/
│   ├── SuratMasuk.java
│   └── SuratKeluar.java
│
└── database/
    └── Koneksi.java
```

---

## Cara Menjalankan Program

### 1. Clone Repository

```bash
git clone https://github.com/username/pbosurat.git
```

### 2. Buka Project

Buka folder project menggunakan Visual Studio Code.

### 3. Pastikan JDK Sudah Terinstall

Cek versi Java:

```bash
java -version
```

### 4. Jalankan Main.java

Masuk ke file:

```text
src/Main.java
```

Kemudian klik Run Java.

---

## Fitur Program

### 1. Tambah Data Surat

Klik tombol:

```text
Tambah
```

Masukkan:

- Nomor Surat
- Pengirim/Tujuan
- Perihal
- Tanggal

Data akan ditambahkan ke tabel.

---

### 2. Cari Data Surat

Klik tombol:

```text
Cari
```

Masukkan nama pengirim atau tujuan surat.

Program akan mencari data yang sesuai.

---

### 3. Edit Data Surat

Pilih salah satu data pada tabel.

Klik tombol:

```text
Edit
```

Ubah data yang diinginkan.

---

### 4. Hapus Data Surat

Pilih data pada tabel.

Klik tombol:

```text
Hapus
```

Data akan dihapus dari tabel.

---

### 5. Sorting Data

Klik tombol:

```text
Sorting
```

Data akan diurutkan berdasarkan tanggal.

---

### 6. Export PDF

Klik tombol:

```text
Export PDF
```

Program akan membuat file:

```text
LaporanSurat.pdf
```

pada folder project.

---

## Data Dummy

Program menyediakan data contoh:

| ID | Nomor Surat | Pengirim/Tujuan | Perihal |
|----|------------|----------------|----------|
| 1 | SM001 | BEM Universitas | Undangan Rapat |
| 2 | SM002 | HIMA Informatika | Proposal Kegiatan |
| 3 | SK001 | Fakultas Teknik | Surat Balasan |
| 4 | SK002 | BEM Universitas | Pemberitahuan Kegiatan |

---

## Database

Nama Database:

```sql
pbosurat
```

Contoh pembuatan database:

```sql
CREATE DATABASE pbosurat;
```

Contoh tabel:

```sql
CREATE TABLE surat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomor_surat VARCHAR(50),
    pengirim VARCHAR(100),
    perihal VARCHAR(100),
    tanggal DATE
);
```

---

## Anggota Kelompok

- razan muhammad ihsan - 242502040012
- muhamad iswahyudi- 25240204
- muhamad haikal - 24250204

---

## Lisensi

Project ini dibuat untuk memenuhi tugas UAS Pemrograman Berorientasi Objek (PBO).
````

