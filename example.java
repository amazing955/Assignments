import java.util.*;

public class example {
    static HashMap<String, String>authentication= new HashMap<>();
    static LinkedList<Double>list = new LinkedList<>();
    static class details {
        String name;
        String id;
        String pin;
        String password;
        double loan_balance;
        double balance;
        double amount;
        String telephone_number;
        String email;
        String transaction;
        Stack<String> stack;
        Scanner input = new Scanner(System.in);

        public details(String name, String id, String pin, String password, double loan_balance, double balance, double amount, String telephone_number, String email) {
            this.name = name;
            this.id = id;
            this.pin = pin;
            this.balance = balance;
            this.amount = amount;
            this.transaction = "";
            this.password = password;
            this.loan_balance = loan_balance;
            this.telephone_number = telephone_number;
            this.email = email;
            stack = new Stack<>();


        }

        public void add_farmer() {
            System.out.println("Enter your name");
            name = input.next();
            if(!authentication.containsKey(name)){
            System.out.println("Enter your ID Number");
            id = input.next();
            System.out.println("Enter your pin");
            pin = input.next();
            System.out.println("Enter your password");
            password = input.next();
            System.out.println("Enter your email");
            email = input.next();
            System.out.println("Enter your telephone number");
            telephone_number = input.next();
            authentication.put(name, password);
            authentication.put(telephone_number, password);
            authentication.put(email, email);
            authentication.put(pin, pin);
            System.out.println("farmer registered successfully");
        }else{
                System.out.println("user already exists");
            }
        }

        public void login() {
            int attempts = 1;
            String login_key;
            String entered_password;
            do {
                System.out.println("Login with user name or telephone number");
                System.out.println("Enter your name or telephone number");
                login_key = input.next();
                if (authentication.containsKey(login_key)) {
                    System.out.println("enter your password");
                    entered_password = input.next();
                    if (authentication.get(login_key).equals(entered_password)) {
                        while (true) {
                            System.out.println("***SACCO***");
                            System.out.println("1.Deposit");
                            System.out.println("2.Withdraw");
                            System.out.println("3.check balance");
                            System.out.println("4.Loans");
                            System.out.println("5.view last transaction");
                            System.out.println("6. Change pin");
                            System.out.println("7.exit");
                            System.out.println("Enter your choice");
                            int choice = input.nextInt();
                            switch (choice) {
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
                                    System.out.println("1. Get loan");
                                    System.out.println("2.Pay loan");
                                    System.out.println("3.Loan Balance");
                                    System.out.println("Enter your choice");
                                    int option = input.nextInt();
                                    if (option == 1) {
                                        get_loan();
                                    } else if (option == 2) {
                                        pay_loan();

                                    } else if (option == 3) {
                                        loan_balance();
                                    } else {
                                        System.out.println("Invalid choice");
                                    }
                                    break;
                                case 5:
                                    last_transaction();
                                    break;
                                case 6:
                                    change_pin();
                                    break;
                                case 7:
                                    System.out.println("Thank you for using our services");
                                    System.exit(0);
                                default:
                                    System.out.println("Invalid choice");
                            }
                        }
                    } else {
                        System.out.println("invalid password on attempt " + attempts);
                    }
                } else {
                    System.out.println("invalid username or password on attempt " + attempts);
                }
                attempts++;
            } while (attempts < 4 && !authentication.containsKey(name));
        }

