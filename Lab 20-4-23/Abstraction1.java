package lab4;

abstract class Shape{
	abstract double CalculateArea();
}
class Circle extends Shape{
    float radius;
    public Circle(float radius) {
		super();
		this.radius=radius;
	}
	@Override
	double CalculateArea() {
		double area = (3.1415*radius*radius); 
		return area;
	}
	
}
class Rectangle extends Shape{

   float length,Breadth;
	@Override
	double CalculateArea() {
		return length*Breadth;
		
	}
	public Rectangle(float length,float Breadth) {
		super();
		this.length=length;
		this.Breadth=Breadth;
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
	    System.out.println("Area Of Circle is : "+circle.CalculateArea());
	    System.out.println("==========================================");
	    
	    Rectangle rectangle = new Rectangle(10,20);
	    System.out.println("Area of Rectangle is : "+rectangle.CalculateArea());
	    
		
	}

}
