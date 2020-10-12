/* * * * * * * * P M R * * * * * * *
 * Author: Sanel Kukic
 * Version: October 11, 2020
 * Purpose: To write a program that can calculate your TDEE given BMR and gender.
 * * * * * * * * * * * * * * * * * *
 * <+s> This was fun but also made me think about how I wanted to
 * implement it. I was itching to use a switch statement at first but then
 * I noticed that logical operators were required, although having all of those if
 * statements really does seem inefficient when scaled up. I also got to properly exit
 * the program using System.exit and passing a return code of 0 when the program outputs
 * successfully and a return code of 1 when there is an error.
 * 
 * <-s> No negative feedback.
 * * * * * * * * * * * * * * * * * *
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        double BMR;
        String gender;
        String activityLevel;
        double activityFactor;
        
        System.out.print("Please enter your name: ");
        name = in.nextLine();
        System.out.print("Please enter your gender (M/F): ");
        gender = in.next().toUpperCase();
        System.out.print("Please enter your BMR: ");
        BMR = in.nextDouble();
        System.out.println("\n");
        
        System.out.println("Select your activity level:");
        System.out.println("[A] Resting (sleeping, reclining)");
        System.out.println("[B] Sedentary (minimal movement)");
        System.out.println("[C] Light (sitting, standing)");
        System.out.println("[D] Moderate (light manual labor, dancing, riding bike)");
        System.out.println("[E] Very active (team sports, hard manual labor)");
        System.out.println("[F] Extremely active (full-time athlete, heavy manual labor)");
        System.out.println("");
        System.out.print("Enter the letter corresponding to your activity level: ");
        activityLevel = in.next().toUpperCase();
        
        if (gender.equals("M") && activityLevel.equals("A")) {
            activityFactor = 1.0;
        } else if (gender.equals("M") && activityLevel.equals("B")) {
            activityFactor = 1.3;
        } else if (gender.equals("M") && activityLevel.equals("C")) {
            activityFactor = 1.6;
        } else if (gender.equals("M") && activityLevel.equals("D")) {
            activityFactor = 1.7;
        } else if (gender.equals("M") && activityLevel.equals("E")) {
            activityFactor = 2.1;
        } else if (gender.equals("M") && activityLevel.equals("F")) {
            activityFactor = 2.4;
        } else if (gender.equals("F") && activityLevel.equals("A")) {
            activityFactor = 1.0;
        } else if (gender.equals("F") && activityLevel.equals("B")) {
            activityFactor = 1.3;
        } else if (gender.equals("F") && activityLevel.equals("C")) {
            activityFactor = 1.5;
        } else if (gender.equals("F") && activityLevel.equals("D")) {
            activityFactor = 1.6;
        } else if (gender.equals("F") && activityLevel.equals("E")) {
            activityFactor = 1.9;
        } else if (gender.equals("F") && activityLevel.equals("F")) {
            activityFactor = 2.2;
        } else {
            System.out.println("You did not enter a valid option. Please try again.");
            activityFactor = 0;
            System.exit(1);
        }
        
        double TDEE = BMR * activityFactor;
        System.out.println("Name: "+name + "\t\t Gender: "+gender);
        System.out.println("BMR: "+BMR + "\t\tActivity factor: "+activityFactor);
        System.out.println("TDEE: "+TDEE + " calories");
        System.exit(0);
    }
}
