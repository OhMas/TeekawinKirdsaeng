
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList a = new DoublyLinkedList();
		a.insertFirst(5);
		a.insertFirst(15);
		a.insertFirst(25);
		a.insertFirst(30);
		
		a.insertLast(3);
		a.insertLast(13);
		a.insertLast(23);
		a.insertLast(33);
		a.insertAfter(23,100);
		a.deleteFirst();
		a.deleteLast();
		a.deleteKey(25);
		a.displayForward();
		a.displayBackward();
	}

}
