import java.util.Scanner;

public class Interest {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in); // input
		
		System.out.println("Enter balance: "); //выведет текст
		double balance = sc.nextDouble(); //ввести самому число
		
		System.out.println("Enter interest: ");
		int interest = sc.nextInt();
		
		sc.close();
	
		
		double newbalance = balance + ((balance/100) * interest);
		
		System.out.println("You new balance: " + newbalance);
		
	}
}
