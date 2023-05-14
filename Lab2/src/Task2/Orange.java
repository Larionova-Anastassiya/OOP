package Task2;

import java.util.Objects;

public class Orange extends Fruit {
	//Приватные значения
		private int price;
		
		public Orange() {
			super(); //empty
		}
		
		//Конструктор для принятия данных
		public Orange(String name, String shop,  int price) {
			super(name, shop);
			
			this.price = price;
		}
		
		// Методы давать и читать данные (по условию)

			// Вернет значение program
			   public int getPrice() {
			      return price;
			   }
			   
			   //Присвоим свое значение program
			   public void setPrice(int price) {
			      this.price = price;
			   }
			   
			// Вернет ответ значений в виде строки (Overriding)
			   public String toString() {
			      return "Fruit:" + super.toString() + "Price = " + price;
			   }
			   
			 //EQUALS
			   public boolean equals(Object o) {
				   if(! super.equals(o)) return false; //in Fruit
				   
				   Orange r = (Orange)o;
				   return this.price == r.price;
			   }
			   
			 //HASHCODE
			   public int hashCode() {
				   return Objects.hash(price);
			   }
}
