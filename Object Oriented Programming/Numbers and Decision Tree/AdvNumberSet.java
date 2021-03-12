package lab;

import java.util.Scanner;

public class AdvNumberSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int max = -99999;
		int min = 99999;
		float cout1=0;
		float cout2=0;
		int a;
		
		do {
			
		
		System.out.println("Please enter a number from 0 to 100. To exit enter -1");
		 a = input.nextInt();
		if(a < -1 || a > 100) 
		{
			System.out.println("Invalid number!");
			
		}
		
		
		else if(a == -1)
		{
			break;
		}
		
		
		
		else
		{
			cout1 = cout1+a;
			cout2++;
			if(max < a)
			{
				max = a;
			}
			else if(min > a)
			{
				min = a;
				
			}
				
		}
		
		} while (a != -1);
		
		float avg = 0;
		avg = cout1/cout2;
		
		System.out.println("The maximum number is"+max);
		System.out.println("The minimum number is"+min);
		System.out.println("The average number is"+avg);
		

	}
}
 