package practice2;

public class testFamily {

	public static void main(String[] args) {
		Family m = new Family("Aruzhan", 43 , 1, 1979, "mother"); 
		Family d = new Family("Ernar", 45, 2, 1977, "father"); 
		Family s = new Family("Aidana", 12, 3, 2010, "sister");
	
				
				
				System.out.println(Family.family); 
				System.out.println("All people in family: " + Family.family.size()); 
				System.out.println(" "); 
				
				System.out.println("ID: " + m.getId() + "; Name: " + m.name);
				System.out.println("Name: " + d.name + "; Age: " + d.getAge() + "; Year: " + d.getYear()); 
				System.out.println("ID: " + s.getId() + "; Name: "+ s.name + "; Age: " + s.getAge() + "; Year: " + s.getYear() + "; Role: " + s.getRole()); 

	}

}
