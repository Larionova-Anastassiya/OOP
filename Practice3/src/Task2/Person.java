package Task2;

public class Person {
	// приватные значения
	   private String name, address;
	   
	   public Person() {
		   //empty
	   }
	   
	   //Конструктор принимающий имя и адрес
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   
	   // Методы давать и читать данные (по условию)
	   
	   //Даст значение имени
	   public String getName() {
	      return name;
	   }
	   // Вернет значение адреса
	   public String getAddress() {
	      return address;
	   }
	   
	   
	   //Присвоим свое значение адреса
	   public void setAddress(String address) {
	      this.address = address;
	   }
	   
	   
	   
	   // Вернет ответ значений в виде строки (Overriding)
	   public String toString() {
	      return "Name = " + name + ", Address = " + address + ". ";
	   }
}
