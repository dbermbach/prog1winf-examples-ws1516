/**
 * 
 */
package de.tuberlin.ise.prog1winf.classmethods;

/**
 * @author Dave
 *
 */
public class FirstExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int [] keineAhnung = {6,7,8,9,10};
		FirstExample.print(array);
		FirstExample.print(keineAhnung);
		System.out.println("print ist durch");
	}

	public static void print(int [] a){
		System.out.println("in print!");
		for(int j: a){
			System.out.println(j);
		}
	}
	
}
