/**
 * 
 */
package de.tuberlin.ise.prog1winf.inheritance;

/**
 * @author Dave
 *
 */
public class GrosselternKlasse {

	Helper h = new Helper("Instanzvariable Groﬂelternklasse");

	public GrosselternKlasse(){
		System.out.println("Konstruktor Groﬂelternklasse");
	}
	
	public void printme(){
		System.out.println("Groﬂeltern printme");
	}
}
