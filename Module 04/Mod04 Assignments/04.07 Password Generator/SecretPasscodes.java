/* * * * * * P M R * * * * * *
 * Author: Sanel Kukic
 *
 * Version: November 02, 2020
 *
 * Purpose: To write a program that can
 * generate a random password according to
 * the user's selections. (challenge program)
 * * * * * * * * * * * * * * *
 * <+s> This was definitely a challenge program! At first I thought I could just
 * store the character sets in their own strings and select random characters from the strings
 * but then I realized that is forbidden by the assignment instructions so I was forced to use
 * ASCII character codes instead
 *
 * <-s> No negative feedback yet lol
 * * * * * * * * * * * * * * */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class SecretPasscodes
{
  public static void main(String [] args) throws IOException
  {
    // instantiate all variables
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();
    PrintWriter outFile = new PrintWriter(new File("passwords.txt"));
    int menuOption = 0;
    int passLength = 0;
    int passCount = 0;
    int buffer = 0;
    String password = "";


    // setup the menu screen
    System.out.println("");
    System.out.println("Welcome to the Password Generator!");
    System.out.println("");
    System.out.println("1. All lowercase");
    System.out.println("2. All uppercase");
    System.out.println("3. Lowercase with numbers");
    System.out.println("4. Lowercase and uppercase with numbers");
    System.out.println("5. Quit");
    System.out.println("");

    while(!(menuOption == 5)){
      menuOption = 0;
      passLength = 0;
      buffer = 0;
      password = "";

      System.out.print("Select a menu option (1-5): ");
      menuOption = userInput.nextInt();

      if(menuOption < 5 && menuOption > 0){
        System.out.println("");
        passCount++;

        while(passLength < 6 || passLength == 0){
          System.out.print("Please enter a password length 6 or more characters long: ");
          passLength = userInput.nextInt();

          if(passLength < 6 || passLength == 0){
            System.out.println("");
            System.out.println("Invalid password length. Must be 6 or greater.");
          }

          else{
            System.out.println("Done!");
            System.out.println("There are currently " + passCount + " passwords created.");
            System.out.println("");
          }

        }
      }

      else if(menuOption == 5) {}

      else{
        System.out.println("");
        System.out.println("Invalid input. Please select a valid option.");
      }

      // all lowercase passwords
      if(menuOption == 1){
        for(int n = 0; n < passLength; n++){
          password += (char)(rand.nextInt(26) + 97);
        }
        outFile.print("Password " + passCount + ": " + password);
        outFile.println();
      }

      // all uppercase passwords
      else if(menuOption == 2){
        for(int n = 0; n < passLength; n++){
          password += (char)(rand.nextInt(26) + 65);
        }
        outFile.print("Password " + passCount + ": " + password);
        outFile.println();
      }

      // alphanumeric with lowercase passwords
      else if(menuOption == 3){
        for(int n = 0; n < passLength; n++){
          buffer = rand.nextInt(74) + 48;
          while(buffer > 57 && buffer < 97){
            buffer = rand.nextInt(74) + 48;
          }
          password += (char)buffer;
        }
        outFile.print("Password " + passCount + ": " + password);
        outFile.println();
      }

      // upper/lower case letters and numbers
      else if (menuOption == 4){
        for(int n = 0; n < passLength; n++){
          buffer = rand.nextInt(74) + 48;
          while((buffer > 57 && buffer < 65) || (buffer > 90 && buffer < 97)){
            buffer = rand.nextInt(74) + 48;
          }
          password += (char)buffer;
        }
      outFile.print(password);
      outFile.println();
      }
    }

    outFile.close();

    // output passwords to file
    Scanner passFile = new Scanner(new File("passwords.txt"));

    System.out.println("");
    System.out.println("Passwords Generated:");

    for(int i = 0; i < passCount; i++){
      System.out.println("\t" + passFile.nextLine());
    }
    System.out.println("");
    System.out.println("Total Number of Passwords: " + passCount);
    System.out.println("");
 }
}
