package Task1;

//3.implements можно сделать сколько угодно, например добавить "издает звук"
public class Sparrow extends Birds implements Fly{ 
	//all methods birds
	public String name;



	public Sparrow(String name) {
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

	
	
	//interfaces methods
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(name + " can fly");
		
	}
}
