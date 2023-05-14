package Lab1;
import java.util.Vector;

import practice2.Student; // импортировали из другой папки
//import java.util.Vector;


public class GradeBook {
	//какие будут данные
	public String namecourse;
	private String description;
	private int credit;
	private String condition;
	static int numStudent;
	public static Vector<Student> listStudents;
	
	
	
	static {
		listStudents = new Vector<Student>();
	}
	
	//constructor чтобы назначать переменные
	public GradeBook() {}
	
	public GradeBook(String namecourse) {
		this.namecourse = namecourse;
	}
			
	public GradeBook(String namecourse, String description, int credit, String condition) {
		this(namecourse);
		this.description = description;
		this.credit = credit;
		this.condition = condition;
	}
	
	public GradeBook(String namecourse, Vector<Student> listStudents) {
		this(namecourse);
		this.listStudents = listStudents;
	}
	
	
	
	
	//methods чтобы манипулировать объектами - символизирует поведение
	public void setNameCourse(String course) { //принимает данные противоположно get
		namecourse = course;
	}
		
	public String getNameCourse() { //даем только посмотреть данные
		return(namecourse);
	}
	
	public void setDescription(String description) { //принимает данные противоположно get
		this.description = description;
	}
		
	public String getDescription() { //даем только посмотреть данные
		return(description);
	}
	
	public void setCredit(int credit) { //принимает данные противоположно get
		this.credit = credit;
	}
		
	public int getCredit() { //даем только посмотреть данные
		return(credit);
	}
	
	public void setCondition(String condition) { //принимает данные противоположно get
		this.condition = condition;
	}
		
	public String getCondition() { //даем только посмотреть данные
		return(condition);
	}
	
	
	
	
	
	//вывод и действия по условиям
	public void displayMessage() {
		System.out.println ("Welcome to the grade book for " + description + " " + namecourse + "!");
		System.out.println(" ");
		System.out.println("Please, inpute grades for students:");
		
		//outputBarChart();
	}
	
	
	public void displayGradeReport() {
		System.out.println("Class average is " + determineAverage() + ". Lowest grade is " + determineClassMin() + ". Highest grade is " + determineClassMax() + ".");
		//outputBarChart();
	}
	/* create students
	Student s = new Student("Anna", 1,20, 60); //имя добавится с айди и годом,grade но покажет только имя
	Student t = new Student("Miras", 3,22, 80);
	Student v = new Student("Nastya", 67,21, 100);
	*/
	
	//для среднего значения из листа нахождение
	public double determineAverage() {
		double sum = 0;
		for(Student st: listStudents) {
			sum += st.getGrade();
		}
		return (sum / listStudents.size());
	}
	
	//для нахождения максимума из листа
	/*
	public Student determineClassMax() {
		double max = 0;
		Student s = listStudents.get(0);
		for(Student st: listStudents) {
			if(st.getGrade() > max) {
				max = st.getGrade();
				s = st;
			}
		}
		return max;
	*/
	
	
	public Student determineClassMax() {
		double max = 0;
		Student s = new Student();
		for(Student st: listStudents) {
			if(st.getGrade() > max) {
				max = st.getGrade();
				s = st;
			}
		}
		return s;
	}
		
	
	//для нахождения минимума из листа
	public Student determineClassMin() {
		double min = 100;
		Student res = new Student();
		for (Student st: listStudents) {
			if (st.getGrade() < min) {
				min = st.getGrade();
				res = st;
			}
		}
		return res;
	}
	
	
	
	
}