        public void deposit(){
            System.out.println("Enter amount to deposit");
            amount = input.nextDouble();
           balance = balance + amount;
           transaction="Deposit of "+amount+"successful";
           list.add(balance);
           stack.push(transaction);
           System.out.println("deposit of "+amount+" successful");
            System.out.println("Your new balance is "+balance);
        }
        public void withdraw(){
            int attempts = 1;
            do {
                System.out.println("You are only allowed to enter your pin 3 Times");
                System.out.println("Enter your pin");
                pin=input.next();
                if(authentication.containsKey(pin)) {
                    System.out.println("Enter amount to withdraw");
                    amount = input.nextDouble();
                    if (amount <= balance) {
                        balance = balance - amount;
                        list.add(balance);
                        transaction = "Withdraw of " + amount + "Successful";
                        stack.push(transaction);
                        System.out.println("Withdraw of " + amount + " successful");
                    } else {
                        System.out.println("insufficient balance");
                    }
                    attempts ++;
                }else{
                    System.out.println("Invalid pin on attempt "+attempts);
                }

                }while (attempts < 4 && !authentication.containsKey(pin));
        }
        public void check_balance() {
            int attempts = 1;
            do {
                System.out.println("Enter your pin");
                pin = input.next();
                if (authentication.containsKey(pin)) {

                    System.out.println("balance\t:\t" + balance);
                } else {
                    System.out.println("incorrect pin on attempt " + attempts);
                }
                attempts++;
            } while (attempts < 4 && !authentication.containsKey(pin));
        }
        public void last_transaction() {
            int attempts = 1;
            do {
                System.out.println("Enter your pin");
                pin = input.next();
                if (authentication.containsKey(pin)) {
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());

                    } else {
                        System.out.println("No transaction found");
                    }
                } else {
                    System.out.println("Invalid pin");
                }
                attempts++;
            } while (attempts < 4 && !authentication.containsKey(pin));
        }
        public void recover_password() {
            int trial = 1;
            String entered_email;
            do {
                System.out.println("Enter your email");
                entered_email = input.next();
                if (authentication.containsKey(entered_email)) {
                    System.out.println(authentication);
                } else {
                    System.out.println("Invalid Email");
                }
                trial++;
            } while (trial < 4 && !authentication.containsKey(entered_email));
        }
        public void get_loan(){
            int attempts =1;
            do{
                System.out.println("Enter pin to accept terms and conditions");
                pin =input.next();
                if(authentication.containsKey(pin)){
                    System.out.println("Enter amount to borrow");
                    amount =input.nextDouble();
                    System.out.println("Enter your monthly income");
                    double income =input.nextDouble();
                    double loan_limit= 50000000.0;
                    double monthly_profit = 0.1*amount;
                    double monthly_total = amount+monthly_profit;
                    double three_months_profit =0.35*amount;
                    double three_month_total = three_months_profit+amount;
                    if (amount < income && amount<loan_limit){
                        System.out.println("****Terms and conditions****");
                        System.out.println("1.Monthly\namount\t:\t"+amount+"Profit\t:\t"+monthly_profit+"\n Total\t:\t"+monthly_total);
                        System.out.println("2.Three months\namount\t:\t "+amount+ "Profit\t:\t"+three_months_profit+ "\n Total\t:\t"+three_months_profit);
                        System.out.println("Enter your choice");
                        int choice = input.nextInt();
                        if(choice ==1){
                            loan_balance=monthly_total;
                            balance+=amount;
                            transaction ="Attained a loan of"+amount+"Shillings";
                            stack.push(transaction);
                            System.out.println("Loan processed successfully, you can check your balance");
                        }else if(choice==2){
                            loan_balance=three_month_total;
                            balance+=amount;
                            transaction ="Attained a loan of"+amount+"Shillings";
                            stack.push(transaction);
                            System.out.println("Loan processed successfully, you can check your balance");

                        }else{
                            System.out.println("invalid choice");
                        }
                    }else{
                        System.out.println("You are not eligible for loan\nTry for amount less than your monthly earnings");
                    }
                }
                attempts++;
            }while (attempts < 4 && !authentication.containsKey(pin));
        }
        public void pay_loan(){
            int attempts = 1;
            do {
                System.out.println("Enter your pin code");
                pin = input.next();
                if (authentication.containsKey(pin)) {
                    System.out.println("Enter amount to pay");
                    amount = input.nextDouble();
                    if (amount < balance) {
                        double Outstanding = loan_balance - amount;
                        loan_balance = Outstanding;
                        transaction = "loan payment of " + amount + "Successful";
                        stack.push(transaction);
                        System.out.println("You have successfully payed " + amount + " and you have an outstanding balance of " + Outstanding);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                } else {
                    System.out.println("Invalid pin");
                }
                attempts++;

            }while(attempts < 4 && !authentication.containsKey(pin));
        }
        public void loan_balance(){
            int attempts = 1;
            do {
                System.out.println("Enter your pin code");
                pin = input.next();
                if (authentication.containsKey(pin)) {
                    System.out.println("loan balance \t:\t"+loan_balance);
                }else{
                    System.out.println("Invalid pin");
                }
                attempts++;
            }while (attempts < 4 && !authentication.containsKey(pin));
        }
        public void change_pin(){
                System.out.println("Enter your old pin code");
                pin = input.next();
                if (authentication.containsKey(pin)) {
                    System.out.println("Enter new pin code");
                    String pin1 = input.next();
                    System.out.println("Confirm your new pin code");
                    String pin2 = input.next();
                    if(Objects.equals(pin1, pin2)){
                        authentication.remove(pin, pin);
                        authentication.put(pin2, pin2);
                        System.out.println("Pin changed successfully");
                    }else {
                        System.out.println("pin mismatch");
                    }
                }else{
                    System.out.println("Invalid pin");
                }
            }
        }

    }


