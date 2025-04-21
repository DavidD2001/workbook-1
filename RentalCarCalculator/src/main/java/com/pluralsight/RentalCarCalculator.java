package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        //Questions input:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date you want to pickup: ");
        String date = scanner.nextLine();
        System.out.println("Please enter the number of days you want to rent: ");
        int days = scanner.nextInt();
        System.out.println("Do you want an electronic toll tag for $3.95/day?(Yes/No): ");
        String electronic = scanner.nextLine();
        System.out.println("Would you want like a GPS for $2.95/day?(Yes/No): ");
        String location = scanner.nextLine();
        System.out.println("Would you like roadside assistance for 3.95/day?(Yes/No): ");
        String roadside = scanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        //
        double basicCar = 29.99;
        double YesNo = 0.0;
        double totalCar = basicCar * days;

        if (electronic.equalsIgnoreCase("yes")) {
            YesNo += 3.95 * days;
        }
        if (location.equalsIgnoreCase("yes")) {
            YesNo += 2.95 * days;
        }
        if (roadside.equalsIgnoreCase("yes")) {
            YesNo += 3.95 * days;
        }
        double surcharge = 0.0;
        if (age < 25) {
            surcharge = totalCar * 0.30;
        }
        double totalRent = totalCar + YesNo + surcharge;

        System.out.println("Pick-Up Date: " + date);
        System.out.println("Base package Fee: " + totalCar);
        System.out.println("Premium Fee: " + YesNo);
        System.out.println("Underage(younger than 25) surcharge: " + surcharge);
        System.out.println("Total: " + totalRent);

        scanner.close();



    }
}