package Task1;
//В начале denominator = 2 и ответ был 2 (не было ошибки) "The answer is: 2 Done."
// Когда сделали denominator = 0 то вышла ошибка "Exception in thread "main" java.lang.ArithmeticException: / by zero"

//ЗАЩИТА ОТ ОШИБОК

public class Example1 {
	public static void main(String[] args) {
	int denominator, numerator, ratio;

		//основное выполнение задания без ошибок если
	try {
	numerator   = 5;
	denominator = 0;

    ratio = numerator / denominator;
	System.out.println("The answer is: "+ratio);
    }
	
	//в случае ошибки отдельный вывод (арифметическая ошибка)
	catch(ArithmeticException ae) {
		System.out.println("Divide by 0");
		// ae.printStackTrace(); //вывод вида ошибки  метод
	}
	
	//в любом случае в конце выполняется вывод
	finally {
		System.out.println("Done.");
	}
	}
	
}
