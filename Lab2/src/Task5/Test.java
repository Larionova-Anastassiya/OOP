package Task5;


public class Test {

	public static void main(String[] args) {
		//Ввод был дан в задании (резисторы подключенные)
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f);
		
		double R = circuit.getResistance();  //Answer: 2.4
		
		// double R = circuit.getCurrent(); //Answer: 0.8333333333333334
		// double R = circuit.getPotentialDiff(); //Answer: 1
		// double R = circuit.getPower(); //Answer: 1.6666666666666667
		
		System.out.println(R); //ANSWER: 2.4
	

	}

}