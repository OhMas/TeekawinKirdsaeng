//Name:
//ID:
//Section:

public class Book extends Item{
	
	private StringBuilder note = null;
	
	public Book(double _purchasePrice, double _age, double weight) {
		super(_purchasePrice, _age, weight);
		note = new StringBuilder();

	}

	@Override
	public double getCurrentValue() {
		//Your Code Goes Here
		double sum = 0;
		sum = getPurchasePrice() * Math.pow(0.9, getAge());
		return sum;
	}

	@Override
	public String toString()
	{
		return "[Book: value = "+String.format( "%.2f", this.getCurrentValue())+" Baht, Note = \""+getNote()+"\"]";
	}
	
	public void takeNote(String _note)
	{
		System.out.println("Taking note: \""+_note+"\"");
		note.append(_note);
	}
	
	public String getNote()
	{
		return note.toString();
	}
	
	public Book clone()
	{
		//Your Code Goes Here
		Book a = new Book(getPurchasePrice(),getAge() , getWeight());
		a.note = new StringBuilder(note);
		return a;
	}
}
