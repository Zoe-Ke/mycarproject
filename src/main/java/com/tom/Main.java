package com.tom;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int fee = 30;

    public static void main(String[] args) {
        List<Car> Cars = new ArrayList<>();
        System.out.println("Welcome to my parking lot!");
        int func = 0;
        while (func != 4) {
            System.out.println("(1)entering time");
            System.out.println("(2)leaving time");
            System.out.println("(3)ststus");
            System.out.println("(4)exit");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            func = Integer.parseInt(number);
            switch (func) {
                case 1:
                    System.out.println("Please enter your car id");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    Cars.add(c);
                    System.out.println("Car added");
                    break;
                case 3:
                    for (Car car : Cars) {
                        System.out.println(car.id + "/" + car.enter + "/" + car.leave);
                    }
                    break;

            }
        }
    }
}
