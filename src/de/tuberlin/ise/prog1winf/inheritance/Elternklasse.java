/**
 * 
 */
package de.tuberlin.ise.prog1winf.inheritance;

/**
 * @author Dave
 *
 */
public class Elternklasse extends GrosselternKlasse{

	int j = 5;
	Helper h = new Helper("Instanzvariable Elternklasse");
	
	public Elternklasse(int j){
		this(true);
		this.j = j;
		System.out.println("Konstruktor Elternklasse");
	}
	
	public Elternklasse(boolean b){
//		super();
		System.out.println("boolean Konstruktor");
	}
	
	public void printme(){
		System.out.println("Eltern printme");
	}
	
}
