import com.vehicle.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    while (true){
        System.out.println("...MERCEDES...");
        System.out.println("1.Fuel System");
        System.out.println("2.Electric System");
        System.out.println("Enter your choice");
        int choice;
        Scanner input=new Scanner(System.in);
        choice=input.nextInt();
        switch(choice){
            case 1:
                car fuel=new car();
                fuel.setspeed(0);
                fuel.setfuellevel(0);
                fuel.GetSpeed();
                fuel.GetDistanceKm();
                fuel.drive(0);
                fuel.calculateRemainingFuel(0);
                break;
                case 2:
                    ElectricCar perform=new ElectricCar();
                    perform.setspeed(0);
                    perform.SetBatteryLevel(0);
                    perform.GetSpeed();
                    perform.GetDistanceKm();
                    perform.drive(0);
                    perform.GetBatteryLevel();
                    break;
                        }
                    }
        }
    }

