
/**
 * A program that calculates the total points and average grade every time a test is added to the total.
 *
 * @author Sanel Kukic
 * @version September 13, 2020
 */
public class GradesV2
{
    public static void main(String[] args) {
        // local variables
        int numTests = 0;
        int testGrade = 0;
        int totalPoints = 0;
        double average = 0.0;
        
        // test 1
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"   ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average score: "+average+"    \n");
        
        // test 2
        testGrade = 73;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
        
        // test 3
        testGrade = 91;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
        
        // test 4
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
        
        // custom test 1
        testGrade = 100;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
        
        // custom test 2
        testGrade = 41;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
        
        // custom test 3
        testGrade = 55;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
        
        // custom test 4
        testGrade = 88;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
        
        // custom test 5
        testGrade = 22;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test #"+numTests+"    ");
        System.out.print("Test Grade: "+testGrade+"     ");
        System.out.print("Total Points: "+totalPoints+"     ");
        System.out.print("Average Score: "+average+"       \n");
    }
}
