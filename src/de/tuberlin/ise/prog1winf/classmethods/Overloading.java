/**
 * 
 */
package de.tuberlin.ise.prog1winf.classmethods;

/**
 * @author Dave
 *
 */
public class Overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3 };
		double[] doubleArray = { 1.0, 1.2, 1.3 };
		print(intArray);
		print(doubleArray);

	}

	public static void print(int[] a) {
		System.out.println("in int print!");
		for (int j : a) {
			System.out.println(j);
		}
	}

	public static void print(double[] a) {
		System.out.println("in double print!");
		for (double j : a) {
			System.out.println(j);
		}
	}

}
