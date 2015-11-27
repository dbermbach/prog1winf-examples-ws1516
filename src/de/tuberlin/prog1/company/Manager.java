/**
 * 
 */
package de.tuberlin.prog1.company;

/**
 * @author Dave
 *
 */
public class Manager extends Mitarbeiter {

	/**
	 * @param name
	 * @param wochenstunden
	 * @param gehalt
	 */
	public Manager(String name, double wochenstunden, double gehalt) {
		super(name, wochenstunden, gehalt);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param gehalt
	 */
	public Manager(String name, double gehalt) {
		super(name, gehalt);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.tuberlin.prog1.company.Mitarbeiter#arbeite()
	 */
	@Override
	public double arbeite() {
		System.out.println(this.getName() + " hat 8h lang dummes"
				+ " Zeug geredet und dabei " + (this.getGehalt() / 365)
				+ " verdient.");
		return 8;
	}

}
