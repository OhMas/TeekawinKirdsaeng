
public class Lab02Task6 {
	
	public static void main(String[] args) {
		
		Queue q = new Queue(50);
		q.insert(5);
		q.insert(15);
		q.insert(25);
		q.insert(30);
		
		for(int i=1; i<5; i++) {
			System.out.println(q.remove());
		}
	}
	
}
