/*
 * * * * * * * * * * P M R * * * * * * * * * *
 * Author: Sanel Kukic
 * Version: September 28, 2020
 * Purpose: To challenge myself to write a program that can simulate an online movie-ticket purchase.
 * * * * * * * * * * * * * * * * * * * * * * *
 * <+s> This was a little bit of a challenge but not too difficult.
 * Knowing how to read from stdin and output to stdout is crucial.
 * One thing that might trip up a lot of people is converting from String to int/double
 * I didn't know if I was supposed to implement error handling in this but it would've been an even better program if I had.
 * 
 * <-s> No negative feedback.
 * * * * * * * * * * * * * * * * * * * * * * *
 */
import java.util.Scanner;
import java.lang.String;

public class BuyMovieTickets
{
    public static void main(String[] args) {
        String name;
        String date;
        String movie;
        String ticket_qty;
        String cost;
        String card_number;
        String pin;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("*** Hello ***\n");
        System.out.print("Please enter your name: ");
        name = scan.nextLine();
        System.out.print("Please enter today's date (mm/dd/yyyy): ");
        date = scan.nextLine();
        System.out.print("Please enter the name of the movie you wish to see: ");
        movie = scan.nextLine();
        System.out.print("Please enter the number of tickets you wish to purchase: ");
        ticket_qty = scan.nextLine();
        System.out.print("Please enter the cost of one ticket: ");
        cost = scan.nextLine();
        System.out.print("Please enter your card number (####-####-####-####): ");
        card_number = scan.nextLine();
        System.out.print("Please enter your card's PIN number (####): ");
        pin = scan.nextLine();
        
        System.out.println("*** Your Receipt ***");
        
        
        int name_space_index = name.indexOf(" ");
        String first_name = name.substring(0, name_space_index);
        String last_name = name.substring(name_space_index + 1, name.length());
        String first_initial = first_name.substring(0, 1);
        String last_initial = last_name.substring(0, 1);
        System.out.println("Your Name: "+first_initial+". "+last_name);
        
        String card_last_four = card_number.substring(15, 19);
        String censored_card_number = "****-****-****-" + card_last_four;
        
        String order_number = first_initial + "" + last_initial + "" + card_last_four;
        System.out.println("Order Number: "+order_number);
        
        System.out.println("Date: "+date+"\n");
        
        System.out.println("Items: \n");
        System.out.println("    Movie: "+movie);
        System.out.println("    Unit cost: "+cost);
        System.out.println("    Quantity: "+ticket_qty);
        
        int quantity = Integer.parseInt(ticket_qty);
        
        String no_dollar_sign_cost = cost.substring(0, 0) + cost.substring(1);
        double ticket_cost = Double.parseDouble(no_dollar_sign_cost);
        double final_total = ticket_cost * Double.valueOf(quantity);
        
        System.out.println("\nFinal total: $"+final_total);
        System.out.println("\nYour card ending in "+censored_card_number+" has been charged a total of $"+final_total);
        System.out.println("**************");
        System.out.println("Thank you for your business!\n");
    }
}
