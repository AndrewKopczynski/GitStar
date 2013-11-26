package lab08;

import java.util.Scanner;

/** Comparisons.java
 * - Compares 3 integers using the Compare3 class.
 * 
 * @author Andrew Kopczynski
 * @version 0.1 */
public class Comparisons {
	/** Main method.
	 * Prompts for 3 integers then prints largest.
	 * 
	 * @param args Unused. */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 3 strings: ");
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		System.out.println("The largest string out of the set {" 
			+ a + ", " + b + ", " + c + "} is " + Compare3.largest(a, b, c));
		
		System.out.print("Enter 3 integer numbers: ");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		scan.close();
		
		System.out.println("The largest number out of the set {" 
			+ x + ", " + y + ", " + z + "} is " + Compare3.largest(x, y, z));
	}
}
