package q2;

import java.text.DecimalFormat;
import java.util.Scanner;

/** SecondsConvert.java
 * - Converts a given amount of seconds into a hh:mm:ss format. 
 * 
 * @author Andrew P. Kopczynski
 * @version 0.1 */
public class SecondsCovert {
	/** Defines the value of a second, avoids magic numbers although
	 * one isn't considered a magic number; in this context, it could. */
	public static final int SECOND_VALUE = 1;
	/** Defines the value of a minute in seconds, avoids magic numbers. */
	public static final int MINUTE_VALUE = 60;
	/** Defines the value of an hour in seconds, avoids magic numbers. */
	public static final int HOUR_VALUE = 3600;
	
	/** Prompts user for an integer value, seconds.
	 * <p>
	 * The value is then processed via division and subtraction.
	 * Prints final statement after it is formatted in hh:mm:ss.
	 * 
	 * @param args Unused. */
	public static void main(String[] args) {
		
		System.out.println("Enter an integer, for seconds, "
			+ "to be converted to time in the hh:mm:ss format.");
		Scanner scan = new Scanner(System.in);
		int seconds = scan.nextInt();
		scan.close();
		
		/* Fomarts the "hh" "mm" "ss" parts of "hh:mm:ss". */
		DecimalFormat df = new DecimalFormat("00.#");
		
		/* Finds how many times seconds can be divided into hours,
		leaves the remainer as seconds so it can be divided into
		minutes. */
		int secondsToHours = seconds / HOUR_VALUE;
		seconds = seconds - (HOUR_VALUE * secondsToHours);
		System.out.print(df.format(secondsToHours) + ":");
		
		/* Divides remaining seconds into minutes, leaves the
		left over seconds to print just as seconds. */
		int secondsToMinutes = seconds / MINUTE_VALUE;
		seconds = seconds - (MINUTE_VALUE * secondsToMinutes);
		System.out.print(df.format(secondsToMinutes) + ":");
		
		System.out.print(df.format(seconds));
	}
}
