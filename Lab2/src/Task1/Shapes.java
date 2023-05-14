package Task1;

import java.util.Objects;

abstract public class Shapes {
	/*volume  объем, 
	surface area площадь поверхности
	public double volume;
	public double surfaceArea;
	*/
	
	
	
	String color;
	
	
	//Constructors
	public Shapes() {
		//empty
	}
	
	public Shapes(String color) {
		this.color = color;
	}
	
	
	
	//Methods
	
	//OVERRIDING 
	public String toString() {
		return "Color shape: " + color + ". ";
	}
	
	/*
	public double getVolume() {
		System.err.println("Shape unknown! Cannot compute volume!");
	    return 0;
	}
	*/
	
	
	//Все конкретные подклассы Shape должны реализовывать метод 
	//с именем getVolume()
	abstract public double getVolume();
	//с именем getSurfaceArea()
	abstract public double getSurfaceArea();
	abstract public String getColorShape();
	
	
	
	
	//EQUALS
	   public boolean equals(Object o) {
		   if(o == this) return true; //address
		   if(o == null) return false; //empty
		   if(o.getClass() != this.getClass()) return false;
		   
		   if(((Shapes) o).getVolume() != this.getVolume()) return false;
		   
		   Shapes f = (Shapes)o;
		   return this.color == f.color;
	   }
	   
	   

	//HASHCODE
	   public int hashCode() {
		   return Objects.hash(getVolume());
	   }
}
