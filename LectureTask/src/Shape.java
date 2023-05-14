
abstract class Shape {
	//override draw  O (circle) or /_\ (treangle) or [] or simvols 
	Color color;
	int pos;
	//constructors
	
	public Shape() {
		//empty
	}
	
	//draw(color)
	public Shape(Color color) {
		this.color = color;
	}
	//draw(color, pos) any overload
	public Shape(Color color, int pos) {
		this.color = color;
		this.pos = pos;
	}
	//abstract draw
	abstract void draw();
	 
	void draw(int n) {
		 for (int i=0; i<n; i++) {
			 draw();
		 }
	 }
	
}
