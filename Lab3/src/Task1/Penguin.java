package Task1;

public class Penguin extends Birds{
	//all methods birds
	public String name;
	
	
	
	public Penguin(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	//abstracts methods
	public void eat() {
		System.out.println(name + " can eat");
	}

	public void sleep() {
		System.out.println(name + " can sleep");
	}
	
	public void run() {
		System.out.println(name + " can run");
	}
}
