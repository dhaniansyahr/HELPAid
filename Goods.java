import java.util.Date;

public class Goods extends Contribution {
    private String description;
    private int estimatedValue;

    public Goods(String description, int estimatedValue, Date receivedDate, String contributionID) {
        super(receivedDate, contributionID);
        this.description = description;
        this.estimatedValue = estimatedValue;
    }

    public String getDescription() {
        return description;
    }

    public int getEstimatedValue() {
        return estimatedValue;
    }
}

/*
 * Penjelasan Tentang Class Ini
 * 
 * 1. **Atribut Kelas:**
 * - `description`: Menyimpan deskripsi atau keterangan yang menjelaskan jenis
 * barang yang disumbangkan.
 * - `estimatedValue`: Menyimpan nilai perkiraan atau estimasi dari nilai barang
 * yang disumbangkan.
 * 
 * 2. **Konstruktor:**
 * - Konstruktor kelas `Goods` menerima parameter untuk menginisialisasi nilai
 * atribut-atribut kelas. Konstruktor ini juga memanggil konstruktor dari kelas
 * induk (`Contribution`) menggunakan kata kunci `super` untuk menginisialisasi
 * atribut yang dimiliki oleh kelas induk.
 * 
 * 3. **Getter:**
 * - Getter digunakan untuk mendapatkan nilai dari atribut. Dalam hal ini,
 * terdapat getter untuk mendapatkan deskripsi dan estimasi nilai barang.
 * 
 * 4. **Kegunaan:**
 * - Kelas ini dirancang khusus untuk menyimpan informasi terkait sumbangan
 * barang dalam konteks sistem bantuan. Dengan menggunakan kelas ini, Anda dapat
 * melacak dan menyimpan informasi seperti deskripsi barang dan estimasi nilai
 * barang yang disumbangkan.
 * 
 * 5. **Penerapan:**
 * - Objek `Goods` dapat digunakan ketika ingin merekam sumbangan barang dari
 * para penyumbang. Informasi ini kemudian dapat digunakan untuk melihat
 * kontribusi yang telah diterima oleh sistem.
 */