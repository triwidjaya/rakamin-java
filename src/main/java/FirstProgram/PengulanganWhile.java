package FirstProgram;

import java.util.Scanner;

public class PengulanganWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ready? ");
        String ulangi = scanner.nextLine();
        System.out.println("Start");
        int counter = 0;

        while (ulangi.equals(1) || ulangi.equalsIgnoreCase("yes")){
            System.out.println("Apakah anda mau mengulang? (yes/no): ");
            String jawab = scanner.nextLine();
            counter++;

            if (!jawab.equalsIgnoreCase("yes")){
                ulangi = "0";
            }

            System.out.println("Pengulangan ke-" + counter);
        }
    }
}
