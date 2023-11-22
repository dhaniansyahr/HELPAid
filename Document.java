public class Document {
    private String documentID;
    private String fileName;
    private String description;

    public Document(String documentID, String fileName, String description) {
        this.documentID = documentID;
        this.fileName = fileName;
        this.description = description;
    }

    public String getDocumentID() {
        return documentID;
    }

    public String getFileName() {
        return fileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

/*
 * Penjelasan Tentang Class Document
 * 
 * 1. **Atribut Kelas:**
 * - `documentID`: Menyimpan ID unik untuk setiap dokumen.
 * - `fileName`: Menyimpan nama file atau identifier untuk dokumen tersebut.
 * - `description`: Menyimpan deskripsi atau keterangan yang menjelaskan isi
 * dari dokumen.
 * 
 * 2. **Konstruktor:**
 * - Konstruktor digunakan untuk membuat objek `Document` dengan memberikan
 * nilai awal pada atribut-atributnya. Konstruktor ini menerima parameter untuk
 * menginisialisasi nilai atribut kelas.
 * 
 * 3. **Getter:**
 * - Getter digunakan untuk mendapatkan nilai dari atribut. Dalam hal ini,
 * terdapat getter untuk mendapatkan ID dokumen, nama file, dan deskripsi
 * dokumen.
 * 
 * 4. **Setter:**
 * - Setter digunakan untuk mengubah nilai dari atribut. Dalam hal ini, terdapat
 * setter untuk mengubah ID dokumen, nama file, dan deskripsi dokumen.
 * 
 * 5. **Kegunaan:**
 * - Kelas ini menyediakan representasi untuk informasi spesifik tentang dokumen
 * yang terkait dengan suatu permohonan bantuan. Dengan menggunakan kelas ini,
 * Anda dapat melacak dan menyimpan informasi terkait dokumen, seperti ID
 * dokumen, nama file, dan deskripsi.
 * 
 * 6. **Penerapan:**
 * - Objek `Document` dapat digunakan di berbagai bagian dari sistem bantuan,
 * seperti ketika mendaftarkan dokumen yang terkait dengan suatu permohonan
 * bantuan atau ketika menampilkan informasi dokumen kepada pengguna.
 */
