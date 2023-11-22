import java.util.Date;

public class Contribution {
    private Date receivedDate;
    private String contributionID;

    public Contribution(Date receivedDate, String contributionID) {
        this.receivedDate = receivedDate;
        this.contributionID = contributionID;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public String getContributionID() {
        return contributionID;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public void setContributionID(String contributionID) {
        this.contributionID = contributionID;
    }
}

/*
 * Penjelasan Tentang Class Contribution
 * 
 * 1. **Atribut Kelas:**
 * - `receivedDate`: Menyimpan tanggal ketika sumbangan diterima.
 * - `contributionID`: Menyimpan identifikasi unik atau nomor ID terkait dengan
 * sumbangan.
 * 
 * 2. **Konstruktor:**
 * - Konstruktor digunakan untuk membuat objek `Contribution` dengan memberikan
 * nilai awal pada atribut-atributnya. Konstruktor ini menerima parameter untuk
 * menginisialisasi nilai atribut kelas.
 * 
 * 3. **Getter dan Setter:**
 * - Getter digunakan untuk mendapatkan nilai dari atribut.
 * - Setter digunakan untuk mengubah atau mengeset nilai dari atribut.
 * 
 * 4. **Kegunaan:**
 * - Kelas ini menyediakan dasar untuk merepresentasikan informasi umum mengenai
 * setiap sumbangan yang diterima. Oleh karena itu, setiap jenis sumbangan
 * seperti `CashDonation` dan `Goods` dapat mewarisi kualitas umum ini dan
 * menambahkan atribut atau perilaku khusus jenis sumbangan tersebut.
 * 
 * 5. **Pewarisan:**
 * - Meskipun kelas ini mungkin tidak memiliki atribut khusus, namun ia dapat
 * digunakan sebagai kelas induk untuk jenis sumbangan khusus lainnya, seperti
 * `CashDonation` dan `Goods`. Dengan cara ini, kelas-kelas ini dapat mewarisi
 * atribut dan metode dari kelas `Contribution`.
 */