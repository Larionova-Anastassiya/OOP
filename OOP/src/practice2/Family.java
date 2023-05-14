package practice2;

import java.util.Vector;



public class Family {
			String name; 
			private int age; 
			private int id;
			private int year; 
			private String role; 
			static int cnt;
			static Vector<Family> family;
			
			
			
			static{
				family = new Vector<Family>();
			}
			
			{
				id = cnt++;
				family.add(this);
			}
			
			
			public Family() {}
			
			public Family(String name){ 
				this.name = name;
			}
			
	
			public Family(String name, int age, int id, int year, String role){ 
				this(name); 
				this.age = age; 
				this.id = id;
				this.year = year;
				this.role = role;
			}
			
					
			public void setName(String person) { 
				name = person;
			}
			
			public String getName() { 
				return(name);
			}
			
			public void setAge(int newage) {
				age = newage;
			}
			
			public int getAge() {  
				return(age);
			}
			
			public void setId(int newid) {
				id = newid;
			}
			
			public int getId() {  
				return(id);
			}
			
			public void setYear(int year) {
				this.year = year; 
			}
			
			public int getYear() { 
				return(year);
			}
			
			public void setRole(String role) { 
				this.role = role;
			}
			
			public String getRole() { 
				return(role);
			}
			

			public String toString() {
				return "Name in Family: "+ name + ", Role: " + role + ".";
			}
}
