/**
 * Objective : 
 * Developer : Divyesh
 * Date : June 21, 2022
 * Time : 2:38:05 PM
 */
enum Apple {
	JONATHAN, GOLDENDEL, REDDEL, WINESAP, CORTLAND;
}

public class EnumExample {
	public static void main(String args[]) {
		Apple ap;
		System.out.println("Here are all Apple constants:");

		Apple allapples[] = Apple.values();
		for (Apple a : allapples) {
			System.out.println(a);
		}
		System.out.println();

		ap = Apple.valueOf("WINESAP");
		System.out.println("ap contains " + ap);
	}
}