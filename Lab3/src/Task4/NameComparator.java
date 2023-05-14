package Task4;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	
	
	public int compare(Employee e1, Employee e2) {
		// Sorting in ascending order of name
		return e1.name.compareTo(e2.name);
	}

}
