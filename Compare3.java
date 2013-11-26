package lab08;
/** Compare3.java
 * - Compare 3 things, returns largest.
 * 
 * @author Andrew Kopczynski
 * @version 0.1 */
public class Compare3 {
	
	/** Compares 3 things.
	 * 
	 * @param x First things
	 * @param y Second things
	 * @param z Third things
	 * @return The largest thing of the three.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable largest(Comparable x, Comparable y, Comparable z) {
		// shortcut to avoid repetative lines
		Comparable largest = z;
		
		if (x.compareTo(y) == 1) {
			if (x.compareTo(z) == 1) {
				largest = x;
			}
		} else if (y.compareTo(z) == 1) {
			largest = y;
		}
		return largest;
	}
}
