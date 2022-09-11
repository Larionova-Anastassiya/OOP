/* calculate an area, perimeter, and the length of diagonal
	of a square with a side a */
import java.util.Scanner;

public class AreaPerimeterLengh {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);// input

			System.out.print("Enter the Length square: "); //выведет текст
			double length = sc.nextDouble(); //ввести самому число example 3.4
		
			sc.close(); //закрыли сканер

			double area = length * length;
			double perimeter = 4 * length;
			double diagonal = Math.sqrt(2) * length;

			System.out.println("Area: " + area); //вывод всех данных с надписью
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Length of diagonal: " + diagonal);

		}
	}

