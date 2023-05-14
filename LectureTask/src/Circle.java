
public class Circle extends Shape {
	//constant
	public int radius;
	public Circle( Color color, int pos, int radius) { 
		super(color, pos); //in Shape
		this.radius = radius;
	}
	//override draw  O (circle) 
	//specific Radius example
	void draw() {
		System.out.print("  ".repeat(pos)); //отступ пустоты сделает
		 if (color == Color.BLACK)
			 System.out.println("()");
		 else System.err.println("O"); //if error
	 }
	
	
	public int getRadius() {
		return radius;
	}
	
}
