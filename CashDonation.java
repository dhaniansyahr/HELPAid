import java.util.Date;

public class CashDonation extends Contribution {
    private int amount;
    private String paymentChannel;
    private String refrenceNo;

    public CashDonation(int amount, String paymentChannel, String refrenceNo, Date receivedDate,
            String contributionID) {
        super(receivedDate, contributionID);
        this.amount = amount;
        this.paymentChannel = paymentChannel;
        this.refrenceNo = refrenceNo;
    }

    public int getAmount() {
        return amount;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public String getRefrenceNo() {
        return refrenceNo;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public void setRefrenceNo(String refrenceNo) {
        this.refrenceNo = refrenceNo;
    }
}

/*
 * Penjelasan Tentang Class Ini
 * 
 * 1. **Atribut Kelas:**
 * - `amount`: Menyimpan jumlah uang tunai yang disumbangkan.
 * - `paymentChannel`: Menyimpan informasi tentang saluran pembayaran yang
 * digunakan untuk sumbangan.
 * - `referenceNo`: Menyimpan nomor referensi atau identifikasi unik terkait
 * dengan sumbangan uang tunai.
 * 
 * 2. **Konstruktor:**
 * - Konstruktor digunakan untuk membuat objek `CashDonation` dengan memberikan
 * nilai awal pada atribut-atributnya. Konstruktor ini menerima parameter untuk
 * menginisialisasi nilai atribut kelas dan juga memanggil konstruktor dari
 * kelas induk (`Contribution`) untuk menginisialisasi atribut yang diwarisi.
 * 
 * 3. **Getter dan Setter:**
 * - Getter digunakan untuk mendapatkan nilai dari atribut.
 * - Setter digunakan untuk mengubah atau mengeset nilai dari atribut.
 * 
 * 4. **Pewarisan:**
 * - Kelas `CashDonation` merupakan turunan dari kelas `Contribution`. Oleh
 * karena itu, ia mewarisi atribut dan metode dari kelas `Contribution`. Dalam
 * hal ini, atribut yang diwarisi adalah `receivedDate` dan `contributionID`.
 */
