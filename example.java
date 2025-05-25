import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class example {
    static class details{
        String name;
        String id;
        String pin;
        double balance;
        double amount;
        String transaction;
        LinkedList<Double>joan;
        LinkedList<String>list;
        Stack<Double>stack;
        Stack<String>stack2;

        public details(String name, String id, String pin,double balance,double amount){
            this.name = name;
            this.id = id;
            this.pin = pin;
           this.balance = balance;
           this.amount = amount;
           this.transaction ="";
           list = new LinkedList<>();
           joan = new LinkedList<>();
           stack = new Stack<>();
           stack2 = new Stack<>();


        }
        public void add_farmer(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name");
            name = input.next();
            System.out.println("Enter your id");
            id = input.next();
            System.out.println("Enter your pin");
            pin = input.next();
            list.add(name);
            list.add(id);
            list.add(pin);
            System.out.println("farmer registered successfully");

            System.out.println("\n***LOGIN***");
            System.out.println("Enter your name");
            String e_name = input.next();
            if(name.equals(e_name)){
                System.out.println("enter your pin");
                String entered_pin = input.next();
                if(Objects.equals(entered_pin, pin)){
                    while(true){
                        System.out.println("***SACCO***");
                        System.out.println("1.Deposit");
                        System.out.println("2.Withdraw");
                        System.out.println("3.check balance");
                        System.out.println("4.view last transaction");
                        System.out.println("5.exit");
                        int choice = input.nextInt();
                        switch(choice){
                            case 1:
                               deposit();
                               break;
                               case 2:
                                   withdraw();
                                   break;
                                   case 3:
                                       check_balance();
                                       break;
                                       case 4:
                                           last_transaction();
                                            case 5:
                                           System.out.println("logging out");
                                           System.exit(0);
                                           break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    }
                }else {
                    System.out.println("incorrect pin");
                }
          }else {
                System.out.println("invalid username");
            }
        }
        public void deposit(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount to deposit");
            amount = input.nextDouble();
           balance = balance + amount;
           joan.add(balance);
           transaction="deposit";
           stack2.push(transaction);
           stack.push(balance);
           System.out.println("deposit of "+amount+" successful");
            System.out.println("your new balance is "+balance);
        }
        public void withdraw(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount to withdraw");
            amount = input.nextDouble();
            if(amount <= balance){
                balance = balance - amount;
                joan.add(balance);
                transaction="withdraw";
                stack2.push(transaction);
                stack.push(balance);
                System.out.println("Withdraw of "+amount+" successful");
            }else {
                System.out.println("insufficient balance");
            }
        }
        public void check_balance(){
            System.out.println("name\t:\t"+name+"\nid\t\t:\t"+id+"\nbalance\t:\t"+balance);
        }
        public void last_transaction(){
            if (Objects.equals(transaction, "withdraw")){
                System.out.println(transaction+" of "+stack.peek());
            }else if(Objects.equals(transaction, "deposit")){
                System.out.println(transaction+" of "+stack.peek());
            }else {
                System.out.println("No transaction found");
            }

        }
    }
    }

