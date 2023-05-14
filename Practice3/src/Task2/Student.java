package Task2;

public class Student extends Person {
	//Приватные значения студента
	private String program;
	private int year;
	private double fee; //взнос
	
	public Student() {
		super(); //empty
	}
	
	//Конструктор для принятия данных
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address); // возмет из Персона имя и адрес
		
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	// Методы давать и читать данные (по условию)

	// Вернет значение program
	   public String getProgram() {
	      return program;
	   }
	   
	   //Присвоим свое значение program
	   public void setProgram(String program) {
	      this.program = program;
	   }
	   
	// Вернет значение year
	   public int getYear() {
	      return year;
	   }
	   
	   //Присвоим свое значение year
	   public void setYear(int year) {
	      this.year = year;
	   }
	   
	// Вернет значение fee
	   public double getFee() {
	      return fee;
	   }
	   
	   //Присвоим свое значение fee
	   public void setFee(double fee) {
	      this.fee = fee;
	   }
	   
	// Вернет ответ значений в виде строки (Overriding)
	   public String toString() {
	      return "Student:" + super.toString() + "Program = " + program + ", Year = " + year + ", Fee = " + fee;
	   }
}
