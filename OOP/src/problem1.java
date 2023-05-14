/* Example:
Your name: Anna
+----+
|Anna|
+----+
 */
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //input name
		System.out.print("Your name: "); //text name for you
		String name = sc.nextLine(); //read name
		sc.close();
		//show result
		System.out.print("+");
		for(int i = 0; i < name.length(); i++) { //размер имени считает
				System.out.print("-");
		}
		System.out.println("+"); //println следующий текст с новой строки
		System.out.print("|");
		System.out.print(name);
		System.out.println("|");
		System.out.print("+");
		for(int i = 0; i < name.length(); i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}
} 

