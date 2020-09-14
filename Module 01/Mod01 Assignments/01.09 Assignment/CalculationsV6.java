
/**
 * 01.09 Assignment - Doing arithmetic operations using integer and double variables
 * and order of operations
 *
 * @author Sanel Kukic
 * @version September 13, 2020
 */
public class CalculationsV6
{
    public static void main(String[] args) {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 10;
        int iNum5 = 15;
        int iNum6 = 24;
        int iNum7 = 74;
        int iNum8 = 67;
        int iNum9 = 245;
        int iNum10 = 4;
        int iNum11 = 99;
        int iNum12 = 150;
        int iNum13 = 2;
        
        // Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 31.44;
        double dNum4 = 77.55;
        double dNum5 = 120.04;
        double dNum6 = 79.99;
        double dNum7 = 59.99;
        double dNum8 = 21.56;
        double dNum9 = 109.53;
        double dNum10 = 192.38;
        double dNum11 = 191.11;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + iNum4 + " = " + (dNum2 - iNum4));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " x " + iNum2 + " = " + (iNum1 * iNum2)); 
        System.out.println(dNum2 + " x " + iNum4+" x " + iNum4 + " = " + (dNum2 * iNum4 * iNum4));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + iNum4 + " = " + (dNum1 / iNum4));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(iNum4 + " % " + dNum2 + " = " + (iNum4 % dNum2));
        System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("01.08 Additional int Equations");
        System.out.println(iNum5 + " - " + iNum6 + " / " + iNum7 + " = " + (iNum5 - iNum6 / iNum7));
        System.out.println(iNum8 + " % " + iNum9 + " x " + iNum10 + " = " + (iNum8 % iNum9 * iNum10));
        System.out.println(iNum11 + " + " + iNum12 + " % " + iNum13 + " = " + (iNum11 + iNum12 % iNum13));
        System.out.println();
        
        // 1.09 Additional double Equations
        System.out.println("01.09 Additional double Equations");
        System.out.println(dNum3 + " % " + dNum4 + " x " + dNum5 + " = " + (dNum3 % dNum4 * dNum5));
        System.out.println(dNum6 + " / " + dNum7 + " + " + dNum8 + " = " + (dNum6 / dNum7 + dNum8));
        System.out.println(dNum9 + " - " + dNum10 + " x " + dNum11 + " = " + (dNum9 + dNum10 * dNum11));
        System.out.println();
        
               
    }
}
