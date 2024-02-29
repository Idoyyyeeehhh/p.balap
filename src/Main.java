import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner p_balap = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int coba = p_balap.nextInt();

            switch (coba) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String studentNIM = p_balap.next();
                    if (studentNIM.length() >= 15 && "202310370311387".equals(studentNIM)) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String username = p_balap.next();
                    System.out.print("Enter your password (admin): ");
                    String password = p_balap.next();
                    if (username.equals("Dhyyss") && password.equals("Rafiganteng")) {
                        System.out.println("Successfull Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    selesai = true;
                    System.out.println("Done bg");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }

        p_balap.close();
    }
}