/**
 * 03.08 DBA
 *
 * @author Sanel Kukic
 * @version October 12, 2020
 */
import java.util.Scanner;

public class CarnivalTicket
{
    public static void main(String[] args) {
        String name;
        String student;
        boolean senior;
        int age;
        int price;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (First Last): ");
        name = in.nextLine();
        System.out.print("Are you a student? (y/n): ");
        student = in.next().toUpperCase();
        System.out.print("Please enter your age: ");
        age = in.nextInt();
        
        if (name.split(" ").length != 2) {
            System.out.println("Please enter your full name!");
            System.exit(1);
        }
        
        // get user id
        String first_initial = name.substring(0, 1).toUpperCase();
        String last_name = name.split(" ")[1];
        int random_id = 1 + (int)(Math.random() * 1000);
        String user_id = first_initial + "" + last_name + "" + random_id;
        
        // determine senior status
        if (age >= 65) {
            senior = true;
        } else {
            senior = false;
        }
        
        // find price
        if (age < 3) {
            if (student.equals("Y")) {
                price = 1;
            } else {
                price = 2;
            }
        } else if ((age >= 3) && (age <= 5)) {
            if (student.equals("Y")) {
                price = 8;
            } else {
                price = 9;
            }
        } else if ((age >= 6) && (age <= 18)) {
            if (student.equals("Y")) {
                price = 10;
            } else {
                price = 11;
            }
        } else if (age > 18) {
            if (student.equals("Y") || senior == true) {
                price = 11;
            } else {
                price = 12;
            }
        } else {
            price = 0;
        }
        
        if (price == 0) {
            System.out.println("Invalid age input.");
            System.exit(1);
        }
        
        // find discounts
        if (student == "Y" && senior == true) {
            // can not qualify for both, so lets do the student discount
            // since both discounts only take off $1
            // i'll just take off $1 instead of the combined $2
            price = price - 1;
        } else if (student == "N" && senior == true) {
            // senior discount
            price = price - 1;
        } else if (student == "Y" && senior == false) {
            // student discount
            price = price - 1;
        } else {
            // no discounts
            price = price;
        }
        
        // output ticket information
        System.out.println("");
        System.out.println("Welcome to the Super Mega Carnival, "+name+"!");
        System.out.println("Your user ID is: "+user_id);
        System.out.println("Total cost of your ticket: $"+price);
        System.out.println("Have fun!");
        System.exit(0);
    }
}
