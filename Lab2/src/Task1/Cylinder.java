package Task1;

import java.util.Objects;

public class Cylinder extends Shapes {
	
	//values radius and height
		private int radius; 
		private int height; 
		private final double PI = 3.14;
		
		
		public Cylinder() {
			super(); //empty
		}
		
		public Cylinder(int radius, int height) {
			this.radius = radius; //only radius and height
			this.height = height;
		}
		
		public Cylinder(String color, int radius, int height) { //all variable for cylinder
			super(color);
			this.radius = radius; //only radius and height
			this.height = height;
		}
		
		
		
		//Methods
		
		public int getRadius() { // Вернет значение 
			return radius;
		}
		
		public void setRadius (int radius) { //Присвоим свое значение 
			this.radius = radius;
		}
		
		public int getHeight() { // Вернет значение 
			return height;
		}
		
		public void setHeight (int height) { //Присвоим свое значение 
			this.height = height;
		}
		
		
		
		// Вернет ответ значений в виде строки (Overriding)
		public String toString() {
		    return "Cylinder: " + super.toString() + "Radius = " + getRadius() + " Height = " + getHeight();
		}
		
		
		//abstract 
		
		public double getVolume() {
			return Math.pow(radius, 2) * height * PI; //число в степени через спец функцию
		}
		//Volume = radius ^ 2 * height * 3,14
		
		public double getSurfaceArea() {
			return (2 * PI * (Math.pow(radius, 2))) + (2 * PI * radius * height);
		}
		
		public String getColorShape() {
			return super.color;
		}
		
		
		
		//EQUALS
		   public boolean equals(Object o) {
			   if(! super.equals(o)) return false; //in Fruit
			   
			   Cylinder c = (Cylinder)o;
			   return this.radius == c.radius && this.height == c.height;
		   }
		   
		 //HASHCODE
		   public int hashCode() {
			   return Objects.hash(radius, height);
		   }

}
