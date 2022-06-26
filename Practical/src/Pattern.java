/**
 * 
 */

/**
 * Objective :
 * Developer : Divyesh   
 * Date      : 06-Jun-2022
 * Time      : 11:35:10 AM
 */
public class Pattern {

	public static void main(String[] args) {

		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k = 6; k >=1 ; k--)
		{
			for(int d = k; d >= 1; d--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}