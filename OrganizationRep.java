public class OrganizationRep extends User {
    private String jobTitle;

    public OrganizationRep(String username, String password, String fullname, String email, String mobileNo,
            String jobTitle) {
        super(username, password, fullname, email, mobileNo);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

/*
 * Penjelasan Tentang Class OrganizationRep
 * 
 * 1. **Atribut Kelas:**
 * - `jobTitle`: Menyimpan informasi tentang jabatan atau posisi dari perwakilan
 * organisasi.
 * 
 * 2. **Konstruktor:**
 * - Terdapat satu konstruktor dengan parameter yang digunakan untuk
 * menginisialisasi nilai atribut ketika objek `OrganizationRep` dibuat.
 * Konstruktor ini memanggil konstruktor kelas induk `User` menggunakan kata
 * kunci `super` untuk menginisialisasi atribut yang bersifat umum antara kelas
 * `User` dan `OrganizationRep`.
 * 
 * 3. **Getter:**
 * - Terdapat getter untuk mendapatkan nilai atribut `jobTitle`.
 * 
 * 4. **Kegunaan:**
 * - Kelas ini digunakan untuk merepresentasikan perwakilan dari suatu
 * organisasi yang memiliki hak akses dan tanggung jawab tertentu dalam sistem
 * bantuan. Sebagai turunan dari `User`, `OrganizationRep` mewarisi atribut dan
 * metode umum yang dimiliki oleh pengguna.
 * 
 * 5. **Penerapan:**
 * - Objek `OrganizationRep` digunakan untuk menyimpan informasi kredensial
 * perwakilan organisasi, seperti username, password, nama lengkap, alamat
 * email, dan nomor telepon. `OrganizationRep` dapat diidentifikasi oleh jabatan
 * atau posisinya dalam organisasi.
 */