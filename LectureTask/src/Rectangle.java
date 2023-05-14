
public class Rectangle extends Shape {
	//override draw  [] 
	//constant
		public Rectangle( Color color, int pos) { 
			super(color, pos); //in Shape
		}
		
		void draw() {
			System.out.print(" ".repeat(pos)); //отступ пустоты сделает
			 if (color == Color.RED)
				 System.out.println("{}");
			 else System.err.println("[]");
		 }
}
