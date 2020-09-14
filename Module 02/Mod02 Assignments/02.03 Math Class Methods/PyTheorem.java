
/**
 * Write a description of class PyTheorem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PyTheorem
{
    public static void main(String[] args) {
        // generate random sides for triangle a
        int triangle1sideA = (int)((Math.random() * (23 - 5)) + 5);
        int triangle1sideB = (int)((Math.random() * (23 - 5)) + 5);
        
        // generate random sides for triangle b
        int triangle2sideA = (int)((Math.random() * (23 - 5)) + 5);
        int triangle2sideB = (int)((Math.random() * (23 - 5)) + 5);
        
        // find the hypotenuse of both triangles
        double triangle1Hypotenuse = Math.sqrt(Math.pow(triangle1sideA, 2) + Math.pow(triangle1sideB, 2));
        double triangle2Hypotenuse = Math.sqrt(Math.pow(triangle2sideA, 2) + Math.pow(triangle2sideB, 2));
        
        // print everything to stdout
        System.out.print("Triangle 1    ");
        System.out.print("Side 1: "+triangle1sideA+"    ");
        System.out.print("Side 2: "+triangle1sideB+"    ");
        System.out.print("Hypotenuse: "+triangle1Hypotenuse+"   \n");
        System.out.print("Triangle 2    ");
        System.out.print("Side 1: "+triangle2sideA+"    ");
        System.out.print("Side 2: "+triangle2sideB+"    ");
        System.out.print("Hypotenuse: "+triangle2Hypotenuse+"   \n");
    }
}
