package Task3;

//Parent
public abstract class Piece {
	
	//Values
	int A;
	int B;
			
			
	//constructors
	public Piece() {
		//empty
	}
	
	//вводим наши цифры местонахождения
	public Piece(int A, int B) {
		this.A = A;
		this.B = B;
	}
	
	public double getA() {
		return A;
	}
	public double getB() {
		return B;
	}
	
	
	abstract public boolean isLegalMove(int a, int b); //у всех детей должен быть метод

}
