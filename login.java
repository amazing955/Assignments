import java.util.LinkedList;
import java.util.Scanner;

public class login {
static class user{
    String name;
    String  age;
    String email;
    String password;
    LinkedList<String> users;

    public user(String name, String  age, String email, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        users = new LinkedList<>();

    }
    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        name = scanner.next();
        System.out.println("please enter your age");
        age = scanner.next();
        System.out.println("please enter your email");
        email = scanner.next();
        System.out.println("please enter your password");
        password = scanner.next();

        users.add(name);
        users.add(age);
        users.add(password);
        users.add(email);

        System.out.println("Registered successfully");
    }

    public void display() {
        for (String olivier : users) {
            System.out.println("Name\t\t:\t"+name+"\nage\t\t\t:\t"+age+"\nemail\t\t:\t"+email+"\npassword\t:\t"+password);
        }
    }
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        name = scanner.next();
            if (users.contains(name)) {
                System.out.println("enter your password");
                String entered_password = scanner.next();
              if (entered_password.equals(password)) {
                    store();

            }else {
                  System.out.println("incorrect password");
              }
            } else {
                System.out.println("invalid user name");
            }
        }

    public void forgot_password(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your email");
        email = scanner.next();
        if(users.contains(email)){
            display();
        }else {
            System.out.println("Email does not exist");
        }
    }
    public void store(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("MY NOTE BOOK");
        System.out.println("enter the title");
        String book_title = scanner.next();
        System.out.println("type your work here");
        String text= scanner.next();
        System.out.println("title\n"+book_title+"text"+text);
        LinkedList<String> book;
        book = new LinkedList<>();
        book.add(book_title);
        book.add(text);
        System.out.println("\n\n\nbook saved successfully");

    }
}

}
