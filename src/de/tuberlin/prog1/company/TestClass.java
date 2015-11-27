/**
 * 
 */
package de.tuberlin.prog1.company;

/**
 * @author Dave
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mitarbeiter[] mitarbeiter = new Mitarbeiter[3];
		mitarbeiter[0] = new Programmierer("Klaus Meier", 48000,
				ProgrammierSprache.C, ProgrammierSprache.JAVA,
				ProgrammierSprache.JAVASCRIPT);
		mitarbeiter[1] = new Manager("Nemo", 1234456789);
		mitarbeiter[2] = new Programmierer("Dori", 32000,
				ProgrammierSprache.JAVASCRIPT);

		for (Mitarbeiter m : mitarbeiter) {
			m.arbeite();
			
		}
	}
}
