import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

public class HelpAid {

    // Untuk Membuat Random Number Sepanjang 6 Digit
    public int randomNumber() {
        return (int) (Math.random() * 1000000);
    }

    // Untuk Membuat Random Password
    public String generatePassword() {
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();
        String allCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            randomString.append(allCharacters.charAt(randomIndex));
        }

        return randomString.toString();
    }

    public static void main(String[] args) {
        // Untuk Membuat center text
        int lineLength = 50;
        int sideEqualSign = (lineLength - 8) / 2;

        // Untuk Menu
        int chooseMenu, chooseMenuOrgRep;
        String repeatMenu, repeatAdmin, repeatOrganizationRep, repeatViewAppeals;

        // Untuk Admin
        String usernameAdmin, passwordAdmin;
        Organization selectedORG = new Organization();
        Organization organizationRepMenuViewAppeal = new Organization();

        // Untuk Organization Representative
        String usernameOrgRep, passwordOrgRep, email, fullname, mobileNo, jobTitle;

        // Untuk Applicant
        String usernameApp, passwordApp, fullnameApp, emailApp, mobileNoApp, IDnoApp, addressApp, householdIncomeApp;
        String submitDoc;

        Scanner input = new Scanner(System.in);

        // Declare Organizations U can Edit This Organizations
        List<Organization> organizations = new ArrayList<>();
        Organization organization = new Organization("ORG" + new HelpAid().randomNumber(), "Organization 1",
                "Organization 1");
        organizations.add(organization);
        organization = new Organization("ORG" + new HelpAid().randomNumber(), "Organization 2",
                "Organization 2");
        organizations.add(organization);
        organization = new Organization("ORG" + new HelpAid().randomNumber(), "Organization 3",
                "Organization 3");
        organizations.add(organization);
        organization = new Organization("ORG" + new HelpAid().randomNumber(), "Organization 4",
                "Organization 4");
        organizations.add(organization);
        organization = new Organization("ORG" + new HelpAid().randomNumber(), "Organization 5",
                "Organization 5");
        organizations.add(organization);

        do {
            // Manu Awal Saat Masuk ke HELPAID

            System.out.println();
            System.out.println("=".repeat(lineLength));
            System.out.println(" ".repeat(sideEqualSign) + "HELP AID" + " ".repeat(sideEqualSign));
            System.out.println("=".repeat(lineLength));
            System.out.println();
            System.out.println("1. Admin");
            System.out.println("2. Organization Representative");
            System.out.println("3. View Appeals");
            System.out.println();
            System.out.println("=".repeat(lineLength));
            System.out.println();
            System.out.print("Masukan Pilihan Menu: ");
            chooseMenu = input.nextInt();

            switch (chooseMenu) {
                case 1:
                    do {
                        // Untuk Menu Masuk KE dalam Admin
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("Masukan Username Admin: ");
                        usernameAdmin = input.next();
                        System.out.print("Masukan Password Admin: ");
                        passwordAdmin = input.next();

                        // Kondisi untuk cek Apakah username dan Password yang dimasukan itu sama atau
                        // tidak
                        /*
                         * 
                         * 1. `if (usernameAdmin.equals("admin") && passwordAdmin.equals("admin")) {`:
                         * - Jika username yang dimasukkan adalah "admin" dan password yang dimasukkan
                         * juga adalah "admin", maka blok kode di dalam kurung kurawal akan dijalankan.
                         * 
                         * 2. Kode di dalam blok if:
                         * - Menghapus dan membersihkan layar konsol
                         * (`System.out.print("\033[H\033[2J"); System.out.flush();`).
                         * - Menampilkan judul "List Of Organization" di tengah layar.
                         * - Menampilkan daftar organisasi, termasuk ID organisasi, nama organisasi, dan
                         * alamat organisasi.
                         * - Meminta input dari pengguna untuk memasukkan ID organisasi yang diinginkan.
                         * - Mencari organisasi dengan ID yang sesuai dan menyimpannya dalam variabel
                         * `selectedORG`.
                         * - Jika organisasi ditemukan, melakukan langkah-langkah berikutnya untuk
                         * mendaftarkan perwakilan organisasi.
                         * - Membersihkan layar konsol kembali.
                         * - Menampilkan judul organisasi yang dipilih.
                         * - Membuat username perwakilan organisasi dengan format "ORGREP" diikuti oleh
                         * angka acak.
                         * - Membuat password perwakilan organisasi dengan menggunakan metode
                         * `generatePassword` dari kelas `HelpAid`.
                         * - Meminta input pengguna untuk fullname, email, mobileNo, dan jobTitle
                         * perwakilan organisasi.
                         * - Membuat objek `OrganizationRep` berdasarkan input dan menambahkannya ke
                         * organisasi yang dipilih.
                         * - Menampilkan pesan "Success Register" jika proses pendaftaran berhasil.
                         * - Jika organisasi tidak ditemukan, menampilkan pesan
                         * "No organizations found with the selected ID."
                         * 
                         * 3. `System.out.print("Ulangi Menu Admin (Y/N) : "); repeatAdmin =
                         * input.next();`:
                         * - Meminta input dari pengguna untuk menentukan apakah ingin mengulangi menu
                         * admin.
                         * - Jika jawaban "Y" (case insensitive), program akan kembali ke awal loop
                         * do-while.
                         * 
                         * Dengan demikian, blok kode ini berfungsi untuk memproses akses admin,
                         * menampilkan daftar organisasi, dan mendaftarkan perwakilan organisasi ke
                         * dalam organisasi yang dipilih. Program akan terus mengulang menu admin selama
                         * pengguna memilih untuk melakukannya.
                         */
                        if (usernameAdmin.equals("admin") && passwordAdmin.equals("admin")) {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println();
                            System.out.println("=".repeat(lineLength));
                            System.out.println(
                                    " ".repeat(sideEqualSign) + "List Of Organization" + " ".repeat(sideEqualSign));
                            System.out.println("=".repeat(lineLength));
                            System.out.println();

                            AtomicReference<String> selectedOrganization = new AtomicReference<>("");

                            for (Organization organization1 : organizations) {
                                System.out.println("Organization ID: " + organization1.getOrgID());
                                System.out.println("Organization Name: " + organization1.getOrgName());
                                System.out.println("Organization Address: " + organization1.getAddress());
                                System.out.println();
                            }

                            System.out.println();
                            System.out.print("Masukan Organization ID: ");
                            selectedOrganization.set(input.next());

                            for (Organization organization1 : organizations) {
                                if (organization1.getOrgID().equals(selectedOrganization.get())) {
                                    selectedORG = organization1;
                                }
                            }

                            if (selectedORG != null) {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.println();
                                System.out.println("=".repeat(lineLength));
                                System.out.println(
                                        " ".repeat(sideEqualSign) + selectedORG.getOrgName()
                                                + " ".repeat(sideEqualSign));
                                System.out.println("=".repeat(lineLength));
                                System.out.println();
                                usernameOrgRep = "ORGREP" + new HelpAid().randomNumber();
                                System.out.println("Username: " + usernameOrgRep);
                                passwordOrgRep = new HelpAid().generatePassword();
                                System.out.println("Password: " + passwordOrgRep);
                                System.out.print("Fullname: ");
                                input.nextLine();
                                fullname = input.nextLine();
                                System.out.print("Email: ");
                                email = input.next();
                                System.out.print("Mobile No: ");
                                mobileNo = input.next();
                                System.out.print("Job Title: ");
                                input.nextLine();
                                jobTitle = input.nextLine();

                                // Add Organization Representative to Organization
                                OrganizationRep organizationRep = new OrganizationRep(usernameOrgRep, passwordOrgRep,
                                        fullname,
                                        email, mobileNo, jobTitle);

                                selectedORG.addEmploy(organizationRep);

                                System.out.println("Success Register");

                            } else {
                                System.out.println("No organizations found with the selected ID.");
                            }

                        }

                        System.out.print("Ulangi Menu Admin (Y/N) : ");
                        repeatAdmin = input.next();
                    } while (repeatAdmin.equalsIgnoreCase("Y"));
                    break;

                case 2:
                    do {
                        /*
                         * Code tersebut adalah bagian dari suatu aplikasi yang menangani
                         * operasi-administratif untuk perwakilan organisasi. Berikut penjelasan code
                         * tersebut secara rinci dalam bahasa Indonesia:
                         * 
                         * case 2:: Bagian ini menunjukkan bahwa kode yang berikutnya akan dijalankan
                         * jika pengguna memilih opsi 2 (Organization Representative) dalam menu utama.
                         * 
                         * do { ... } while (repeatOrganizationRep.equalsIgnoreCase("Y"));: Ini adalah
                         * struktur loop do-while yang akan mengeksekusi blok kode di dalamnya
                         * setidaknya satu kali dan akan terus diulang jika pengguna memilih untuk
                         * melanjutkan (input "Y").
                         * 
                         * Blok kode di dalam do-while:
                         * System.out.print("\033[H\033[2J"); System.out.flush();: Membersihkan layar
                         * konsol.
                         * Meminta input username dan password dari perwakilan organisasi.
                         * Mencari keberadaan perwakilan organisasi dengan username dan password yang
                         * dimasukkan dalam daftar organisasi.
                         * Jika perwakilan organisasi ditemukan:
                         * Membersihkan layar konsol.
                         * Menampilkan nama organisasi yang diwakili oleh perwakilan tersebut.
                         * Menampilkan menu pilihan untuk perwakilan organisasi (menambahkan pelamar,
                         * menambahkan permohonan bantuan, menambahkan sumbangan, menambahkan pencairan
                         * bantuan).
                         * Meminta input pilihan menu dari perwakilan organisasi.
                         * Berdasarkan pilihan menu, menjalankan berbagai operasi seperti menambahkan
                         * pelamar, menambahkan permohonan bantuan, menambahkan sumbangan, atau
                         * menambahkan pencairan bantuan.
                         * Program juga menangani logika untuk memasukkan dokumen jika perwakilan ingin
                         * mengirimkan dokumen.
                         * Jika username atau password tidak valid, menampilkan pesan kesalahan.
                         * 
                         * while (repeatOrganizationRep.equalsIgnoreCase("Y"));: Menutup loop do-while
                         * dan menentukan bahwa loop tersebut akan terus berjalan selama pengguna
                         * memilih untuk melanjutkan (input "Y").
                         * 
                         * Case 1: Add Applicant
                         * Membersihkan layar konsol.
                         * Menampilkan header untuk menambahkan pelamar.
                         * Membuat username aplikasi ("APP" diikuti oleh nomor acak).
                         * Membuat password aplikasi menggunakan metode generatePassword dari HelpAid.
                         * Meminta input untuk fullname, email, mobileNo, dan alamat pelamar.
                         * Membuat ID pelamar menggunakan "AA" diikuti oleh nomor acak.
                         * Meminta input untuk pendapatan rumah tangga pelamar.
                         * Jika perwakilan ingin mengirimkan dokumen:
                         * Membuat objek Applicant dengan dokumen-dokumen yang diupload dan
                         * menambahkannya ke organisasi.
                         * Jika tidak mengirimkan dokumen:
                         * Membuat objek Applicant tanpa dokumen dan menambahkannya ke organisasi.
                         * Menampilkan pesan sukses.
                         * 
                         * Case 2: Add Appeal
                         * Membersihkan layar konsol.
                         * Menampilkan header untuk menambahkan permohonan bantuan.
                         * Meminta input untuk tanggal mulai dan berakhir permohonan.
                         * Meminta input deskripsi permohonan.
                         * Membuat objek Appeal dan menambahkannya ke organisasi.
                         * Menampilkan pesan sukses.
                         * 
                         * Case 3: Add Contributions
                         * Membersihkan layar konsol.
                         * Menampilkan header untuk menambahkan sumbangan.
                         * Menampilkan daftar permohonan bantuan yang tersedia.
                         * Meminta input ID permohonan bantuan yang dipilih.
                         * Menemukan permohonan bantuan berdasarkan ID.
                         * Jika permohonan ditemukan:
                         * Menampilkan rincian permohonan bantuan.
                         * Meminta input jenis sumbangan (uang tunai atau barang).
                         * Untuk sumbangan uang tunai:
                         * Meminta input jumlah uang tunai, saluran pembayaran, dan nomor referensi.
                         * Membuat objek CashDonation dan menambahkannya ke permohonan bantuan.
                         * Untuk sumbangan barang:
                         * Meminta input deskripsi barang dan nilai perkiraan.
                         * Membuat objek Goods dan menambahkannya ke permohonan bantuan.
                         * Menampilkan pesan sukses.
                         * 
                         * Case 4: Add Disbursement
                         * Membersihkan layar konsol.
                         * Menampilkan header untuk menambahkan pencairan bantuan.
                         * Menampilkan daftar permohonan bantuan yang tersedia.
                         * Meminta input ID permohonan bantuan yang dipilih.
                         * Menemukan permohonan bantuan berdasarkan ID.
                         * Jika permohonan ditemukan:
                         * Menampilkan rincian permohonan bantuan.
                         * Meminta input ID pelamar yang akan menerima pencairan.
                         * Menemukan pelamar berdasarkan ID.
                         * Jika pelamar ditemukan:
                         * Menampilkan rincian pelamar.
                         * Meminta input tanggal pencairan, jumlah uang tunai, dan jumlah barang yang
                         * dicairkan.
                         * Membuat objek Disbursement dan menambahkannya ke pelamar.
                         * Menampilkan pesan sukses.
                         */
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("Masukan Username Representative: ");
                        usernameOrgRep = input.next();
                        System.out.print("Masukan Password Representative: ");
                        passwordOrgRep = input.next(); // You might want to include password verification logic

                        boolean representativeFound = false;
                        for (Organization organizationRepMenu : organizations) {
                            List<OrganizationRep> employs = organizationRepMenu.getEmploys();
                            if (employs != null) {
                                for (OrganizationRep employ : employs) {
                                    if (employ.getUsername().equals(usernameOrgRep)
                                            && employ.getPassword().equals(passwordOrgRep)) {
                                        representativeFound = true;
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println();
                                        System.out.println("=".repeat(lineLength));
                                        System.out.println(
                                                " ".repeat(sideEqualSign) + organizationRepMenu.getOrgName()
                                                        + " ".repeat(sideEqualSign));
                                        System.out.println("=".repeat(lineLength));
                                        System.out.println();

                                        System.out.println("1. Add Applicant");
                                        System.out.println("2. Add Appeal");
                                        System.out.println("3. Add Contributions");
                                        System.out.println("4. Add Disbursement");

                                        System.out.println();
                                        System.out.println("=".repeat(lineLength));
                                        System.out.println();
                                        System.out.print("Masukan Pilihan Menu: ");
                                        chooseMenuOrgRep = input.nextInt();

                                        switch (chooseMenuOrgRep) {
                                            case 1:
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                                System.out.println();
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println(" ".repeat(sideEqualSign)
                                                        + "Add Applicant" + " ".repeat(sideEqualSign));
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println();
                                                usernameApp = "APP" + new HelpAid().randomNumber();
                                                System.out.println("Username: " + usernameApp);
                                                passwordApp = new HelpAid().generatePassword();
                                                System.out.println("Password: " + passwordApp);
                                                System.out.print("Fullname: ");
                                                input.nextLine();
                                                fullnameApp = input.nextLine();
                                                System.out.print("Email: ");
                                                emailApp = input.next();
                                                System.out.print("Mobile No: ");
                                                mobileNoApp = input.next();
                                                System.out.println("ID No: " + "AA" + new HelpAid().randomNumber());
                                                IDnoApp = "AA" + new HelpAid().randomNumber();
                                                System.out.print("Address: ");
                                                input.nextLine();
                                                addressApp = input.nextLine();
                                                System.out.print("Household Income: ");
                                                householdIncomeApp = input.nextLine();

                                                System.out.print("U Want to Submits Document? (Y/N) : ");
                                                submitDoc = input.next();

                                                if (submitDoc.equalsIgnoreCase("Y")) {
                                                    List<Document> submits = new ArrayList<>();
                                                    System.out.print("Masukan Jumlah Dokumen Yang Ingin Di Upload : ");
                                                    int jumlahDokumen = input.nextInt();
                                                    for (int i = 0; i < jumlahDokumen; i++) {
                                                        System.out.print("Masukan Nama Dokumen : ");
                                                        String fileName = input.next();
                                                        System.out.print("Masukan Deskripsi Dokumen : ");
                                                        String description = input.next();
                                                        Document submit = new Document(
                                                                "DOC" + new HelpAid().randomNumber(),
                                                                fileName, description);
                                                        submits.add(submit);
                                                    }
                                                    Applicant applicant = new Applicant(usernameApp, passwordApp,
                                                            fullnameApp, emailApp, mobileNoApp, IDnoApp, addressApp,
                                                            householdIncomeApp, submits);
                                                    organizationRepMenu.addRecord(applicant);
                                                } else {
                                                    Applicant applicant = new Applicant(usernameApp, passwordApp,
                                                            fullnameApp, emailApp, mobileNoApp, IDnoApp, addressApp,
                                                            householdIncomeApp, null);
                                                    organizationRepMenu.addRecord(applicant);
                                                }

                                                System.out.println("Success Register Aid Applicant By Organizations");
                                                break;

                                            case 2:
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                                System.out.println();
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println(" ".repeat(sideEqualSign) + "Add Appeal"
                                                        + " ".repeat(sideEqualSign));
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println();

                                                // Get input for the appeal

                                                try {
                                                    System.out.print("Enter Form Date (yyyy-MM-dd): ");
                                                    String formDateString = input.next();
                                                    Date fromDate = new SimpleDateFormat("yyyy-MM-dd")
                                                            .parse(formDateString);

                                                    System.out.print("Enter To Date (yyyy-MM-dd): ");
                                                    String toDateString = input.next();
                                                    Date toDate = new SimpleDateFormat("yyyy-MM-dd")
                                                            .parse(toDateString);

                                                    System.out.print("Enter Appeal Description: ");
                                                    String appealDescription = input.nextLine();

                                                    // Create an Appeal object
                                                    Appeal appeal = new Appeal("AP" + new HelpAid().randomNumber(),
                                                            fromDate, toDate, appealDescription,
                                                            "Pending", organizationRepMenu, null, null);

                                                    // Add the appeal to the organization
                                                    organizationRepMenu.addAppeal(appeal);

                                                    System.out.println("Appeal added successfully!");
                                                } catch (ParseException e) {
                                                    System.out.println(
                                                            "Invalid date format. Please enter the date in yyyy-MM-dd format.");
                                                }

                                                System.out.println("Appeal added successfully!");
                                                break;

                                            case 3: // Add Contributions
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                                System.out.println();
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println(" ".repeat(sideEqualSign) + "Add Contributions"
                                                        + " ".repeat(sideEqualSign));
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println();

                                                // Show List of Appeals
                                                System.out.println("List of Appeals:");
                                                for (Appeal appeal : organizationRepMenu.getAppeals()) {
                                                    System.out.println("Appeal ID: " + appeal.getAppealID());
                                                    System.out.println("From Date: " + appeal.getFormDate());
                                                    System.out.println("To Date: " + appeal.getToDate());
                                                    System.out.println();
                                                }

                                                // Select Appeal
                                                System.out.print("Enter Appeal ID: ");
                                                String selectedAppealID = input.next();

                                                // Find the selected appeal
                                                Appeal selectedAppeal = organizationRepMenu.finAppeal(selectedAppealID);

                                                if (selectedAppeal != null) {
                                                    // Display Appeal Details
                                                    System.out.println("Selected Appeal Details:");
                                                    System.out.println("From Date: " + selectedAppeal.getFormDate());
                                                    System.out.println("To Date: " + selectedAppeal.getToDate());

                                                    // Record Contributions
                                                    System.out.println("Record Contributions:");

                                                    System.out.println("1. Record Cash Donation");
                                                    System.out.println("2. Record Goods Donation");

                                                    System.out.print("Enter Contribution Type (1 or 2): ");
                                                    int contributionType = input.nextInt();

                                                    switch (contributionType) {
                                                        case 1: // Record Cash Donation
                                                            System.out.print("Enter Cash Amount: ");
                                                            int cashAmount = input.nextInt();

                                                            System.out.print("Enter Payment Channel: ");
                                                            String paymentChannel = input.next();

                                                            System.out.print("Enter Reference No: ");
                                                            String referenceNo = input.next();

                                                            // Create CashDonation object
                                                            CashDonation cashDonation = new CashDonation(cashAmount,
                                                                    paymentChannel, referenceNo,
                                                                    new Date(), "CD" + new HelpAid().randomNumber());

                                                            // Add contribution to the appeal
                                                            selectedAppeal.addContribution(cashDonation);

                                                            System.out.println("Cash Donation recorded successfully!");
                                                            break;

                                                        case 2: // Record Goods Donation
                                                            System.out.print("Enter Goods Description: ");
                                                            String goodsDescription = input.next();

                                                            System.out.print("Enter Estimated Value: ");
                                                            int estimatedValue = input.nextInt();

                                                            // Create Goods object
                                                            Goods goods = new Goods(goodsDescription, estimatedValue,
                                                                    new Date(),
                                                                    "GD" + new HelpAid().randomNumber());

                                                            // Add contribution to the appeal
                                                            selectedAppeal.addContribution(goods);

                                                            System.out.println("Goods Donation recorded successfully!");
                                                            break;

                                                        default:
                                                            System.out.println("Invalid contribution type.");
                                                            break;
                                                    }
                                                } else {
                                                    System.out.println(
                                                            "Appeal not found. Please enter a valid Appeal ID.");
                                                }

                                                break;

                                            case 4: // Add Disbursement
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                                System.out.println();
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println(" ".repeat(sideEqualSign) + "Add Disbursement"
                                                        + " ".repeat(sideEqualSign));
                                                System.out.println("=".repeat(lineLength));
                                                System.out.println();

                                                // Show List of Appeals
                                                System.out.println("List of Appeals:");
                                                for (Appeal appeal : organizationRepMenu.getAppeals()) {
                                                    System.out.println("Appeal ID: " + appeal.getAppealID());
                                                    System.out.println("From Date: " + appeal.getFormDate());
                                                    System.out.println("To Date: " + appeal.getToDate());
                                                    System.out.println();
                                                }

                                                // Select Appeal
                                                System.out.print("Enter Appeal ID: ");
                                                String selectedAppealIDDis = input.next();

                                                // Find the selected appeal
                                                Appeal selectedAppealDis = organizationRepMenu
                                                        .finAppeal(selectedAppealIDDis);

                                                if (selectedAppealDis != null) {
                                                    // Display Appeal Details
                                                    System.out.println("Selected Appeal Details:");
                                                    System.out.println("From Date: " + selectedAppealDis.getFormDate());
                                                    System.out.println("To Date: " + selectedAppealDis.getToDate());

                                                    // Select Applicant
                                                    System.out.print("Enter Applicant ID: ");
                                                    String selectedApplicantID = input.next();

                                                    // Find the selected applicant
                                                    Applicant selectedApplicant = organizationRepMenu
                                                            .findRecord(selectedApplicantID);

                                                    if (selectedApplicant != null) {
                                                        // Display Applicant Details
                                                        try {
                                                            System.out.println("Applicant Details:");
                                                            System.out.println(
                                                                    "Name: " + selectedApplicant.getFullname());
                                                            System.out
                                                                    .println("Address: "
                                                                            + selectedApplicant.getAddress());
                                                            System.out.println("Household Income: "
                                                                    + selectedApplicant.getHouseholdIncome());

                                                            // Enter Disbursement Details
                                                            System.out.print("Enter Disbursement Date (yyyy-MM-dd): ");
                                                            String disbursementDateString = input.next();
                                                            Date disbursementDate;
                                                            disbursementDate = new SimpleDateFormat("yyyy-MM-dd")
                                                                    .parse(disbursementDateString);

                                                            System.out.print("Enter Cash Amount: ");
                                                            int cashAmount = input.nextInt();

                                                            System.out.print("Enter Goods Disbursed: ");
                                                            int goodsDisbursed = input.nextInt();

                                                            // Create Disbursement object
                                                            Disbursement disbursement = new Disbursement(
                                                                    disbursementDate, cashAmount, goodsDisbursed);

                                                            // Record Disbursement for the Applicant
                                                            selectedApplicant.addDisbursement(disbursement);
                                                        } catch (ParseException e) {
                                                            // TODO Auto-generated catch block
                                                            e.printStackTrace();
                                                        }

                                                        System.out.println("Disbursement recorded successfully!");
                                                    } else {
                                                        System.out.println(
                                                                "Applicant not found. Please enter a valid Applicant ID.");
                                                    }
                                                } else {
                                                    System.out.println(
                                                            "Appeal not found. Please enter a valid Appeal ID.");
                                                }
                                                break;

                                            default:
                                                break;
                                        }

                                        // System.out.println("Welcome, " + employ.getFullname() + "!");
                                        // System.out.println("You are representing " +
                                        // organizationRepMenu.getOrgName());
                                        break;
                                    }
                                }
                            }
                            if (representativeFound) {
                                break;
                            }
                        }

                        if (!representativeFound) {
                            System.out.println(
                                    "Invalid username or password for organization representative. Please try again.");
                        }

                        System.out.print("Ulangi Menu Organization Representative (Y/N) : ");
                        repeatOrganizationRep = input.next();
                    } while (repeatOrganizationRep.equalsIgnoreCase("Y"));
                    break;

                case 3: // View Appeals
                    do {

                        // Untuk Membersihkan Layar Konsole & menampilkan Header
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println();
                        System.out.println("=".repeat(lineLength));
                        System.out.println(" ".repeat(sideEqualSign) + "View Appeals" + " ".repeat(sideEqualSign));
                        System.out.println("=".repeat(lineLength));
                        System.out.println();

                        // Looping untuk menampilkan Smeua Appeals yang ada
                        for (Organization org : organizations) {
                            if (org.getAppeals() != null && org.getAppeals().size() > 0) {
                                org.printAppeals();
                            }
                        }

                        // Untuk Mendapatkan Detail Dari Appeals yang akan di lihat Donor dan memasukan
                        // Appeals ID
                        System.out.println();
                        System.out.print("Enter the Appeal ID to view details: ");
                        String selectedAppealID = input.next();

                        // Find the selected appeal
                        Appeal selectedAppeal;

                        // Looping Untuk Mendapatkan Appeals
                        for (Organization org : organizations) {
                            selectedAppeal = org.finAppeal(selectedAppealID);
                            if (selectedAppeal != null) {
                                organizationRepMenuViewAppeal = org;
                                break;
                            }
                        }

                        // Menampilkan Detail Dari Appeals dan menampilkan Organisasi Name dan Address
                        if (organizationRepMenuViewAppeal != null) {
                            System.out.println(
                                    "Organization Name: " + organizationRepMenuViewAppeal.getOrgName());
                            System.out.println(
                                    "Organization Address: " + organizationRepMenuViewAppeal.getAddress());
                        } else {
                            System.out.println("Appeal not found. Please enter a valid Appeal ID.");
                        }

                        System.out.print("Do you want to view more appeals? (Y/N): ");
                        repeatViewAppeals = input.next();
                    } while (repeatViewAppeals.equalsIgnoreCase("Y"));
                    break;

                default:
                    break;
            }

            // Untuk Mengulangi System ini
            System.out.print("Apakah Anda Masih Ingin Berada Didalam HelpAid (Y/N) : ");
            repeatMenu = input.next();
        } while (repeatMenu.equalsIgnoreCase("Y"));

    }
}