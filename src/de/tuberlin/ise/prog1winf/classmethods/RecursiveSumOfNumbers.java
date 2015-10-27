/**
 * 
 */
package de.tuberlin.ise.prog1winf.classmethods;

/**
 * @author Dave
 *
 */
public class RecursiveSumOfNumbers {

	public static void main(String[] args) {
		calculateSumsInteratively(10);
		System.out.println(calculateSumsRecursively(10));
	}

	/**
	 * @param i
	 */
	public static int calculateSumsRecursively(int i) {
		if (i == 0)
			return 0;
		int ergebnis = calculateSumsRecursively(i - 1) + i;
		return ergebnis;
	}

	/**
	 * @param i
	 */
	public static void calculateSumsInteratively(int i) {
		int ergebnis = 0;
		for (int j = 0; j <= i; j++) {
			ergebnis += j;
		}
		System.out.println(ergebnis);
	}

}
