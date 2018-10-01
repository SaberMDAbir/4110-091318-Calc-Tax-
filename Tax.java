/*
MD Abir A. Choudhury
091318
HW 2 - Tax

The Program should ask the user to enter the price of an item and 
the quantity, then calculate the subtotal, taxes and the total 
using NY sales tax rate 8.75%. The program should accept only 
positive values for the price and the quantity, display an 
error message otherwise.
Write a Java program that solve the above problem 
*/

import java.util.Scanner;
import java.io.*;

public class Tax{
    // error check method for positive value
    public static double errorCheck(double num) {
        Scanner S = new Scanner(System.in);
        if(num < 0) {
            System.out.println("Please input a valid number greater than zero.: ");
            num = S.nextDouble();
            errorCheck(num);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        //variable declarations
        double priceItem = 0.00;
        double quantity = 0.00;

        System.out.println("Enter the price of an item: ");
        priceItem = S.nextDouble();
        priceItem = errorCheck(priceItem);
        if(priceItem < 0) {
            priceItem = priceItem * -1;
        }
        System.out.println("Enter the quantity of that item: ");
        quantity = S.nextDouble();
        quantity = errorCheck(quantity);
        if(quantity < 0) {
            quantity = quantity * -1;
        }

        // calculate the subtotal, tax, total
        double subtotal = (priceItem * quantity);
        double tax = (subtotal * 0.0875);
        double total = (subtotal + tax);

        // display the subtotal, tax, total 
        System.out.println("The subtotal is: " + subtotal);
        System.out.println("The tax is: " + tax);
        System.out.printf("The total is: %.2f %n", total);
    }
}