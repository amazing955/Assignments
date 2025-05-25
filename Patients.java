import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Patients {

    static class PATIENT {
        int id;
        String name;
        String gender;
        String date_of_birth;
        String address;
        String phone_number;
        String email;
        LinkedList<String> medical_history;
        Stack<String> previous_record;

        public PATIENT(int id, String name, String gender, String date_of_birth, String address, String phone_number, String email) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.address = address;
            this.phone_number = phone_number;
            this.email = email;
            this.date_of_birth = date_of_birth;
            this.medical_history = new LinkedList<>();
            this.previous_record = new Stack<>();
        }
        static LinkedList<PATIENT> details = new LinkedList<>();
    }
    public void add_patient() {
        int id;
        String name;
        String gender;
        String date_of_birth;
        String email;
        String address;
        String phone_number;
        System.out.println("enter the id");
        Scanner input = new Scanner(System.in);
        id = input.nextInt();
        System.out.println("enter your name");
        name = input.nextLine();
        System.out.println("enter your gender");
        gender = input.nextLine();
        System.out.println("enter your date_of_birth");
        date_of_birth = input.nextLine();
        System.out.println("enter your address");
        address = input.nextLine();
        System.out.println("enter your phone number");
        phone_number = input.nextLine();
        System.out.println("enter your email");
        email = input.nextLine();
        System.out.println("NAME:"+name+"\nGENDER:"+gender+"\nDATE OF BIRTH:"+date_of_birth+"\nADDRESS:"+address+"\nPHONE:"+phone_number+"EMAIL:\n"+email+"REGISTRATION SUCCESSFUL");
        PATIENT new_patient = new PATIENT(id, name, gender, date_of_birth, address, phone_number, email);
        PATIENT.details.add(new_patient);
    }
    public static void services(){
        while(true){
            int choice2 = 0;
            System.out.println("1.Pharmacy");
            System.out.println("2.Consultations");
            System.out.println("3.Dental");
            System.out.println("4.Check Up");
            System.out.println("5.Maternity");
            System.out.println("6.exit");
            System.out.println("Choose Services:");
            Scanner input = new Scanner(System.in);
            choice2 = input.nextInt();
            switch (choice2){
                case 1:
                    int choice3 = 0;
                    System.out.println("...PHARMACY...");
                    System.out.println("1.Medications");
                    System.out.println("2.Child Care Items");
                    System.out.println("3.Updates");
                    System.out.println("4.Price List");
                    System.out.println("5.exit");
                    System.out.println("enter your choice");
                    choice3 = input.nextInt();
                    if(choice3==1){
                        System.out.println("Please Come To The pharmacy unit an pick your well prescribed drug");
                    }else if(choice3==2){
                        System.out.println("Please come to the child care unit");
                    }else if(choice3==3){
                        System.out.println("We have restocked every thing please visit the pharmacy unit");
                    }else if(choice3==4){
                        System.out.println(".......NOT AVAILABLE...PLEASE TRY AGAIN LATER.....");
                    }else if(choice3==5){
                        System.out.println("....exit....");
                    }else{
                        System.out.println("invalid input!!!!!");
                    }
                    break;
                case 2:
                    int choice4 = 0;
                    System.out.println("...CONSULTATION...");
                    System.out.println("1.Counselling");
                    System.out.println("2.Meet A Medical Personnel");
                    System.out.println("3.exit");
                    System.out.println("enter your choice");
                    choice4 = input.nextInt();
                    if(choice4==1){
                        System.out.println("Please Come To our counselling unit every monday, wednesday, Friday");
                        System.out.println("NOTE: THIS SERVICE IS COMPLETELY FREE OF CHARGE");
                        System.out.println("your health is our priority\n");
                    }else if(choice4==2){
                        System.out.println("1. physically\n2. phone call");
                        int meet = 0;
                        System.out.println("Enter your choice");
                        meet = input.nextInt();
                        if(meet==1){
                            System.out.println("call us in 0781901653");
                        }else{
                            System.out.println("reach out to the medical assistant on the main block B3 on ground floor");
                            System.out.println("YOUR HEALtH MATTERS");
                        }
                    }else if(choice4==3){
                        System.out.println("Thank you for using our services... ");
                    }
                    break;
                case 3:
                    int choice5 = 0;
                    System.out.println("...DENTAL...");
                    System.out.println("1.Dental Examination");
                    System.out.println("2.Teeth Cleaning");
                    System.out.println("3.Treatment");
                    System.out.println("4.exit");
                    System.out.println("enter your choice");
                    choice5 = input.nextInt();
                    if(choice5==1){
                        System.out.println("Please Come To Dental Examination");
                        System.out.println("YOUR HEALtH MATTERS");
                    }
                    break;
                case 4:
                    int choice6 = 0;
                    System.out.println("..CHECK UP...");
                    System.out.println("1.Blood Pressure");
                    System.out.println("2.Heart Rate");
                    System.out.println("3.Respiratory Rate");
                    System.out.println("4.Temperature");
                    System.out.println("5.Others");
                    System.out.println("6.exit");
                    System.out.println("enter your choice");
                    choice6 = input.nextInt();
                    break;
                case 5:
                    int choice7 = 0;
                    System.out.println("...MATERNITY...");
                    System.out.println("1.Antenatal Care");
                    System.out.println("2.Labor And Delivery");
                    System.out.println("3.Postnatal Care");
                    System.out.println("4.Family Planning");
                    System.out.println("5.Others");
                    System.out.println("6.exit");
                    System.out.println("enter your choice");
                    choice7 = input.nextInt();
                case 6:
                    System.out.println("......exiting services......");
                    System.exit(0);
                    break;
            }

        }
    }
}