package Practice10;

public abstract class pseudocodeDiscipline {

	abstract void name();
	abstract void code();
	abstract void description();
	
	
	//template method
	
	public final void viewDiscipline() {
		name();
		code();
		description();
	}
}
