package Task5;

public class Chocolate implements Comparable<Chocolate> {
	
	public int weight;
	public String name;
	
	
	
	
	public Chocolate() {
		//empty
	}
	
	public Chocolate(String name, int weight) {
		
		this.name = name;
		this.weight = weight;
		
	}



	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Chocolate " + getName() + " Weight=" + getWeight();
	}

	
	
	@Override
	public int compareTo(Chocolate c) {
		if (this.weight == c.weight) 
            return 0;
        else if (this.weight < c.weight) 
            return -1;
        else 
            return 1;
	}

}
