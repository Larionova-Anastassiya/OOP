package Task3;

//Королева
public class Queen extends Piece{
	
	//constructors
	public Queen() {
		super();
	}
			
	public Queen(int A, int B) {
		super(A, B);
	}
		
		
	public boolean isLegalMove(int a, int b) {
		if( A == a && B == b )
		    return false; // та же самая клетка
		
	    return b == B && a != A || b != B && a == A || (a - b) == (A - B) || (a + b) == (A + B);
	}

}
