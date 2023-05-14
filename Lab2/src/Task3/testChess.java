package Task3;

import java.util.HashSet;


public class testChess {
	public static void main(String[] args) {
	
		HashSet <Piece> pieces = new HashSet<Piece>(); //без дубликатов чтобы
		
	Rock r = new Rock(1, 1);
	Rock r1 = new Rock(1, 10); //не добавит и не выведет
	//System.out.println("Rock: " + r.isLegalMove(1, 2));
	
		
	King k = new King(8, 2);
	//System.out.println("King: " + k.isLegalMove(8, 2));
	
	
	Queen q = new Queen(7, 7);
	//System.out.println("Queen: " + q.isLegalMove(2, 1));
	
	
	Bishop b = new Bishop(2, 2);
	//System.out.println("Bishop: " + b.isLegalMove(3, 3));
	
	
	Knight n = new Knight(1, 3);
	//System.out.println("Knight: " + n.isLegalMove(3, 2));
	
	
	Peshka p = new Peshka(1, 2);
	//System.out.println("Peshka: " + p.isLegalMove(2, 2));
	
	
	pieces.add(r);
	pieces.add(r1);
	pieces.add(k);
	pieces.add(q);
	pieces.add(b);
	pieces.add(n);
	pieces.add(p);
	
	for(Piece pie: pieces) {
		
		if(pie.getA() > 9 || pie.getB() > 9) {
			System.out.println("A piece outside the board 8x8 because: " + pie.getA() + " and " + pie.getB());
		}
		
		else if (pie.getA() < 9 && pie.getB() < 9){
			if(pie instanceof Rock) {
				System.out.println("Rock: " + pie.isLegalMove(1, 2));
			}
			
			else if (pie instanceof King) {
				System.out.println("King: " + pie.isLegalMove(8, 2));
			}
			
			else if (pie instanceof Queen) {
				System.out.println("Queen: " + pie.isLegalMove(2, 1));
			}
			
			else if (pie instanceof Bishop) {
				System.out.println("Bishop: " + pie.isLegalMove(3, 3));
			}
			
			else if (pie instanceof Knight) {
				System.out.println("Knight: " + pie.isLegalMove(3, 2));
			}
			
			else if (pie instanceof Peshka) {
				System.out.println("Peshka: " + pie.isLegalMove(2, 2));
			}
		}
	}
	
	
	/*
	Rock: true
	King: false
	Queen: false
	Bishop: true
	Knight: true
	Peshka: false
	 */
	}
}
