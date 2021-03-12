
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkStack  a = new LinkStack();
		a.push(16);
		a.push(25);
		a.push(36);
		a.push(49);
		while(a.isEmpty() != true) {
		System.out.println(a.pop());
		a.displayStack();
	}
	}

}
