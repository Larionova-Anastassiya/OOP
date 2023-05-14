package Task1;

import java.util.Objects;

public class Sphere extends Shapes{
	//values
			private int radius; 
			private final double PI = 3.14;
			
			
			public Sphere() {
				super(); //empty
			}
			
			public Sphere(int radius) {
				this.radius = radius; //only radius 
			}
			
			public Sphere(String color, int radius) { //all variable for Sphere
				super(color);
				this.radius = radius; //only radius 
			}
			
			
			
			//Methods
			
			public int getRadius() { // Вернет значение 
				return radius;
			}
			
			public void setRadius (int radius) { //Присвоим свое значение 
				this.radius = radius;
			}
			
			
			
			
			// Вернет ответ значений в виде строки (Overriding)
			public String toString() {
			    return "Sphere: " + super.toString() + "Radius = " + getRadius();
			}
			
			
			//abstract 
			
			public double getVolume() {
				return Math.pow(radius, 3) * PI * (4/3); //число в степени через спец функцию
			}
			//Volume = radius ^ 3  * 3,14 * (4/3)
			
			public double getSurfaceArea() {
				return 4 * PI * (Math.pow(radius, 2));
			}
			
			public String getColorShape() {
				return super.color;
			}
			
			
			//EQUALS
			   public boolean equals(Object o) {
				   if(! super.equals(o)) return false; //in Fruit
				   
				   Sphere s = (Sphere)o;
				   return this.radius == s.radius;
			   }
			   
			 //HASHCODE
			   public int hashCode() {
				   return Objects.hash(radius);
			   }
}
