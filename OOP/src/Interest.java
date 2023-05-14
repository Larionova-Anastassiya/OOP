import java.util.Scanner;

public class Interest {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in); // input
		
		System.out.println("Enter balance: "); //выведет текст
		double balance = sc.nextDouble(); //ввести самому число
		
		System.out.println("Enter interest: "); //выведет текст
		int interest = sc.nextInt(); //ввести самому число
		
		sc.close(); //закрыли сканер
	
		
		double newbalance = balance + ((balance/100) * interest); //вычисляем по формуле проценты и плюсуем их
		
		System.out.println("You new balance: " + newbalance); //выводим результат
		
	}
}
