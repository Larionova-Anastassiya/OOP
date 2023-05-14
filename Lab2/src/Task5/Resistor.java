package Task5;


//Резистор - квадраты соединенные со значениями
public class Resistor extends Circuit{
	//данные резистора с разностью потенциалов
	double valueOfResistor;
	double pottentialDiff = 1; //взяла по дефолту для проверки методов
	
	
	//Конструктор
	Resistor(double value){ //прнимает значение резистора
		this.valueOfResistor = value;
	}

	
	//Методы от абстрактного класса
	public double getResistance() {
		return valueOfResistor;  //вернет значение резистора
	}

	public double getPotentialDiff() {
		return pottentialDiff; //вернет разницу
	}

	public void applyPotentialDiff(double V) {
		this.pottentialDiff = V; //присвоим значение
	}

}

