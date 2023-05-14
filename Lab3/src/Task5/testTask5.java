package Task5;

import Task4.Employee;

public class testTask5 {
	
	public static <E> void main(String[] args) throws CloneNotSupportedException {
	
		
		
		Chocolate chocol[] = new Chocolate[6];//size massiv (array)
		
		//create in array
		chocol[0] = new Chocolate("Twix", 15);
		chocol[1] = new Chocolate("KitKat", 20);
		chocol[2] = new Chocolate("Mars", 5);
		chocol[3] = new Chocolate("Milka", 7);
		chocol[4] = new Chocolate("Snickers", 10);
		chocol[5] = new Chocolate("M&M", 1);
		
		Sort.heapSort(chocol); //comparable in class need for sort
		
		for(int i = 0; i < 6; i++) {
			System.out.println(chocol[i]); //toString input
		}
		
		
		
		System.out.println();
		
		//with import Employee
		
		Employee employe[] = new Employee[6]; //size massiv (array)
		
		//create in array
		employe[0] = new Employee("Aima", 121000.3, "00122");
		employe[1] = new Employee("Nurali", 1500.5, "00122");
		employe[2] = new Employee("Lida", 5500, "00122");
		employe[3] = new Employee("Paul", 150000.5, "00122");
		employe[4] = new Employee("Zingar", 1000, "00122");
		employe[5] = new Employee("Mulan", 300, "00122");
		

		
		Sort.heapSort(employe); //comparable need for sort
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println(employe[i]); //toString input
		}
				
	}

}
