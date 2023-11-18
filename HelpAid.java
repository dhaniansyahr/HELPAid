import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class HelpAid {
    public static void main(String[] args) {

        // Untuk Membuat center text
        int lineLength = 50;
        int sideEqualSign = (lineLength - 8) / 2;

        int chooseMenu;

        System.out.println("=".repeat(lineLength));
        System.out.println(" ".repeat(sideEqualSign) + "HELP AID" + " ".repeat(sideEqualSign));
        System.out.println("=".repeat(lineLength));
        System.out.println();
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println();
        System.out.println("=".repeat(lineLength));
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Pilihan Menu: ");
        chooseMenu = input.nextInt();

        int chooseUser;

        String username, password, fullname, email, mobileNo, IDno, address,
                householdIncome;

        List<User> users = new ArrayList<>(); // Initialize the users list
        // List<User> users;

        switch (chooseMenu) {
            case 1:
                System.out.println("Login");
                break;
            case 2:
                // System.out.println("CLS");
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("=".repeat(lineLength));
                System.out.println(" ".repeat(sideEqualSign) + "REGISTER" + " ".repeat(sideEqualSign));
                System.out.println("=".repeat(lineLength));
                System.out.println();
                System.out.println("1. Aid Applicant");
                System.out.println("2. Donor");
                System.out.println("3. Organization Repsentative");
                System.out.println();
                System.out.println("=".repeat(lineLength));
                System.out.println();
                System.out.print("Masukan Pilihan User: ");
                chooseUser = input.nextInt();

                switch (chooseUser) {
                    case 1:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("=".repeat(lineLength));
                        System.out.println(
                                " ".repeat(sideEqualSign) + "REGISTER AID APPLICANT" + " ".repeat(sideEqualSign));
                        System.out.println("=".repeat(lineLength));
                        System.out.println();
                        System.out.print("Username: ");
                        username = input.next();
                        System.out.print("Password: ");
                        password = input.next();
                        System.out.print("Fullname: ");
                        input.nextLine();
                        fullname = input.nextLine();
                        System.out.print("Email: ");
                        // input.nextLine();
                        email = input.next();
                        System.out.print("Mobile No: ");
                        mobileNo = input.next();
                        System.out.print("ID No: ");
                        IDno = input.next();
                        System.out.print("Address: ");
                        input.nextLine();
                        address = input.nextLine();
                        System.out.print("Household Income: ");
                        // input.nextLine();
                        householdIncome = input.nextLine();

                        Applicant applicant = new Applicant(username, password, fullname, email, mobileNo, IDno,
                                address, householdIncome);

                        users.add(applicant);

                        System.out.println("Success Register");
                        break;

                    case 2:
                        System.out.println("Donor");
                        break;

                    case 3:
                        System.out.println("Organization Repsentative");
                        break;

                    default:
                        break;
                }

                break;

            default:
                break;
        }

        users.forEach((user) -> {
            System.out.println(user + "\n" + user.getUsername() + "\n" + user.getPassword() + "\n" + user.getFullname()
                    + "\n" + user.getEmail() + "\n" + user.getMobileNo());
        });
        // System.out.println(users);
    }
}