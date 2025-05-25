import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        while(true){
            System.out.println("AMAZING HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("welcome to management system");
            System.out.println("1.patient");
            System.out.println("2.administrator");
            System.out.println("3.staff");
            System.out.println("4.stock");
            System.out.println("5.about");
            System.out.println("6.exit");
            System.out.println("Enter your choice: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("1. REGISTRATION: ");
                    System.out.println("2. SERVICES");
                    break;
            }
        }
    }
}