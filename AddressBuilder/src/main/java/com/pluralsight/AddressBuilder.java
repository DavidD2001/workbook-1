package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        //create a StringBuilder object
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: \n");
        //Ask for the name
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        //Make Strings out of the prompt:
        System.out.println("Please enter your Billing Street: ");
        String billingStreet = scanner.nextLine();
        System.out.println("Please enter your billing City: ");
        String billingCity = scanner.nextLine();
        System.out.println("Please enter your billing State(Ex: CA): ");
        String billingState = scanner.nextLine();
        System.out.println("Please enter your billing Zip: ");
        String billingZip = scanner.nextLine();

        //Ask the user for the shipping address
        System.out.println("Please enter your shipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.println("Please enter your shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.println("Please enter your shipping State(Ex: CA): ");
        String shippingState = scanner.nextLine();
        System.out.println("Please enter your shipping Zip: ");
        String shippingZip = scanner.nextLine();

        //Append with the Stringbuilder
        System.out.println(name + '\n');
        System.out.println("Billing Address: ");
        //billing apend.
        billingAddress.append(billingStreet + '\n');
        billingAddress.append(billingCity + ", " + billingState + " " + billingZip + '\n');
        System.out.println(billingAddress.toString());
        //Shipping apend.
        System.out.println("Shipping Address: ");
        shippingAddress.append(shippingStreet + '\n');
        shippingAddress.append(shippingCity + ", " + shippingState + " " + shippingZip + '\n');
        //print the new String append out.
        System.out.println(shippingAddress.toString());




    }
}