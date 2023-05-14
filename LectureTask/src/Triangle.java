
public class Triangle extends Shape{
	//override draw   /_\ (triangle)
	public Triangle( Color color, int pos) { 
		super(color, pos); //in Shape
	}
	void draw() {
		System.out.print(" ".repeat(pos)); //отступ пустоты сделает
		 if (color == Color.BLACK)
			 System.out.println("/| ");
		 else System.err.println("/|");
	 }
}
