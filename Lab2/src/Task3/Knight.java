package Task3;

//Конь
public class Knight extends Piece{
	
	//constructors
	public Knight() {
		super();
	}
					
	public Knight(int A, int B) {
		super(A, B);
	}
		
		
	public boolean isLegalMove(int a, int b) {
	    // use pythagoras to ensure that a move makes a right-angled
	    // triangle move with sides of 1 and 2. 1-squared + 2 squared is 5.
	    int deltaR = a - A;
	    int deltaC = b - B;
	    return 5 == deltaR * deltaR + deltaC * deltaC;
	}

}
