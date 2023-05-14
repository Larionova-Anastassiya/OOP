package Task2;

import java.util.Vector;

public class testPerson {

	public static void main(String[] args) {
		
		Vector<Person> persons = new Vector<Person>();
		/* Test Student class */
		Student s1 = new Student("Anna", "20", "OOP" , 2, 25.5);
		Student s2 = new Student("Nastya", "27", "OOP" , 3, 50);
		
		/* Test Staff class */
		Staff f1 = new Staff("Nurmuchan", "15", "121 school", 30000);
		
		
		persons.add(s1);
		persons.add(s2);
		persons.add(f1);
		
		//System.out.println(s1.toString());
		for(Person p: persons) {
			System.out.println(p.toString());
		}

	}

}
