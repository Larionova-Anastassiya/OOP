package Task1;


public class Animal {
	protected String name; //будут видны классам в одном пакете и наследникам
	protected int weight; //вес 
	public Gender gend;
	private Status docStatus;
	
	public Animal () { //not things
		docStatus = Status.OK;
	}
	
	public Animal(String name) { //only name
		this();
		this.name = name;
	}
	
	public Animal(Gender gender) { //only gender
		this.gend = gender;
	}
	
	//all info
	public Animal(Gender gender, String name, int weight) {
		this(name);
		this.gend = gender;
		this.weight = weight;
	}
	
	
	
	//get and set Status
	public Status getDocStatus() {
		return docStatus;
	}
	public void setDocStatus(Status docStatus) {
		this.docStatus = docStatus;
	}
	
	
	//default for overriding
	public String voice() {
		return "Not defined";
	}
	public String move() {
		return "Not defined";
	}
	
	//toString for Animal
	public String toString() {
		return "Name=" + name + ", docStatus=" + docStatus;
	}
	public final void printToString() {
		System.out.println(this.toString());
	}
	
	
	
	/*
	 * Overriding
	 * In cat 
	 * public String move() {
		return "Run and walk";
	}
	
	
	Bird
	public String move() {
		return "Fly";
	}
	 */
	
	
}

