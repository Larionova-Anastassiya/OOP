package Lab1;

public class TestTemp {

	public static void main(String[] args) {
		
		
		//Первая проверка из Фаренгейта в Цельсия
		Temperature test1 = new Temperature(32, "F"); //Temperature() - 0.0 C default value
		System.out.println("Your value 1: " + test1.toString());  //выведет наш ввод первоначальный

		test1.setScale("C"); //во что преобразить надо
		System.out.println("Your new value is 1 in Celsius: " + test1.toString()); //выведет измененный результат
		
	
	
		//Вторая проверка из Цельсия в Фаренгейт
		Temperature test2 = new Temperature(50, "C"); //Temperature() - 0.0 C default value
		System.out.println("Your value 2: " + test2.toString());  //выведет наш ввод первоначальный

		test2.setScale("F"); //во что преобразить надо
		System.out.println("Your new value is 2 in Fahrenheit: " + test2.toString()); //выведет измененный результат
		
		
		/* Попытка проверки чтобы фаренгейт в фаренгейт не превращал (увеличивает значение) и наоборот Цельсию так же (уменьшает)
		if (test1.setScale() = "F") {
			test1.setScale("C");
			test1.setScale("F");
		}
		
		if (test1.setScale() = "С") {
			test1.setScale("F");
			test1.setScale("C");
		}
		*/
	}

}
