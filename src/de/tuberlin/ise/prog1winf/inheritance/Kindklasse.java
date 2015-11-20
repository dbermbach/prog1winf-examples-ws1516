/**
 * 
 */
package de.tuberlin.ise.prog1winf.inheritance;

/**
 * @author Dave
 *
 */
public class Kindklasse extends Elternklasse {

	static Helper klh = new Helper("Klassenvariable!");

	Helper h = new Helper("Instanzvariable Kindklasse");

	public Kindklasse() {
		super(6);
		System.out.println("Konstruktor Kindklasse");
		printme();
	}

	public void printme(){
		System.out.println("Kind printme");
		super.printme();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kindklasse k = new Kindklasse();
		k.printme();
		
	}

}
