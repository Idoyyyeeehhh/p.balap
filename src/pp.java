import java.util.Scanner;

public class pp {

    public static void main(String[] args) {
        //Variable
        String nim;
        int i = 0;
        int pilih;
        String user;
        String pass;
        Scanner var = new Scanner(System.in);

        do{
            System.out.print("=== Library System ===");
            System.out.print("1. Login As Student");
            System.out.print("2. Login As Admin");
            System.out.print("3. Exit");
            System.out.print("Chose Option (1-3) : ");

            pilih = var.nextInt();

            switch(pilih) {
                case '1':
                    System.out.print("Enter Your Nim : ");
                    nim = var.nextLine();
                    if(nim.equals("202310370311353")) {
                        System.out.print("Succesfully Login as Student");
                    }else {
                        System.out.print("User Not Found");
                    }
                    break;
                case '2':
                    System.out.print("Enter Your Username (Admin) : ");
                    user = var.nextLine();
                    System.out.print("Enter Your Password (Admin) : ");
                    pass = var.nextLine();

                    if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
                        System.out.print("Succesfull login as Admin");
                    } else {
                        System.out.print("Admin User Not Found");
                    }
                    break;
                case '3':
                    System.out.print("adios");
                    break;

                default:
                    System.out.print("Pilihan tidak valid");
            }


        } while (i < 4);
    }
}