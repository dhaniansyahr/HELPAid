import java.util.Date;

public class Disbursement {
    private Date disbursementDate;
    private int cashAmount;
    private int goodsDisbursed;

    public Disbursement(Date disbursementDate, int cashAmount, int goodsDisbursed) {
        this.disbursementDate = disbursementDate;
        this.cashAmount = cashAmount;
        this.goodsDisbursed = goodsDisbursed;
    }

    public Date getDisbursementDate() {
        return disbursementDate;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public int getGoodsDisbursed() {
        return goodsDisbursed;
    }
}

/*
 * Penjelasan Tentang Class Ini
 * 
 * 1. **Atribut Kelas:**
 * - `disbursementDate`: Menyimpan tanggal ketika penyaluran atau pengeluaran
 * dana dan barang dilakukan.
 * - `cashAmount`: Menyimpan jumlah uang tunai yang disalurkan atau dikeluarkan.
 * - `goodsDisbursed`: Menyimpan jumlah barang yang disalurkan atau dikeluarkan.
 * 
 * 2. **Konstruktor:**
 * - Konstruktor digunakan untuk membuat objek `Disbursement` dengan memberikan
 * nilai awal pada atribut-atributnya. Konstruktor ini menerima parameter untuk
 * menginisialisasi nilai atribut kelas.
 * 
 * 3. **Getter:**
 * - Getter digunakan untuk mendapatkan nilai dari atribut. Dalam hal ini,
 * terdapat getter untuk mendapatkan tanggal penyaluran, jumlah uang tunai, dan
 * jumlah barang yang disalurkan.
 * 
 * 4. **Kegunaan:**
 * - Kelas ini menyediakan representasi untuk informasi spesifik tentang
 * penyaluran atau pengeluaran dana dan barang. Dengan menggunakan kelas ini,
 * Anda dapat melacak kapan penyaluran dilakukan dan seberapa besar jumlah uang
 * tunai dan barang yang disalurkan.
 * 
 * 5. **Penerapan:**
 * - Objek `Disbursement` dapat digunakan di berbagai bagian dari sistem
 * bantuan, seperti ketika mendaftarkan penyaluran yang terkait dengan suatu
 * permohonan bantuan tertentu.
 */