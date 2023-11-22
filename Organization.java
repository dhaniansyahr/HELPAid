import java.util.List;
import java.util.ArrayList;

public class Organization {
    private String orgID;
    private String orgName;
    private String address;

    List<OrganizationRep> employs = new ArrayList<OrganizationRep>();
    List<Applicant> records = new ArrayList<Applicant>();
    List<Appeal> appeals = new ArrayList<Appeal>();

    public Organization() {
    }

    public Organization(String orgID, String orgName, String address) {
        this.orgID = orgID;
        this.orgName = orgName;
        this.address = address;
    }

    public String getOrgID() {
        return orgID;
    }

    public String getOrgName() {
        return orgName;
    }

    public String getAddress() {
        return address;
    }

    public List<OrganizationRep> getEmploys() {
        return employs;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmploys(List<OrganizationRep> employs) {
        this.employs = employs;
    }

    // Menambahkan Employees
    public void addEmploy(OrganizationRep employ) {
        this.employs.add(employ);
    }

    public List<Applicant> getRecords() {
        return records;
    }

    public void setRecords(List<Applicant> records) {
        this.records = records;
    }

    public void addRecord(Applicant record) {
        this.records.add(record);
    }

    public List<Appeal> getAppeals() {
        return appeals;
    }

    public void setAppeals(List<Appeal> appeals) {
        this.appeals = appeals;
    }

    public void addAppeal(Appeal appeal) {
        this.appeals.add(appeal);
    }

    public Appeal finAppeal(String appealID) {
        for (Appeal appeal : appeals) {
            if (appeal.getAppealID().equals(appealID)) {
                return appeal;
            }
        }
        return null;
    }

    public Applicant findRecord(String username) {
        for (Applicant record : records) {
            if (record.getUsername().equals(username)) {
                return record;
            }
        }
        return null;
    }

    // For List Of Appeal
    public void printAppeals() {
        System.out.println("List of Appeals");
        System.out.println("====================================");
        for (Appeal appeal : appeals) {
            System.out.println("Appeal ID: " + appeal.getAppealID());
            System.out.println("Form Date: " + appeal.getFormDate());
            System.out.println("To Date: " + appeal.getToDate());
            System.out.println("Description: " + appeal.getDescription());
            System.out.println("Outcome: " + appeal.getOutcome());
            System.out.println("Organization: " + appeal.getOrganization().getOrgName());
            System.out.println("====================================");
        }
    }
}

/*
 * Penjelasan Tentang Class Organization
 * 
 * 1. **Atribut Kelas:**
 * - `orgID`: Menyimpan ID unik untuk setiap organisasi.
 * - `orgName`: Menyimpan nama organisasi.
 * - `address`: Menyimpan alamat organisasi.
 * - `employs`: Sebuah `List` yang menyimpan daftar pegawai (representative)
 * dari organisasi.
 * - `records`: Sebuah `List` yang menyimpan daftar pendaftar bantuan
 * (applicants) dari organisasi.
 * - `appeals`: Sebuah `List` yang menyimpan daftar permohonan bantuan (appeals)
 * yang diajukan oleh organisasi.
 * 
 * 2. **Konstruktor:**
 * - Terdapat dua konstruktor: satu tanpa parameter dan satu dengan parameter
 * untuk menginisialisasi nilai atribut organisasi saat pembuatan objek.
 * 
 * 3. **Getter dan Setter:**
 * - Setiap atribut memiliki getter dan setter yang digunakan untuk mendapatkan
 * dan mengatur nilai atribut.
 * 
 * 4. **Metode `addEmploy`, `addRecord`, dan `addAppeal`:**
 * - Metode ini digunakan untuk menambahkan pegawai, pendaftar bantuan, dan
 * permohonan bantuan ke dalam list yang sesuai.
 * 
 * 5. **Metode `finAppeal` dan `findRecord`:**
 * - Metode ini mencari permohonan bantuan (appeal) berdasarkan ID permohonan
 * dan pendaftar bantuan (record) berdasarkan username.
 * 
 * 6. **Metode `printAppeals`:**
 * - Metode ini mencetak informasi tentang setiap permohonan bantuan yang
 * dimiliki oleh organisasi, termasuk ID permohonan, tanggal mulai, tanggal
 * berakhir, deskripsi, hasil, dan nama organisasi.
 * 
 * 7. **Kegunaan:**
 * - Kelas ini digunakan untuk menyimpan informasi organisasi, seperti daftar
 * pegawai, daftar pendaftar bantuan, dan daftar permohonan bantuan.
 * Metode-metodenya memungkinkan manipulasi data terkait organisasi dan
 * pendaftar bantuan yang terorganisir.
 * 
 * 8. **Penerapan:**
 * - Objek `Organization` dapat digunakan untuk merepresentasikan organisasi
 * dalam sistem bantuan yang dirancang untuk mengelola bantuan dan permohonan
 * bantuan.
 */
