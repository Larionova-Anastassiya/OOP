package Task3;

//Ладья
public class Rock extends Piece{
	
	
	//constructors
	public Rock() {
		// empty
	}
	
	public Rock(int A, int B) {
		super(A, B); //берет из родителя добавляет
	}

	public boolean isLegalMove(int a, int b) {
		if( A == a && B == b )
		    return false; // та же самая клетка
		
	    return b == B && a != A || b != B && a == A;
	}
}
