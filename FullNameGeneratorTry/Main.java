package com.pluralsight;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your suffix if you have one: ");
        String suffix = scanner.nextLine();
        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        if (!suffix.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
        }else{
            fullName = firstName + " " + middleName + " " + lastName;
        }
        System.out.println(fullName);
    }
}