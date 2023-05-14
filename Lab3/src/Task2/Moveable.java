package Task2;

public interface Moveable extends WaterMove, AirMove, GroundMove {

	//интерфейсы могут наследовать сколько угодно интерфейсов
	public void move();	
}

