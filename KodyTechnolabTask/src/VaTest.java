import java.util.Collections;

public class VaTest {

//	VaTest(int... c)
//	{
//		System.out.println(c.length);
//	}

	public static void test(float... i) {
		for (int t = 0; t < i.length; t++) {
			System.out.println(i[t]);
		}

		System.out.println("double");
	}

	public static void test(char... i) {
		for (int t = 0; t < i.length; t++) {
			System.out.println(i[t]);
		}

		System.out.println("short");
	}

	public static void test(int... l) {
		for (int t = 0; t < l.length; t++) {
			System.out.println(l[t]);
		}

		System.out.println("byte");
	}

	public static void main(String[] args) {
//		VaTest v = new VaTest(3,2,3,4);
		test();
	}
}