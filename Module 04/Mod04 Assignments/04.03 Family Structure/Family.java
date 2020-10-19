// * * * * * * * * * * P M R * * * * * * * * * *
// * Project Title: 04.03 File Input
// * Project Author: Sanel Kukic
// * Project Version: October 19, 2020
// * * * * * * * * * * * * * * * * * * * * * * *
// <+s> This was so much fun. You have no idea how I spent
// almost two hours fixing a bug where there were these "invincible" newlines
// and no matter what I tried the string comparisons always failed because of them
// only to find out that I was calling Scanner.hasNextLine instead of Scanner.hasNext
// and Scanner.nextLine instead of Scanner.next
//
// <-s> Apart from almost making me lose my cool, no negative feedback lol
// * * * * * * * * * * * * * * * * * * * * * * *
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Family {
  public static void main(String[] args) throws IOException {
    // create variables
    Scanner in = new Scanner(new File("maleFemaleInFamily.txt"));
    String token = "";
    int bbCounter = 0;
    int bgCounter = 0;
    int ggCounter = 0;
    int counter = 0;
    double bbPercent = 0.0;
    double bgPercent = 0.0;
    double ggPercent = 0.0;
    while (in.hasNext()) {
      token = in.next();
      // ok so i honestly have no clue why i put a regex replace here
      // but the code works so i'm not even gonna dare to touch it
      token = token.replaceAll("[\r\n]+", "\n");
      if (token.contains("BB")) {
        bbCounter++;
      } else if (token.contains("BG")) {
        bgCounter++;
      } else if (token.contains("GB") ) {
        bgCounter++;
      } else if (token.contains("GG")) {
        ggCounter++;
      } else {
        System.out.println("Invalid file input!");
        System.exit(1);
      }
      counter++;
    }

    bbPercent = (int)((double) bbCounter / counter * 10000) / 100.0;
    bgPercent = (int)((double) bgCounter / counter * 10000) / 100.0;
    ggPercent = (int)((double) ggCounter / counter * 10000) / 100.0;

    // output
    System.out.println("Composition statistics for families with two children\n");
    System.out.println("Total number of families: "+counter+"\n");
    System.out.println("Number of families with:");
    System.out.print("       2 boys: "+bbCounter + " represents "+bbPercent+"%\n");
    System.out.print("      2 girls: "+ggCounter + " represents " + ggPercent+"%\n");
    System.out.print("1 boy, 1 girl: "+bgCounter + " represents " + bgPercent+"%\n");
    in.close();
    System.exit(0);
  }
}
