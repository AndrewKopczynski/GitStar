package q4;

import java.util.Scanner;

/** Cube.java 
 * - Finds the volume and surface area of a cube. 
 * 
 * @author Andrew P. Kopczynski
 * @version 1.0 */
public class Cube {
    
    /** Describes the number of sides to a cube. */
    public static final int SIDES_OF_CUBE = 6;
    
    /** Prompts user for a length of a side of the cube,
     * uses the inputed value to print the surface area
     * and volume of the cube.
     * 
     * @param args Unused. */
    public static void main(String[] args) {
        
        System.out.print("Enter a value for the length of a side of a cube: ");
        Scanner scan = new Scanner(System.in);
        int cubeSideLength = scan.nextInt();
        scan.close();
        
        System.out.println("\nYour cube with side length " + cubeSideLength 
            + " would have a surface area of " 
            + (cubeSideLength * cubeSideLength * SIDES_OF_CUBE)
            + " and a volume of " 
            + (cubeSideLength * cubeSideLength * cubeSideLength) + ".");
    }
}
