package Task1;

import java.util.Objects;


public class Cube extends Shapes{
	//values
	private int sides; //сторона (ребро)
	
	
	public Cube() {
		super(); //empty
	}
	
	public Cube(int sides) {
		this.sides = sides; //only sides
	}
	
	public Cube(String color, int sides) { //all variable for cube
		super(color);
		this.sides = sides;
	}
	
	
	
	//Methods
	
	public int getSide() { // Вернет значение 
		return sides;
	}
	
	public void setSides (int sides) { //Присвоим свое значение 
		this.sides = sides;
	}
	
	// Вернет ответ значений в виде строки (Overriding)
	public String toString() {
	    return "Cube: " + super.toString() + "Side size = " + sides;
	}
	
	
	//abstract 
	
	public double getVolume() {
		return Math.pow(sides, 3); //число в степени через спец функцию
	}
	//Volume = sides ^ 3
	
	public double getSurfaceArea() {
		return 6 * (Math.pow(sides, 2));
	}
	
	public String getColorShape() {
		return super.color;
	}
	
	
	
	
	//EQUALS
	   public boolean equals(Object o) {
		   if(! super.equals(o)) return false; //in Fruit
		   
		   Cube s = (Cube)o;
		   return this.sides == s.sides;
	   }
	   
	 //HASHCODE
	   public int hashCode() {
		   return Objects.hash(sides);
	   }
}
