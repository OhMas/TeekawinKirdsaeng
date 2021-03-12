
public class Lab02Task1 {

	public static void main(String[] args) {
		
		StackX stack = new StackX(50);
		stack.push(5);
		stack.push(15);
		stack.push(25);
		stack.push(30);
		
		for(int i=1; i<5; i++) {
			System.out.println(stack.pop());
		}
	}
	
}
