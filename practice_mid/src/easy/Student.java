package easy;

public class Student extends Person {
	private int id_card;
	public String book;
	
	public Student() {
		super();
	}
	
	public Student(String name, int year, int id, Gender gen, int id_card) {
		super(name, year, id, gen);
		this.id_card = id_card;
	}
	
	public String toString() {
		return super.toString() + " ID card: " + id_card;
	}

}
