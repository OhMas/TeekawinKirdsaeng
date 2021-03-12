package lab;

import java.util.Scanner;

public class NumberSet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int a = input.nextInt();
		System.out.println("Please enter a number");
		int b = input.nextInt();
		System.out.println("Please enter a number");
		int c = input.nextInt();
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		double avg = (a+b+c)/3.0;
		
		System.out.println("The maximium number is :"+max);
		System.out.println("The minimium number is :"+min);
		System.out.println("The average value is :"+avg);
		
		

	}

}
