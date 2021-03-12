
public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdArray b = new OrdArray(50);
		
		b.insert(1);
		b.insert(3);
		b.insert(2);
		b.insert(5);
		b.insert(4);
		b.display();
		System.out.println(b.find(3));
		b.delete(3);
		b.display();
		

	}

}
