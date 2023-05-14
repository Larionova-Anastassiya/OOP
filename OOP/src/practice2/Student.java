/*Student has a name, id and a year of study. 
 * provide a constructor with two parameters and create methods to access name, id and increment the year of study
 * 
 */
package practice2; //

import java.util.Vector;

public class Student {
	//какие будут данные
	public String name;
	private int id; //прямого доступа нет
	private int year;
	private double grade;
	static int numStudent;
	public static Vector<Student> students;
	
	
	//bloc initialization
	static {
		students = new Vector<Student>();
	}
	
	{
		numStudent++;
		students.add(this);
	}
	
	//constructor чтобы назначать переменные
	
	public Student() {}
	

	public Student(String name, int id){ //присваивает все данные сразу
		//this(name); если вызвать наш свой же конструктор в прошлом созданный
		this();
		this.name = name;
		this.id = id;
	}
	
	public Student(String name, int id, int year, double grade){ //присваивает все данные сразу
		//this(name); если вызвать наш свой же конструктор в прошлом созданный
		this(name, id);
		this.year = year;
		this.grade = grade;
	}
	
	
	//methods чтобы манипулировать объектами - символизирует поведение
	public void setName(String person) { //принимает данные противоположно get
		name = person;
	}
	
	public String getName() { //даем только посмотреть данные
		return(name);
	}
	
	public void setId(int newid) {
		id = newid;
	}
	
	public int getId() {  //даем только посмотреть данные
		return(id);
	}
	
	public void setYear(int newyear) {
		year = newyear;
	}
	
	public int getyear() { //даем только посмотреть данные
		return(year);
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public double getGrade() { //даем только посмотреть данные
		return(grade);
	}
	

}
