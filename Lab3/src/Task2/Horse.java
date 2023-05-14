package Task2;

public class Horse extends Animal{
	
	//наземные животные
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed have 10");

	}


	//у всех есть животных есть движение
	@Override
	public void move() {
		System.out.println("Horse can move");

	}
}
