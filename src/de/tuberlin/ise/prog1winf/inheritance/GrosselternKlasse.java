/**
 * 
 */
package de.tuberlin.ise.prog1winf.inheritance;

/**
 * @author Dave
 *
 */
public class GrosselternKlasse {

	Helper h = new Helper("Instanzvariable Gro�elternklasse");

	public GrosselternKlasse(){
		System.out.println("Konstruktor Gro�elternklasse");
	}
	
	public void printme(){
		System.out.println("Gro�eltern printme");
	}
}
