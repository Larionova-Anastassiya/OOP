package Task3;

//Пешка
public class Peshka extends Piece{
	
	//constructors
	public Peshka() {
		super();
	}
			
	public Peshka(int A, int B) {
		super(A, B);
	}
		
			
	public boolean isLegalMove(int a, int b) {
			 if( A == a && B == b )
			   return false; // та же самая клетка
			 
			 return b == B && a != A;
		}

}
