package Task5;

//параллельное соединение резисторов
public class Parallel extends Circuit{
	//значения 2 разных резисторов
	Circuit a;
	Circuit b;

	
	
	Parallel(Circuit a,Circuit b){ //вводим два резистора
		this.a = a;
		this.b = b;
	}

	
	//методы с абстрактного класса
	public double getResistance() {
		return ((a.getResistance() * b.getResistance()) / (a.getResistance() + b.getResistance())); // Сопротивление параллельного
	}

	public double getPotentialDiff() {
		return a.getPotentialDiff(); //вернет разницу потенциалов
	} 

	public void applyPotentialDiff(double V) { //добавляем для обоих резисторов разницу
		this.a.applyPotentialDiff(V);
		this.b.applyPotentialDiff(V);
	}


}

