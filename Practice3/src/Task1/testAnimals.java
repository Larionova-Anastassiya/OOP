package Task1;

import java.util.Vector;

public class testAnimals {

	public static void main(String[] args) {
		
		Parrot p1 = new Parrot("Kesha", 20); //name and size wings
		Parrot p2 = new Parrot("Misha", 10);
		
		Animal c1 = new Cat("Kira"); // only name
		Cat c2 = new Cat("Graph", 5); //name and age
		
		//vector all animal
		Vector<Animal> zoo = new Vector<Animal>();
		zoo.add(p1);
		zoo.add(p2);
		zoo.add(c1);
		zoo.add(c2);
		
		System.out.println(zoo);
		
		for(Animal animal : zoo) {
			System.out.println("\n"+animal.voice()); // polymorphism, call overriden voice
			
			//выполнит спец метод кошки
			if(animal instanceof Cat) {
				Cat c = (Cat)animal;
				c.findMouse();
			}
			
			// выполнит спец метод попугая
			else if(animal instanceof Parrot) {
				((Parrot)animal).findSeed(); // call specific
			}
			
			
		}
		
	}

}
