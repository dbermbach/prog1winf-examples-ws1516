/**
 * 
 */
package de.tuberlin.ise.prog1winf.inheritance;

/**
 * @author Dave
 *
 */
public class GrosselternKlasse {

	Helper h = new Helper("Instanzvariable Großelternklasse");

	public GrosselternKlasse(){
		System.out.println("Konstruktor Großelternklasse");
	}
	
	public void printme(){
		System.out.println("Großeltern printme");
	}
}
