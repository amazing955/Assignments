package com.vehicle;

import java.util.Scanner;

public class ElectricCar extends car {

        private double BatteryLevel;

        public double GetBatteryLevel;
        public void SetBatteryLevel(double battery){
            this.BatteryLevel = battery;
            System.out.println("Enter the power on amount of the battery");
            Scanner input = new Scanner(System.in);
            battery = input.nextDouble();
            if(battery >=0 && battery <=100){
                if(battery <= 15){
                    System.out.println("Low battery");
                    BatteryLevel += battery;
                }else if(battery > 15 && battery <100){
                    System.out.println("Half battery");
                }else if(battery == 100){
                    System.out.println("full battery");
                    BatteryLevel += battery;
                }
            }else{
                System.out.println("invalid input");
            }

        }
        public double GetBatteryLevel(){
            System.out.println("The battery level is"+BatteryLevel);
            return BatteryLevel;
        }
        @Override
        public void drive(int distance){
            super.drive(distance);

        }
        }
