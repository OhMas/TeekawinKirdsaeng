
public class Lab02Task7 {
	
	public static void main(String[] args) {
		
		PriorityQ pq = new PriorityQ(50);
		pq.insert(5);
		pq.insert(15);
		pq.insert(25);
		pq.insert(30);
		
		for(int i=1; i<5; i++) {
			System.out.println(pq.remove());
		}
	}
	
}
