package lab;

/*
 * The Triangle class, subclass of Shape
 */

/*  The structure of Triangle class is similar to Rectangle */
public class Triangle extends Shape{
	
	public double base;
	public double height;

	

   //add your code here
	public double getArea()
	{
		return 0.5*base*height;
		
	}
	
	public Triangle()
	{
		base = 0.0;
		height = 0.0;
	}

	public Triangle(String color,double base, double height)
	{
		super(color);
		this.base = base;
		this.height = height;
		
	}
	public String toString()
	{
		
		return "Triangle[base="+base+",height="+height+",Shape[color="+getColor()+"]]";
	}
	
	public double getArea(double base, double height)
	{
		this.base = base;
		this.height = height;
		return getArea();
		
	}

}
