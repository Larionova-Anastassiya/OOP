package Task5;

public abstract class Circuit { //абстрактный класс главный для других
	
	Circuit(){
		//пустой конструктор
	}
	
	//абстрактные методы которые должны быть во всех "детях" класса
	public abstract double getResistance(); //эквивалетное сопротивление схемы
	public abstract double getPotentialDiff(); //разность потенциалов
	public abstract void applyPotentialDiff(double V); //применить разность потенциалов
	
	
	
	// Power = (Electric Potential Difference^2)/Resistance ----- FORMULA
	public double getPower() {
		return (getPotentialDiff()*getPotentialDiff()) / getResistance(); 
	}
	
	
	// Resistance = Potential Difference / Current  ----- FORMULA Ohm's law
	public double getCurrent() {
		return getPotentialDiff() / getResistance();
	}

	
	//I = V / R
	 //V1 = I * R1
}
