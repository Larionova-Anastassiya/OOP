package Task1;

public class Cat extends Animal {
	
	int age;
	
	public Cat() {} //empty
	
	public Cat(String name) { //only name
		super(name); //in Animal
	}
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	//overriding
	public String voice() {
		return "Meow";
	}
	public String move() {
		return "Run and walk";
	}
	
	
	//toStrings
	public String toString() { //in Animal + Cat
		return super.toString()+ ", Age: "+age;
	}
	
	
	//new method
	public void findMouse() {
		System.out.println("Mouse Found!");
	}

}
