package Task3;

//Слон
public class Bishop extends Piece{
	
	//constructors
	public Bishop() {
		super();
	}
				
	public Bishop(int A, int B) {
		super(A, B);
	}
		
		
	public boolean isLegalMove(final int a, final int b) {
	    return (a - b) == (A - B) || (a + b) == (A + B);
	}

}
