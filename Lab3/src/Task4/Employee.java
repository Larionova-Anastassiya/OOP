package Task4;
import java.util.Date;
import java.util.Objects; //for hash

public class Employee extends Person implements Cloneable, Comparable<Employee> {

	
	//VALUES
	public double salary; //annual salary
	public Date hireDate; //date the employee started work
	public String insuranceNumber;
	
	
	
	
	//CONSTRUCTOR
	public Employee() {
		//empty
	}
	//inherited from only Person only name
	public Employee(String name) {
		super(name);
	}
	
	//inherited with all values
	public Employee(String name, double salary,String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.insuranceNumber = insuranceNumber;
		this.hireDate = new Date();
	}




	//METHODS GETTERS AND SETTERS
	//SALARY
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//DATE
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	//NUMBER
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}




	//IN PERSON EQUALS AND NEW WITH EMPLOYEE
	@Override
	public boolean equals(Object o) {
		//return super.equals(o);
		if(! super.equals(o)) return false; //in Person for name
		   
		   Employee e = (Employee)o;
		   return this.insuranceNumber == e.insuranceNumber; //this.salary == e.salary && this.hireDate == e.hireDate && 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(insuranceNumber);
	}

	//IN PERSON TO STRING AND NEW WITH EMPLOYEE
	@Override
	public String toString() {
		return super.toString() + ". Salary: "  + getSalary() + ". Hire Date: " + getHireDate() + ". Insurance Number: " + getInsuranceNumber() + ".";
	}
	


	//CLONE
	//shallow
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	/* если самим все прописать отдельно
	public Object clone() {
		Employee e = new Employee();
		this.name = e.name;
		this.salary = e.salary;
		this.insuranceNumber = e.insuranceNumber;
		this.hireDate = new Date();
		
		return e;
	}
	*/
	
	
	@Override
	
	public int compareTo(Employee e) {
		
		if (this.salary == e.salary) 
            return 0;
        else if (this.salary > e.salary) 
            return -1;
        else 
            return 1;
	}
	
	
	/*
	public int compareTo1(Employee e) {
		return name.compareTo(name);
	}
	*/
}
