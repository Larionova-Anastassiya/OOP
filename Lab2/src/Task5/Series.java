package Task5;

//последовательное соединение резисторов
public class Series extends Circuit{
	//значения 2 разных резисторов
	Circuit a;
	Circuit b;

	
	
	Series(Circuit a,Circuit b){ //вводим два резистора
		this.a = a;
		this.b = b;
	}

	
	
	//методы с абстрактного класса
	public double getResistance() {
		return a.getResistance() + b.getResistance(); // Сопротивление последовательного
	}

	
	public double getPotentialDiff() {
		return a.getPotentialDiff() + b.getPotentialDiff(); // найдет и вернет разницу
	}
	

	public void applyPotentialDiff(double V) {
		double current = (a.getPotentialDiff() / a.getResistance()); // вводится разница и умножается (по условию задачи)
		this.a.applyPotentialDiff(a.getResistance()*current);
		this.b.applyPotentialDiff(b.getResistance()*current);
	}

}

