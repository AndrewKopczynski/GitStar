package q3;

import java.util.Random;

/** Arithemtic.java
 * - Compares two floating point numbers in several ways. 
 * 
 * @author Andrew P. Kopczynski
 * @version 1.0 */
public class Arithemtic {

    /** Generates two pseudo random doubles.
     * <p>
     * Performs the following mathematic operations using the generated numbers:
     * <ul>
     * <li>Sum of numbers
     * <li>Difference of numbers
     * <li>Quotient of numbers
     * <li>Proudct of numbers
     * </ul>
     * 
     * @param args Unused. */
    public static void main(String[] args) {
        
        Random generator = new Random();
        double rNum1 = generator.nextDouble();
        double rNum2 = generator.nextDouble();
        
        System.out.println("Here's our two (pseudo) random numbers:");
        System.out.println(rNum1 + " and " + rNum2 + "\n");
        
        System.out.println("The sum ( + ) "
                + "of these two numbers is " + (rNum1 + rNum2));
        System.out.println("The difference ( - ) "
                + "of these two numbers is " + (rNum1 - rNum2));
        System.out.println("The quotient ( / ) "
                + "of these two numbers is " + (rNum1 / rNum2));
        System.out.println("The product ( * ) "
                + "of these two numbers is " + (rNum1 + rNum2));
    }
}
