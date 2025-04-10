package test_02_04_25;

import java.util.Scanner;

public class LastDigit_HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int ld = num%10;

		while(ld>0)
		{
			int value = sum(ld);
			if(value<9)
			{
				if(value == 1)
				{
					System.out.println("Happy Number");
					break;
				}
				else if(value == 4)
				{
					System.out.println("Un-Happy Number");
					break;
				}
			}
			else
			{
				ld = value;
			}
		}
	}
	public static int sum(int num)
	{
		int sum = 0;
		int mul = 1;
		while(num>0)
		{
			int ld = num%10;
			mul = ld * ld;
			num/=10;
			sum +=mul;
		}
		return sum;
	}
}
