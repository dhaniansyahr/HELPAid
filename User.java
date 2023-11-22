public class User {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String mobileNo;

    public User(String username, String password, String fullname, String email, String mobileNo) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    /**
     * @return String
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return String
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return String
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param fullname
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param mobileNo
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nPassword: " + password + "\nFullname: " + fullname + "\nEmail: " + email
                + "\nMobile No: " + mobileNo;
    }
}

/*
 * Penjelasan Tentang Class Ini
 * 1. **Atribut Kelas:**
 * - `username`: Menyimpan nilai nama pengguna (username) pengguna.
 * - `password`: Menyimpan nilai kata sandi (password) pengguna.
 * - `fullname`: Menyimpan nama lengkap dari pengguna.
 * - `email`: Menyimpan alamat email dari pengguna.
 * - `mobileNo`: Menyimpan nomor telepon seluler dari pengguna.
 * 
 * 2. **Konstruktor:**
 * - Terdapat satu konstruktor dengan parameter yang digunakan untuk
 * menginisialisasi nilai atribut ketika objek `User` dibuat.
 * 
 * 3. **Getter:**
 * - Terdapat getter untuk masing-masing atribut yang memungkinkan mendapatkan
 * nilai atribut dari objek `User`.
 * 
 * 4. **Setter:**
 * - Terdapat setter untuk masing-masing atribut yang memungkinkan pengaturan
 * nilai atribut dari objek `User`.
 * 
 * 5. **Metode `toString`:**
 * - Override metode `toString` yang mengembalikan representasi string dari
 * objek `User`. Metode ini memberikan tampilan yang mudah dibaca dari informasi
 * pengguna seperti username, password, fullname, email, dan nomor telepon.
 * 
 * 6. **Penerapan:**
 * - Kelas ini menyediakan basis umum untuk menyimpan informasi dasar tentang
 * pengguna dalam sistem. Kelas ini bisa diwarisi oleh kelas-kelas lain dalam
 * konteks sistem manajemen bantuan yang membutuhkan informasi dasar pengguna.
 * 
 * 7. **Contoh Penggunaan:**
 * - Kelas ini bisa digunakan sebagai dasar untuk membuat objek pengguna,
 * termasuk objek seperti `Applicant` dan `OrganizationRep` yang telah
 * dijelaskan sebelumnya.
 */