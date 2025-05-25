package com.vehicle;

import java.util.Scanner;

public class car {
    private double speedkph;
    private float fuellevel;
    private int distance_travelled;

    public void setspeed(double speed) {
        this.speedkph = speed;
        System.out.println("Enter the speed");
        Scanner input = new Scanner(System.in);
        speed = input.nextDouble();
        speedkph += speed;
    }

    public void setfuellevel(float fuel) {
        this.fuellevel = fuel;
        System.out.println("Enter the fuel Amount not more than 100 liters");
        Scanner input = new Scanner(System.in);
        fuel = input.nextFloat();
        if (fuellevel >= 0.0 && fuellevel <= 100.0) {
            if (fuel == 0.0) {
                System.out.println("Fuel tank is Empty");
                fuellevel += fuel;
            } else if (fuel > 0.0 && fuel <= 100.0) {
                System.out.println("Fuel tank is half");
                fuellevel += fuel;
            } else if (fuel == 100.0) {
                System.out.println("Fuel tank is Full");
                fuellevel += fuel;
            } else {

            }

        }

    }

    public void drive(int distance) {
        this.distance_travelled = distance;
        System.out.println("Enter the number of hours taken");
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        double output = (double) distance;
        output = speedkph / time;
        System.out.println("The distance covered is " + output);
    }

    public double GetSpeed() {
        System.out.println("The speed is " + speedkph + "kilometer per hour");
        return speedkph;
    }

    public int GetDistanceKm() {
        System.out.println("The distance covered is " + distance_travelled + "km");
        return distance_travelled;
    }

    public int calculateRemainingFuel(double distance) {
        System.out.println("Enter the Amount of current fuel");
        Scanner Input = new Scanner(System.in);
        float OriginalFuel = Input.nextFloat();
        double currentfuel = OriginalFuel - (distance_travelled * 0.5);
        System.out.println("The amount of current fuel is " + currentfuel + "Liters and the distance is " + distance_travelled + "Km");
        return (int) currentfuel;
    }
}


