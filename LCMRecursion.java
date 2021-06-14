package lcmRecursion;
import java.util.Scanner;

public class LCMRecursion {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		//variables
		int num1;
		int num2;
		int lcm = 0;
		//create scanner
		sc = new Scanner(System.in);
		//get values from user input
		System.out.print("Please Enter the First Integer Value : ");
		num1 = sc.nextInt();	
		
		System.out.print("Please Enter the Second Integer Value : ");
		num2 = sc.nextInt();
				
		//least common multiplier
		lcm = (num1 * num2) / gcd(num1, num2);
		System.out.println("LCM of " + num1 + " and " + num2 + "  is  " + lcm);
	}
	//recursive function to find greatest common divisor so we can find least common multiplier
	public static int gcd(int x, int y)
	{
		if(y == 0)
		{
			return x;
		}
		else
		{
			return gcd(y, x % y);
		}
	}

}
