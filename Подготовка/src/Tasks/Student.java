package Tasks;

import java.util.Objects;

//classes - manager, teacher, student, rector, security

// interfaces - 
// canApplyTeacher - for manager, rector
// canViewTranscriptAll - for teacher, manager
// goWithKazbekBi - for manager, teacher, rector
// haveLesson - teacher, student
// freeTimeGo - manager, rector, teacher

//abstract class - haveLesson, viewMarks, ...

public class Student {
	//Fields
	String name;
	
	//Constructor
	public Student() {
		//enemy
	}
	public Student(String name) {
		this.name = name;
	}
	
	//GET and SET
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//Methods
	public String nameWithLesson(String name, String Lesson) {
		return name + Lesson;
	}

	//toString
	public String toString() {
		return "Name:" + name;
	}
	
	//Equals
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  return true;
		if (obj == null)  return false;
		if (getClass() != obj.getClass()) return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
	
	//clone
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
