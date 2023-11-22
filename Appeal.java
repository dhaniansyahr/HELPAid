import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appeal {
    private String appealID;
    private Date formDate;
    private Date toDate;
    private String description;
    private String outcome;

    Organization organization; // Organization Return Association Relationship
    // private Contribution[] receives;
    List<Contribution> receives = new ArrayList<Contribution>(); // Contribution Return Association Relationship
    // private Disbursement[] results_in;
    List<Disbursement> results_in = new ArrayList<Disbursement>(); // Disbursement Return Association Relationship

    public Appeal(String appealID, Date formDate, Date toDate, String description, String outcome,
            Organization organization, List<Contribution> receives, List<Disbursement> results_in) {
        this.appealID = appealID;
        this.formDate = formDate;
        this.toDate = toDate;
        this.description = description;
        this.outcome = outcome;
        this.organization = organization;
        this.receives = (receives != null) ? new ArrayList<>(receives) : new ArrayList<>();
        this.results_in = (results_in != null) ? new ArrayList<>(results_in) : new ArrayList<>();
    }

    public String getAppealID() {
        return appealID;
    }

    public Date getFormDate() {
        return formDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public String getDescription() {
        return description;
    }

    public String getOutcome() {
        return outcome;
    }

    public Organization getOrganization() {
        return organization;
    }

    public List<Contribution> getReceives() {
        return receives;
    }

    public List<Disbursement> getResults_in() {
        return results_in;
    }

    public void setAppealID(String appealID) {
        this.appealID = appealID;
    }

    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public void setReceives(List<Contribution> receives) {
        this.receives = receives;
    }

    public void setResults_in(List<Disbursement> results_in) {
        this.results_in = results_in;
    }

    public void addContribution(Contribution contribution) {
        // Ensure contributions list is initialized
        if (receives == null) {
            receives = new ArrayList<>();
        }

        receives.add(contribution);
    }

    // Overloaded method to specifically add CashDonation
    public void addContribution(CashDonation cashDonation) {
        // Ensure contributions list is initialized
        if (receives == null) {
            receives = new ArrayList<>();
        }

        receives.add(cashDonation);
    }

    // Overloaded method to specifically add Goods
    public void addContribution(Goods goods) {
        // Ensure contributions list is initialized
        if (receives == null) {
            receives = new ArrayList<>();
        }

        receives.add(goods);
    }

    public void addDisbursement(Disbursement disbursement) {
        // Ensure disbursements list is initialized
        if (results_in == null) {
            results_in = new ArrayList<>();
        }

        results_in.add(disbursement);
    }

}

/*
 * Penjelasan Tentang Class Appeals
 * 
 * Kelas `Appeal` adalah representasi dari suatu permohonan bantuan dalam sistem
 * yang Anda rancang. Berikut adalah penjelasan detailnya:
 * 
 * 1. **Atribut Kelas:**
 * - `appealID`: Menyimpan ID unik dari suatu permohonan bantuan.
 * - `formDate`: Menyimpan tanggal mulai permohonan bantuan.
 * - `toDate`: Menyimpan tanggal berakhirnya permohonan bantuan.
 * - `description`: Menyimpan deskripsi atau keterangan mengenai permohonan
 * bantuan.
 * - `outcome`: Menyimpan hasil atau status dari permohonan bantuan (contoh:
 * "Pending", "Approved", "Rejected").
 * - `organization`: Menyimpan referensi ke objek `Organization` yang merupakan
 * organisasi yang mengajukan permohonan bantuan.
 * - `receives`: Menyimpan daftar kontribusi (objek `Contribution`) yang
 * diterima oleh permohonan bantuan.
 * - `results_in`: Menyimpan daftar pencairan (objek `Disbursement`) yang
 * dihasilkan oleh permohonan bantuan.
 * 
 * 2. **Konstruktor:**
 * - Konstruktor digunakan untuk membuat objek `Appeal` dengan memberikan nilai
 * awal pada atribut-atributnya. Konstruktor ini menerima parameter untuk
 * menginisialisasi nilai atribut kelas.
 * 
 * 3. **Getter dan Setter:**
 * - Getter digunakan untuk mendapatkan nilai dari atribut.
 * - Setter digunakan untuk mengubah atau mengeset nilai dari atribut.
 * 
 * 4. **Metode `addContribution`:**
 * - Digunakan untuk menambahkan kontribusi (objek `Contribution`) ke dalam
 * daftar kontribusi (`receives`) pada permohonan bantuan.
 * - Terdapat tiga metode overload, yaitu `addContribution` untuk kontribusi
 * umum, `addContribution` untuk menambahkan `CashDonation`, dan
 * `addContribution` untuk menambahkan `Goods`.
 * 
 * 5. **Metode `addDisbursement`:**
 * - Digunakan untuk menambahkan pencairan (objek `Disbursement`) ke dalam
 * daftar pencairan (`results_in`) pada permohonan bantuan.
 * 
 * Dengan adanya metode-metode tersebut, Anda dapat dengan mudah menambahkan
 * kontribusi dan pencairan ke dalam suatu permohonan bantuan. Selain itu,
 * penggunaan list untuk `receives` dan `results_in` memungkinkan adanya lebih
 * dari satu kontribusi atau pencairan untuk setiap permohonan bantuan.
 */
