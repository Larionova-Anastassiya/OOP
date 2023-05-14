package Task1;

import java.util.HashSet;


public class testShapes {

	public static void main(String[] args) {
		
		HashSet <Shapes> shapes = new HashSet<Shapes>(); //без дубликатов чтобы
		
		//Example for cube
		Cube cu = new Cube(5);
		Shapes cu1 = new Cube("Red", 7); //with polimorphism
		
		/*
		System.out.println ("Cube side: " + cu.getSide() + " Area: " + cu.getSurfaceArea() + " and Volume: " + cu.getVolume());
		System.out.println(cu1.toString());
		
		
		System.out.println(" ");
		*/
		
		//Example for cylinder
		Cylinder cy = new Cylinder(3, 8); // radius, height
		Shapes cy1 = new Cylinder("Black", 7, 11); //with polimorphism
		
		
		/*
		System.out.println ("Cylinder radius: " + cy.getRadius() + " Area: " + cy.getSurfaceArea() + " and Volume: " + cy.getVolume());
		System.out.println(cy1.toString());
		
		
		System.out.println(" ");
		*/
		
		//Example for sphere
		Sphere s = new Sphere(6); // radius, height
		Shapes s1 = new Sphere("Green", 10); //with polimorphism
			
		
		/*
		System.out.println ("Sphere radius: " + s.getRadius() + " Area: " + s.getSurfaceArea() + " and Volume: " + s.getVolume());
		System.out.println(s1.toString());
		*/
		
		
		//Добавить элементы
		shapes.add(cu);
		shapes.add(cu1);
		shapes.add(cy);
		shapes.add(cy1);
		shapes.add(s);
		shapes.add(s1);
		
		
		for(Shapes sh: shapes) {
			System.out.println(sh.toString());
			
			if(sh instanceof Cube) {
				System.out.println ("Area: " + sh.getSurfaceArea() + " and Volume: " + sh.getVolume());
			}
			
			else if(sh instanceof Cylinder) {
				System.out.println ("Area: " + sh.getSurfaceArea() + " and Volume: " + sh.getVolume());
			}
			
			else if(sh instanceof Sphere) {
				System.out.println ("Area: " + sh.getSurfaceArea() + " and Volume: " + sh.getVolume());
			}
			
			System.out.println(" ");
		}

	}

}
