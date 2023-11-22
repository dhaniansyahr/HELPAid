import java.util.ArrayList;
import java.util.List;

public class Applicant extends User {
    private String IDno;
    private String address;
    private String householdIncome;

    List<Document> submits;
    List<Disbursement> disbursements = new ArrayList<Disbursement>();

    public Applicant(String username, String password, String fullname, String email, String mobileNo, String IDno,
            String address, String householdIncome, List<Document> submits) {
        super(username, password, fullname, email, mobileNo);
        this.IDno = IDno;
        this.address = address;
        this.householdIncome = householdIncome;
        this.submits = submits;
    }

    public String getIDno() {
        return IDno;
    }

    public String getAddress() {
        return address;
    }

    public String getHouseholdIncome() {
        return householdIncome;
    }

    public void setIDno(String IDno) {
        this.IDno = IDno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseholdIncome(String householdIncome) {
        this.householdIncome = householdIncome;
    }

    public List<Document> getSubmits() {
        return submits;
    }

    public void setSubmits(List<Document> submits) {
        this.submits = submits;
    }

    public void addSubmit(Document submit) {
        this.submits.add(submit);
    }

    @Override
    public String toString() {
        return "Applicant \naddress = " + address + ",\nhouseholdIncome = " + householdIncome + ",\nIDno = " + IDno
                + "\n";
    }

    public List<Disbursement> getDisbursements() {
        return disbursements;
    }

    public void setDisbursements(List<Disbursement> disbursements) {
        this.disbursements = disbursements;
    }

    public void addDisbursement(Disbursement disbursement) {
        this.disbursements.add(disbursement);
    }
}

/*
 * Penjelasan Tentang Class Applicant
 * 
 * 1. **Atribut Kelas:**
 * - `IDno`: Menyimpan nomor identitas unik dari pemohon bantuan.
 * - `address`: Menyimpan alamat tempat tinggal pemohon bantuan.
 * - `householdIncome`: Menyimpan pendapatan rumah tangga dari pemohon bantuan.
 * - `submits`: Menyimpan daftar dokumen (objek `Document`) yang telah di-submit
 * oleh pemohon bantuan.
 * - `disbursements`: Menyimpan daftar pencairan (objek `Disbursement`) yang
 * diterima oleh pemohon bantuan.
 * 
 * 2. **Konstruktor:**
 * - Konstruktor digunakan untuk membuat objek `Applicant` dengan memberikan
 * nilai awal pada atribut-atributnya. Konstruktor ini menerima parameter untuk
 * menginisialisasi nilai atribut kelas.
 * 
 * 3. **Getter dan Setter:**
 * - Getter digunakan untuk mendapatkan nilai dari atribut.
 * - Setter digunakan untuk mengubah atau mengeset nilai dari atribut.
 * 
 * 4. **Metode `addSubmit`:**
 * - Digunakan untuk menambahkan dokumen (objek `Document`) ke dalam daftar
 * dokumen (`submits`) yang dimiliki oleh pemohon bantuan.
 * 
 * 5. **Metode `toString`:**
 * - Override metode `toString` dari kelas `Object` untuk memberikan
 * representasi string dari objek `Applicant`. Metode ini memberikan informasi
 * mengenai alamat, pendapatan rumah tangga, dan nomor identitas pemohon
 * bantuan.
 * 
 * 6. **Metode `getDisbursements` dan `addDisbursement`:**
 * - `getDisbursements`: Digunakan untuk mendapatkan daftar pencairan
 * (`disbursements`) yang diterima oleh pemohon bantuan.
 * - `setDisbursements`: Digunakan untuk mengeset daftar pencairan pemohon
 * bantuan.
 * - `addDisbursement`: Digunakan untuk menambahkan pencairan (objek
 * `Disbursement`) ke dalam daftar pencairan yang dimiliki oleh pemohon bantuan.
 */