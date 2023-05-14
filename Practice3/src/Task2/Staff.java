package Task2;

public class Staff extends Person {
	//Приватные значения staff
		private String school;
		private double pay; 
		
		
		//Конструктор для принятия данных
		public Staff(String name, String address, String school, double pay) {
			super(name, address); // возмет из Персона имя и адрес
			
			this.school = school;
			this.pay = pay;
		}
		
		// Методы давать и читать данные (по условию)

		// Вернет значение program
		   public String getSchool() {
		      return school;
		   }
		   
		   //Присвоим свое значение program
		   public void setSchool(String school) {
		      this.school = school;
		   }
		   
		
		   
		// Вернет значение fee
		   public double getPay() {
		      return pay;
		   }
		   
		   //Присвоим свое значение fee
		   public void setPay(double pay) {
		      this.pay = pay;
		   }
		   
		// Вернет ответ значений в виде строки (Overriding)
		   public String toString() {
		      return "Staff:" + super.toString() + "School = " + school + ", Pay = " + pay;
		   }
}
