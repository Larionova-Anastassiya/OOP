package Task2;

import java.util.HashSet;

public class testFruit {
public static void main(String[] args) {
		
		HashSet <Fruit> fruits = new HashSet<Fruit>();
		Orange o1 = new Orange("Karlic", "Metro", 120);
		Orange o2 = new Orange("Kara Kara","Metro", 100);
		
		Orange o3 = new Orange("Karlic","Metro", 120);
		Orange o4 = o2;
		
		fruits.add(o1);
		fruits.add(o2);
		fruits.add(o3);
		fruits.add(o4);
		
		
		for(Fruit f: fruits) {
			System.out.println(f.toString());
		}
		
		/* Use vector
		 
		 
		Vector<Fruit> fruits = new Vector<Fruit>();
		
		Orange o1 = new Orange("Karlic", 120);
		Orange o2 = new Orange("Kara Kara", 100);
		
		fruits.add(o1);
		fruits.add(o2);
		
		for(Fruit f: fruits) {
			System.out.println(f.toString());
		}
		*/

	}
}
