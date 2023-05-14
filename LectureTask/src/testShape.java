import java.util.Vector;

public class testShape {
	public static void main(String[] args) throws InterruptedException {
		Vector<Shape> shapes = new Vector<Shape>();
		
		//Circle
		shapes.add(new Circle(Color.RED, 4, 20)); //position = 4, radius = 20
		shapes.add(new Circle(Color.RED, 14, 30));
		shapes.add(new Circle(Color.BLACK, 20, 15));
		shapes.add(new Circle(Color.BLACK, 8, 26));
		
		
		shapes.add(new Rectangle(Color.RED, 50));
		shapes.add(new Rectangle(Color.BLACK, 60));
		shapes.add(new Rectangle(Color.RED, 20));
		
		shapes.add(new Triangle(Color.BLACK, 30));
		shapes.add(new Triangle(Color.RED, 25));
		
		
		for(Shape s: shapes) {
			s.draw();
			
			Thread.sleep(100);
			
			/*
			if(s instanceof Circle){
				Circle c = (Circle)s;
				System.out.println("Radius " + c.getRadius());
			}
			*/
			
		}
	}
}
