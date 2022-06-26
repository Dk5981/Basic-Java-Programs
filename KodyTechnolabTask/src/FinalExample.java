import java.util.LinkedList;

interface A {

	private void dis(int a) {
		System.out.println("Hello" + a);
	}

}
public class FinalExample implements A
{
	private void dis(int a) {
		System.out.println("Hello" + a);
	}
	public static void main(String[] args) {
		FinalExample a = new FinalExample();
		a.dis(5);
		
		LinkedList<String> list = new LinkedList<String>();
	}
}

