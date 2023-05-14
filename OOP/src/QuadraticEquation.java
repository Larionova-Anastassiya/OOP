import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// input

		System.out.print("Enter the a: "); //выведет текст
		double a = sc.nextDouble(); //ввести самому число a example 3 
		
		System.out.print("Enter the b: "); //выведет текст
		double b = sc.nextDouble(); //ввести самому число b example 3 
		
		System.out.print("Enter the c: "); //выведет текст
		double c = sc.nextDouble(); //ввести самому число c example 3 
	
		sc.close(); //закрыли сканер

		double D = Math.pow(b,2) - (4*a*c); //нашли дескриминант по формуле
		
		if (D >= 0) { //условие если больше 0 и выполняем решение по формулам
			double answer1 = ((-b + Math.sqrt(D))/(2*a)); 
			
			double answer2 = ((-b - Math.sqrt(D))/(2*a));
			
			System.out.println("Discriminant: " + D);
			
			System.out.println("Answer1: " + answer1 + " Answer2: " + answer2); //вывод всех данных с надписью
		}
		else System.out.println("D is negative"); //вместо ошибки вывод сообщения
		
	}
}
