/**
 * 
 */
package de.tuberlin.prog1.company;

/**
 * @author Dave
 *
 */
public abstract class Mitarbeiter {

	private final int id = nextId++;
	private static int nextId = 0;
	private String name;
	private double wochenstunden = 39.5;
	private double gehalt;

	/**
	 * @param name
	 * @param wochenstunden
	 * @param gehalt
	 */
	protected Mitarbeiter(String name, double wochenstunden, double gehalt) {
		this(name, gehalt);
		this.wochenstunden = wochenstunden;

	}

	protected Mitarbeiter(String name, double gehalt) {
		this.name = name;
		this.gehalt = gehalt;
	}

	public abstract double arbeite();
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the wochenstunden
	 */
	public double getWochenstunden() {
		return this.wochenstunden;
	}

	/**
	 * @param wochenstunden the wochenstunden to set
	 */
	public void setWochenstunden(double wochenstunden) {
		this.wochenstunden = wochenstunden;
	}

	/**
	 * @return the gehalt
	 */
	public double getGehalt() {
		return this.gehalt;
	}

	/**
	 * @param gehalt the gehalt to set
	 */
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

}
