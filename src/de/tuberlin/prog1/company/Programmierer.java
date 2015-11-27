/**
 * 
 */
package de.tuberlin.prog1.company;

/**
 * @author Dave
 *
 */
public class Programmierer extends Mitarbeiter {

	private ProgrammierSprache[] sprachen = new ProgrammierSprache[0];

	/**
	 * @param name
	 * @param wochenstunden
	 * @param gehalt
	 */
	public Programmierer(String name, double wochenstunden, double gehalt,
			ProgrammierSprache... sprachen) {
		super(name, wochenstunden, gehalt);
		for (ProgrammierSprache p : sprachen)
			this.lerneSprache(p);
	}

	/**
	 * @param name
	 * @param gehalt
	 */
	public Programmierer(String name, double gehalt,
			ProgrammierSprache... sprachen) {
		super(name, gehalt);
		for (ProgrammierSprache p : sprachen)
			this.lerneSprache(p);
	}

	public void lerneSprache(ProgrammierSprache ps) {
		ProgrammierSprache[] temp = new ProgrammierSprache[this.sprachen.length + 1];
		for (int i = 0; i < this.sprachen.length; i++) {
			temp[i] = this.sprachen[i];
		}
		temp[/* this.sprachen.length */temp.length - 1] = ps;
		this.sprachen = temp;
		System.out.println(this.getName() + " kann jetzt in " + ps
				+ " programmieren.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.tuberlin.prog1.company.Mitarbeiter#arbeite()
	 */
	@Override
	public double arbeite() {
		int index = (int) (Math.random() * this.sprachen.length);
		System.out.println(this.getName() + " hat 8h in "
				+ this.sprachen[index] + " programmiert.");
		return 8;
	}

	
	
	
}
