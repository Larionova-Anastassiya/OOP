/*Student has a name, id and a year of study. 
 * provide a constructor with two parameters and create methods to access name, id and increment the year of study
 * 
 */

public class Student {
	private String name;
	private String id;
	private String year;
	
	public void setName(String person) {
		name = person;
	}
	
	public String getName() {
		return(name);
	}
	
	public void setId(String newid) {
		id = newid;
	}
	
	public String getId() {
		return(id);
	}
	
	public void setYear(String newyear) {
		year = newyear;
	}
	
	public String getyear() {
		return(year);
	}

}

