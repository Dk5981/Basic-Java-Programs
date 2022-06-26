/**
 * Objective :
 * Developer : Divyesh   
 * Date      : 06-Jun-2022
 * Time      : 11:02:00 AM
 */
public class PascalTringle {

	public static void main(String[] args) {

		int square = 1, rem = 0;
		
		for(int i = 1; i <= 6; i++)
		{
			for(int k = 5; k >= i; k--)
			{
				System.out.print(" ");
			}
			if(i == 1)
			{
				System.out.print(square);
			}
			else
			{
				square = square * 11;
				int temp = square;
				String reverse = "";

				while(square > 0)
				{
					rem = square % 10;
					reverse = reverse.concat(String.valueOf(rem));
					square = square /10;
				}
				for(int z = reverse.length()-1; z >= 0; z--)
				{
					System.out.print(reverse.charAt(z) + " ");
				}
				square = temp;
			}
			System.out.println();
		}
	}
}