package Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.Comparator;


public class testTask4 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		//PERSONS AND EMPLOYEES
		Person p = new Person("Anna");
		//System.out.println(p.toString());
		Person e = new Employee("Nastya", 1000000, "006");
		//System.out.println(e.toString()); //all empty only name have
		Employee e2 = new Employee("Alionora", 180.9, "00122");
		//System.out.println(e2.toString()); //all values
		Person e3 = e2; //not save because this duplicate
		Employee e4 = new Employee("Zarina", 1500.5, "00122"); //"Zarina", 1500.5, "00122" -- add, but "Alionora", 121.3, "00122" -- not add
		Employee e6 = new Employee("Anna", 121.3, "00122");
		
		
		//CLONE EMPLOYEE
		Object e5 = ((Employee) e).clone(); //this works and clone all elements
		//System.out.println(e5.toString());
		
		
		
		//HASH with no duplicate
		HashSet <Person> persons = new HashSet <Person>();
		
		persons.add(p);
		persons.add(e);
		persons.add(e2);
		persons.add(e3);
		persons.add(e4);
		persons.add((Person) e5); //cast argument Object to Person but this duplicate
		
		//print only original employees
		for(Person pe: persons) {
			System.out.println(pe.toString());
		}


		System.out.println();
		
		
		
		
		
		
		//ARRAY and SORTING NAME (EMPLOYEE)
		System.out.println("Sorting name Employee: ");
		ArrayList <Employee> persons2 = new ArrayList <Employee>();
		
		persons2.add(e2);
		persons2.add(e4);
		persons2.add(e6);
		
	
		Comparator<Employee> myNameComparator = new NameComparator();
		persons2.sort(myNameComparator);
		for(Person pe2: persons2) {
			System.out.println(pe2.getName());
		}
		
		Collections.sort(persons2); //sorting with salary
		
		System.out.println();
		System.out.println("Sorting salary employees:");
		
		for(Employee pe2: persons2) {
			System.out.println(pe2.getName() + " " + pe2.getSalary());
		}
		
		
		
		
	
		
		System.out.println();
		
		
		
		
		
		//MANAGER
		Manager m = new Manager("Oleg", 100, "006");
		//System.out.println(m.toString()); only salary
		//add employees for manager 1 and we have bonus
		m.addEmpForManager(e2);
		m.addEmpForManager(e4);
		//System.out.println(m.toString()); // salary with bonus
		
		System.out.println();
		
		
		
		//CLONE MANAGER
		Object m2 = ((Manager) m).clone(); //this works and clone all elements (with bonus and new salary)
		System.out.println(m2.toString()); //copy with bonus
		
		
		Manager m3 = new Manager("Poly", 150, "009");
		//System.out.println(m.toString());
		//add employees for manager 1 and we have bonus
		m3.addEmpForManager(e2);
		m3.addEmpForManager(e4);
		m3.addEmpForManager(e6);
		System.out.println(m3.toString()); //with bonus
		
		
		Manager m4 = new Manager("Artur", 100, "010");
		m4.addEmpForManager(e6);
		m4.addEmpForManager(e2);
		System.out.println(m4.toString()); //only salary
		
		
		
		
		
		//ARRAY and SORTING NAME
		ArrayList <Manager> manager2 = new ArrayList <Manager>();

		manager2.add(m);
		//manager2.add(m2);
		manager2.add(m3);
		manager2.add(m4);

		System.out.println();
		System.out.println("Sorting name Manager: ");
		
		Comparator<Employee> myNameComparatorMa = new NameComparator();
		manager2.sort(myNameComparatorMa);
		for(Person ma2: manager2) {
			System.out.println(ma2.getName());
		}
		
		
		
		Collections.sort(manager2); //sorting with salary and bonus

		System.out.println();
		System.out.println("Sorting salary managers:");

		for(Manager ma2: manager2) {
			System.out.println(ma2.getName() + " " + ma2.getSalary() + " Bonus: " + ma2.bonus);
		}
	}

}
