import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

public class HelpAid {

    public int randomNumber() {
        return (int) (Math.random() * 1000000);
    }

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

        int chooseMenu, chooseMenuOrgRep;
        String repeatMenu, repeatAdmin, repeatOrganizationRep, repeatViewAppeals;

        // Untuk Admin
        String usernameAdmin, passwordAdmin;
        Organization selectedORG = new Organization();
        Organization organizationRepMenuViewAppeal = new Organization();

        // Untuk Organization Representative
        String usernameOrgRep, passwordOrgRep, email, fullname, mobileNo, jobTitle;
        // List<OrganizationRep> employs = new ArrayList<>();

        // Untuk Applicant
        String usernameApp, passwordApp, fullnameApp, emailApp, mobileNoApp, IDnoApp, addressApp, householdIncomeApp;
        String submitDoc;

        Scanner input = new Scanner(System.in);

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
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("Masukan Username Admin: ");
                        usernameAdmin = input.next();
                        System.out.print("Masukan Password Admin: ");
                        passwordAdmin = input.next();

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
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println();
                        System.out.println("=".repeat(lineLength));
                        System.out.println(" ".repeat(sideEqualSign) + "View Appeals" + " ".repeat(sideEqualSign));
                        System.out.println("=".repeat(lineLength));
                        System.out.println();

                        for (Organization org : organizations) {
                            // System.out.println("Appeals for " + org.getOrgName() + ": " +
                            // org.getAppeals());
                            if (org.getAppeals() != null && org.getAppeals().size() > 0) {
                                org.printAppeals();
                            }
                            // org.printAppeals();
                        }

                        System.out.println();
                        System.out.print("Enter the Appeal ID to view details: ");
                        String selectedAppealID = input.next();

                        // Find the selected appeal
                        Appeal selectedAppeal;

                        for (Organization org : organizations) {
                            selectedAppeal = org.finAppeal(selectedAppealID);
                            if (selectedAppeal != null) {
                                organizationRepMenuViewAppeal = org;
                                break;
                            }
                        }

                        if (organizationRepMenuViewAppeal != null) {
                            System.out.println(
                                    "Organization Name: " + organizationRepMenuViewAppeal.getOrgName());
                            System.out.println(
                                    "Organization Address: " + organizationRepMenuViewAppeal.getAddress());
                            // Any other details you want to display
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

            System.out.print("Apakah Anda Masih Ingin Berada Didalam HelpAid (Y/N) : ");
            repeatMenu = input.next();
        } while (repeatMenu.equalsIgnoreCase("Y"));

    }
}