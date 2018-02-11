/*
 Chapter 7 Self Test
 Question 2: Create class Circle which is a subclass of TwoDShape
*/

abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	TwoDShape() {
		width = height = 0;
		name = "none";
	}
	
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	double getWidth() { return width; }
	double getHeight() { return height; }
	String getName() { return name; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	void setName(String n) { name = n; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	abstract double area();
}

class Circle extends TwoDShape {
	private double diameter;
	
	Circle() {
		super();
	}
	
	Circle(double d) {
		super(d, "Circle");
		diameter = d;
	}
	
	Circle(Circle ob) {
		super(ob.getDiameter(), ob.getName());
		diameter = ob.diameter;
	}
	
	double getDiameter() { return diameter; }
	void setDiameter(double d) { diameter = d; }
	
	double area() {
		return (3.14 * (diameter/2) * (diameter/2));
	}
}

class Shape {
	public static void main(String args[]) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(6);
		Circle c3 = new Circle(c2);
		
		System.out.println(" Circle c1, with diameter = " + c1.getDiameter() + ", has an area of " + c1.area());
		System.out.println(" Circle c2, with diameter = " + c2.getDiameter() + ", has an area of " + c2.area());
		System.out.println(" Circle c3, with diameter = " + c3.getDiameter() + ", has an area of " + c3.area());
	}
}