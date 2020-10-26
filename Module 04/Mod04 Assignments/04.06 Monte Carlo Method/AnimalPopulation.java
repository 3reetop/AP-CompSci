
/* * * * * * * * * * P M R * * * * * * * * * *
 * PURPOSE: Use Monte Carlo sampling method to estimate the average number of animals observed before
 *          spotting one you are tracking within a particular ecosystem.
 * AUTHOR:  Sanel Kukic
 * VERSION: October 26, 2020
 * * * * * * * * * * * * * * * * * * * * * * *
 * <+s> I found the Monte Carlo method to be quite interesting, and this program was indeed
 * quite challenging at first but once you have everything planned out it becomes much easier.

 * <-s> No negative feedback.
 *
 * * * * * * * * * * * * * * * * * * * * * * *
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class AnimalPopulation {
    public static void main(String[] args) throws IOException {
        // Instantiate variables
        PrintWriter writer = new PrintWriter(new File("data.txt"));
        Scanner sc = new Scanner(System.in);
        int numTrials;
        int animalsSpotted;
        int animal;
        Scanner sc2;
        int totalTrials = 0;
        int totalAnimalsSpotted = 0;
        File file = new File("data.txt");
        double average;

        // Collect data
        while(true){
            // Validation for the number of trials, check if the user provided number is greater than or equal to 1000
            System.out.print("How many trials do you want to simulate: ");
            numTrials = sc.nextInt();

            if(numTrials < 1000){
                System.out.println("\nPlease try again. Enter a number greater than 1000.\n");
            }else{
                System.out.println("\nSimulating...\n");
                break;
            }
        }

        // Actually do the trials
        for(int i = 0; i < numTrials; i++){
            animalsSpotted = 0;
            while(true){
                animal = (int)(Math.random() * 10) + 1;
                animalsSpotted++;
                if(animal == 10){
                    // As soon as we see a fox squirrel, immediately stop the trials
                    break;
                }
            }
            // Write the data to data.txt
            writer.println(animalsSpotted);
        }

        // Don't forget to call close() so the file actually gets written to disk
        writer.close();

        //Process Data
        sc2 = new Scanner(file);

        while(sc2.hasNext()){
            totalAnimalsSpotted += Integer.parseInt(sc2.next());
            totalTrials++;
        }

        // Calculate the average number of squirrels observed
        average = (double)totalAnimalsSpotted/totalTrials;

        System.out.println("The average number of squirrels observed until \nspotting a Fox Squirrel at the city park is: " + average);

        // Even if you're only reading from the file, it's still good practice to call close() once you're done with the file!
        sc2.close();
    }
}
