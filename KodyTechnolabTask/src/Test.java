public class Test {
	public static void main(String args[]) {
		Test obj = null;
		obj.staticMethod();
		obj.nonStaticMethod();
	}

	private static void staticMethod()
	{
		System.out.println("static method");
	}

	private void nonStaticMethod()
	{
		// Can not be called by null reference
		System.out.print("Non - static method - ");
		System.out.println("cannot be called by null reference & quot");
	}
}