import java.util.Scanner;


public class Palindrom {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in); // input
		
		System.out.print("Enter you words: ");  //выведет текст
		String word = sc.nextLine(); //ввести самому
		
		sc.close(); //закрыли сканер
		
		//String reverse = reverseString(word);
		/*if (word.equals (reverseString (word))) {
		
	        System.out.println ("DEBUG: returning true");
		}
	    else System.out.println ("DEBUG: returning false");
	    */
		int length = word.length(); //размер самого слова
	    int forward = 0;
	    int backward = length - 1; //назад уход по букве или цифре
	    
		char forwardChar = word.charAt(forward++); //одновременно начать повторять заданную строку вперед, 
        char backwardChar = word.charAt(backward--); //одновременно начать повторять заданную строку назад
      //по одному символу за раз. Если есть совпадение, цикл продолжается
        if (forwardChar != backwardChar) { //если неравны то не полидром
        	System.out.println("No");
        }
        else System.out.println("Yes");
	}
}
