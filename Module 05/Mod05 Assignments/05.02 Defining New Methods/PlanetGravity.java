/* * * * * * P M R * * * * * *
 * Purpose: To learn how to create your own
 * methods in Java, and call them from within other methods
 *
 * Author: Sanel Kukic
 * Version: November 9, 2020
 * * * * * * * * * * * * * * *
 * <+s> Nice little program in my opinion. I wanted to
 * make the chart display look as neat as possible so I decided
 * to use printf() instead of \t to format it, looks a lot neater
 * but I don't know if we're forbidden from using printf(), it
 * doesn't say we aren't in the assignment instructions so I'll assume
 * we aren't lol.
 *
 *
 * <-s> No negative feedback.
*/

public class PlanetGravity
{
    public static double[] resultant_gravity(double[] kg, double[] km)
    {
      double universal_gravitational_constant = 6.67E-11;
      double[] resultant_gravities = new double[9];
      for(int i = 0; i < resultant_gravities.length; i++)
      {
          resultant_gravities[i] = ((universal_gravitational_constant * kg[i]) / (Math.pow(km[i]/2,2)));
      }
      return resultant_gravities;
    }


    public static void output(String[] planet, double[] diameter, double[] kg, double[] g)
    {
      System.out.printf("%32s\n","Planetary Data");
      System.out.printf("%-12s %-17s %7s %11s\n","Planet","Diameter (km)","Mass (kg)","g (m/s^2)");
      System.out.println("--------------------------------------------------");
      for(int i = 0; i < 9; i++)
      {
        System.out.printf("%-14s %-14.0f %5.2e %11.2f\n",planet[i],diameter[i],kg[i],g[i]);
      }
    }


    public static void main(String[]args)
    {
      String[] planet = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
      double[] kg = {3.30E23,4.869E24,5.972E24,6.4219E23,1.900E27,5.68E26,8.683E25,1.0247E26,1.27E22};
      double[] km = {4880000,12103600,12756300,6794000,142984000,120536000,51118000,49532000,2274000};
      double[] diameter = {4880,12103.6,12756.3,6794,142984,120536,51118,49532,2274 };
      double[] g = resultant_gravity(kg, km);
      output(planet, diameter, kg, g);
    }


}
