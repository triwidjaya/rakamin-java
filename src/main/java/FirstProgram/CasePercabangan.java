package FirstProgram;

import java.util.Scanner;
public class CasePercabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = scanner.nextInt();
        String grade;

        if (true == nilai > 90) {
            ;
            grade = "A";
        } else if (true == nilai > 80) {
            ;
            grade = "AB";
        } else if (true == nilai > 70) {
            ;
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Grade adalah " + grade);
    }
}
