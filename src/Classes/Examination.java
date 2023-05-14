package Classes;

import java.util.*;

import Enums.*;
import People.*;

public class Examination {
	//FIELDS
	private Course course;
    private Date date;
    private Vector<Student> listOfStudents;
    private Employee proctor;
    private LessonType type;
    
    
    //GETTERS and SETTERS
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Vector<Student> getListOfStudents() {
		return listOfStudents;
	}
	public void setListOfStudents(Vector<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	public Employee getProctor() {
		return proctor;
	}
	public void setProctor(Employee proctor) {
		this.proctor = proctor;
	}
	public LessonType getType() {
		return type;
	}
	public void setType(LessonType type) {
		this.type = type;
	}
    
    //FUNCTIONS
	public void createReport() {
    }
}
