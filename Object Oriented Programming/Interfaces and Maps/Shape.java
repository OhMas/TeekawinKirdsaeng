
public abstract class Shape implements Comparable {

	public static Double PI = 3.14;
	public String color;
	public String description;
	
	public Shape (String color, String description)
	{
		this.color = color;
		this.description = description;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	public String toString()
	{
		
		return description+"(color="+ color +", area="+ this.getArea() +")";
		
	}
	
	public int compareTo(Object shape)
	{
		;
		 
		if(this.getArea() == ((Shape) shape).getArea() )
		{
			return 0;
		}
		
		else if(this.getArea() > ((Shape) shape).getArea())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	
	
	

}
