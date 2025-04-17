package com.pluralsight;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Step 1: Ask the user for their full name, date of the show and the number of tickets.
        System.out.println("Please enter the name for Reservation: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the date you wish to reserve(MM/DD/YYYY): ");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        String formattedDate = parsedDate.format(dateFormatter);

        System.out.println("How many tickets would you like?: ");
        int ticketAmount = scanner.nextInt();

        if (ticketAmount <= 1) {
            System.out.println(ticketAmount + " ticket has been reserved for " + formattedDate + " under the name " + name);
        } else {
            System.out.println(ticketAmount + " tickets have been reserved for " + formattedDate + " under the name " + name);;
        }
    scanner.close();







    }
}