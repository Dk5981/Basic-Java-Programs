import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * Objective :
 * Developer : Divyesh   
 * Date      : 05-Jun-2022
 * Time      : 3:34:42 PM
 */
class Animal 
{
	public void eat() throws IOException 
	{
		System.out.println("Generic Animal Eating Generally!!");
	}
}
class Horse extends Animal
{
	public void eat() 
	{
		System.out.println("Horse eating hay, oats.");
	}
}
public class TestAnimals {

	public void doStuff(Animal a) throws IOException
	{
		System.out.println("In the Animal Version!!");
	}
	
	public void doStuff(Horse h)
	{
		System.out.println("In the Horse Version!!");
	}
	
	public static void main(String[] args) throws IOException {

		Animal obj = new Horse();
//		obj.eat();

		List<String> list = new ArrayList<String>();
				
		String a = "Dhruv";
		
		list.add(a);
		
		String s =  null;
		
		list.add(s);
				
		list.add(null);
		
		List<String> list2 = new ArrayList<String>(list);
				
		System.out.println(list2);
		System.out.println(list);
		
		TestAnimals obj1 = new TestAnimals();
		obj1.doStuff(obj);
	}
}