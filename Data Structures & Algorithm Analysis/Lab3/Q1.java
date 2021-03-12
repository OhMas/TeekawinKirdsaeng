
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLastList a = new FirstLastList();
		//Link[] b = {new Link(5),new Link(15),new Link(25),new Link(30)};
		a.insertFirst(5);
		a.insertFirst(15);
		a.insertFirst(25);
		a.insertFirst(30);
		
		a.insertLast(3);
		a.insertLast(13);
		a.insertLast(23);
		a.insertLast(33);
		while(a.isEmpty() != true) {
		System.out.println(a.deleteFirst());
		a.displayList();
	}

	}
}
