package Task4;

import java.util.Objects;

public class Person {

	public String name;

	
	
	//CONSTRUCTOR
	public Person() {
		//empty
	}
	public Person(String name) {
		this.name = name;
	}

	
	
	//METHODS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	//HASHCODE and EQUALS

	@Override
	public boolean equals(Object o) {
		if (this == o) return true; //address
		if (o == null) return false; //null if empty
		if (this.getClass() != o.getClass()) return false;
		
		
		Person p = (Person) o;
		return this.name == p.name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}



	//TO STRING
	@Override
	public String toString() {
		return "Person name: " + name;
	}
	
	
	
}
