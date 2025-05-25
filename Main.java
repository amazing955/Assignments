import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
while (true){

    System.out.println("***WELCOME***");
    System.out.println("1.Register farmer");
    System.out.println("2.exit");
    System.out.println("Enter your choice");
    Scanner in = new Scanner(System.in);
    int choice = in.nextInt();
    example.details farm=new example.details("","","",0,0);
    switch(choice){
        case 1:
           farm.add_farmer();
           break;
           case 2:
                   System.out.println("Thank you for using our service");
                   System.exit(0);
                   break;
        default:
            System.out.println("Invalid option");

    }
}
    }
}
