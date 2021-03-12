package lab;

import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Color?");
		String color = input.nextLine();
		
		if(color.equals("green")) {
			System.out.println("Size");
			String size = input.nextLine();
			if(size.equals("big")) {
				System.out.println("This fruit it a \"Watermelon\"");
			}
			else if(size.equals("medium")) {
				System.out.println("This fruit it a \"Apple\"");
				
			}
			else if(size.equals("small")) {
				System.out.println("This fruit it a \"Grape\"");
			}
		}
		else if(color.equals("yellow")) {
			System.out.println("Shape?");
			String shape = input.nextLine();
			if(shape.equals("round")) {
				System.out.println("Size?");
				String size2 = input.nextLine();
				if(size2.equals("big")) {
					System.out.println("This fruit it a \"Grapefruit\"");
				}
				else if(size2.equals("small")) {
					System.out.println("This fruit it a \"Lemon\"");
				}
			
			}
		}
		else if(color.equalsIgnoreCase("red")) {
			System.out.println("Size?");
			String size3 = input.nextLine();
			if(size3.equals("medium")) {
				System.out.println("This fruit it a \"Apple\"");
			}
			else if(size3.equals("small")) {
				System.out.println("Taste?");
				String taste = input.nextLine();
				if(taste.equals("sweet")) {
					System.out.println("This fruit it a \"Cherry\"");
				}
				else if(taste.equals("sour")) {
					System.out.println("This fruit it a \"Grape\"");
				}
			}
		}
		
		

	}

}
