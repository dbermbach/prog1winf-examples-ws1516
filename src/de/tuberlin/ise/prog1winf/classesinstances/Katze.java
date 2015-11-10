/**
 * 
 */
package de.tuberlin.ise.prog1winf.classesinstances;

/**
 * @author Dave
 *
 */
public class Katze {
	
	boolean kastriert;
	int alter;
	String rasse;
	long id = nextId++;
	static long nextId = 0;

	public void tuWas(){
		System.out.println(this.rasse);
	}
	
	public static void main(String[] args) {
		Katze k = new Katze();
		k.alter = 30;
		k.kastriert = false;
		k.rasse = "Tiger";
		Katze k2 = new Katze();
		k2.rasse = "nicht Tiger";
		Katze k3 = new Katze();
		
		System.out.println("k: "+k.id);
		System.out.println("k2: "+k2.id);
		System.out.println("k3: "+k3.id);
		System.out.println("k kastriert?" + k.kastriert);
		k.kastriert = true;
		System.out.println("k kastriert?" + k.kastriert);
		k.tuWas();
		k2.tuWas();
		k3.tuWas();
	}
	
}
