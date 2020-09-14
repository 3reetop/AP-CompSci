/**
 * * * * * * * * * * * * * * P M R * * * * * * * * * * * * * * * *
 * PROJECT TITLE: 01.13 Currency Conversion
 * 
 * PURPOSE OF PROJECT: To write a program that can convert currencies using current exchange rates,
 * given the total amount of money available and the local exchange rates of currencies around the
 * world. Also, be able to determine how many souveniers can be purchased given a budget.
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * <+s> This challenge taught me a lot. Being forced to use modulo and
 * division did make things much more difficult than I thought they
 * would be but now I understand how to use the modulo operator much
 * more efficiently. In addition, this challenge makes you think very
 * logically as to what mathematical formula/equation you'll use to calculate
 * the USD equivalent of a currency, as well as how to get the remaining cost
 * after the souvenirs given that you can't use subtraction or multiplication.
 * 
 * <-s> No negative feedback on this project.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Sanel Kukic
 * @version September 13, 2020
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        // my countries of choice are mexico, great britain, and japan
        
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars
        
        // mexico variables
        double pesosSpent = 1000.25;            // Mexican Pesos spent
        double pesoExchangeRate = 21.28;        // 1 US dollar = 21.28 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        // japan variables
        double yenSpent = 2530.44;             // Japanese Yen spent
        double dollarsSpentInJapan = 0;         // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;         // US dollars remanining after Japan
        double yenExchangeRate = 106.16;        // 1 USD == 106.16 Yen
        
        // great britain variables
        double poundsSpent = 3000.10;           // British Pound sterling spent
        double dollarsSpentInGB = 0.00;         // US dollars spent in Great Britain
        double dollarsAfterGB = 0.0;            // US dollars remaining after Great Britain
        double poundsExchangeRate = 0.78;       // 1 USD == 0.78 Pound sterling

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        System.out.println("Starting USD: "+startingUsDollars+"\n");
        
        // Conversions for Mexico
        System.out.println("Mexico:");
        System.out.println("    Pesos spent: "+pesosSpent);
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate; // Converting the pesos to the USD equivalent
        System.out.println("    US Dollars equivalent spent: "+dollarsSpentInMexico);
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico; // Subtracting the USD we just calculated from our initial starting value
        System.out.println("    US Dollars remanining: "+dollarsAfterMexico+"\n");
        
        // Conversions for Great Britain
        System.out.println("Great Britain:");
        System.out.println("    Pound sterling spent: "+poundsSpent);
        dollarsSpentInGB = poundsSpent / poundsExchangeRate; // Convert pounds to USD
        System.out.println("    US Dollars equivalent spent: "+dollarsSpentInGB);
        dollarsAfterGB = dollarsAfterMexico - dollarsSpentInGB; // Subtract from the remaining amount of USD AFTER we visited mexico already
        System.out.println("    US Dollars remaining: "+dollarsAfterGB+"\n");
        
        // Conversions for China
        System.out.println("Japan:");
        System.out.println("    Yen spent: "+yenSpent);
        dollarsSpentInJapan = yenSpent / yenExchangeRate; // Convert Yen to USD
        System.out.println("    US Dollars equivalent spent: "+dollarsSpentInJapan);
        dollarsAfterJapan = dollarsAfterGB - dollarsSpentInJapan; // Subtract from the remaining amount of USD AFTER we visited Great Britain already
        System.out.println("    US Dollars remaining: "+dollarsAfterJapan);
        System.out.println("=========================");
        
        // The value in dollarsAfterJapan should now be the amount of money we have left after visiting all 3 countries.
        System.out.println("US Dollars remaining: "+dollarsAfterJapan+"\n\n");
        


        // Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                           //cost per item of first souvenir
        int budget1 = 100;                            //budget for first item
        int totalItems1 = budget1 / costItem1;        //how many items can be purchased
        int fundsRemaining1 = budget1 % totalItems1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = (int)(budget2 / costItem2);   //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

