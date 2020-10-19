// i tried my best at this, i've run this program a few times
// and i'm not sure if my output is valid for the question
//
// hopefully this is the correct answer lol
import java.util.Random;
public class RandomTokenGenerator {
  public static void main(String[] args) {
    // here i define a float containing 20.0
    // this float contains the percentage chance that a red token is drawn
    float chance = 20.0f;

    // here i generate 10 random floats by calling the randomGen() method
    // below and storing them in an array
    float[] n = randomGen();

    // here i create an array of 10 Strings to store the outputs
    String[] tokens = new String[10];

    // here i create a while loop that will iterate over the contents of the
    // float array from earlier and multiply each element by 100
    //
    // then it will compare each element to the chance float i defined
    // earlier and if the element is smaller than the chance float
    // then i know that a red token was chosen so i add the string "red"
    // to the string array i created earlier, otherwise i add the "blue"
    // string to the array i created earlier
    int i = 0;
    while (i < n.length) {
      n[i] = n[i] * 100;
      if (n[i] < chance) {
        tokens[i] = "red";
      } else {
        tokens[i] = "blue";
      }
      // output the values of the String token to stdout
      // since i know that both the float and String arrays have 10 elements
      // in them i can re-use the same i integer i created earlier
      System.out.println(tokens[i]);
      // increment i and loop all over again
      i++;
    }
  }

  // function to generate random floats
  public static float[] randomGen() {
    // create a new instance of the Random class.
    Random rand = new Random();
    // create an array of 10 floats
    float[] the_array = new float[10];

    // setup a while loop
    int i = 0;
    while (i < 9) {
      // for each element in the float array i just created, set its
      // value to a randomly generated float between 0 and 1
      the_array[i] = rand.nextFloat();
      i++;
    }
    // once the loop has completed, return the array
    return the_array;
  }
}
