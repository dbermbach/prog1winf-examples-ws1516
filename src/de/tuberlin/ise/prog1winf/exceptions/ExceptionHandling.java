/**
 * 
 */
package de.tuberlin.ise.prog1winf.exceptions;


/**
 * @author Dave
 *
 */
public class ExceptionHandling {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int i = 0;
		try {
			method();
			System.out.println(3 / i);
			System.out.println(42);

		} catch (ArithmeticException | NullPointerException a) {
			System.out.println("arithmetic exception");
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("Hallo");
		} finally {
			System.out.println("finally!");
		}
		System.out.println("Programm läuft noch");
	}

	/**
	 * 
	 * @throws Exception wirft eine checked Exception
	 */
	private static void method() throws Exception{
		Exception e = new Exception("Fehlermeldung");
		throw e;
		
	}

}
