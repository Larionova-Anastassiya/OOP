package Task4;

import java.util.Vector;

public class Manager extends Employee{

	public double bonus;
	public double newSalary;
	
	public static Vector <Employee> employees = new Vector <Employee>();  //vector аккаунтов всех хранящихся employee

	
	//CONSTRUCTORS
	public Manager(String name) {
		super(name);
	}
	//inherited with all values
	public Manager(String name, double salary, String insuranceNumber) {
		super(name, salary, insuranceNumber);
	}

	
	public void addEmpForManager(Employee e) {
		employees.add(e);
	}

	//EQUALS AND TO STRING WITH EMPLOYEE AND NEW MANAGER
	@Override
	public boolean equals(Object o) {
		//return super.equals(o);
		if(! super.equals(o)) return false; //in Employee all
		   
		   Manager e = (Manager)o;
		   return this.bonus == e.bonus; //in manager equals bonus
	}
	
	public double getBonus() {
		bonus = employees.size() * 0.5;
		return bonus;
	}
	
	public double getNewSalary() {
		return bonus + salary;
	}

	@Override
	public String toString() {
		return super.toString() + " Bonus: " + getBonus() + ". New Salary: " + getNewSalary() + ".";
	}
	
	
	
	
	//CLONE
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	//COMPARE TO Sorting
	public int compareTo(Manager m) {

		if (this.salary == m.salary) {
			if (this.bonus == m.bonus) 
				return 0;
			else if (this.bonus < m.bonus) 
				return -1;
			else 
				return 1;
			//return 0;
		}
		else if (this.salary < m.salary) 
			return 1;
		else 
			return -1;
	}
	
}
