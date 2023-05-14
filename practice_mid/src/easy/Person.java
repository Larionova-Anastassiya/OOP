package easy;

import java.util.Objects;

abstract public class Person {
	String name;
	public int year;
	
	private int id; //for init bloc
	static int cnt;
	
	public Gender gen; //enum
	
	{ //init block
		id = cnt++;
	}
	
	public Person() {
		//empty
	}
	
	public Person(String name) {
		this.name = name; //1 use this
	}
	
	public Person(String name, int year, int id, Gender gender) {
		this(name); //2 use this
		this.year = year;
		this.id = id;
		this.gen = gender; //enum
	}
	
	public String getName() { ////даем только посмотреть данные
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name + " ID: " + id;
	}
	
	//public abstract String favBook();  //обязательно у дочерних
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(o.getClass() != this.getClass()) return false;
		
		Person p = (Person) o; //type cast
		return this.name == p.name; //or this.name.equals(p.name)
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}

}
