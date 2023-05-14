package Task2;

import java.util.Objects;

public class Fruit {
	// приватные значения
		private String name;
		private String shop;
		
		public Fruit() {
			//empty
		}
		
		//Конструктор принимающий имя
		public Fruit(String name) {
			this.name = name;
		}
		
		public Fruit(String name, String shop) {
			this(name);
			this.shop = shop;
		}
		
		// Методы давать и читать данные (по условию)
		   
		   //Даст значение имени
		   public String getName() {
		      return name;
		   }
		   
		   public void setName(String name) {
			   this.name = name;
		   }
		   
		 //Даст значение имени
		   public String getShop() {
		      return shop;
		   }
		   
		   public void setShop(String shop) {
			   this.shop = shop;
		   }
		   
		// Вернет ответ значений в виде строки (Overriding)
		   public String toString() {
		      return "Name = " + name +  ". Shop: " + shop + ". ";
		   }
		   
		  //EQUALS
		   public boolean equals(Object o) {
			   if(o == this) return true; //address
			   if(o == null) return false; //empty
			   if(o.getClass() != this.getClass()) return false;
			   
			   Fruit f = (Fruit)o;
			   return this.shop == f.shop && this.name.equals(f.name);
		   }
		   
		   //HASHCODE
		   public int hashCode() {
			   return Objects.hash(name, shop);
		   }
}
