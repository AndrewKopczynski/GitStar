package q1;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Change.java
 * - Finds the fewest amount of bills/coins needed for a given value.
 *  
 * @author Andrew P. Kopczynski
 * @version 1.0 */
public class Change {
	
	/** Defines the value of a penny - avoids magic numbers. */
	public static final int COIN_PENNY_VALUE = 1;
	/** Defines the value of a nickel - avoids magic numbers. */
	public static final int COIN_NICKEL_VALUE = 5;
	/** Defines the value of a dime - avoids magic numbers. */
	public static final int COIN_DIME_VALUE = 10;
	/** Defines the value of a quarter - avoids magic numbers. */
	public static final int COIN_QUARTER_VALUE = 25;
	/** Defines the value of a 1 dollar - avoids magic numbers. */
	public static final int DOLLAR_VALUE = 100;
	/** Defines the value of a toonie - avoids magic numbers. */
	public static final int COIN_TOONIE_VALUE = 200;
	/** Defines the value of a five dollar bill - avoids magic numbers. */
	public static final int BILL_FIVE_VALUE = 500;
	/** Defines the value of a ten dollar bill - avoids magic numbers. */
	public static final int BILL_TEN_VALUE = 1000;
	
	/** Prompts the user for a double value, casts the double to an integer
	 * and then performs several division & subtraction statements,
	 * assigning the results to new variables representing currency.
	 * <p>
	 * At the end, prints the smallest amount of each article of
	 * currency required to make up the intially prompted amount.
	 * 
	 * @param args Unused. */
	public static void main(String[] args) {
		
		System.out.println("Enter an amount of currency to be "
				+ "converted to bills and coins: ");
		Scanner scan = new Scanner(System.in);
		
		// Holds the prompted for value for formatting.
		double d = scan.nextDouble();
		scan.close();
		
		DecimalFormat df = new DecimalFormat("#.00");
		d = Double.parseDouble(df.format(d));
		System.out.println("You entered: " + df.format(d));
		
		// Cast to to int, less accuracy issues later on.
		int pennyValue = (int) (d * DOLLAR_VALUE);
		
		// Holds the amount of 10 dollar bills required
		int billTens = pennyValue / BILL_TEN_VALUE;
		pennyValue = pennyValue - (BILL_TEN_VALUE * billTens);
		
		// Holds the amount of 5 dollar bills required
		int billFives = pennyValue / BILL_FIVE_VALUE;
		pennyValue = pennyValue - (BILL_FIVE_VALUE * billFives);
		
		// Holds the amount of two dollar coins required
		int coinToonie = pennyValue / COIN_TOONIE_VALUE;
		pennyValue = pennyValue - (COIN_TOONIE_VALUE * coinToonie);
		
		// Holds the amount of quarters required
		int coinQuarter = pennyValue / COIN_QUARTER_VALUE;
		pennyValue = pennyValue - (COIN_QUARTER_VALUE * coinQuarter);
		
		// Holds the amount of dimes required
		int coinDime = pennyValue / COIN_DIME_VALUE;
		pennyValue = pennyValue - (COIN_DIME_VALUE * coinDime);
		
		// Holds the amount of nickels required
		int coinNickel = pennyValue / COIN_NICKEL_VALUE;
		pennyValue = pennyValue - (COIN_NICKEL_VALUE * coinNickel);
		
		/* Penny value used for last message, since its left with only 
		 * pennies after the substraction and assignments above. */
		System.out.println(billTens + " ten dollar bills,\n" 
			+ billFives + " five dollar bills,\n"
		 	+ coinToonie + " two dollar coin,\n"
			+ coinQuarter + " quarters,\n"
		 	+ coinDime + " dimes,\n"
			+ coinNickel + " nickels,\n"
		 	+ pennyValue + " pennies.");
	
	}
}
