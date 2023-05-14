package Task1;

//2. мышь тоже может летать и наследует интерфейс
public class Bat implements Fly{
	public String name;



	public Bat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	//interfaces methods
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(name + " can fly");

	}

}
