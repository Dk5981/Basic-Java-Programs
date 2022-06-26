

/**
 * Objective : This Pro
 * Developer : Divyesh Date : 06-Jun-2022 Time : 6:15:00 AM
 */
public class MethodOverloading {

	void test() {
		System.out.println("No parameters");
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// Overload test for a double parameter
	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}

	public static void main(String[] args) {

		MethodOverloading ob = new MethodOverloading();
		short i = 88;
		ob.test();
		ob.test(10, 20);
		ob.test(i); 
		ob.test(78); 
	}

}
