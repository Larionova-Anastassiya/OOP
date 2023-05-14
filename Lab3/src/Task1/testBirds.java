package Task1;

public class testBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penguin p1 = new Penguin("Penguin Pasha");
		
		
		//with abstract
		p1.eat();
		p1.run();
		p1.sleep();
		
		
		//1. состояние: есть переменные в абстрактном
		p1.setAge(12);
		System.out.println("Age " + p1.getAge());
		
		//p1.fly(); not method
		
		
		System.out.println();
		
		
		
		Sparrow s1 = new Sparrow("Sparrow Kesha");
		
		//with abstract
		s1.eat();
		s1.run();
		s1.sleep();

		//with implements
		s1.fly(); 
		
		
		System.out.println();
		
		
		//2. у которых вообще нет ничего общего
		Bat b = new Bat("Bat Noils");


		//with implements
		b.fly(); 
		

	}

}

/*
  1. Интерфейс описывает только поведение. У него нет состояния (внутри интерфейса реализации нет). Нельзя сделать приватные переменные.
  мы не сможем реализовать внутри интерфейса геттеры и сеттеры
  
  А у абстрактного класса состояние есть: он описывает и то, и другое.
  
  
  
  2. Абстрактный класс связывает между собой и объединяет классы, имеющие очень близкую связь. 
  В то же время, один и тот же интерфейс могут реализовать классы, у которых вообще нет ничего общего.
  
  
  3. Классы могут реализовывать сколько угодно интерфейсов, но наследоваться можно только от одного класса.
  extends 1,    implements 1, 2, 3 ...
  
*/
