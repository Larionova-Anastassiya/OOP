package Task3;

//Король
public class King extends Piece {
	
	//constructors
	public King() {
		super();
	}
		
	public King(int A, int B) {
		super(A, B);
	}
	
		
	public boolean isLegalMove(int a, int b) {
		  if( A == a && B == b )
		    return false; // та же самая клетка
		 
		  return (Math.abs(A-a) <= 1) && (Math.abs(B-b) <= 1);
		}

}
