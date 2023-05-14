package Task1;

public class Parrot extends Animal{
	
	int wingSize; //this bird
	
	public Parrot() {}
	
	public Parrot(String name, int wingSize) {
		super(name); //Animal
		this.wingSize = wingSize;
	}
	
	//overriding
	public String voice() {
		return "Tweet";
	}
	public String move() {
		return "Fly";
	}
	
	
	//new method
	void findSeed() {
		System.out.println("Seed found!");
	}
	
	//new toString 
	public String toString() {
		return super.toString() + ", Wings size "+wingSize;
	}

}
