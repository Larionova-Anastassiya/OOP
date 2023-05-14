package People;

import java.io.Serializable;
import java.util.*;

import Classes.*;
import Enums.*;


public class Teacher extends Employee implements Serializable  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Teacher(String name, String lastName, String password, int age, Gender gender, int phoneNumber, ProfessorType professorType) {
		super(name, lastName, password, age, gender,phoneNumber);
		this.professorType = professorType;
	}
	
	//FIELDS
	private Vector<Course> courses = new Vector<Course>();
	private double rate = 0.0;
	private double cnt = 0;
	private boolean isAvailable;
	private ProfessorType professorType;
	
	//GETTERS and SETTERS
	public Vector<Course> getCourses() {
		return courses;
	}
	public void setCourses(Vector<Course> courses) {
		this.courses = courses;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public ProfessorType getProfessorType() {
		return professorType;
	}
	public void setProfessorType(ProfessorType professorType) {
		this.professorType = professorType;
	}
	
	//FUNCTION
	
	
	public void viewStudents(String courseName) {
		if(this.haveYouThisCourse(courseName) == true) {
			for(Course c: Databases.courses) {
				if(c.getCourseName().equals(courseName)) {
					Course course = c;
					Databases.users.stream().filter(n -> n instanceof Student).map(n -> (Student)n).filter(n -> n.haveYouThisCourse(course.getCourseName())).forEach(n -> System.out.println(n.getName() + " " + n.getLastName() + " " + n.getID()));	
				}
			}
		}
		System.out.println("You have no this course");
	}
	
	public void viewMark(String courseName) {
		if(this.haveYouThisCourse(courseName) == true) {
			for(Course c: Databases.courses) {
				if(c.getCourseName().equals(courseName)) {
					Course course = c;
					Databases.users.stream().filter(n -> n instanceof Student).map(n -> (Student)n).filter(n -> n.haveYouThisCourse(course.getCourseName())).forEach(n -> System.out.println(n.getMarkOfCourse(course)));	
				}
			}
		}
		System.out.println("You have no this course");
	}
	public void putAttendance() {
	}
	public void deleteFile(String courseName, String fileName) {
		for(File file: Databases.files) {
			if(file.getCourseName().equals(courseName) && file.getFromWho().equals(this.getLogin()) && file.getFileName().equals(fileName)) {
				Databases.files.remove(file);
			}
		}
	}
	
	public void viewMyCourses() {
		courses.stream().forEach(n -> System.out.println(n.getCourseName() + " | " + n.getCredits()));
	}
	
	public void addFile(Course course,File file) {
		if(!this.haveYouThisCourse(course.getCourseName())) {
			System.out.println("You dont have this course");
			return;
		}
		else {
			Databases.files.add(file);
			Databases.save();
		}
	}
	
	public void viewFiles(String courseName) {
		Databases.files.stream().filter(n -> n.getCourseName().equals(courseName)).filter(n -> n.getFromWho().equals(this.getLogin())).forEach(x -> System.out.println(x.getFileName() + " " + x.getDescription()));
	}
	
	public void setPointToStudent(String login, String courseName, Double point, int chooseTypeOfMarking) {
		for(User user: Databases.users) {
			if(login.equals(user.getLogin())) {
				Student a = (Student) user;
				a.setPoint(courseName, point, chooseTypeOfMarking);
			}
		}
	}
	
	public boolean haveYouThisCourse(String courseName) {
		for(Course c: courses) {
			if(courseName.equals(c.getCourseName())) {
				return true;
			}
		}
		return false;
	}
	
	public void addCourse(Course c) {
		if(this.courses.contains(c)) {
			System.out.println("Already have this course!");
			return;
		}
		this.courses.add(c);
		Databases.save();
	}
	
	public void setRating(Double rate) {
		this.rate += rate;
		this.cnt += 1;
		Databases.save();
	}
	
	public Double getRating() {
		if(cnt == 0) {
			return rate;
		}
		return rate / cnt * 1.0;
	}
	
	
}
