
/**
 * * * * * * P M R * * * * * *
 * Title: 03.05 Body Mass Index
 * Purpose: To make a calculator for your BMI using if statements.
 * Author: Sanel Kukic
 * Version: October 5th, 2020
 * -----------------------
 * <+s> I liked this assignment. I can't wait to get into
 * exception handling and try/catch because then
 * I can actually implement it into these assignments!
 * 
 * <-s> It did give me some trouble because I decided to use
 * String.split when doing logic on the height, but I fixed those
 * errors quickly
 */
import java.util.Scanner;
import java.lang.String;

public class BMI
{
    public static void main(String[] args)
    {
        String user_name;
        String _weight;
        String height;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (First Last): ");
        user_name = in.nextLine();
        
        System.out.print("Enter your weight in pounds (e.g. 180): ");
        _weight = in.nextLine();
        
        System.out.print("Enter your height in feet and inches (e.g. 6 0): ");
        height = in.nextLine();
        
        System.out.println("\nBody Mass Index Calculator");
        System.out.println("=======================");
        System.out.println("Name: "+user_name);
        
        // convert height from feet/inches to meters
        // first convert from feet/inches to just inches
        // then from inches to m
        int weight = Integer.parseInt(_weight);
        String _height[] = height.split(" ");
        int height_feet = Integer.parseInt(_height[0]);
        int height_inches = Integer.parseInt(_height[1]);
        
        int total_inches = (height_feet * 12) + height_inches;
        double total_meters = total_inches / 39.37;
        double rounded_meters = Math.round(total_meters * 100) / 100.0;
        
        // now that we have the height in meters
        // we need the weight in kg
        double total_kg = weight / 2.205;
        double rounded_kg = Math.round(total_kg * 100) / 100.0;
        
        double height_squared = Math.pow(total_meters, 2);
        double BMI = total_kg / height_squared;
        double BMI_rounded = Math.round(BMI * 100) / 100.0;
        String category;
        
        if (BMI_rounded < 18.5) {
            // underweight
            category = "Underweight";
        } else if ((BMI_rounded >= 18.5) && (BMI_rounded <= 24.9)) {
            category = "Normal";
        } else if ((BMI_rounded >= 25.0) && (BMI_rounded <= 29.9)) {
            category = "Overweight";
        } else if (BMI_rounded >= 29.9) {
            category = "Obese";
        } else {
            category = "Unknown";
        }
        System.out.println("Height (m): "+rounded_meters);
        System.out.println("Weight (kg): "+rounded_kg);
        System.out.println("BMI: "+BMI_rounded);
        System.out.println("Category: "+category);
    }
}
