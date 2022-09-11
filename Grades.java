// displays a grade (A, A-, B+…) according to a number that a user 
import java.util.Scanner; 

public class Grades {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// input

		System.out.print("Enter the number: "); //выведет текст
		int score = sc.nextInt(); //ввести самому число example 30 станет int
	
		sc.close(); //закрыли сканер

		String [] marks = {"F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
		
		System.out.println(marks[(int)(Math.round((score)/5))]); //вывод данных 
		
	}
}
